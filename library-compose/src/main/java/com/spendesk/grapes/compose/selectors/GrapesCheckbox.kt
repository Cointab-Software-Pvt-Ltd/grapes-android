package com.spendesk.grapes.compose.selectors

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author : dany
 * @since : 23/02/2023, Thu
 **/
@Composable
fun GrapesCheckbox(
    isChecked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
) {
    Checkbox(
        modifier = modifier,
        checked = isChecked,
        enabled = isEnabled,
        colors = CheckboxColors(
            // Checkmark color
            checkedCheckmarkColor = GrapesTheme.colors.contentComplementary,
            uncheckedCheckmarkColor = Color.Transparent,
            // Box color
            checkedBoxColor = GrapesTheme.colors.backgroundPrimaryBrandDefault,
            uncheckedBoxColor = Color.Transparent,
            disabledCheckedBoxColor = GrapesTheme.colors.contentDisable,
            disabledUncheckedBoxColor = Color.Transparent,
            disabledIndeterminateBoxColor = GrapesTheme.colors.contentDisable,
            // Border color
            checkedBorderColor = GrapesTheme.colors.backgroundPrimaryBrandDefault,
            uncheckedBorderColor = GrapesTheme.colors.borderDefault,
            disabledBorderColor = GrapesTheme.colors.contentDisable,
            disabledUncheckedBorderColor = GrapesTheme.colors.borderDefault,
            disabledIndeterminateBorderColor = GrapesTheme.colors.borderDefault,
        ),
        onCheckedChange = onCheckedChange
    )
}

@Composable
@Preview(
    widthDp = 422,
    showBackground = true,
)
private fun GrapesCheckboxPreview() {
    GrapesTheme {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                GrapesCheckbox(isChecked = true, isEnabled = true, onCheckedChange = { Log.i("GrapesCheckbox", "action checkbox clicked: $it") })
                Text("Checkbox selected and enabled")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                GrapesCheckbox(isChecked = false, isEnabled = true, onCheckedChange = { Log.i("GrapesCheckbox", "action checkbox clicked: $it") })
                Text("Checkbox unselected and enabled")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                GrapesCheckbox(isChecked = true, isEnabled = false, onCheckedChange = { Log.i("GrapesCheckbox", "action checkbox clicked: $it") })
                Text("Checkbox selected and disabled")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                GrapesCheckbox(isChecked = false, isEnabled = false, onCheckedChange = { Log.i("GrapesCheckbox", "action checkbox clicked: $it") })
                Text("Checkbox unselected and disabled")
            }
        }
    }
}
