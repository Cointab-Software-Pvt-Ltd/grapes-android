package com.spendesk.grapes.compose.actionsheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.icons.GrapesIconSet
import com.spendesk.grapes.compose.theme.GrapesTheme

@Composable
fun GrapesActionSheetButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: @Composable (BoxScope.() -> Unit)? = null,
    enabled: Boolean = true,
    colors: ButtonColors = GrapesActionSheetDefaults.colors(),
) {
    TextButton(
        onClick = onClick,
        enabled = enabled,
        colors = colors,
        shape = GrapesTheme.shapes.radius0,
        modifier = modifier
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit12),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = GrapesTheme.dimensions.unit16)
        ) {
            Box { icon?.invoke(this) }
            Text(
                text = text,
                style = GrapesTheme.typography.titleM,
                modifier = Modifier
                    .padding(vertical = GrapesTheme.dimensions.unit12)
                    .weight(1f)
            )
        }
    }
}

@Preview
@Composable
private fun PreviewActionSheetButton() {
    GrapesTheme {
        Column {
            GrapesActionSheetButton(
                text = "Action",
                onClick = {},
                icon = { GrapesIconSet.Crop() },
                modifier = Modifier.fillMaxWidth()
            )
            GrapesActionSheetButton(
                text = "Action",
                onClick = {},
                icon = { GrapesIconSet.Crop() },
                enabled = false,
                modifier = Modifier.fillMaxWidth()
            )
            GrapesActionSheetButton(
                text = "Action",
                onClick = {},
                colors = GrapesActionSheetDefaults.alertColors(),
                icon = { GrapesIconSet.Crop() },
                modifier = Modifier.fillMaxWidth()
            )
            GrapesActionSheetButton(
                text = "Action",
                onClick = {},
                colors = GrapesActionSheetDefaults.brandColors(),
                icon = { GrapesIconSet.Crop() },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
