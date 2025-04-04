@file:Suppress("MatchingDeclarationName")

package com.spendesk.grapes.compose.button.primary

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.button.core.BasicButton
import com.spendesk.grapes.compose.button.core.GrapesButtonColors
import com.spendesk.grapes.compose.button.core.GrapesButtonState
import com.spendesk.grapes.compose.icons.GrapesIconSet
import com.spendesk.grapes.compose.theme.GrapesTheme

@Stable
object GrapesTertiaryDefault {

    @Composable
    internal fun colors(): GrapesButtonColors = GrapesButtonColors(
        containerColor = Color.Transparent,
        contentColor = GrapesTheme.colors.contentSelected,
        disabledContainerColor = Color.Transparent,
        disabledContentColor = GrapesTheme.colors.contentSecondaryBGPrimary,
        loadingColor = GrapesTheme.colors.backgroundSecondaryBrandPressed,
    )
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun GrapesTertiaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    state: GrapesButtonState = GrapesButtonState.Enabled,
    icon: @Composable (() -> Unit)? = null,
    interactionSource: MutableInteractionSource? = null,
    alignment: Alignment = Alignment.Center,
) {
    BasicButton(
        text = text,
        state = state,
        icon = icon,
        interactionSource = interactionSource,
        colors = GrapesTertiaryDefault.colors(),
        border = null,
        onClick = onClick,
        alignment = alignment,
        modifier = modifier,
    )
}

@Composable
@Preview(showBackground = true)
@Preview(showBackground = true, fontScale = 2f)
private fun PreviewGrapesTertiaryButton() {
    GrapesTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
            modifier = Modifier.padding(GrapesTheme.dimensions.unit8)
        ) {
            val icon = @Composable { GrapesIconSet.Bell() }
            GrapesTertiaryButton(
                text = "Tertiary Button",
                state = GrapesButtonState.Enabled,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesTertiaryButton(
                text = "Tertiary Button",
                state = GrapesButtonState.Enabled,
                onClick = {},
                icon = icon,
                modifier = Modifier.fillMaxWidth()
            )

            GrapesTertiaryButton(
                text = "Tertiary Button",
                state = GrapesButtonState.Disabled,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesTertiaryButton(
                text = "Tertiary Button",
                state = GrapesButtonState.Disabled,
                icon = icon,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesTertiaryButton(
                text = "Tertiary Button",
                icon = icon,
                state = GrapesButtonState.Enabled,
                alignment = Alignment.CenterStart,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesTertiaryButton(
                text = "Tertiary Button",
                state = GrapesButtonState.Disabled,
                alignment = Alignment.CenterStart,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
