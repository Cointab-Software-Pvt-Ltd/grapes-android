package com.spendesk.grapes.compose.gauge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.theme.GrapesTheme
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

/**
 * @author : dany
 * @since : 26/10/2023, Thu
 **/

@Immutable
internal object GrapesGaugeDefaults {

    // Container properties
    val containerHeight: Dp = 16.dp

    @Composable
    fun containerShape(): Shape = GrapesTheme.shapes.radius4

    @Composable
    fun containerBackgroundColor(): Color = GrapesTheme.colors.neutralLightest

    // Segment properties
    val segmentDelimiterWidth: Dp = 2.dp
    val segmentStripWidth = 2.dp

    @Composable
    fun segmentDelimiterColor(): Color = GrapesTheme.colors.backgroundPrimaryDefault

    // Limit divider properties
    val limitDividerWidth: Dp = 3.dp
    val limitDividerHeight: Dp = 24.dp

    @Composable
    fun limitDividerColor(): Color = GrapesTheme.colors.backgroundComplementaryDefault
}

@Stable
data class GaugeUiModel(
    val total: Float,
    val segments: ImmutableList<GrapesGaugeSegment>,
    val limit: GrapesGaugeLimit? = null,
)

@Stable
sealed class GrapesGaugeSegment {

    abstract val value: Float

    @Stable
    data class Solid(
        override val value: Float,
        val color: Color,
    ) : GrapesGaugeSegment()

    @Stable
    data class Stripped(
        override val value: Float,
        val stripeColor: Color,
        val backgroundColor: Color,
    ) : GrapesGaugeSegment()
}

@Stable
data class GrapesGaugeLimit(
    val position: Float,
)

/**
 * Displays a gauge composed of a list of segments, each segment can be either solid or stripped.
 *
 * @param model the UI model containing the total, segments, and optional limit.
 * @param modifier the modifier to apply to this layout.
 * @param backgroundColor the background color of the gauge container.
 * @param shape the shape to clip the gauge container.
 */
@Composable
fun GrapesGauge(
    model: GaugeUiModel,
    modifier: Modifier = Modifier,
    backgroundColor: Color = GrapesGaugeDefaults.containerBackgroundColor(),
    shape: Shape = GrapesGaugeDefaults.containerShape(),
) {
    Box(
        contentAlignment = Alignment.CenterStart,
        modifier = modifier
    ) {
        Surface(
            color = backgroundColor,
            shape = shape,
            modifier = Modifier
        ) {
            BoxWithConstraints {
                val availableWidth = maxWidth

                Row(
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .height(GrapesGaugeDefaults.containerHeight)
                        .fillMaxWidth()
                ) {
                    model.segments.forEachIndexed { index, segment ->
                        val spacing = when (index) {
                            0, model.segments.lastIndex -> GrapesGaugeDefaults.segmentDelimiterWidth / 2
                            else -> GrapesGaugeDefaults.segmentDelimiterWidth
                        }
                        val width = availableWidth * segment.value / model.total - spacing
                        when (segment) {
                            is GaugeSegment.Solid -> {
                                Box(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .width(width)
                                        .background(segment.color)
                                )
                            }

                            is GaugeSegment.Stripped -> {
                                Box(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .width(width)
                                        .background(
                                            createStripeBrush(
                                                stripeColor = segment.stripeColor,
                                                backgroundColor = segment.backgroundColor,
                                                stripeWidth = GrapesGaugeDefaults.segmentStripWidth
                                            )
                                        )
                                )
                            }
                        }
                        if (index != model.segments.lastIndex) {
                            VerticalDivider(
                                color = GrapesGaugeDefaults.segmentDelimiterColor(),
                                thickness = GrapesGaugeDefaults.segmentDelimiterWidth,
                            )
                        }
                    }
                }
            }
        }
        if (model.limit != null) {
            GaugeLimitDivider(
                fraction = model.limit.position / model.total,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(GrapesGaugeDefaults.limitDividerHeight)
            )
        }
    }
}

@Composable
private fun createStripeBrush(
    stripeColor: Color,
    backgroundColor: Color,
    stripeWidth: Dp,
): Brush {
    val stripeWidthPx = with(LocalDensity.current) { stripeWidth.toPx() }
    val brushSizePx = 2 * stripeWidthPx
    val stripeStart = stripeWidthPx / brushSizePx

    return Brush.linearGradient(
        colorStops = arrayOf(
            0.0f to backgroundColor,
            stripeStart to backgroundColor,
            stripeStart to stripeColor,
            1.0f to stripeColor,
        ),
        start = Offset(0f, 0f),
        end = Offset(brushSizePx, brushSizePx),
        tileMode = TileMode.Repeated
    )
}

@Composable
private fun GaugeLimitDivider(
    fraction: Float, // [0f..1f] fraction of the width
    modifier: Modifier = Modifier,
    color: Color = GrapesGaugeDefaults.limitDividerColor(),
    width: Dp = GrapesGaugeDefaults.limitDividerWidth,
) {
    Box(
        modifier = modifier.drawBehind {
            val x = size.width * fraction.coerceIn(0f, 1f) - width.toPx() / 2
            val y = 0f
            drawRoundRect(
                color = color,
                topLeft = Offset(x, y),
                size = Size(width.toPx(), size.height),
                cornerRadius = CornerRadius(size.width / 2)
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
private fun GaugePreview() {
    GrapesTheme {
        Column(verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit4)) {
            GrapesGauge(
                model = GaugeUiModel(
                    total = 1f,
                    segments = persistentListOf(
                        GaugeSegment.Solid(value = 0.1f, color = GrapesTheme.colors.backgroundPrimaryBrandDefault),
                        GaugeSegment.Solid(value = 0.25f, color = GrapesTheme.colors.backgroundPrimaryWarningDefault),
                        GaugeSegment.Solid(value = 0.65f, color = GrapesTheme.colors.backgroundPrimaryAlertDefault)
                    ),
                    limit = GaugeLimit(0.35f),
                ),
                modifier = Modifier.padding(16.dp),
            )
            GrapesGauge(
                model = GaugeUiModel(
                    total = 123f,
                    segments = persistentListOf(
                        GaugeSegment.Solid(value = 12f, color = GrapesTheme.colors.backgroundPrimaryBrandDefault),
                        GaugeSegment.Solid(value = 25f, color = GrapesTheme.colors.backgroundPrimaryWarningDefault),
                        GaugeSegment.Solid(value = 65f, color = GrapesTheme.colors.backgroundPrimaryAlertDefault)
                    ),
                    limit = GaugeLimit(102f),
                ),
                modifier = Modifier.padding(16.dp),
            )
            GrapesGauge(
                model = GaugeUiModel(
                    total = 1f,
                    segments = persistentListOf(
                        GaugeSegment.Solid(value = 0.2f, color = GrapesTheme.colors.backgroundPrimaryBrandDefault)
                    ),
                ),
                modifier = Modifier.padding(16.dp),
            )
            GrapesGauge(
                model = GaugeUiModel(
                    total = 1f,
                    segments = persistentListOf(
                        GaugeSegment.Solid(
                            value = 0.2f,
                            color = GrapesTheme.colors.backgroundPrimaryBrandDefault,
                        ),
                        GaugeSegment.Stripped(
                            value = 0.5f,
                            stripeColor = GrapesTheme.colors.backgroundSecondaryAlertDefault,
                            backgroundColor = GrapesTheme.colors.contentWarningDefault
                        )
                    ),
                ),
                modifier = Modifier.padding(16.dp),
            )
        }
    }
}
