package com.spendesk.grapes.samples.compose

/**
 * @author Kélian CLERC
 * @since 17/01/2025
 */
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.theme.GrapesTheme

@Composable
fun SpacingDestination() {
    val scroll = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scroll)
            .padding(vertical = GrapesTheme.dimensions.unit16),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit32),
    ) {
        SpacingPlaceholder(GrapesTheme.dimensions.unit0, "unit0")
        SpacingPlaceholder(GrapesTheme.dimensions.unit4, "unit4")
        SpacingPlaceholder(GrapesTheme.dimensions.unit8, "unit8")
        SpacingPlaceholder(GrapesTheme.dimensions.unit16, "unit16")
        SpacingPlaceholder(GrapesTheme.dimensions.unit24, "unit24")
        SpacingPlaceholder(GrapesTheme.dimensions.unit32, "unit32")
        SpacingPlaceholder(GrapesTheme.dimensions.unit40, "unit40")
        SpacingPlaceholder(GrapesTheme.dimensions.unit48, "unit48")
        SpacingPlaceholder(GrapesTheme.dimensions.unit56, "unit56")
        SpacingPlaceholder(GrapesTheme.dimensions.unit64, "unit64")
    }
}

@Composable
private fun SpacingPlaceholder(spacing: Dp, text: String) {
    Column(verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(GrapesTheme.dimensions.unit4), horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.height(50.dp)) {
            LeftItem()
            SpacingItem(spacing)
            RightItem()
        }
        Text(
            text = "$text: ${spacing.value}dp",
            style = GrapesTheme.typography.bodyM,
        )
    }
}

@Composable
private fun LeftItem() {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .width(100.dp)
            .background(Brush.horizontalGradient(listOf(GrapesTheme.colors.backgroundSecondaryInfoDefault.copy(alpha = 0f), GrapesTheme.colors.backgroundSecondaryInfoDefault)))
            .border(1.dp, Brush.horizontalGradient(listOf(GrapesTheme.colors.borderInfoDefault.copy(alpha = 0f), GrapesTheme.colors.borderInfoDefault)), GrapesTheme.shapes.radius0)
    )
}

@Composable
private fun RightItem() {
    Spacer(
        modifier = Modifier
            .fillMaxHeight()
            .width(100.dp)
            .background(Brush.horizontalGradient(listOf(GrapesTheme.colors.backgroundSecondaryInfoDefault, GrapesTheme.colors.backgroundSecondaryInfoDefault.copy(alpha = 0f))))
            .border(1.dp, Brush.horizontalGradient(listOf(GrapesTheme.colors.borderInfoDefault, GrapesTheme.colors.borderInfoDefault.copy(alpha = 0f))), GrapesTheme.shapes.radius0)
    )
}

@Composable
fun SpacingItem(spacing: Dp) {
    Spacer(
        modifier = Modifier
            .fillMaxHeight()
            .width(spacing)
            .background(
                createStripeGauge(
                    stripeColor = GrapesTheme.colors.backgroundPrimaryAlertDefault,
                    stripeBg = GrapesTheme.colors.backgroundSecondaryAlertDefault,
                    stripeWidth = 4.dp
                )
            ),
    )
}

@Composable
private fun createStripeGauge(
    stripeColor: Color,
    stripeBg: Color,
    stripeWidth: Dp
): Brush {
    val stripeWidthPx = with(LocalDensity.current) { stripeWidth.toPx() }
    val brushSizePx = 2 * stripeWidthPx
    val stripeStart = stripeWidthPx / brushSizePx

    return Brush.linearGradient(
        stripeStart to stripeBg,
        stripeStart to stripeColor,
        start = Offset(0f, 0f),
        end = Offset(brushSizePx, brushSizePx),
        tileMode = TileMode.Repeated
    )
}

@Preview
@Composable
fun SpacingDestinationPreview() {
    GrapesTheme {
        SpacingDestination()
    }
}
