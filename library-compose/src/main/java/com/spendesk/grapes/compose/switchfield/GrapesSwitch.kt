package com.spendesk.grapes.compose.switchfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author : RomainGF
 * @since : 03/09/2024
 **/
@Composable
fun GrapesSwitch(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Switch(
        checked = checked,
        onCheckedChange = onCheckedChange,
        enabled = enabled,
        colors = GrapesSwitchDefaults.colors(),
        modifier = modifier,
    )
}

object GrapesSwitchDefaults {

    @Composable
    fun colors() = SwitchDefaults.colors(
        checkedThumbColor = GrapesTheme.colors.backgroundPrimaryDefault,
        checkedTrackColor = GrapesTheme.colors.contentSelected,
        uncheckedThumbColor = GrapesTheme.colors.backgroundPrimaryDefault,
        uncheckedTrackColor = GrapesTheme.colors.contentSecondaryBGPrimary,
        uncheckedBorderColor = GrapesTheme.colors.contentSecondaryBGPrimary,
        disabledCheckedTrackColor = GrapesTheme.colors.backgroundPrimaryDisabled,
        disabledCheckedBorderColor = GrapesTheme.colors.borderDefault,
        disabledCheckedThumbColor = GrapesTheme.colors.contentDisable,
        disabledUncheckedTrackColor = GrapesTheme.colors.backgroundPrimaryDisabled,
        disabledUncheckedThumbColor = GrapesTheme.colors.contentDisable,
        disabledUncheckedBorderColor = GrapesTheme.colors.borderDefault,
    )
}

@Preview
@Composable
private fun PreviewGrapesSwitch() {
    GrapesTheme {
        Row(
            horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
        ) {
            GrapesSwitch(checked = true, onCheckedChange = {})
            GrapesSwitch(checked = false, onCheckedChange = {})
            GrapesSwitch(checked = true, onCheckedChange = {}, enabled = false)
            GrapesSwitch(checked = false, onCheckedChange = {}, enabled = false)
        }
    }
}
