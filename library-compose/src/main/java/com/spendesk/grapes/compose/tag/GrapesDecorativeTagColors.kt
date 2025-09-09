package com.spendesk.grapes.compose.tag

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import com.spendesk.grapes.compose.theme.brightForest
import com.spendesk.grapes.compose.theme.brightGrolive
import com.spendesk.grapes.compose.theme.brightLemon
import com.spendesk.grapes.compose.theme.brightOcean
import com.spendesk.grapes.compose.theme.brightPeach
import com.spendesk.grapes.compose.theme.brightPink
import com.spendesk.grapes.compose.theme.carbon7
import com.spendesk.grapes.compose.theme.purple20
import com.spendesk.grapes.compose.theme.white

object GrapesDecorativeTagColor {

    val Neutral: GrapesDecorativeTagColors = DefaultGrapesDecorativeTagColors(containerColor = carbon7)

    val Forest: GrapesDecorativeTagColors = DefaultGrapesDecorativeTagColors(containerColor = brightForest)

    val Grolive: GrapesDecorativeTagColors = DefaultGrapesDecorativeTagColors(containerColor = brightGrolive)

    val Lemon: GrapesDecorativeTagColors = DefaultGrapesDecorativeTagColors(containerColor = brightLemon)

    val Ocean: GrapesDecorativeTagColors = DefaultGrapesDecorativeTagColors(containerColor = brightOcean)

    val Peach: GrapesDecorativeTagColors = DefaultGrapesDecorativeTagColors(containerColor = brightPeach)

    val Pink: GrapesDecorativeTagColors = DefaultGrapesDecorativeTagColors(containerColor = brightPink)

    val Purple: GrapesDecorativeTagColors = DefaultGrapesDecorativeTagColors(containerColor = purple20)

    val Default: GrapesDecorativeTagColors = DefaultGrapesDecorativeTagColors(containerColor = white)
}

private class DefaultGrapesDecorativeTagColors(
    private val containerColor: Color,
) : GrapesDecorativeTagColors {

    @Composable
    override fun containerColor(): Color {
        return containerColor
    }
}

@Stable
interface GrapesDecorativeTagColors {

    @Composable
    fun containerColor(): Color
}
