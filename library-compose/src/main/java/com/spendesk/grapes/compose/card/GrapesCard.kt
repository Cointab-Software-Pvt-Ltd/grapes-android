package com.spendesk.grapes.compose.card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.button.NoRippleInteractionSource
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author : kelian
 * @since : 08/11/2024
 **/
@Composable
fun GrapesCard(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit,
) {
    Card(
        onClick = onClick ?: {},
        modifier = modifier,
        colors = GrapesCardDefaults.colors,
        border = GrapesCardDefaults.border,
        content = content,
        interactionSource = remember { if (onClick == null) NoRippleInteractionSource() else MutableInteractionSource() },
    )
}

@Preview
@Composable
private fun GrapesCardPreview() {
    var number by remember { mutableStateOf(0) }
    GrapesTheme {
        Column(
            modifier = Modifier
                .background(GrapesTheme.colors.structureBackground)
                .padding(GrapesTheme.dimensions.spacing3)
        ) {
            GrapesCard {
                Text("Non clickable card", modifier = Modifier.padding(GrapesTheme.dimensions.spacing3))
            }
            Spacer(modifier = Modifier.height(GrapesTheme.dimensions.spacing3))
            GrapesCard(onClick = { number++ }) {
                Text("clickable card $number", modifier = Modifier.padding(GrapesTheme.dimensions.spacing3))
            }
        }
    }
}

@Immutable
internal object GrapesCardDefaults {

    private val borderThickness = 0.5.dp

    val colors: CardColors
        @Composable get() = CardDefaults.elevatedCardColors(
            containerColor = GrapesTheme.colors.mainWhite,
        )

    val border: BorderStroke
        @Composable get() = BorderStroke(
            width = borderThickness,
            color = GrapesTheme.colors.neutralLight,
        )
}
