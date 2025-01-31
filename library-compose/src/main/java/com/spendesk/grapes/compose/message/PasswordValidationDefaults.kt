package com.spendesk.grapes.compose.message

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author Kélian CLERC
 * @since 27/02/2023
 */
@Immutable
object PasswordValidationDefaults {

    val ValidationItemSize: Dp @Composable get() = GrapesTheme.dimensions.sizeIconM
    val ValidationSuccessItemSize: Dp @Composable get() = GrapesTheme.dimensions.sizeIconM
    val ValidationBoxSize = 16.dp

    val SuccessColor: Color @Composable get() = GrapesTheme.colors.contentSuccessDefault
    val ErrorColor: Color @Composable get() = GrapesTheme.colors.contentAlertDefault

    @DrawableRes
    val ValidIcon: Int = R.drawable.ic_grapes_icon_circle_check

    @DrawableRes
    val InvalidIcon: Int = R.drawable.ic_grapes_icon_circle_cross
}
