package com.spendesk.grapes.compose.listitem

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.icons.GrapesHighlightIcon
import com.spendesk.grapes.compose.icons.GrapesHighlightIconSize
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * Author: dany
 * Since: 05/11/2024, Tue
 */
@Composable
fun GrapesInlineInformationIconItem(
    description: String,
    tint: Color,
    containerColor: Color,
    @DrawableRes icon: Int,
    colors: GrapesInlineInformationColors = GrapesInlineInformationColorsDefaults.colors(),
) {
    GrapesInlineInformationIconItem(
        description = description,
        icon = {
            GrapesHighlightIcon(
                size = GrapesHighlightIconSize.LARGE,
                painter = painterResource(icon),
                tint = tint,
                containerColor = containerColor,
            )
        },
        colors = colors,
    )
}

@Composable
private fun GrapesInlineInformationIconItem(
    description: String,
    icon: @Composable () -> Unit,
    colors: GrapesInlineInformationColors = GrapesInlineInformationColorsDefaults.colors(),
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit12),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        icon()
        Text(
            text = description,
            color = colors.description,
            style = GrapesTheme.typography.bodyM,
            modifier = Modifier,
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun PreviewGrapesInlineInformationIconItem() {
    GrapesTheme {
        GrapesInlineInformationIconItem(
            description = "This is some kind of potential description",
            colors = GrapesInlineInformationColorsDefaults.colors(),
            icon = R.drawable.ic_grapes_icon_card,
            tint = GrapesTheme.colors.contentPrimary,
            containerColor = GrapesTheme.colors.backgroundSecondaryWarningPressed,
        )
    }
}
