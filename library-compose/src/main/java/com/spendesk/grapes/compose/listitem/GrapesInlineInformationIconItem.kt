package com.spendesk.grapes.compose.listitem

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.icons.GrapesHighlightIcon
import com.spendesk.grapes.compose.icons.GrapesHighlightIconSize
import com.spendesk.grapes.compose.listitem.GrapesInlineInformationColors
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * Author: dany
 * Since: 05/11/2024, Tue
 */
@Composable
fun GrapesInlineInformationIconItem(
    description: String,
    modifier: Modifier = Modifier,
    colors: GrapesInlineInformationColors = GrapesInlineInformationColorsDefaults.colors(),
    painter: Painter,
    tint: Color,
    containerColor: Color
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit4),
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit12),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            GrapesHighlightIcon(
                size = GrapesHighlightIconSize.LARGE,
                modifier = Modifier,
                painter = painter,
                contentDescription = "test",
                tint = tint,
                containerColor = containerColor,
            )
            Text(
                text = description,
                color = colors.description,
                style = GrapesTheme.typography.bodyM,
                modifier = Modifier,
            )
        }
        Text(
            text = "blahblablah",
            color = GrapesTheme.colors.contentSecondaryBGPrimary,
            style = GrapesTheme.typography.bodyM,
            modifier = Modifier
        )
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
            painter = painterResource(R.drawable.ic_grapes_icon_card),
            tint = GrapesTheme.colors.contentPrimary,
            containerColor = GrapesTheme.colors.backgroundSecondaryWarningPressed,
        )
    }
}
