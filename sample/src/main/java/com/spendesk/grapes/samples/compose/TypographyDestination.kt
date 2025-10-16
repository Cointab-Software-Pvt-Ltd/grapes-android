package com.spendesk.grapes.samples.compose

/**
 * @author Kélian CLERC
 * @since 17/01/2025
 */
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.theme.GrapesTheme

@Composable
fun TypographyDestination() {
    val scroll = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scroll)
            .padding(GrapesTheme.dimensions.unit16),
        verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit16),
    ) {
        Text("Heading", style = GrapesTheme.typography.headingXl, color = GrapesTheme.colors.contentPrimary)
        Text("Title/Xxl", style = GrapesTheme.typography.titleXxl, color = GrapesTheme.colors.contentPrimary)
        Text("Title/Xl", style = GrapesTheme.typography.titleXl, color = GrapesTheme.colors.contentPrimary)
        Text("Title/L", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Text("Title/M", style = GrapesTheme.typography.titleM, color = GrapesTheme.colors.contentPrimary)
        Text("Title/S", style = GrapesTheme.typography.titleS, color = GrapesTheme.colors.contentPrimary)
        Text("Body/M", style = GrapesTheme.typography.bodyL, color = GrapesTheme.colors.contentPrimary)
        Text("Body/S", style = GrapesTheme.typography.bodyM, color = GrapesTheme.colors.contentPrimary)
        Text("Body/Xs", style = GrapesTheme.typography.bodyXs, color = GrapesTheme.colors.contentPrimary)
    }
}

@Preview
@Composable
fun TypographyDestinationPreview() {
    GrapesTheme {
        TypographyDestination()
    }
}
