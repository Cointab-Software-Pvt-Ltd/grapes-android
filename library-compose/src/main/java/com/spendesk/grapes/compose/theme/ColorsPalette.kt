package com.spendesk.grapes.compose.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * @author : danyboucanova
 * @since : 18/05/2022, Wed
 **/
@Suppress("LongParameterList", "LongMethod")
fun lightColorsPalette(
    primaryDark: Color = purple90,

    white: Color = grayWhite,

    neutralLightest: Color = carbon10,
    neutralDark: Color = carbon70,
    neutralNormal: Color = carbon40,
    neutralLight: Color = carbon20,
    neutralLighter: Color = carbon10,

    backgroundOverlay: Color = blue100.copy(alpha = 0.6f),

    backgroundPrimaryDefault: Color = white,
    backgroundPrimaryHover: Color = carbon3.copy(alpha = 0.8f),
    backgroundPrimaryPressed: Color = carbon10.copy(alpha = 0.8f),
    backgroundPrimarySelected: Color = purple10,
    backgroundPrimaryDisabled: Color = carbon5,
    backgroundPrimaryReadOnly: Color = carbon3,

    backgroundPrimaryBrandDefault: Color = purple70,
    backgroundPrimaryBrandHover: Color = purple80,
    backgroundPrimaryBrandPressed: Color = purple90,

    backgroundPrimaryInfoDefault: Color = blue70,
    backgroundPrimaryInfoHover: Color = blue80,
    backgroundPrimaryInfoPressed: Color = blue90,

    backgroundPrimarySuccessDefault: Color = emerald70,
    backgroundPrimarySuccessHover: Color = emerald80,
    backgroundPrimarySuccessPressed: Color = emerald90,

    backgroundPrimaryWarningDefault: Color = apricot70,
    backgroundPrimaryWarningHover: Color = apricot80,
    backgroundPrimaryWarningPressed: Color = apricot90,

    backgroundPrimaryAlertDefault: Color = raspberry70,
    backgroundPrimaryAlertHover: Color = raspberry80,
    backgroundPrimaryAlertPressed: Color = raspberry90,

    backgroundSecondaryDefault: Color = carbon3,
    backgroundSecondaryDisabled: Color = carbon5,

    backgroundSecondaryBrandDefault: Color = purple10,
    backgroundSecondaryBrandHover: Color = purple10.copy(alpha = 0.8f),
    backgroundSecondaryBrandPressed: Color = purple20.copy(alpha = 0.8f),

    backgroundSecondaryInfoDefault: Color = blue10,
    backgroundSecondaryInfoHover: Color = blue10.copy(alpha = 0.8f),
    backgroundSecondaryInfoPressed: Color = blue20.copy(alpha = 0.8f),

    backgroundSecondarySuccessDefault: Color = emerald10,
    backgroundSecondarySuccessHover: Color = emerald10.copy(alpha = 0.8f),
    backgroundSecondarySuccessPressed: Color = emerald20.copy(alpha = 0.8f),

    backgroundSecondaryWarningDefault: Color = apricot10,
    backgroundSecondaryWarningHover: Color = apricot10.copy(alpha = 0.8f),
    backgroundSecondaryWarningPressed: Color = apricot20.copy(alpha = 0.8f),

    backgroundSecondaryAlertDefault: Color = raspberry10,
    backgroundSecondaryAlertHover: Color = raspberry10.copy(alpha = 0.8f),
    backgroundSecondaryAlertPressed: Color = raspberry20.copy(alpha = 0.8f),

    backgroundComplementaryDefault: Color = carbon100,
    backgroundComplementaryHover: Color = carbon80,
    backgroundComplementaryPressed: Color = carbon90,
    backgroundComplementaryDisabled: Color = carbon100,

    contentPrimary: Color = carbon100,
    contentDecorativeIcon: Color = carbon50,
    contentComplementary: Color = white,
    contentSelected: Color = purple70,
    contentDisable: Color = carbon20,

    contentSecondaryBGPrimary: Color = carbon60,
    contentSecondaryBGSecondary: Color = carbon70,

    contentBrandDefault: Color = purple70,

    contentInfoDefault: Color = blue70,
    contentSuccessDefault: Color = emerald70,
    contentWarningDefault: Color = apricot70,
    contentAlertDefault: Color = raspberry70,

    borderDefault: Color = carbon15,
    borderComplementary: Color = carbon80,
    borderHover: Color = purple90,
    borderSelected: Color = purple70,

    borderInfoDefault: Color = blue70,
    borderInfoDecorative: Color = blue50,

    borderSuccessDefault: Color = emerald70,
    borderSuccessDecorative: Color = emerald50,

    borderWarningDefault: Color = apricot70,
    borderWarningDecorative: Color = apricot50,

    borderAlertDefault: Color = raspberry70,
    borderAlertDecorative: Color = raspberry50,
): GrapesColors = GrapesColors(
    mainWhite = white,
    google = google,
    primaryDark = primaryDark,
    neutralDark = neutralDark,
    neutralNormal = neutralNormal,
    neutralLight = neutralLight,
    neutralLighter = neutralLighter,
    neutralLightest = neutralLightest,
    isLight = true,
    backgroundOverlay = backgroundOverlay,
    backgroundPrimaryDefault = backgroundPrimaryDefault,
    backgroundPrimaryHover = backgroundPrimaryHover,
    backgroundPrimaryPressed = backgroundPrimaryPressed,
    backgroundPrimarySelected = backgroundPrimarySelected,
    backgroundPrimaryDisabled = backgroundPrimaryDisabled,
    backgroundPrimaryReadOnly = backgroundPrimaryReadOnly,
    backgroundPrimaryBrandDefault = backgroundPrimaryBrandDefault,
    backgroundPrimaryBrandHover = backgroundPrimaryBrandHover,
    backgroundPrimaryBrandPressed = backgroundPrimaryBrandPressed,
    backgroundPrimaryInfoDefault = backgroundPrimaryInfoDefault,
    backgroundPrimaryInfoHover = backgroundPrimaryInfoHover,
    backgroundPrimaryInfoPressed = backgroundPrimaryInfoPressed,
    backgroundPrimarySuccessDefault = backgroundPrimarySuccessDefault,
    backgroundPrimarySuccessHover = backgroundPrimarySuccessHover,
    backgroundPrimarySuccessPressed = backgroundPrimarySuccessPressed,
    backgroundPrimaryWarningDefault = backgroundPrimaryWarningDefault,
    backgroundPrimaryWarningHover = backgroundPrimaryWarningHover,
    backgroundPrimaryWarningPressed = backgroundPrimaryWarningPressed,
    backgroundPrimaryAlertDefault = backgroundPrimaryAlertDefault,
    backgroundPrimaryAlertHover = backgroundPrimaryAlertHover,
    backgroundPrimaryAlertPressed = backgroundPrimaryAlertPressed,
    backgroundSecondaryDefault = backgroundSecondaryDefault,
    backgroundSecondaryDisabled = backgroundSecondaryDisabled,
    backgroundSecondaryBrandDefault = backgroundSecondaryBrandDefault,
    backgroundSecondaryBrandHover = backgroundSecondaryBrandHover,
    backgroundSecondaryBrandPressed = backgroundSecondaryBrandPressed,
    backgroundSecondaryInfoDefault = backgroundSecondaryInfoDefault,
    backgroundSecondaryInfoHover = backgroundSecondaryInfoHover,
    backgroundSecondaryInfoPressed = backgroundSecondaryInfoPressed,
    backgroundSecondarySuccessDefault = backgroundSecondarySuccessDefault,
    backgroundSecondarySuccessHover = backgroundSecondarySuccessHover,
    backgroundSecondarySuccessPressed = backgroundSecondarySuccessPressed,
    backgroundSecondaryWarningDefault = backgroundSecondaryWarningDefault,
    backgroundSecondaryWarningHover = backgroundSecondaryWarningHover,
    backgroundSecondaryWarningPressed = backgroundSecondaryWarningPressed,
    backgroundSecondaryAlertDefault = backgroundSecondaryAlertDefault,
    backgroundSecondaryAlertHover = backgroundSecondaryAlertHover,
    backgroundSecondaryAlertPressed = backgroundSecondaryAlertPressed,
    backgroundComplementaryDefault = backgroundComplementaryDefault,
    backgroundComplementaryHover = backgroundComplementaryHover,
    backgroundComplementaryPressed = backgroundComplementaryPressed,
    backgroundComplementaryDisabled = backgroundComplementaryDisabled,
    contentPrimary = contentPrimary,
    contentDecorativeIcon = contentDecorativeIcon,
    contentComplementary = contentComplementary,
    contentSelected = contentSelected,
    contentDisable = contentDisable,
    contentSecondaryBGPrimary = contentSecondaryBGPrimary,
    contentSecondaryBGSecondary = contentSecondaryBGSecondary,
    contentBrandDefault = contentBrandDefault,
    contentInfoDefault = contentInfoDefault,
    contentSuccessDefault = contentSuccessDefault,
    contentWarningDefault = contentWarningDefault,
    contentAlertDefault = contentAlertDefault,
    borderDefault = borderDefault,
    borderComplementary = borderComplementary,
    borderHover = borderHover,
    borderSelected = borderSelected,
    borderInfoDefault = borderInfoDefault,
    borderInfoDecorative = borderInfoDecorative,
    borderSuccessDefault = borderSuccessDefault,
    borderSuccessDecorative = borderSuccessDecorative,
    borderWarningDefault = borderWarningDefault,
    borderWarningDecorative = borderWarningDecorative,
    borderAlertDefault = borderAlertDefault,
    borderAlertDecorative = borderAlertDecorative,
)

internal val LocalGrapesColors = staticCompositionLocalOf { lightColorsPalette() }
