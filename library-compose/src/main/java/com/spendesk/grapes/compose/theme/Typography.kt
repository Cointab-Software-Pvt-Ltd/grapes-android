package com.spendesk.grapes.compose.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.spendesk.grapes.compose.R

/**
 * @author : danyboucanova
 * @since : 03/05/2022, Tue
 **/

private val Roobert = FontFamily(
    Font(R.font.font_roobert_medium, FontWeight.Medium),
)

@OptIn(ExperimentalTextApi::class)
private val Inter = FontFamily(
    Font(
        R.font.font_inter_opsz_wght,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(600),
            FontVariation.width(100f),
            FontVariation.slant(0f),
        ),
        weight = FontWeight.SemiBold
    ),
    Font(
        R.font.font_inter_opsz_wght,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(500),
            FontVariation.width(100f),
            FontVariation.slant(0f),
        ),
        weight = FontWeight.Medium
    )
)

@Immutable
data class GrapesTypography(
    val bodyXs: TextStyle,
    val bodyS: TextStyle,
    val bodyM: TextStyle,
    @Deprecated("No longer used")
    val bodyL: TextStyle,
    @Deprecated("No longer used")
    val bodyXl: TextStyle,
    @Deprecated("No longer used")
    val bodyXxl: TextStyle,
    val titleS: TextStyle,
    val titleM: TextStyle,
    val titleL: TextStyle,
    val titleXl: TextStyle,
    val titleXxl: TextStyle,
    val heading: TextStyle,
) {
    constructor(
        defaultFontFamily: FontFamily = Inter,
        bodyXs: TextStyle = TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp,
            lineHeight = 16.sp,
        ),
        bodyS: TextStyle = TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            lineHeight = 20.sp,
        ),
        bodyM: TextStyle = TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            lineHeight = 24.sp,
        ),
        bodyL: TextStyle = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
        ),
        bodyXl: TextStyle = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp,
        ),
        bodyXxl: TextStyle = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 40.sp,
        ),
        titleS: TextStyle = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            lineHeight = 20.sp,
        ),
        titleM: TextStyle = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            lineHeight = 24.sp,
        ),
        titleL: TextStyle = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp,
            lineHeight = 26.sp,
        ),
        titleXl: TextStyle = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            lineHeight = 28.sp,
        ),
        titleXxl: TextStyle = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp,
            lineHeight = 32.sp,
        ),
        heading: TextStyle = TextStyle(
            fontFamily = Roobert,
            fontWeight = FontWeight.Medium,
            fontSize = 32.sp,
            lineHeight = 40.sp,
        ),
    ) : this(
        bodyXs = bodyXs.withDefaultFontFamily(defaultFontFamily),
        bodyS = bodyS.withDefaultFontFamily(defaultFontFamily),
        bodyM = bodyM.withDefaultFontFamily(defaultFontFamily),
        bodyL = bodyL.withDefaultFontFamily(defaultFontFamily),
        bodyXl = bodyXl.withDefaultFontFamily(defaultFontFamily),
        bodyXxl = bodyXxl.withDefaultFontFamily(defaultFontFamily),
        titleS = titleS.withDefaultFontFamily(defaultFontFamily),
        titleM = titleM.withDefaultFontFamily(defaultFontFamily),
        titleL = titleL.withDefaultFontFamily(defaultFontFamily),
        titleXl = titleXl.withDefaultFontFamily(defaultFontFamily),
        titleXxl = titleXxl.withDefaultFontFamily(defaultFontFamily),
        heading = heading,
    )
}

internal val LocalGrapesTypography = staticCompositionLocalOf { GrapesTypography() }

private fun TextStyle.withDefaultFontFamily(default: FontFamily): TextStyle {
    return if (fontFamily != null) this else copy(fontFamily = default)
}
