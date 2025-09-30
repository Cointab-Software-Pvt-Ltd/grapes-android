package com.spendesk.grapes.compose.listitem

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
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
    modifier: Modifier = Modifier,
    colors: GrapesInlineInformationColors = GrapesInlineInformationColorsDefaults.colors(),
    subtitle: String? = null,
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
        modifier = modifier,
        colors = colors,
        subtitle = subtitle,
    )
}

@Composable
private fun GrapesInlineInformationIconItem(
    description: String,
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    colors: GrapesInlineInformationColors = GrapesInlineInformationColorsDefaults.colors(),
    subtitle: String? = null,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit4),
        horizontalAlignment = Alignment.Start
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
        if (subtitle != null) {
            Text(
                text = subtitle,
                color = GrapesTheme.colors.contentSecondaryBGPrimary,
                style = GrapesTheme.typography.bodyM,
                modifier = Modifier.padding(vertical = GrapesTheme.dimensions.unit4)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun PreviewGrapesInlineInformationIconItem() {
    GrapesTheme {
        GrapesInlineInformationIconItem(
            modifier = Modifier.padding(all = GrapesTheme.dimensions.unit16),
            description = "This is some kind of potential description",
            colors = GrapesInlineInformationColorsDefaults.colors(),
            icon = R.drawable.ic_grapes_icon_card,
            tint = GrapesTheme.colors.contentPrimary,
            containerColor = GrapesTheme.colors.backgroundSecondaryWarningPressed,
            subtitle = "This is a subtitle",
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun PreviewGrapesInlineInformationIconItem_NoSubtitle() {
    GrapesTheme {
        GrapesInlineInformationIconItem(
            modifier = Modifier.padding(all = GrapesTheme.dimensions.unit16),
            description = "This is some kind of potential description",
            colors = GrapesInlineInformationColorsDefaults.colors(),
            icon = R.drawable.ic_grapes_icon_card,
            tint = GrapesTheme.colors.contentPrimary,
            containerColor = GrapesTheme.colors.backgroundSecondaryWarningPressed,
        )
    }
}
