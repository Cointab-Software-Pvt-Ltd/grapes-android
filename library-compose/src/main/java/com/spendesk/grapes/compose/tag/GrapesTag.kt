package com.spendesk.grapes.compose.tag

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.icons.GrapesIconSet
import com.spendesk.grapes.compose.tag.atoms.GrapesTagIcon
import com.spendesk.grapes.compose.theme.GrapesTheme
import com.spendesk.grapes.compose.theme.LocalGrapesShapes

/**
 * @author jean-philippe
 * @since 18/10/2023, Wednesday
 **/

@Composable
fun GrapesSuccessTag(
    label: String,
    showIcon: Boolean = true,
) {
    CompositionLocalProvider(
        LocalContentColor provides GrapesTheme.colors.contentSuccessDefault,
    ) {
        val icon: @Composable () -> Unit = @Composable {
            GrapesTagIcon(iconRes = R.drawable.ic_grapes_icon_circle_check, contentDescription = "Success tag icon")
        }

        val tagColors = SuccessGrapesTagColors()

        GrapesStatusTag(
            label = label,
            leadingIcon = icon.takeIf { showIcon },
            backgroundColor = tagColors.containerColor().value,
        )
    }
}

@Composable
fun GrapesInfoTag(
    label: String,
    showIcon: Boolean = true,
) {
    CompositionLocalProvider(
        LocalContentColor provides GrapesTheme.colors.contentInfoDefault,
    ) {
        val icon: @Composable () -> Unit = @Composable {
            GrapesTagIcon(iconRes = R.drawable.ic_grapes_icon_circle_information, contentDescription = "Info tag icon")
        }

        val tagColors = InfoGrapesTagColors()

        GrapesStatusTag(
            label = label,
            leadingIcon = icon.takeIf { showIcon },
            backgroundColor = tagColors.containerColor().value,
        )
    }
}

@Composable
fun GrapesWarningTag(
    label: String,
    showIcon: Boolean = true,
) {
    CompositionLocalProvider(
        LocalContentColor provides GrapesTheme.colors.contentWarningDefault,
    ) {
        val icon: @Composable () -> Unit = @Composable {
            GrapesTagIcon(iconRes = R.drawable.ic_grapes_icon_triangle_warning, contentDescription = "Warning tag icon")
        }

        val tagColors = WarningGrapesTagColors()

        GrapesStatusTag(
            label = label,
            leadingIcon = icon.takeIf { showIcon },
            backgroundColor = tagColors.containerColor().value,
        )
    }
}

@Composable
fun GrapesErrorTag(
    label: String,
    showIcon: Boolean = true,
) {
    CompositionLocalProvider(
        LocalContentColor provides GrapesTheme.colors.contentAlertDefault,
    ) {
        val icon: @Composable () -> Unit = @Composable {
            GrapesTagIcon(iconRes = R.drawable.ic_grapes_icon_hexagone_cross, contentDescription = "Error tag icon")
        }

        val tagColors = ErrorGrapesTagColors()

        GrapesStatusTag(
            label = label,
            leadingIcon = icon.takeIf { showIcon },
            backgroundColor = tagColors.containerColor().value,
        )
    }
}

@Composable
fun GrapesNeutralTag(
    label: String,
    showIcon: Boolean = true,
) {
    CompositionLocalProvider(
        LocalContentColor provides GrapesTheme.colors.contentSecondaryBGSecondary,
    ) {
        val icon: @Composable () -> Unit = @Composable {
            GrapesTagIcon(iconRes = R.drawable.ic_grapes_icon_circle_question_filled, contentDescription = "Neutral tag icon")
        }

        val tagColors = NeutralGrapesTagColors()

        GrapesStatusTag(
            label = label,
            leadingIcon = icon.takeIf { showIcon },
            backgroundColor = tagColors.containerColor().value,
        )
    }
}

@Composable
fun GrapesDecorativeTag(
    label: String,
    backgroundColor: GrapesDecorativeTagColors,
    modifier: Modifier = Modifier,
    leadingIcon: (@Composable () -> Unit)? = null,
) {
    CompositionLocalProvider(
        LocalContentColor provides GrapesTheme.colors.contentPrimary,
    ) {
        GrapesStatusTag(
            modifier = modifier,
            label = label,
            backgroundColor = backgroundColor.containerColor(),
            leadingIcon = leadingIcon,
        )
    }
}

@Composable
fun GrapesStatusTag(
    label: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
    leadingIcon: (@Composable () -> Unit)? = null,
) {
    Surface(
        modifier = modifier.height(GrapesTheme.dimensions.sizeIconXl),
        shape = LocalGrapesShapes.current.radius1000,
        color = backgroundColor,
    ) {
        Row(
            modifier = Modifier
                .padding(
                    PaddingValues(
                        start = GrapesTheme.dimensions.unit8.takeIf { leadingIcon == null } ?: GrapesTheme.dimensions.unit4,
                        end = GrapesTheme.dimensions.unit8,
                    )
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit4),
        ) {
            if (leadingIcon != null) {
                Box(
                    modifier = Modifier.size(GrapesTheme.dimensions.sizeIconM),
                    contentAlignment = Alignment.Center,
                ) {
                    leadingIcon()
                }
            }

            Text(
                text = label,
                style = GrapesTheme.typography.bodyL,
                color = LocalContentColor.current
            )
        }
    }
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
                    GrapesErrorTag(label = tag.tag, showIcon = true)
                    GrapesErrorTag(label = tag.tag, showIcon = false)
                }

                is StatusTags.Info -> {
                    GrapesInfoTag(label = tag.tag, showIcon = true)
                    GrapesInfoTag(label = tag.tag, showIcon = false)
                }

                is StatusTags.Success -> {
                    GrapesSuccessTag(label = tag.tag, showIcon = true)
                    GrapesSuccessTag(label = tag.tag, showIcon = false)
                }

                is StatusTags.Warning -> {
                    GrapesWarningTag(label = tag.tag, showIcon = true)
                    GrapesWarningTag(label = tag.tag, showIcon = false)
                }

                is StatusTags.Neutral -> {
                    GrapesNeutralTag(label = tag.tag, showIcon = true)
                    GrapesNeutralTag(label = tag.tag, showIcon = false)
                }
            }
        }
    }
}

internal class StatusTagProvider : PreviewParameterProvider<StatusTags> {

    override val values: Sequence<StatusTags> = sequenceOf(
        StatusTags.Error("Error"),
        StatusTags.Warning("Warning"),
        StatusTags.Info("Info"),
        StatusTags.Success("Success"),
        StatusTags.Neutral("Neutral"),
    )
}

internal sealed class StatusTags {

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
                backgroundColor = tag.colors,
                leadingIcon = {
                    GrapesIconSet.Puzzle()
                },
            )

            GrapesDecorativeTag(
                label = tag.label,
                backgroundColor = tag.colors,
                leadingIcon = null,
            )
        }
    }
}

internal class DecorativeTagProvider : PreviewParameterProvider<DecorativeTag> {

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

internal data class DecorativeTag(val label: String, val colors: GrapesDecorativeTagColors)
