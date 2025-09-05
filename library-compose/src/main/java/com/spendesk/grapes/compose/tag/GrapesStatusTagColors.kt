package com.spendesk.grapes.compose.tag

import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author jean-philippe
 * @since 18/10/2023, Wednesday
 **/
@Composable
internal fun NeutralGrapesTagColors(
    containerColor: Color = GrapesTheme.colors.neutralLightest,
    contentColor: Color = LocalContentColor.current,
): GrapesStatusTagColors = DefaultGrapesStatusTagColors(
    containerColor = containerColor,
    contentColor = contentColor,
)

@Composable
internal fun ErrorGrapesTagColors(
    containerColor: Color = GrapesTheme.colors.backgroundSecondaryAlertDefault,
    contentColor: Color = LocalContentColor.current,
): GrapesStatusTagColors = DefaultGrapesStatusTagColors(
    containerColor = containerColor,
    contentColor = contentColor,
)

@Composable
internal fun WarningGrapesTagColors(
    containerColor: Color = GrapesTheme.colors.backgroundSecondaryWarningDefault,
    contentColor: Color = LocalContentColor.current,
): GrapesStatusTagColors = DefaultGrapesStatusTagColors(
    containerColor = containerColor,
    contentColor = contentColor,
)

@Composable
internal fun InfoGrapesTagColors(
    containerColor: Color = GrapesTheme.colors.backgroundSecondaryInfoDefault,
    contentColor: Color = LocalContentColor.current,
): GrapesStatusTagColors = DefaultGrapesStatusTagColors(
    containerColor = containerColor,
    contentColor = contentColor,
)

@Composable
internal fun SuccessGrapesTagColors(
    containerColor: Color = GrapesTheme.colors.backgroundSecondarySuccessDefault,
    contentColor: Color = LocalContentColor.current,
): GrapesStatusTagColors = DefaultGrapesStatusTagColors(
    containerColor = containerColor,
    contentColor = contentColor,
)

private class DefaultGrapesStatusTagColors constructor(
    private val containerColor: Color,
    private val contentColor: Color,
) : GrapesStatusTagColors {

    @Composable
    override fun containerColor(): State<Color> {
        return rememberUpdatedState(containerColor)
    }

    @Composable
    override fun contentColor(): State<Color> {
        return rememberUpdatedState(contentColor)
    }
}

@Stable
interface GrapesStatusTagColors {

    @Composable
    fun containerColor(): State<Color>

    @Composable
    fun contentColor(): State<Color>
}
