package com.spendesk.grapes.compose.appbar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.spendesk.grapes.compose.theme.GrapesTheme

object GrapesTopAppBarDefaults {

    @Composable
    @OptIn(ExperimentalMaterial3Api::class)
    fun largeTopAppBarColors(
        containerColor: Color = GrapesTheme.colors.backgroundPrimaryDefault,
        scrolledContainerColor: Color = GrapesTheme.colors.backgroundPrimaryDefault,
        navigationIconContentColor: Color = GrapesTheme.colors.contentPrimary,
        titleContentColor: Color = GrapesTheme.colors.contentPrimary,
        actionIconContentColor: Color = GrapesTheme.colors.contentPrimary,
    ) = TopAppBarDefaults.largeTopAppBarColors(
        containerColor = containerColor,
        scrolledContainerColor = scrolledContainerColor,
        navigationIconContentColor = navigationIconContentColor,
        titleContentColor = titleContentColor,
        actionIconContentColor = actionIconContentColor,
    )

    @Composable
    @OptIn(ExperimentalMaterial3Api::class)
    fun mediumTopAppBarColors(
        containerColor: Color = GrapesTheme.colors.backgroundPrimaryDefault,
        scrolledContainerColor: Color = GrapesTheme.colors.backgroundPrimaryDefault,
        navigationIconContentColor: Color = GrapesTheme.colors.contentPrimary,
        titleContentColor: Color = GrapesTheme.colors.contentPrimary,
        actionIconContentColor: Color = GrapesTheme.colors.contentPrimary,
    ) = TopAppBarDefaults.mediumTopAppBarColors(
        containerColor = containerColor,
        scrolledContainerColor = scrolledContainerColor,
        navigationIconContentColor = navigationIconContentColor,
        titleContentColor = titleContentColor,
        actionIconContentColor = actionIconContentColor,
    )

    @Composable
    @OptIn(ExperimentalMaterial3Api::class)
    fun topAppBarColors(
        containerColor: Color = GrapesTheme.colors.backgroundPrimaryDefault,
        scrolledContainerColor: Color = GrapesTheme.colors.backgroundPrimaryDefault,
        navigationIconContentColor: Color = GrapesTheme.colors.contentPrimary,
        titleContentColor: Color = GrapesTheme.colors.contentPrimary,
        actionIconContentColor: Color = GrapesTheme.colors.contentPrimary,
    ) = TopAppBarDefaults.topAppBarColors(
        containerColor = containerColor,
        scrolledContainerColor = scrolledContainerColor,
        navigationIconContentColor = navigationIconContentColor,
        titleContentColor = titleContentColor,
        actionIconContentColor = actionIconContentColor,
    )
}
