package com.spendesk.grapes.compose.actionsheet

import androidx.compose.material3.ButtonColors
import androidx.compose.runtime.Composable
import com.spendesk.grapes.compose.theme.GrapesTheme

object GrapesActionSheetDefaults {

    @Composable
    fun colors() = ButtonColors(
        contentColor = GrapesTheme.colors.contentPrimary,
        disabledContentColor = GrapesTheme.colors.contentDisable,
        containerColor = GrapesTheme.colors.backgroundPrimaryDefault,
        disabledContainerColor = GrapesTheme.colors.backgroundPrimaryDefault,
    )

    @Composable
    fun alertColors() = ButtonColors(
        contentColor = GrapesTheme.colors.contentAlertDefault,
        disabledContentColor = GrapesTheme.colors.contentDisable,
        containerColor = GrapesTheme.colors.backgroundPrimaryDefault,
        disabledContainerColor = GrapesTheme.colors.backgroundPrimaryDefault,
    )

    @Composable
    fun brandColors() = ButtonColors(
        contentColor = GrapesTheme.colors.contentBrandDefault,
        disabledContentColor = GrapesTheme.colors.contentDisable,
        containerColor = GrapesTheme.colors.backgroundPrimaryDefault,
        disabledContainerColor = GrapesTheme.colors.backgroundPrimaryDefault,
    )
}
