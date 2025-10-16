package com.spendesk.grapes.samples.compose

/**
 * @author Kélian CLERC
 * @since 17/01/2025
 */
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.theme.GrapesTheme

@Composable
fun NavigationDestination() {
    val scroll = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scroll)
    ) {
        Text("Actionable Avatar", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Text("todo ...", style = GrapesTheme.typography.bodyM, color = GrapesTheme.colors.contentSecondaryBGPrimary)
        Text("Action Menu", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Text("todo ...", style = GrapesTheme.typography.bodyM, color = GrapesTheme.colors.contentSecondaryBGPrimary)
        Text("Card link", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Text("todo ...", style = GrapesTheme.typography.bodyM, color = GrapesTheme.colors.contentSecondaryBGPrimary)
        Text("Company Selector", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Text("todo ...", style = GrapesTheme.typography.bodyM, color = GrapesTheme.colors.contentSecondaryBGPrimary)
        Text("Todo", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Text("todo ...", style = GrapesTheme.typography.bodyM, color = GrapesTheme.colors.contentSecondaryBGPrimary)
        Text("Search & Filters", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Text("todo ...", style = GrapesTheme.typography.bodyM, color = GrapesTheme.colors.contentSecondaryBGPrimary)
    }
}

@Preview
@Composable
fun NavigationDestinationPreview() {
    GrapesTheme {
        NavigationDestination()
    }
}
