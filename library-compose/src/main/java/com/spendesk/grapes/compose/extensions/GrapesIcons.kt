package com.spendesk.grapes.compose.extensions

import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.model.GrapesConfigurationStatus

object GrapesIcons {

    /**
     * The Grapes design system contains some main configuration typically used to describe a component state.
     *
     * This function tries to match the provided [configurationState] to its icon associated.
     *
     * @return matching icon for a [configurationState] given.
     */
    fun iconFor(configurationState: GrapesConfigurationStatus): Int =
        when (configurationState) {
            GrapesConfigurationStatus.SUCCESS -> R.drawable.ic_grapes_icon_circle_check
            GrapesConfigurationStatus.INFORMATION -> R.drawable.ic_grapes_icon_circle_information
            GrapesConfigurationStatus.NEUTRAL -> R.drawable.ic_grapes_icon_receipt_question
            GrapesConfigurationStatus.ALERT -> R.drawable.ic_grapes_icon_octogone_cross
            GrapesConfigurationStatus.WARNING -> R.drawable.ic_grapes_icon_triangle_warning
            GrapesConfigurationStatus.BLOCKED -> R.drawable.ic_grapes_icon_lock_close
        }
}
