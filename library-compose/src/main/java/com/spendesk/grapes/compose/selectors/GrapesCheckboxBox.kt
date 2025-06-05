package com.spendesk.grapes.compose.selectors

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.theme.GrapesTheme

@Composable
fun GrapesCheckboxBox(
    text: String,
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onCheckedChange: (Boolean) -> Unit,
    maxLines: Int = 1,
    overflow: TextOverflow = TextOverflow.Ellipsis,
) {
    Card(
        onClick = { onCheckedChange(!checked) },
        enabled = enabled,
        shape = GrapesTheme.shapes.radius12,
        colors = CardDefaults.cardColors(
            containerColor = GrapesTheme.colors.backgroundPrimaryDefault,
            contentColor = GrapesTheme.colors.contentPrimary,
            disabledContainerColor = GrapesTheme.colors.backgroundPrimaryDisabled,
            disabledContentColor = GrapesTheme.colors.contentSecondaryBGPrimary,
        ),
        border = BorderStroke(1.dp, GrapesTheme.colors.borderDefault),
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit16),
            modifier = Modifier.padding(GrapesTheme.dimensions.unit16)
        ) {
            GrapesCheckbox(
                isChecked = checked,
                isEnabled = enabled,
                onCheckedChange = { onCheckedChange(!checked) },
                modifier = Modifier.size(GrapesTheme.dimensions.unit24)
            )
            Text(
                text = text,
                style = GrapesTheme.typography.bodyM,
                maxLines = maxLines,
                overflow = overflow,
            )
        }
    }
}

@Preview
@Preview(fontScale = 2f)
@Composable
private fun PreviewGrapesCheckboxBox() {
    GrapesTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
        ) {
            GrapesCheckboxBox(
                text = "Long label that should be truncated at the end",
                checked = false,
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                onCheckedChange = {},
            )
            GrapesCheckboxBox(
                text = "Long label that should be truncated at the end",
                checked = false,
                modifier = Modifier.fillMaxWidth(),
                enabled = false,
                onCheckedChange = {},
            )
            GrapesCheckboxBox(
                text = "Label",
                checked = true,
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                onCheckedChange = {},
            )
            GrapesCheckboxBox(
                text = "Label",
                checked = true,
                modifier = Modifier.fillMaxWidth(),
                enabled = false,
                onCheckedChange = {},
            )
            GrapesCheckboxBox(
                text = "Long label that should be on multiple lines and should not be truncated at the end",
                checked = false,
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                onCheckedChange = {},
                maxLines = Int.MAX_VALUE,
                overflow = TextOverflow.Clip,
            )
        }
    }
}
