package com.spendesk.grapes.samples.compose

/**
 * @author Kélian CLERC
 * @since 17/01/2025
 */
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.icons.GrapesIconSet
import com.spendesk.grapes.compose.theme.GrapesTheme

@Composable
fun SizeDestination() {
    val scroll = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scroll)
            .padding(vertical = GrapesTheme.dimensions.unit16),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit32),
    ) {
        SizePlaceholder(GrapesTheme.dimensions.sizing1, "sizing1")
        SizePlaceholder(GrapesTheme.dimensions.sizing2, "sizing2")
        SizePlaceholder(GrapesTheme.dimensions.sizing3, "sizing3")
        SizePlaceholder(GrapesTheme.dimensions.sizing4, "sizing4")
        SizePlaceholder(GrapesTheme.dimensions.sizing5, "sizing5")
        SizePlaceholder(GrapesTheme.dimensions.sizing6, "sizing6")
        SizePlaceholder(GrapesTheme.dimensions.sizing7, "sizing7")
        HorizontalDivider()
        Text("UI refresh")
        SizePlaceholder(GrapesTheme.dimensions.sizeIconS, "sizeIconS")
        SizePlaceholder(GrapesTheme.dimensions.sizeIconM, "sizeIconM")
        SizePlaceholder(GrapesTheme.dimensions.sizeIconL, "sizeIconL")
        SizePlaceholder(GrapesTheme.dimensions.sizeIconXl, "sizeIconXl")
    }
}

@Composable
private fun SizePlaceholder(size: Dp, text: String) {
    Column(verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8), horizontalAlignment = Alignment.CenterHorizontally) {
        GrapesIconSet.Spendesk(
            modifier = Modifier
                .size(size)
                .dashedBorder(
                    brush = SolidColor(GrapesTheme.colors.backgroundPrimaryInfoDefault),
                    shape = GrapesTheme.shapes.radius0,
                    strokeWidth = 2.dp,
                    dashLength = 4.dp,
                    gapLength = 4.dp
                )
        )
        Text(
            text = "$text: ${size.value}dp",
            style = GrapesTheme.typography.bodyM,
        )
    }
}

private fun Modifier.dashedBorder(
    brush: Brush,
    shape: Shape,
    strokeWidth: Dp = 2.dp,
    dashLength: Dp = 4.dp,
    gapLength: Dp = 4.dp,
    cap: StrokeCap = StrokeCap.Round
) = this.drawWithContent {

    val outline = shape.createOutline(size, layoutDirection, density = this)

    val dashedStroke = Stroke(
        cap = cap,
        width = strokeWidth.toPx(),
        pathEffect = PathEffect.dashPathEffect(
            intervals = floatArrayOf(dashLength.toPx(), gapLength.toPx())
        )
    )

    drawContent()

    drawOutline(
        outline = outline,
        style = dashedStroke,
        brush = brush
    )
}


@Preview
@Composable
fun SizeDestinationPreview() {
    GrapesTheme {
        SizeDestination()
    }
}
