package com.spendesk.grapes.samples.compose

/**
 * @author Kélian CLERC
 * @since 17/01/2025
 */
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.theme.GrapesTheme
import com.spendesk.grapes.compose.theme.carbon15
import com.spendesk.grapes.compose.theme.carbon30
import com.spendesk.grapes.compose.theme.carbon7
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

private data class ColorUiModel(
    val groups: ImmutableList<ColorShowcase>,
)

private sealed class ColorShowcase {
    data class ColorGroup(
        val groupName: String,
        val colors: ImmutableList<ColorShowcase>,
    ) : ColorShowcase()

    data class ColorItem(
        val colorName: String,
        val color: Color,
        val contentColor: Color,
    ) : ColorShowcase()
}


@Composable
fun ColorsDestination() {
    val items = ColorUiModel(
        persistentListOf(
            ColorShowcase.ColorGroup(
                "Background",
                persistentListOf(
                    ColorShowcase.ColorGroup(
                        groupName = "Primary",
                        colors = persistentListOf(
                            ColorShowcase.ColorGroup(
                                "PrimaryDefault",
                                colors = backgroundPrimaryDefault()
                            ),
                            ColorShowcase.ColorGroup(
                                "PrimaryBrand",
                                colors = backgroundPrimaryBrand()
                            ),
                            ColorShowcase.ColorGroup(
                                "PrimaryInfo",
                                colors = backgroundPrimaryInfo()
                            ),
                            ColorShowcase.ColorGroup(
                                "PrimarySuccess",
                                colors = backgroundPrimarySuccess()
                            ),
                            ColorShowcase.ColorGroup(
                                "PrimaryWarning",
                                colors = backgroundPrimaryWarning()
                            ),
                            ColorShowcase.ColorGroup(
                                "PrimaryAlert",
                                colors = backgroundPrimaryAlert()
                            ),
                        )
                    ),
                    ColorShowcase.ColorGroup(
                        groupName = "Secondary",
                        colors = persistentListOf(
                            ColorShowcase.ColorGroup(
                                "SecondaryDefault",
                                colors = backgroundSecondaryDefault()
                            ),
                            ColorShowcase.ColorGroup(
                                "SecondaryBrand",
                                colors = backgroundSecondaryBrand()
                            ),
                            ColorShowcase.ColorGroup(
                                "SecondaryInfo",
                                colors = backgroundSecondaryInfo()
                            ),
                            ColorShowcase.ColorGroup(
                                "SecondarySuccess",
                                colors = backgroundSecondarySuccess()
                            ),
                            ColorShowcase.ColorGroup(
                                "SecondaryWarning",
                                colors = backgroundSecondaryWarning()
                            ),
                            ColorShowcase.ColorGroup(
                                "SecondaryAlert",
                                colors = backgroundSecondaryAlert()
                            ),
                        )
                    ),
                )
            ),
            ColorShowcase.ColorGroup(
                "Content",
                colors = persistentListOf(
                    ColorShowcase.ColorGroup(
                        groupName = "Default",
                        colors = content()
                    ),
                    ColorShowcase.ColorGroup(
                        groupName = "Secondary",
                        colors = contentSecondary()
                    ),
                    ColorShowcase.ColorGroup(
                        groupName = "Statuses",
                        colors = contentStatuses()
                    ),
                )
            ),
            ColorShowcase.ColorGroup(
                "Border",
                colors = persistentListOf(
                    ColorShowcase.ColorGroup(
                        groupName = "Default",
                        colors = borderDefault()
                    ),
                    ColorShowcase.ColorGroup(
                        groupName = "Info",
                        colors = borderInfo()
                    ),
                    ColorShowcase.ColorGroup(
                        groupName = "Success",
                        colors = borderSuccess()
                    ),
                    ColorShowcase.ColorGroup(
                        groupName = "Warning",
                        colors = borderWarning()
                    ),
                    ColorShowcase.ColorGroup(
                        groupName = "Alert",
                        colors = borderAlert()
                    ),
                )
            ),
        )
    )

    LazyVerticalGrid(modifier = Modifier.fillMaxSize(), columns = GridCells.Fixed(3)) {
        items.groups.forEach { item ->
            when (item) {
                is ColorShowcase.ColorGroup -> colorGroup(item, 0, "")
                is ColorShowcase.ColorItem -> colorItem(item)
            }
        }
    }
}

private fun LazyGridScope.colorGroup(group: ColorShowcase.ColorGroup, depth: Int, parentName: String, modifier: Modifier = Modifier) {
    val groupName = "$parentName/${group.groupName}"
    item(span = { GridItemSpan(maxLineSpan) }) {
        val titleStyle = when (depth) {
            0 -> GrapesTheme.typography.legacyTitleXxl
            1 -> GrapesTheme.typography.legacyTitleL
            else -> GrapesTheme.typography.titleM
        }
        val titleBackground = when (depth) {
            0 -> carbon30
            1 -> carbon15
            else -> carbon7
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(titleBackground)
                .padding(GrapesTheme.dimensions.unit8)
        ) {
            Text(
                text = groupName,
                style = titleStyle,
                color = GrapesTheme.colors.contentPrimary,
                modifier = modifier
            )
        }
    }
    group.colors.forEach { colorItem ->
        when (colorItem) {
            is ColorShowcase.ColorGroup -> colorGroup(colorItem, depth = depth + 1, parentName = groupName)
            is ColorShowcase.ColorItem -> colorItem(colorItem)
        }
    }
}

private fun LazyGridScope.colorItem(colorItem: ColorShowcase.ColorItem, modifier: Modifier = Modifier) {
    item {
        Box(
            modifier = Modifier
                .padding(GrapesTheme.dimensions.unit8)
                .size(64.dp)
                .background(colorItem.color, shape = GrapesTheme.shapes.radius12)
                .padding(GrapesTheme.dimensions.unit8),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = colorItem.colorName,
                style = GrapesTheme.typography.bodyM,
                color = colorItem.contentColor,
                modifier = modifier
            )
        }
    }
}

@Preview
@Composable
fun ColorsDestinationPreview() {
    GrapesTheme {
        ColorsDestination()
    }
}

@Composable
private fun backgroundPrimaryDefault(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        "backgroundPrimaryDefault",
        GrapesTheme.colors.backgroundPrimaryDefault,
        GrapesTheme.colors.contentPrimary
    ),
    ColorShowcase.ColorItem(
        "backgroundPrimaryHover",
        GrapesTheme.colors.backgroundPrimaryHover,
        GrapesTheme.colors.contentPrimary
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimaryPressed",
        color = GrapesTheme.colors.backgroundPrimaryPressed,
        contentColor = GrapesTheme.colors.contentPrimary
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimarySelected",
        color = GrapesTheme.colors.backgroundPrimarySelected,
        contentColor = GrapesTheme.colors.contentPrimary
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimaryDisabled",
        color = GrapesTheme.colors.backgroundPrimaryDisabled,
        contentColor = GrapesTheme.colors.contentPrimary
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimaryReadOnly",
        color = GrapesTheme.colors.backgroundPrimaryReadOnly,
        contentColor = GrapesTheme.colors.contentPrimary
    ),
)

@Composable
private fun backgroundPrimaryBrand(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimaryBrandDefault",
        color = GrapesTheme.colors.backgroundPrimaryBrandDefault,
        contentColor = GrapesTheme.colors.backgroundSecondaryBrandDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimaryBrandHover",
        color = GrapesTheme.colors.backgroundPrimaryBrandHover,
        contentColor = GrapesTheme.colors.backgroundSecondaryBrandDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimaryBrandPressed",
        color = GrapesTheme.colors.backgroundPrimaryBrandPressed,
        contentColor = GrapesTheme.colors.backgroundSecondaryBrandDefault
    ),
)

@Composable
private fun backgroundPrimaryInfo(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimaryInfoDefault",
        color = GrapesTheme.colors.backgroundPrimaryInfoDefault,
        contentColor = GrapesTheme.colors.backgroundSecondaryInfoDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimaryInfoHover",
        color = GrapesTheme.colors.backgroundPrimaryInfoHover,
        contentColor = GrapesTheme.colors.backgroundSecondaryInfoDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimaryInfoPressed",
        color = GrapesTheme.colors.backgroundPrimaryInfoPressed,
        contentColor = GrapesTheme.colors.backgroundSecondaryInfoDefault
    ),
)

@Composable
private fun backgroundPrimarySuccess(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimarySuccessDefault",
        color = GrapesTheme.colors.backgroundPrimarySuccessDefault,
        contentColor = GrapesTheme.colors.backgroundSecondarySuccessDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimarySuccessHover",
        color = GrapesTheme.colors.backgroundPrimarySuccessHover,
        contentColor = GrapesTheme.colors.backgroundSecondarySuccessDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimarySuccessPressed",
        color = GrapesTheme.colors.backgroundPrimarySuccessPressed,
        contentColor = GrapesTheme.colors.backgroundSecondarySuccessDefault
    ),
)

@Composable
private fun backgroundPrimaryWarning(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimaryWarningDefault",
        color = GrapesTheme.colors.backgroundPrimaryWarningDefault,
        contentColor = GrapesTheme.colors.backgroundSecondaryWarningDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimaryWarningHover",
        color = GrapesTheme.colors.backgroundPrimaryWarningHover,
        contentColor = GrapesTheme.colors.backgroundSecondaryWarningDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimaryWarningPressed",
        color = GrapesTheme.colors.backgroundPrimaryWarningPressed,
        contentColor = GrapesTheme.colors.backgroundSecondaryWarningDefault
    ),
)

@Composable
private fun backgroundPrimaryAlert(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimaryAlertDefault",
        color = GrapesTheme.colors.backgroundPrimaryAlertDefault,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimaryAlertHover",
        color = GrapesTheme.colors.backgroundPrimaryAlertHover,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundPrimaryAlertPressed",
        color = GrapesTheme.colors.backgroundPrimaryAlertPressed,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
)


@Composable
private fun backgroundSecondaryDefault(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "backgroundSecondaryDefault",
        color = GrapesTheme.colors.backgroundSecondaryDefault,
        contentColor = GrapesTheme.colors.contentPrimary
    ),
)


@Composable
private fun backgroundSecondaryBrand(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "backgroundSecondaryBrandDefault",
        color = GrapesTheme.colors.backgroundSecondaryBrandDefault,
        contentColor = GrapesTheme.colors.contentBrandDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundSecondaryBrandHover",
        color = GrapesTheme.colors.backgroundSecondaryBrandHover,
        contentColor = GrapesTheme.colors.contentBrandDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundSecondaryBrandPressed",
        color = GrapesTheme.colors.backgroundSecondaryBrandPressed,
        contentColor = GrapesTheme.colors.contentBrandDefault
    ),
)

@Composable
private fun backgroundSecondaryInfo(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "backgroundSecondaryInfoDefault",
        color = GrapesTheme.colors.backgroundSecondaryInfoDefault,
        contentColor = GrapesTheme.colors.contentInfoDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundSecondaryInfoHover",
        color = GrapesTheme.colors.backgroundSecondaryInfoHover,
        contentColor = GrapesTheme.colors.contentInfoDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundSecondaryInfoPressed",
        color = GrapesTheme.colors.backgroundSecondaryInfoPressed,
        contentColor = GrapesTheme.colors.contentInfoDefault
    ),
)

@Composable
private fun backgroundSecondarySuccess(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "backgroundSecondarySuccessDefault",
        color = GrapesTheme.colors.backgroundSecondarySuccessDefault,
        contentColor = GrapesTheme.colors.contentSuccessDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundSecondarySuccessHover",
        color = GrapesTheme.colors.backgroundSecondarySuccessHover,
        contentColor = GrapesTheme.colors.contentSuccessDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundSecondarySuccessPressed",
        color = GrapesTheme.colors.backgroundSecondarySuccessPressed,
        contentColor = GrapesTheme.colors.contentSuccessDefault
    ),
)

@Composable
private fun backgroundSecondaryWarning(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "backgroundSecondaryWarningDefault",
        color = GrapesTheme.colors.backgroundSecondaryWarningDefault,
        contentColor = GrapesTheme.colors.contentWarningDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundSecondaryWarningHover",
        color = GrapesTheme.colors.backgroundSecondaryWarningHover,
        contentColor = GrapesTheme.colors.contentWarningDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundSecondaryWarningPressed",
        color = GrapesTheme.colors.backgroundSecondaryWarningPressed,
        contentColor = GrapesTheme.colors.contentWarningDefault
    ),
)

@Composable
private fun backgroundSecondaryAlert(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "backgroundSecondaryAlertDefault",
        color = GrapesTheme.colors.backgroundSecondaryAlertDefault,
        contentColor = GrapesTheme.colors.contentAlertDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundSecondaryAlertHover",
        color = GrapesTheme.colors.backgroundSecondaryAlertHover,
        contentColor = GrapesTheme.colors.contentAlertDefault
    ),
    ColorShowcase.ColorItem(
        colorName = "backgroundSecondaryAlertPressed",
        color = GrapesTheme.colors.backgroundSecondaryAlertPressed,
        contentColor = GrapesTheme.colors.contentAlertDefault
    ),
)

@Composable
private fun content(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "contentPrimary",
        color = GrapesTheme.colors.contentPrimary,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
    ColorShowcase.ColorItem(
        colorName = "contentDecorativeIcon",
        color = GrapesTheme.colors.contentDecorativeIcon,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
    ColorShowcase.ColorItem(
        colorName = "contentComplementary",
        color = GrapesTheme.colors.contentComplementary,
        contentColor = GrapesTheme.colors.contentPrimary
    ),
    ColorShowcase.ColorItem(
        colorName = "contentSelected",
        color = GrapesTheme.colors.contentSelected,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
    ColorShowcase.ColorItem(
        colorName = "contentDisable",
        color = GrapesTheme.colors.contentDisable,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
)

@Composable
private fun contentSecondary(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "contentSecondaryBGPrimary",
        color = GrapesTheme.colors.contentSecondaryBGPrimary,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
    ColorShowcase.ColorItem(
        colorName = "contentSecondaryBGSecondary",
        color = GrapesTheme.colors.contentSecondaryBGSecondary,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
)

@Composable
private fun contentStatuses(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "contentBrandDefault",
        color = GrapesTheme.colors.contentBrandDefault,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
    ColorShowcase.ColorItem(
        colorName = "contentInfoDefault",
        color = GrapesTheme.colors.contentInfoDefault,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
    ColorShowcase.ColorItem(
        colorName = "contentSuccessDefault",
        color = GrapesTheme.colors.contentSuccessDefault,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
    ColorShowcase.ColorItem(
        colorName = "contentWarningDefault",
        color = GrapesTheme.colors.contentWarningDefault,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
    ColorShowcase.ColorItem(
        colorName = "contentAlertDefault",
        color = GrapesTheme.colors.contentAlertDefault,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
)

@Composable
private fun borderDefault(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "borderDefault",
        color = GrapesTheme.colors.borderDefault,
        contentColor = GrapesTheme.colors.contentPrimary
    ),
    ColorShowcase.ColorItem(
        colorName = "borderComplementary",
        color = GrapesTheme.colors.borderComplementary,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
    ColorShowcase.ColorItem(
        colorName = "borderHover",
        color = GrapesTheme.colors.borderHover,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
    ColorShowcase.ColorItem(
        colorName = "borderSelected",
        color = GrapesTheme.colors.borderSelected,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
)

@Composable
private fun borderInfo(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "borderInfoDefault",
        color = GrapesTheme.colors.borderInfoDefault,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
    ColorShowcase.ColorItem(
        colorName = "borderInfoDecorative",
        color = GrapesTheme.colors.borderInfoDecorative,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
)

@Composable
private fun borderSuccess(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "borderSuccessDefault",
        color = GrapesTheme.colors.borderSuccessDefault,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
    ColorShowcase.ColorItem(
        colorName = "borderSuccessDecorative",
        color = GrapesTheme.colors.borderSuccessDecorative,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
)

@Composable
private fun borderWarning(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "borderWarningDefault",
        color = GrapesTheme.colors.borderWarningDefault,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
    ColorShowcase.ColorItem(
        colorName = "borderWarningDecorative",
        color = GrapesTheme.colors.borderWarningDecorative,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
)

@Composable
private fun borderAlert(): ImmutableList<ColorShowcase> = persistentListOf(
    ColorShowcase.ColorItem(
        colorName = "borderAlertDefault",
        color = GrapesTheme.colors.borderAlertDefault,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
    ColorShowcase.ColorItem(
        colorName = "borderAlertDecorative",
        color = GrapesTheme.colors.borderAlertDecorative,
        contentColor = GrapesTheme.colors.contentComplementary
    ),
)
