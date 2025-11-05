package com.spendesk.grapes.compose.card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * Grapes filled clickable Card.
 */
@Composable
fun GrapesCard(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    border: BorderStroke? = null,
    interactionSource: MutableInteractionSource? = null,
    content: @Composable ColumnScope.() -> Unit,
) {
    Card(
        enabled = enabled,
        colors = GrapesCardDefaults.colors,
        border = border,
        shape = GrapesTheme.shapes.radius12,
        onClick = onClick,
        interactionSource = interactionSource,
        content = content,
        modifier = modifier,
    )
}

/**
 * Grapes filled non-clickable Card.
 */
@Composable
fun GrapesCard(
    modifier: Modifier = Modifier,
    border: BorderStroke? = null,
    content: @Composable ColumnScope.() -> Unit,
) {
    Card(
        border = border,
        colors = GrapesCardDefaults.colors,
        content = content,
        shape = GrapesTheme.shapes.radius12,
        modifier = modifier,
    )
}

@Immutable
object GrapesCardDefaults {

    private val borderThickness = 0.5.dp

    internal val colors: CardColors
        @Composable get() = CardDefaults.cardColors(
            containerColor = GrapesTheme.colors.backgroundPrimaryDefault,
            disabledContainerColor = GrapesTheme.colors.backgroundPrimaryDisabled,
            contentColor = GrapesTheme.colors.contentPrimary,
            disabledContentColor = GrapesTheme.colors.contentDisable,
        )

    val border: BorderStroke
        @Composable get() = BorderStroke(
            width = borderThickness,
            color = GrapesTheme.colors.borderDefault,
        )
}

@Preview
@Composable
private fun GrapesCardPreview() {
    GrapesTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
            modifier = Modifier
                .background(GrapesTheme.colors.backgroundSecondaryDefault)
                .padding(GrapesTheme.dimensions.unit16)
        ) {
            GrapesCard {
                Text("Non clickable card", modifier = Modifier.padding(GrapesTheme.dimensions.unit16))
            }
            GrapesCard(onClick = {}) {
                Text("clickable card", modifier = Modifier.padding(GrapesTheme.dimensions.unit16))
            }
            GrapesCard(
                onClick = {},
                enabled = false,
            ) {
                Text("Disabled clickable card", modifier = Modifier.padding(GrapesTheme.dimensions.unit16))
            }
        }
    }
}
