package com.spendesk.grapes.compose.actionmenu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.icons.GrapesIconSet
import com.spendesk.grapes.compose.theme.GrapesTheme
import com.spendesk.grapes.compose.theme.brightLemon

/**
 * @author : RomainGF
 * @since : 09/10/2023
 **/
private const val ACTION_TEXT_MAX_LINES = 2

/**
 * ActionMenuItem is a button with an icon and a text.
 *
 * @param text Text to display on the button
 * @param icon Slot for the icon to display on the left of the text. Size is constrained to 16dp.
 * @param onClick Callback when the button is clicked
 * @param modifier Modifier
 * @param enabled Whether the button is enabled or not
 */
@Composable
fun GrapesNavigationItem(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = GrapesTheme.colors.backgroundSecondaryDefault,
            contentColor = GrapesTheme.colors.contentPrimary,
            disabledContainerColor = GrapesTheme.colors.backgroundPrimaryDisabled,
            disabledContentColor = GrapesTheme.colors.contentSecondaryBGSecondary,
        ),
        contentPadding = PaddingValues(
            start = GrapesTheme.dimensions.unit12,
            end = GrapesTheme.dimensions.unit12,
            top = GrapesTheme.dimensions.unit12,
            bottom = GrapesTheme.dimensions.unit16,
        ),
        shape = GrapesTheme.shapes.radius12,
        modifier = modifier,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit16),
        ) {
            if (icon != null) {
                Box(
                    modifier = Modifier.sizeIn(
                        maxWidth = GrapesTheme.dimensions.unit32,
                        maxHeight = GrapesTheme.dimensions.unit32,
                    )
                ) {
                    CompositionLocalProvider(LocalContentColor provides GrapesTheme.colors.contentPrimary) {
                        icon()
                    }
                }
            }
            Text(
                text = text,
                maxLines = ACTION_TEXT_MAX_LINES,
                overflow = TextOverflow.Ellipsis,
                style = GrapesTheme.typography.bodyM,
                modifier = Modifier.weight(1f),
            )
            if (enabled) {
                GrapesIconSet.ChevronRight(
                    tint = GrapesTheme.colors.contentPrimary
                )
            }
        }
    }
}

@Preview
@Preview(fontScale = 2f)
@Composable
private fun ActionMenuItemPreview() {
    GrapesTheme {
        val icon = @Composable {
            Surface(
                color = brightLemon,
                shape = GrapesTheme.shapes.radius8,
                modifier = Modifier.size(GrapesTheme.dimensions.unit32)
            ) {
                GrapesIconSet.Puzzle(
                    modifier = Modifier
                        .padding(GrapesTheme.dimensions.unit8)
                        .size(GrapesTheme.dimensions.unit24)
                )
            }
        }
        val text = "Action"
        val textNoIcon = "Action without icon"
        val longText = "Action with a very long title which will not fit in one line. Event two lines will not be enough"
        val modifier = Modifier.fillMaxWidth()
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            GrapesNavigationItem(
                text = text,
                icon = icon,
                onClick = {},
                modifier = modifier,
            )
            GrapesNavigationItem(
                text = longText,
                icon = icon,
                onClick = {},
                modifier = modifier,
            )
            GrapesNavigationItem(
                text = textNoIcon,
                onClick = {},
                modifier = modifier,
            )
            GrapesNavigationItem(
                text = text,
                icon = icon,
                onClick = {},
                enabled = false,
                modifier = modifier,
            )
        }
    }
}
