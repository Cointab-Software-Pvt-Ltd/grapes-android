@file:Suppress("MatchingDeclarationName")

package com.spendesk.grapes.compose.appbar

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author : RomainGF
 * @since : 09/10/2023
 **/

interface GrapesNavigationItem {

    @get:StringRes val title: Int

    @get:DrawableRes val icon: Int
}

@Composable
fun GrapesNavigationBar(
    tabs: List<GrapesNavigationItem>,
    selected: GrapesNavigationItem?,
    onSelected: (GrapesNavigationItem) -> Unit,
    modifier: Modifier = Modifier,
    windowInsets: WindowInsets = NavigationBarDefaults.windowInsets,
) {
    NavigationBar(
        containerColor = GrapesTheme.colors.backgroundPrimaryDefault,
        contentColor = GrapesTheme.colors.contentSelected,
        windowInsets = windowInsets,
        modifier = modifier,
    ) {
        tabs.forEach { tab ->
            GrapesNavigationBarItem(
                selected = tab == selected,
                tab = tab,
                onSelected = onSelected,
            )
        }
    }
}

@Composable
private fun RowScope.GrapesNavigationBarItem(
    selected: Boolean,
    tab: GrapesNavigationItem,
    onSelected: (GrapesNavigationItem) -> Unit,
) {
    val textStyle = GrapesTheme.typography.titleM
    val colors = NavigationBarItemDefaults.colors(
        indicatorColor = GrapesTheme.colors.backgroundPrimaryDefault,
        selectedIconColor = GrapesTheme.colors.contentSelected,
        selectedTextColor = GrapesTheme.colors.contentSelected,
        unselectedIconColor = GrapesTheme.colors.neutralDark,
        unselectedTextColor = GrapesTheme.colors.neutralDark,
    )

    NavigationBarItem(
        selected = selected,
        onClick = { onSelected(tab) },
        icon = {
            Icon(
                painter = painterResource(tab.icon),
                contentDescription = null,
            )
        },
        label = {
            Text(
                text = stringResource(tab.title),
                style = textStyle,
            )
        },
        colors = colors,
    )
}

@Preview
@Preview(fontScale = 2f)
@Composable
private fun Preview() {
    GrapesTheme {
        val tabs = listOf(
            object : GrapesNavigationItem {
                override val title: Int = R.string.grapes_top_app_bar_back_icon_description
                override val icon: Int = R.drawable.ic_grapes_icon_circle_plus
            },
            object : GrapesNavigationItem {
                override val title: Int = R.string.grapes_top_app_bar_close_icon_description
                override val icon: Int = R.drawable.ic_grapes_icon_arrow_left
            },
            object : GrapesNavigationItem {
                override val title: Int = R.string.grapes_top_app_bar_more_icon_description
                override val icon: Int = R.drawable.ic_grapes_icon_ellipsis_vertical
            }
        )
        GrapesNavigationBar(
            tabs = tabs,
            selected = tabs.first(),
            onSelected = {},
            modifier = Modifier,
        )
    }
}
