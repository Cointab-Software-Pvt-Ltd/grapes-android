package com.spendesk.grapes.compose.tag

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.icons.GrapesIconSet
import com.spendesk.grapes.compose.tag.atoms.GrapesTagIcon
import com.spendesk.grapes.compose.theme.GrapesTheme

@Composable
fun GrapesSuccessTag(
    label: String,
    modifier: Modifier = Modifier,
    iconPosition: GrapesTagIconPosition = GrapesTagDefaults.defaultTagPosition(),
    icon: (@Composable () -> Unit)? = {
        GrapesTagIcon(
            iconRes = R.drawable.ic_grapes_icon_circle_check,
            contentDescription = null,
        )
    },
) {
    GrapesStatusTag(
        label = label,
        leadingIcon = icon.takeIf { iconPosition == GrapesTagIconPosition.Leading },
        trailingIcon = icon.takeIf { iconPosition == GrapesTagIconPosition.Trailing },
        colors = GrapesTagDefaults.colorsSuccess(),
        modifier = modifier,
    )
}

@Composable
fun GrapesInfoTag(
    label: String,
    modifier: Modifier = Modifier,
    iconPosition: GrapesTagIconPosition = GrapesTagDefaults.defaultTagPosition(),
    icon: (@Composable () -> Unit)? = {
        GrapesTagIcon(
            iconRes = R.drawable.ic_grapes_icon_circle_information,
            contentDescription = null,
        )
    },
) {
    GrapesStatusTag(
        label = label,
        leadingIcon = icon.takeIf { iconPosition == GrapesTagIconPosition.Leading },
        trailingIcon = icon.takeIf { iconPosition == GrapesTagIconPosition.Trailing },
        colors = GrapesTagDefaults.colorsInfo(),
        modifier = modifier,
    )
}

@Composable
fun GrapesWarningTag(
    label: String,
    modifier: Modifier = Modifier,
    iconPosition: GrapesTagIconPosition = GrapesTagDefaults.defaultTagPosition(),
    icon: (@Composable () -> Unit)? = {
        GrapesTagIcon(
            iconRes = R.drawable.ic_grapes_icon_triangle_warning,
            contentDescription = null,
        )
    },
) {
    GrapesStatusTag(
        label = label,
        leadingIcon = icon.takeIf { iconPosition == GrapesTagIconPosition.Leading },
        trailingIcon = icon.takeIf { iconPosition == GrapesTagIconPosition.Trailing },
        colors = GrapesTagDefaults.colorsWarning(),
        modifier = modifier,
    )
}

@Composable
fun GrapesAlertTag(
    label: String,
    modifier: Modifier = Modifier,
    iconPosition: GrapesTagIconPosition = GrapesTagDefaults.defaultTagPosition(),
    icon: (@Composable () -> Unit)? = {
        GrapesTagIcon(
            iconRes = R.drawable.ic_grapes_icon_octogone_cross,
            contentDescription = null,
        )
    },
) {
    GrapesStatusTag(
        label = label,
        leadingIcon = icon.takeIf { iconPosition == GrapesTagIconPosition.Leading },
        trailingIcon = icon.takeIf { iconPosition == GrapesTagIconPosition.Trailing },
        colors = GrapesTagDefaults.colorsAlert(),
        modifier = modifier,
    )
}

@Composable
fun GrapesNeutralTag(
    label: String,
    modifier: Modifier = Modifier,
    iconPosition: GrapesTagIconPosition = GrapesTagDefaults.defaultTagPosition(),
    icon: (@Composable () -> Unit)? = {
        GrapesTagIcon(
            iconRes = R.drawable.ic_grapes_icon_circle_question_filled,
            contentDescription = null,
        )
    },
) {
    GrapesStatusTag(
        label = label,
        leadingIcon = icon.takeIf { iconPosition == GrapesTagIconPosition.Leading },
        trailingIcon = icon.takeIf { iconPosition == GrapesTagIconPosition.Trailing },
        colors = GrapesTagDefaults.colorsNeutral(),
        modifier = modifier,
    )
}

@Composable
fun GrapesDecorativeTag(
    label: String,
    colors: GrapesDecorativeTagColors,
    modifier: Modifier = Modifier,
    iconPosition: GrapesTagIconPosition = GrapesTagDefaults.defaultTagPosition(),
    icon: (@Composable () -> Unit)? = {
        GrapesTagIcon(
            iconRes = R.drawable.ic_grapes_icon_circle_question_filled,
            contentDescription = null,
        )
    },
) {
    GrapesStatusTag(
        label = label,
        colors = GrapesStatusTagColors(
            containerColor = colors.containerColor(),
            contentColor = GrapesTheme.colors.contentPrimary,
        ),
        leadingIcon = icon.takeIf { iconPosition == GrapesTagIconPosition.Leading },
        trailingIcon = icon.takeIf { iconPosition == GrapesTagIconPosition.Trailing },
        modifier = modifier
    )
}

@Composable
fun GrapesStatusTag(
    label: String,
    colors: GrapesStatusTagColors,
    modifier: Modifier = Modifier,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
) {
    Surface(
        modifier = modifier.height(GrapesTheme.dimensions.sizeIconXl),
        shape = GrapesTheme.shapes.radius1000,
        color = colors.containerColor,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = GrapesTheme.dimensions.unit4)
        ) {
            CompositionLocalProvider(
                LocalContentColor provides colors.contentColor,
            ) {
                if (leadingIcon != null) {
                    Box(
                        contentAlignment = Alignment.Center,
                        content = { leadingIcon() },
                        modifier = Modifier.size(GrapesTheme.dimensions.sizeIconM),
                    )
                }

                Text(
                    text = label,
                    style = GrapesTheme.typography.bodyL,
                    modifier = Modifier.padding(horizontal = GrapesTheme.dimensions.unit4)
                )

                if (trailingIcon != null) {
                    Box(
                        contentAlignment = Alignment.Center,
                        content = { trailingIcon() },
                        modifier = Modifier.size(GrapesTheme.dimensions.sizeIconM),
                    )
                }
            }
        }
    }
}

data object GrapesTagDefaults {

    fun defaultTagPosition(): GrapesTagIconPosition = GrapesTagIconPosition.Leading

    @Composable
    internal fun colorsNeutral(): GrapesStatusTagColors = GrapesStatusTagColors(
        containerColor = GrapesTheme.colors.neutralLightest,
        contentColor = GrapesTheme.colors.contentSecondaryBGSecondary,
    )

    @Composable
    internal fun colorsAlert(): GrapesStatusTagColors = GrapesStatusTagColors(
        containerColor = GrapesTheme.colors.backgroundSecondaryAlertDefault,
        contentColor = GrapesTheme.colors.contentAlertDefault,
    )

    @Composable
    internal fun colorsWarning(): GrapesStatusTagColors = GrapesStatusTagColors(
        containerColor = GrapesTheme.colors.backgroundSecondaryWarningDefault,
        contentColor = GrapesTheme.colors.contentWarningDefault,
    )

    @Composable
    internal fun colorsInfo(): GrapesStatusTagColors = GrapesStatusTagColors(
        containerColor = GrapesTheme.colors.backgroundSecondaryInfoDefault,
        contentColor = GrapesTheme.colors.contentInfoDefault,
    )

    @Composable
    internal fun colorsSuccess(): GrapesStatusTagColors = GrapesStatusTagColors(
        containerColor = GrapesTheme.colors.backgroundSecondarySuccessDefault,
        contentColor = GrapesTheme.colors.contentSuccessDefault,
    )
}

@Preview
@Composable
private fun PreviewStatusTag(
    @PreviewParameter(StatusTagProvider::class) tag: StatusTags,
) {
    GrapesTheme {
        Column(verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8)) {
            when (tag) {
                is StatusTags.Error -> {
                    GrapesAlertTag(
                        label = tag.tag,
                    )
                    GrapesAlertTag(
                        label = tag.tag,
                        iconPosition = GrapesTagIconPosition.Trailing
                    )
                    GrapesAlertTag(
                        label = tag.tag,
                        icon = null
                    )
                }

                is StatusTags.Info -> {
                    GrapesInfoTag(
                        label = tag.tag,
                    )
                    GrapesInfoTag(
                        label = tag.tag,
                        iconPosition = GrapesTagIconPosition.Trailing
                    )
                    GrapesInfoTag(
                        label = tag.tag,
                        icon = null
                    )
                }

                is StatusTags.Success -> {
                    GrapesSuccessTag(
                        label = tag.tag,
                    )
                    GrapesSuccessTag(
                        label = tag.tag,
                        iconPosition = GrapesTagIconPosition.Trailing
                    )
                    GrapesSuccessTag(
                        label = tag.tag,
                        icon = null
                    )
                }

                is StatusTags.Warning -> {
                    GrapesWarningTag(
                        label = tag.tag,
                    )
                    GrapesWarningTag(
                        label = tag.tag,
                        iconPosition = GrapesTagIconPosition.Trailing
                    )
                    GrapesWarningTag(
                        label = tag.tag,
                        icon = null
                    )
                }

                is StatusTags.Neutral -> {
                    GrapesNeutralTag(
                        label = tag.tag,
                    )
                    GrapesNeutralTag(
                        label = tag.tag,
                        iconPosition = GrapesTagIconPosition.Trailing
                    )
                    GrapesNeutralTag(
                        label = tag.tag,
                        icon = null
                    )
                }
            }
        }
    }
}

private class StatusTagProvider : PreviewParameterProvider<StatusTags> {

    override val values: Sequence<StatusTags> = sequenceOf(
        StatusTags.Error("Error"),
        StatusTags.Warning("Warning"),
        StatusTags.Info("Info"),
        StatusTags.Success("Success"),
        StatusTags.Neutral("Neutral"),
    )
}

private sealed class StatusTags {

    abstract val tag: String

    data class Error(override val tag: String) : StatusTags()
    data class Info(override val tag: String) : StatusTags()
    data class Warning(override val tag: String) : StatusTags()
    data class Success(override val tag: String) : StatusTags()
    data class Neutral(override val tag: String) : StatusTags()
}

@Preview
@Composable
private fun PreviewDecorativeTag(
    @PreviewParameter(DecorativeTagProvider::class) tag: DecorativeTag,
) {
    GrapesTheme {
        Column(verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8)) {
            GrapesDecorativeTag(
                label = tag.label,
                colors = tag.colors,
                icon = {
                    GrapesIconSet.Puzzle()
                },
            )

            GrapesDecorativeTag(
                label = tag.label,
                colors = tag.colors,
                icon = null,
            )
        }
    }
}

private class DecorativeTagProvider : PreviewParameterProvider<DecorativeTag> {

    override val values: Sequence<DecorativeTag> = sequenceOf(
        DecorativeTag(
            label = "Neutral",
            colors = GrapesDecorativeTagColor.Neutral,
        ),
        DecorativeTag(
            label = "Forest",
            colors = GrapesDecorativeTagColor.Forest,
        ),
        DecorativeTag(
            label = "Grolive",
            colors = GrapesDecorativeTagColor.Grolive,
        ),
        DecorativeTag(
            label = "Lemon",
            colors = GrapesDecorativeTagColor.Lemon,
        ),
        DecorativeTag(
            label = "Ocean",
            colors = GrapesDecorativeTagColor.Ocean,
        ),
        DecorativeTag(
            label = "Peach",
            colors = GrapesDecorativeTagColor.Peach,
        ),
        DecorativeTag(
            label = "Pink",
            colors = GrapesDecorativeTagColor.Pink,
        ),
        DecorativeTag(
            label = "Purple",
            colors = GrapesDecorativeTagColor.Purple,
        ),
        DecorativeTag(
            label = "Default",
            colors = GrapesDecorativeTagColor.Default,
        ),
    )
}

private data class DecorativeTag(val label: String, val colors: GrapesDecorativeTagColors)
