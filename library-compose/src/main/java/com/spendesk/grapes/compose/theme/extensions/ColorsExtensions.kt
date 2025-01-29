package com.spendesk.grapes.compose.theme.extensions

import androidx.compose.ui.graphics.Color
import com.spendesk.grapes.compose.model.GrapesConfigurationStatus
import com.spendesk.grapes.compose.theme.GrapesColors

/**
 * @author : danyboucanova
 * @since : 09/06/2022, Wed
 **/
fun GrapesColors.backgroundColorFor(configurationState: GrapesConfigurationStatus): Color {
    return when (configurationState) {
        GrapesConfigurationStatus.SUCCESS -> backgroundPrimarySuccessDefault
        GrapesConfigurationStatus.INFORMATION -> backgroundPrimaryInfoDefault
        GrapesConfigurationStatus.NEUTRAL -> backgroundSecondaryDefault
        GrapesConfigurationStatus.ALERT -> backgroundPrimaryAlertDefault
        GrapesConfigurationStatus.WARNING -> backgroundPrimaryWarningDefault
        GrapesConfigurationStatus.BLOCKED -> backgroundPrimaryBrandDefault
    }
}

fun GrapesColors.contentColorFor(configurationState: GrapesConfigurationStatus): Color {
    return when (configurationState) {
        GrapesConfigurationStatus.SUCCESS -> contentSuccessDefault
        GrapesConfigurationStatus.INFORMATION -> contentInfoDefault
        GrapesConfigurationStatus.NEUTRAL -> contentSecondaryBGSecondary
        GrapesConfigurationStatus.ALERT -> contentAlertDefault
        GrapesConfigurationStatus.WARNING -> contentWarningDefault
        GrapesConfigurationStatus.BLOCKED -> contentSelected
    }
}

fun GrapesColors.neutralContentColorFor(configurationState: GrapesConfigurationStatus): Color {
    return when (configurationState) {
        GrapesConfigurationStatus.SUCCESS -> contentComplementary
        GrapesConfigurationStatus.INFORMATION -> contentComplementary
        GrapesConfigurationStatus.NEUTRAL -> contentSecondaryBGSecondary
        GrapesConfigurationStatus.ALERT -> contentComplementary
        GrapesConfigurationStatus.WARNING -> contentComplementary
        GrapesConfigurationStatus.BLOCKED -> contentComplementary
    }
}

val GrapesColors.unspecified: Color
    get() = Color(0f, 0f, 0f, 0f)
