package com.spendesk.grapes.compose.listitem

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * Author: dany
 * Since: 05/11/2024, Tue
 */
@Immutable
data class GrapesInlineInformationColors internal constructor(
    val title: Color,
    val description: Color
)

object GrapesInlineInformationColorsDefaults {

    @Composable
    fun colors(
        titleColor: Color = GrapesTheme.colors.neutralDark,
        descriptionColor: Color = GrapesTheme.colors.contentPrimary,
    ): GrapesInlineInformationColors = GrapesInlineInformationColors(
        title = titleColor,
        description = descriptionColor,
    )
}
