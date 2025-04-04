@file:Suppress("MatchingDeclarationName")

package com.spendesk.grapes.compose.button.primary

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.button.core.BasicButton
import com.spendesk.grapes.compose.button.core.GrapesButtonColors
import com.spendesk.grapes.compose.button.core.GrapesButtonState
import com.spendesk.grapes.compose.icons.GrapesIconSet
import com.spendesk.grapes.compose.theme.GrapesTheme

@Stable
object GrapesPrimaryDefault {

    @Composable
    internal fun brandColors(): GrapesButtonColors = GrapesButtonColors(
        containerColor = GrapesTheme.colors.backgroundPrimaryBrandDefault,
        contentColor = GrapesTheme.colors.contentComplementary,
        disabledContainerColor = GrapesTheme.colors.backgroundPrimaryDisabled,
        disabledContentColor = GrapesTheme.colors.contentSecondaryBGSecondary,
        loadingColor = GrapesTheme.colors.backgroundPrimaryBrandPressed,
    )

    @Composable
    internal fun alertColors(): GrapesButtonColors = GrapesButtonColors(
        containerColor = GrapesTheme.colors.backgroundPrimaryAlertDefault,
        contentColor = GrapesTheme.colors.contentComplementary,
        disabledContainerColor = GrapesTheme.colors.backgroundPrimaryDisabled,
        disabledContentColor = GrapesTheme.colors.contentSecondaryBGSecondary,
        loadingColor = GrapesTheme.colors.backgroundPrimaryAlertPressed,
    )

    @Composable
    internal fun warningColors(): GrapesButtonColors = GrapesButtonColors(
        containerColor = GrapesTheme.colors.backgroundPrimaryWarningDefault,
        contentColor = GrapesTheme.colors.contentComplementary,
        disabledContainerColor = GrapesTheme.colors.backgroundPrimaryDisabled,
        disabledContentColor = GrapesTheme.colors.contentSecondaryBGSecondary,
        loadingColor = GrapesTheme.colors.backgroundPrimaryWarningPressed,
    )

    @Composable
    internal fun buttonBorder(state: GrapesButtonState): BorderStroke? {
        return when (state) {
            is GrapesButtonState.Disabled -> BorderStroke(1.dp, GrapesTheme.colors.borderDefault)
            is GrapesButtonState.Enabled,
            is GrapesButtonState.Loading.Determinate,
            is GrapesButtonState.Loading.Indeterminate,
            -> null
        }
    }
}

@Composable
fun GrapesBrandPrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    state: GrapesButtonState = GrapesButtonState.Enabled,
    icon: @Composable (() -> Unit)? = null,
    interactionSource: MutableInteractionSource? = null,
) {
    BasicButton(
        text = text,
        state = state,
        icon = icon,
        interactionSource = interactionSource,
        colors = GrapesPrimaryDefault.brandColors(),
        border = GrapesPrimaryDefault.buttonBorder(state),
        onClick = onClick,
        modifier = modifier,
    )
}

@Composable
fun GrapesAlertPrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    state: GrapesButtonState = GrapesButtonState.Enabled,
    icon: @Composable (() -> Unit)? = null,
    interactionSource: MutableInteractionSource? = null,
) {
    BasicButton(
        text = text,
        state = state,
        icon = icon,
        interactionSource = interactionSource,
        colors = GrapesPrimaryDefault.alertColors(),
        border = GrapesPrimaryDefault.buttonBorder(state),
        onClick = onClick,
        modifier = modifier,
    )
}

@Composable
fun GrapesWarningPrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    state: GrapesButtonState = GrapesButtonState.Enabled,
    icon: @Composable (() -> Unit)? = null,
    interactionSource: MutableInteractionSource? = null,
) {
    BasicButton(
        text = text,
        state = state,
        icon = icon,
        interactionSource = interactionSource,
        colors = GrapesPrimaryDefault.warningColors(),
        border = GrapesPrimaryDefault.buttonBorder(state),
        onClick = onClick,
        modifier = modifier,
    )
}

@Composable
@Preview(showBackground = true)
@Preview(showBackground = true, fontScale = 2f)
private fun PreviewGrapesBrandPrimaryButton() {
    GrapesTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
            modifier = Modifier.padding(GrapesTheme.dimensions.unit8)
        ) {
            val icon = @Composable { GrapesIconSet.Bell() }
            GrapesBrandPrimaryButton(
                text = "Primary Button",
                state = GrapesButtonState.Enabled,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesBrandPrimaryButton(
                text = "Primary Button",
                state = GrapesButtonState.Enabled,
                onClick = {},
                icon = icon,
                modifier = Modifier.fillMaxWidth()
            )

            GrapesBrandPrimaryButton(
                text = "Primary Button Loading",
                state = GrapesButtonState.Loading.Determinate(0.35f),
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesBrandPrimaryButton(
                text = "Primary Button",
                state = GrapesButtonState.Disabled,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesBrandPrimaryButton(
                text = "Primary Button",
                state = GrapesButtonState.Disabled,
                icon = icon,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
@Preview(showBackground = true, fontScale = 2f)
private fun PreviewGrapesWarningPrimaryButton() {
    GrapesTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
            modifier = Modifier.padding(GrapesTheme.dimensions.unit8)
        ) {
            val icon = @Composable { GrapesIconSet.Bell() }
            GrapesWarningPrimaryButton(
                text = "Primary Button",
                state = GrapesButtonState.Enabled,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesWarningPrimaryButton(
                text = "Primary Button",
                state = GrapesButtonState.Enabled,
                onClick = {},
                icon = icon,
                modifier = Modifier.fillMaxWidth()
            )

            GrapesWarningPrimaryButton(
                text = "Primary Button Loading",
                state = GrapesButtonState.Loading.Determinate(0.35f),
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesWarningPrimaryButton(
                text = "Primary Button",
                state = GrapesButtonState.Disabled,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesWarningPrimaryButton(
                text = "Primary Button",
                state = GrapesButtonState.Disabled,
                icon = icon,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
@Preview(showBackground = true, fontScale = 2f)
private fun PreviewGrapesAlertPrimaryButton() {
    GrapesTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
            modifier = Modifier.padding(GrapesTheme.dimensions.unit8)
        ) {
            val icon = @Composable { GrapesIconSet.Bell() }
            GrapesAlertPrimaryButton(
                text = "Primary Button",
                state = GrapesButtonState.Enabled,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesAlertPrimaryButton(
                text = "Primary Button",
                state = GrapesButtonState.Enabled,
                onClick = {},
                icon = icon,
                modifier = Modifier.fillMaxWidth()
            )

            GrapesAlertPrimaryButton(
                text = "Primary Button Loading",
                state = GrapesButtonState.Loading.Determinate(0.35f),
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesAlertPrimaryButton(
                text = "Primary Button",
                state = GrapesButtonState.Disabled,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesAlertPrimaryButton(
                text = "Primary Button",
                state = GrapesButtonState.Disabled,
                icon = icon,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
