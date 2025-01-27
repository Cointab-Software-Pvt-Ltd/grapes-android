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
    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "radius0",
            imports = ["com.spendesk.grapes.compose.theme.GrapesShapes"]
        )
    )
    val shape0: CornerBasedShape = RoundedCornerShape(cornerRadius0Dp),

    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "radius4",
            imports = ["com.spendesk.grapes.compose.theme.GrapesShapes"]
        )
    )
    val shape1: CornerBasedShape = RoundedCornerShape(cornerRadius1Dp),

    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "radius8",
            imports = ["com.spendesk.grapes.compose.theme.GrapesShapes"]
        )
    )
    val shape2: CornerBasedShape = RoundedCornerShape(cornerRadius2Dp),

    @Deprecated("Pre UI refresh design token, without equivalent")
    val shape3: CornerBasedShape = RoundedCornerShape(cornerRadius3Dp),

    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "radius1000",
            imports = ["com.spendesk.grapes.compose.theme.GrapesShapes"]
        )
    )
    val shape4: CornerBasedShape = RoundedCornerShape(CornerRadiusRoundedPercent),

    // UI refresh:
    val radius0: CornerBasedShape = RoundedCornerShape(cornerRadius0Dp),
    val radius4: CornerBasedShape = RoundedCornerShape(cornerRadius4Dp),
    val radius8: CornerBasedShape = RoundedCornerShape(cornerRadius8Dp),
    val radius12: CornerBasedShape = RoundedCornerShape(cornerRadius12Dp),
    val radius1000: CornerBasedShape = RoundedCornerShape(CornerRadiusRoundedPercent),
)

private val cornerRadius1Dp = 4.dp
private val cornerRadius2Dp = 8.dp
private val cornerRadius3Dp = 16.dp

// UI refresh
private val cornerRadius0Dp = 0.dp
private val cornerRadius4Dp = 4.dp
private val cornerRadius8Dp = 8.dp
private val cornerRadius12Dp = 12.dp
private const val CornerRadiusRoundedPercent = 50

internal val LocalGrapesShapes = staticCompositionLocalOf { GrapesShapes() }
