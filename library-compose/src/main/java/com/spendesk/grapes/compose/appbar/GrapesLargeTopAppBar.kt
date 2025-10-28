package com.spendesk.grapes.compose.appbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.theme.GrapesTheme

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun GrapesLargeTopAppBar(
    title: String,
    modifier: Modifier = Modifier,
    actions: @Composable RowScope.() -> Unit = {},
    navigationIcon: @Composable () -> Unit = {},
    colors: TopAppBarColors = GrapesTopAppBarDefaults.largeTopAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null,
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
) {
    GrapesLargeTopAppBar(
        title = {
            Text(
                text = title,
                color = GrapesTheme.colors.contentPrimary,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        },
        colors = colors,
        actions = actions,
        navigationIcon = navigationIcon,
        scrollBehavior = scrollBehavior,
        windowInsets = windowInsets,
        modifier = modifier
    )
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun GrapesLargeTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    actions: @Composable RowScope.() -> Unit = {},
    navigationIcon: @Composable () -> Unit = {},
    colors: TopAppBarColors = GrapesTopAppBarDefaults.largeTopAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null,
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
) {
    MaterialTheme(
        typography = Typography(
            headlineMedium = GrapesTheme.typography.headingXl,
            titleLarge = GrapesTheme.typography.titleXl,
        ),
    ) {
        LargeTopAppBar(
            title = title,
            colors = colors,
            actions = actions,
            navigationIcon = navigationIcon,
            scrollBehavior = scrollBehavior,
            windowInsets = windowInsets,
            modifier = modifier
        )
    }
}

@Composable
@Preview
@OptIn(ExperimentalMaterial3Api::class)
private fun GrapesLargeTopAppBarPreview() {
    GrapesTheme {
        val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
        Scaffold(
            topBar = {
                GrapesLargeTopAppBar(
                    title = "Top app bar title",
                    navigationIcon = {
                        GrapesTopAppBarIconButton(
                            icon = { GrapesTopAppBarBackIcon() },
                            onClick = {}
                        )
                    },
                    scrollBehavior = scrollBehavior,
                )
            },
            modifier = Modifier
                .background(GrapesTheme.colors.backgroundSecondaryDefault)
                .nestedScroll(scrollBehavior.nestedScrollConnection)
        ) { innerPadding ->
            Box(
                modifier = Modifier
                    .padding(innerPadding)
                    .verticalScroll(rememberScrollState())
                    .height(1000.dp)
                    .fillMaxWidth()
                    .background(Brush.verticalGradient(listOf(Color.Red, Color.Blue)))
            )
        }
    }
}
