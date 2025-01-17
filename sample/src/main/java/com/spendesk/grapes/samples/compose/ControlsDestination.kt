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
fun ControlsDestination() {
    val scroll = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scroll)
    ) {
        Text("Checkbox", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Text("todo ...", style = GrapesTheme.typography.bodyS, color = GrapesTheme.colors.contentSecondaryBGPrimary)
        Text("Radio button", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Text("todo ...", style = GrapesTheme.typography.bodyS, color = GrapesTheme.colors.contentSecondaryBGPrimary)
        Text("Switch", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Text("todo ...", style = GrapesTheme.typography.bodyS, color = GrapesTheme.colors.contentSecondaryBGPrimary)
        Text("Option group", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Text("todo ...", style = GrapesTheme.typography.bodyS, color = GrapesTheme.colors.contentSecondaryBGPrimary)
    }
}

@Preview
@Composable
fun ControlsDestinationPreview() {
    GrapesTheme {
        ControlsDestination()
    }
}
