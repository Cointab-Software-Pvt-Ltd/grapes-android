package com.spendesk.grapes.bottomsheet.searchable

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.spendesk.grapes.R
import com.spendesk.grapes.databinding.FragmentBottomSheetSearchableBinding
import com.spendesk.grapes.extensions.afterTextChangedWith
import com.spendesk.grapes.extensions.forceHideKeyboard
import com.spendesk.grapes.extensions.gone
import com.spendesk.grapes.extensions.visible
import com.spendesk.grapes.extensions.withActivityAttached
import com.spendesk.grapes.list.simple.SimpleListAdapter
import com.spendesk.grapes.list.simple.SimpleListModel
import java.io.Serializable

/**
 * A full-screen bottom sheet dialog with a search input and a list of selectable items.
 *
 * This fragment displays:
 * - A header with a title and close button
 * - A search input field with live search capability
 * - A RecyclerView list that fills the remaining space
 * - An empty state view when no results are found
 *
 * **Important timing considerations:**
 * - `updateViewState` can be called before the view is created. In this case, the state is buffered
 *   and applied automatically in `onResume` after the view is ready.
 * - This ensures the RecyclerView always has correct height measurements.
 */
class SearchableBottomSheetDialogFragment : BottomSheetDialogFragment() {

    companion object {

        fun newInstance(configuration: Configuration) = SearchableBottomSheetDialogFragment().apply {
            isCancelable = false
            arguments = Bundle().apply {
                putSerializable(INTENT_CONFIGURATION, configuration)
            }
        }

        private const val INTENT_CONFIGURATION = "configuration"
        private const val EDITTEXT_TEXT_CHANGED_DELAY = 500L // Milliseconds
    }

    data class Configuration(
        val title: CharSequence,
        val searchInputText: CharSequence? = null,
        val hintText: CharSequence? = null,
    ) : Serializable

    private var binding: FragmentBottomSheetSearchableBinding? = null
    private val adapter = SimpleListAdapter()
    private var configuration: Configuration? = null

    /**
     * Buffers view state updates that arrive before the view is created.
     * Applied automatically in onResume when the view is ready.
     */
    private var pendingViewState: SearchableBottomSheetDialogFragmentViewState? = null

    // region Observable properties

    var onItemClicked: ((item: SimpleListModel) -> Unit)? = null
    var onSearchInputChanged: ((searchInput: String) -> Unit)? = null
    var onCancelListener: (() -> Unit)? = null

    // endregion Observable properties

    override fun getTheme(): Int = R.style.BottomSheetDialogStyle // TODO: handle dark theme here.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            configuration = it.getSerializable(INTENT_CONFIGURATION) as Configuration
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)

        with(dialog) {
            setOnShowListener { dialogInterface ->
                (dialogInterface as BottomSheetDialog).findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet)?.let { bottomSheet ->
                    // Set the bottom sheet container to take the full screen height
                    bottomSheet.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT

                    with(BottomSheetBehavior.from(bottomSheet)) {
                        // Configure behavior to use full screen height
                        maxHeight = ViewGroup.LayoutParams.MATCH_PARENT

                        // Don't save collapsed state (always start expanded)
                        saveFlags = BottomSheetBehavior.SAVE_SKIP_COLLAPSED
                        skipCollapsed = true

                        // Start in expanded state immediately
                        state = BottomSheetBehavior.STATE_EXPANDED

                        // Prevent user from dragging to dismiss
                        isDraggable = false
                    }
                }
            }
        }

        return dialog
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ) = FragmentBottomSheetSearchableBinding.inflate(inflater, container, false)
        .apply { binding = this }
        .root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize view components
        setupView()
        bindView()

        // Hide keyboard after a short delay to ensure smooth bottom sheet animation
        Handler(Looper.getMainLooper()).postDelayed({ view.forceHideKeyboard() }, 50)

        // Apply any view state that was buffered before the view was ready
        // Use post to ensure the view is fully measured and laid out
        pendingViewState?.let {
            view.post {
                applyViewState(it)
                pendingViewState = null
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    /**
     * Controls the display of the search progress indicator.
     *
     * @param show True to show the progress bar, false to hide it
     */
    fun showSearchProgressBar(show: Boolean) {
        binding?.searchableSheetSearchInput?.showProgressBar(show)
    }

    /**
     * Updates the view state of the bottom sheet.
     *
     * **Important:** This method can be called before the view is created. In such cases,
     * the state is buffered in `pendingViewState` and applied automatically in `onResume`.
     * This ensures the RecyclerView always has correct height measurements, preventing
     * layout issues that occur when the adapter is updated before the view is fully measured.
     *
     * @param viewState The new state to apply (Content, Empty, or Error)
     */
    fun updateViewState(viewState: SearchableBottomSheetDialogFragmentViewState) {
        if (view == null) {
            // View not created yet - buffer the state for later
            pendingViewState = viewState
        } else {
            // View is ready - apply the state immediately
            applyViewState(viewState)
        }
    }

    /**
     * Applies the view state to the UI components.
     *
     * This method should only be called when the view is ready (not null).
     * It updates the adapter and visibility of empty state views based on the state type.
     *
     * @param viewState The state to apply
     */
    private fun applyViewState(viewState: SearchableBottomSheetDialogFragmentViewState) {
        when (viewState) {
            is SearchableBottomSheetDialogFragmentViewState.Content -> {
                adapter.updateList(items = viewState.items)
                binding?.searchableSheetEmptyStateGroup?.gone()
            }

            is SearchableBottomSheetDialogFragmentViewState.Empty -> {
                adapter.updateList(items = listOf())
                binding?.apply {
                    searchableSheetEmptyStateTitleText.text = viewState.title
                    searchableSheetEmptyStateGroup.visible()
                }
            }

            is SearchableBottomSheetDialogFragmentViewState.Error -> Unit
        }
    }

    private fun setupView() {
        binding?.apply {
            searchableSheetHeaderTitle.text = configuration?.title
            configuration?.searchInputText?.let { searchableSheetSearchInput.getEditText().setText(it) }
            searchableSheetSearchInput.getEditText().hint = configuration?.hintText

            searchableSheetList.adapter = adapter
        }
    }

    override fun onCancel(dialog: DialogInterface) {
        onCancelListener?.invoke()
        super.onCancel(dialog)
    }

    private fun bindView() {
        binding?.apply {
            searchableSheetHeaderCloseButton.setOnClickListener { dialog?.cancel() }
            searchableSheetSearchInput.getEditText()
                .afterTextChangedWith(EDITTEXT_TEXT_CHANGED_DELAY) { withActivityAttached { runOnUiThread { onSearchInputChanged?.invoke(it.trim()) } } }
        }

        with(adapter) {
            onItemSelected = { _, item -> withActivityAttached { runOnUiThread { onItemClicked?.invoke(item) } } }
        }
    }
}
