package com.spendesk.grapes.compose.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * @author : danyboucanova
 * @since : 16/05/2022, Mon
 **/

@Immutable
data class GrapesDimensions(
    val dividerThickness: Dp = 1.0.dp,

    val borderLarge: Dp = 2.0.dp,

    val elevationNormal: Dp = 8.dp,

    val sizeIconS: Dp = 14.dp,
    val sizeIconM: Dp = 16.dp,
    val sizeIconL: Dp = 20.dp,
    val sizeIconXl: Dp = 24.dp,

    val unit0: Dp = 0.dp,
    val unit4: Dp = 4.dp,
    val unit8: Dp = 8.dp,
    val unit12: Dp = 12.dp,
    val unit16: Dp = 16.dp,
    val unit20: Dp = 20.dp,
    val unit24: Dp = 24.dp,
    val unit32: Dp = 32.dp,
    val unit40: Dp = 40.dp,
    val unit48: Dp = 48.dp,
    val unit56: Dp = 56.dp,
    val unit64: Dp = 64.dp,
)

internal val LocalGrapesDimensions = staticCompositionLocalOf { GrapesDimensions() }
