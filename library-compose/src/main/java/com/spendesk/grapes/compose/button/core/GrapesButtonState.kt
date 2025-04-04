package com.spendesk.grapes.compose.button.core

import androidx.compose.runtime.Immutable

@Immutable
sealed class GrapesButtonState {

    @Immutable
    data object Enabled : GrapesButtonState()

    @Immutable
    data object Disabled : GrapesButtonState()

    @Immutable
    sealed class Loading : GrapesButtonState() {

        @Immutable
        data object Indeterminate : Loading()

        /**
         * Reflects exactly how complete an action is.
         *
         * @param progress The progress of the indicator in range [0.0 ; 1.0]. Values outside of this range are coerced into the range.
         */
        @Immutable
        data class Determinate(
            val progress: Float,
        ) : Loading()
    }
}
