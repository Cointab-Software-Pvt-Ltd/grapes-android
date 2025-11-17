package com.spendesk.grapes.compose.gauge

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
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
import com.spendesk.grapes.compose.gauge.GrapesGaugeDefaults.ANIMATION_DELAY_MILLIS
import com.spendesk.grapes.compose.gauge.GrapesGaugeDefaults.ANIMATION_DURATION_MILLIS
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

    const val ANIMATION_DELAY_MILLIS: Int = 100
    const val ANIMATION_DURATION_MILLIS: Int = 300

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
    Gauge(
        model = model,
        modifier = modifier,
        backgroundColor = backgroundColor,
        shape = shape,
        animationSpec = null,
    )
}

/**
 * Displays an animated gauge composed of a list of segments, each segment can be either solid or stripped.
 *
 * @param model the UI model containing the total, segments, and optional limit.
 * @param modifier the modifier to apply to this layout.
 * @param backgroundColor the background color of the gauge container.
 * @param shape the shape to clip the gauge container.
 * @param animationSpec the animation specification for animating each segment. By default, segments animate sequentially.
 */
@Composable
fun GrapesAnimatedGauge(
    model: GaugeUiModel,
    modifier: Modifier = Modifier,
    backgroundColor: Color = GrapesGaugeDefaults.containerBackgroundColor(),
    shape: Shape = GrapesGaugeDefaults.containerShape(),
    animationSpec: (index: Int) -> AnimationSpec<Float> = { index ->
        // Animation duration should not depend on the number of segments
        val durationPerSegment = ANIMATION_DURATION_MILLIS / model.segments.size
        tween(
            durationMillis = durationPerSegment,
            delayMillis = ANIMATION_DELAY_MILLIS + durationPerSegment * index,
            easing = LinearEasing,
        )
    },
) {
    Gauge(
        model = model,
        modifier = modifier,
        backgroundColor = backgroundColor,
        shape = shape,
        animationSpec = animationSpec,
    )
}

@Composable
private fun Gauge(
    model: GaugeUiModel,
    animationSpec: ((index: Int) -> AnimationSpec<Float>)?,
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
                        if (animationSpec == null) {
                            Segment(
                                segment = segment,
                                width = availableWidth * segment.value / model.total - spacing,
                            )
                        } else {
                            AnimatedSegment(
                                targetWidth = availableWidth * segment.value / model.total - spacing,
                                segment = segment,
                                animationSpec = { animationSpec(index) },
                            )
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
private fun AnimatedSegment(
    segment: GrapesGaugeSegment,
    targetWidth: Dp,
    animationSpec: () -> AnimationSpec<Float> = { spring() },
) {
    // Animate from 0f to 1f representing the fraction of the target width
    val animatedFraction = remember { Animatable(0f) }
    val width by remember { derivedStateOf { targetWidth * animatedFraction.value } }

    // Remember if this segment has already animated to avoid re-animating
    // on recomposition, for example in LazyColumn scroll
    var animationCompleted by rememberSaveable(segment) { mutableStateOf(false) }

    LaunchedEffect(segment) {
        if (animationCompleted) {
            animatedFraction.snapTo(1f)
        } else {
            animatedFraction.snapTo(0f)
            animatedFraction.animateTo(
                targetValue = 1f,
                animationSpec = animationSpec(),
            )
            animationCompleted = true
        }
    }

    Segment(
        segment = segment,
        width = width,
    )
}

@Composable
private fun Segment(
    width: Dp,
    segment: GrapesGaugeSegment,
) {
    when (segment) {
        is GrapesGaugeSegment.Solid -> {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(width)
                    .background(segment.color)
            )
        }

        is GrapesGaugeSegment.Stripped -> {
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
            GrapesAnimatedGauge(
                model = GaugeUiModel(
                    total = 1f,
                    segments = persistentListOf(
                        GrapesGaugeSegment.Solid(value = 0.1f, color = GrapesTheme.colors.backgroundPrimaryBrandDefault),
                        GrapesGaugeSegment.Solid(value = 0.25f, color = GrapesTheme.colors.backgroundPrimaryWarningDefault),
                        GrapesGaugeSegment.Solid(value = 0.65f, color = GrapesTheme.colors.backgroundPrimaryAlertDefault)
                    ),
                    limit = GrapesGaugeLimit(0.35f),
                ),
                modifier = Modifier.padding(16.dp),
            )
            GrapesAnimatedGauge(
                model = GaugeUiModel(
                    total = 123f,
                    segments = persistentListOf(
                        GrapesGaugeSegment.Solid(value = 12f, color = GrapesTheme.colors.backgroundPrimaryBrandDefault),
                        GrapesGaugeSegment.Solid(value = 25f, color = GrapesTheme.colors.backgroundPrimaryWarningDefault),
                        GrapesGaugeSegment.Solid(value = 65f, color = GrapesTheme.colors.backgroundPrimaryAlertDefault)
                    ),
                    limit = GrapesGaugeLimit(102f),
                ),
                modifier = Modifier.padding(16.dp),
            )
            GrapesAnimatedGauge(
                model = GaugeUiModel(
                    total = 1f,
                    segments = persistentListOf(
                        GrapesGaugeSegment.Solid(value = 0.2f, color = GrapesTheme.colors.backgroundPrimaryBrandDefault)
                    ),
                ),
                modifier = Modifier.padding(16.dp),
            )
            GrapesAnimatedGauge(
                model = GaugeUiModel(
                    total = 1f,
                    segments = persistentListOf(
                        GrapesGaugeSegment.Solid(
                            value = 0.2f,
                            color = GrapesTheme.colors.backgroundPrimaryBrandDefault,
                        ),
                        GrapesGaugeSegment.Stripped(
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
