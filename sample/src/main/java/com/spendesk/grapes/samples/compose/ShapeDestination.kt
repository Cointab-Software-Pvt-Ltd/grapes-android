package com.spendesk.grapes.samples.compose

/**
 * @author Kélian CLERC
 * @since 17/01/2025
 */
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.theme.GrapesTheme

@Composable
fun ShapeDestination() {
    val scroll = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scroll),
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(GrapesTheme.dimensions.spacing3),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.spacing3))
        ShapePlaceholder(
            text = "radius0",
            shape = GrapesTheme.shapes.radius0,
            containerColor = GrapesTheme.colors.backgroundSecondaryDefault,
            contentColor = GrapesTheme.colors.contentPrimary,
            borderColor = GrapesTheme.colors.borderDefault,
        )
        ShapePlaceholder(
            text = "radius4",
            shape = GrapesTheme.shapes.radius4,
            containerColor = GrapesTheme.colors.backgroundSecondaryInfoDefault,
            contentColor = GrapesTheme.colors.contentPrimary,
            borderColor = GrapesTheme.colors.borderInfoDefault,
        )
        ShapePlaceholder(
            text = "radius8",
            shape = GrapesTheme.shapes.radius8,
            containerColor = GrapesTheme.colors.backgroundSecondarySuccessDefault,
            contentColor = GrapesTheme.colors.contentPrimary,
            borderColor = GrapesTheme.colors.borderSuccessDefault,
        )
        ShapePlaceholder(
            text = "radius12",
            shape = GrapesTheme.shapes.radius12,
            containerColor = GrapesTheme.colors.backgroundSecondaryWarningDefault,
            contentColor = GrapesTheme.colors.contentPrimary,
            borderColor = GrapesTheme.colors.borderWarningDefault,
        )
        ShapePlaceholder(
            text = "radius1000",
            shape = GrapesTheme.shapes.radius1000,
            containerColor = GrapesTheme.colors.backgroundSecondaryAlertDefault,
            contentColor = GrapesTheme.colors.contentPrimary,
            borderColor = GrapesTheme.colors.borderAlertDefault,
        )
    }
}

@Composable
fun ShapePlaceholder(
    text: String,
    shape: Shape,
    containerColor: Color,
    contentColor: Color,
    borderColor: Color,
) {
    Box(
        modifier = Modifier
            .size(100.dp)
            .clip(shape)
            .background(containerColor)
            .border(1.dp, borderColor, shape),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = text,
            style = GrapesTheme.typography.bodyM,
            color = contentColor,
        )
    }
}

@Preview
@Composable
fun ShapeDestinationPreview() {
    GrapesTheme {
        ShapeDestination()
    }
}
