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

    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "unit0",
            imports = ["com.spendesk.grapes.compose.theme.GrapesDimensions"]
        )
    )
    val spacing0: Dp = 0.dp,

    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "unit4",
            imports = ["com.spendesk.grapes.compose.theme.GrapesDimensions"]
        )
    )
    val spacing1: Dp = 4.dp,

    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "unit8",
            imports = ["com.spendesk.grapes.compose.theme.GrapesDimensions"]
        )
    )
    val spacing2: Dp = 8.dp,

    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "unit16",
            imports = ["com.spendesk.grapes.compose.theme.GrapesDimensions"]
        )
    )
    val spacing3: Dp = 16.dp,

    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "unit24",
            imports = ["com.spendesk.grapes.compose.theme.GrapesDimensions"]
        )
    )
    val spacing4: Dp = 24.dp,

    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "unit32",
            imports = ["com.spendesk.grapes.compose.theme.GrapesDimensions"]
        )
    )
    val spacing5: Dp = 32.dp,

    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "unit40",
            imports = ["com.spendesk.grapes.compose.theme.GrapesDimensions"]
        )
    )
    val spacing6: Dp = 40.dp,

    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "unit48",
            imports = ["com.spendesk.grapes.compose.theme.GrapesDimensions"]
        )
    )
    val spacing7: Dp = 48.dp,

    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "unit56",
            imports = ["com.spendesk.grapes.compose.theme.GrapesDimensions"]
        )
    )
    val spacing8: Dp = 56.dp,

    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "unit64",
            imports = ["com.spendesk.grapes.compose.theme.GrapesDimensions"]
        )
    )
    val spacing9: Dp = 64.dp,

    val elevationNormal: Dp = 8.dp,

    @Deprecated("Pre UI refresh design token, without equivalent")
    val sizing1: Dp = 12.dp,

    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "sizeIconM",
            imports = ["com.spendesk.grapes.compose.theme.GrapesDimensions"]
        )
    )
    val sizing2: Dp = 16.dp,

    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "sizeIconL",
            imports = ["com.spendesk.grapes.compose.theme.GrapesDimensions"]
        )
    )
    val sizing3: Dp = 20.dp,

    @Deprecated(
        "Pre UI refresh design token",
        replaceWith = ReplaceWith(
            expression = "sizeIconXl",
            imports = ["com.spendesk.grapes.compose.theme.GrapesDimensions"]
        )
    )
    val sizing4: Dp = 24.dp,

    @Deprecated("Pre UI refresh design token, without equivalent")
    val sizing5: Dp = 32.dp,

    @Deprecated("Pre UI refresh design token, without equivalent")
    val sizing6: Dp = 40.dp,

    @Deprecated("Pre UI refresh design token, without equivalent")
    val sizing7: Dp = 56.dp,
    // endregion pre-UI refresh

    // region UI refresh
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

    // endregion UI refresh
)

internal val LocalGrapesDimensions = staticCompositionLocalOf { GrapesDimensions() }
