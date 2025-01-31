package com.spendesk.grapes.compose.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.dp

/**
 * @author Kélian CLERC
 * @since 29/09/2022
 */
@Immutable
data class GrapesShapes(
    val radius0: CornerBasedShape = RoundedCornerShape(cornerRadius0Dp),
    val radius4: CornerBasedShape = RoundedCornerShape(cornerRadius4Dp),
    val radius8: CornerBasedShape = RoundedCornerShape(cornerRadius8Dp),
    val radius12: CornerBasedShape = RoundedCornerShape(cornerRadius12Dp),
    val radius1000: CornerBasedShape = RoundedCornerShape(CornerRadiusRoundedPercent),
)

private val cornerRadius0Dp = 0.dp
private val cornerRadius4Dp = 4.dp
private val cornerRadius8Dp = 8.dp
private val cornerRadius12Dp = 12.dp
private const val CornerRadiusRoundedPercent = 50

internal val LocalGrapesShapes = staticCompositionLocalOf { GrapesShapes() }
