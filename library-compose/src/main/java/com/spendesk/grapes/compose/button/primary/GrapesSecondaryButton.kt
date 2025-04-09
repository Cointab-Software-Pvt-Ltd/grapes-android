@file:Suppress("MatchingDeclarationName")

package com.spendesk.grapes.compose.button.primary

import androidx.compose.foundation.BorderStroke
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
object GrapesSecondaryDefault {

    @Composable
    internal fun colors(): GrapesButtonColors = GrapesButtonColors(
        containerColor = GrapesTheme.colors.backgroundPrimaryDefault,
        contentColor = GrapesTheme.colors.contentPrimary,
        disabledContainerColor = GrapesTheme.colors.backgroundPrimaryDisabled,
        disabledContentColor = GrapesTheme.colors.contentSecondaryBGSecondary,
        loadingColor = GrapesTheme.colors.backgroundSecondaryBrandPressed,
    )

    @Composable
    internal fun alertColors(): GrapesButtonColors = GrapesButtonColors(
        containerColor = GrapesTheme.colors.backgroundPrimaryDefault,
        contentColor = GrapesTheme.colors.contentAlertDefault,
        disabledContainerColor = GrapesTheme.colors.backgroundPrimaryDisabled,
        disabledContentColor = GrapesTheme.colors.contentSecondaryBGSecondary,
        loadingColor = GrapesTheme.colors.backgroundSecondaryAlertPressed,
    )

    @Composable
    internal fun warningColors(): GrapesButtonColors = GrapesButtonColors(
        containerColor = GrapesTheme.colors.backgroundPrimaryDefault,
        contentColor = GrapesTheme.colors.contentWarningDefault,
        disabledContainerColor = GrapesTheme.colors.backgroundPrimaryDisabled,
        disabledContentColor = GrapesTheme.colors.contentSecondaryBGSecondary,
        loadingColor = GrapesTheme.colors.backgroundSecondaryWarningPressed,
    )

    @Composable
    internal fun buttonBorder(): BorderStroke? {
        return BorderStroke(1.dp, GrapesTheme.colors.borderDefault)
    }
}

@Composable
fun GrapesSecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    state: GrapesButtonState = GrapesButtonState.Enabled,
    icon: @Composable (() -> Unit)? = null,
) {
    BasicButton(
        text = text,
        state = state,
        icon = icon,
        colors = GrapesSecondaryDefault.colors(),
        border = GrapesSecondaryDefault.buttonBorder(),
        onClick = onClick,
        modifier = modifier,
    )
}

@Composable
fun GrapesAlertSecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    state: GrapesButtonState = GrapesButtonState.Enabled,
    icon: @Composable (() -> Unit)? = null,
) {
    BasicButton(
        text = text,
        state = state,
        icon = icon,
        colors = GrapesSecondaryDefault.alertColors(),
        border = GrapesSecondaryDefault.buttonBorder(),
        onClick = onClick,
        modifier = modifier,
    )
}

@Composable
fun GrapesWarningSecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    state: GrapesButtonState = GrapesButtonState.Enabled,
    icon: @Composable (() -> Unit)? = null,
) {
    BasicButton(
        text = text,
        state = state,
        icon = icon,
        colors = GrapesSecondaryDefault.warningColors(),
        border = GrapesSecondaryDefault.buttonBorder(),
        onClick = onClick,
        modifier = modifier,
    )
}

@Composable
@Preview(showBackground = true)
@Preview(showBackground = true, fontScale = 2f)
private fun GrapesSecondaryButtonPreview() {
    GrapesTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
            modifier = Modifier.padding(GrapesTheme.dimensions.unit8)
        ) {
            val icon = @Composable { GrapesIconSet.Bell() }
            GrapesSecondaryButton(
                text = "Secondary Button",
                state = GrapesButtonState.Enabled,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesSecondaryButton(
                text = "Secondary Button",
                state = GrapesButtonState.Enabled,
                onClick = {},
                icon = icon,
                modifier = Modifier.fillMaxWidth()
            )

            GrapesSecondaryButton(
                text = "Secondary Button Loading",
                state = GrapesButtonState.Loading.Determinate(0.35f),
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesSecondaryButton(
                text = "Secondary Button",
                state = GrapesButtonState.Disabled,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesSecondaryButton(
                text = "Secondary Button",
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
private fun GrapesWarningSecondaryButtonPreview() {
    GrapesTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
            modifier = Modifier.padding(GrapesTheme.dimensions.unit8)
        ) {
            val icon = @Composable { GrapesIconSet.Bell() }
            GrapesWarningSecondaryButton(
                text = "Secondary Button",
                state = GrapesButtonState.Enabled,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesWarningSecondaryButton(
                text = "Secondary Button",
                state = GrapesButtonState.Enabled,
                onClick = {},
                icon = icon,
                modifier = Modifier.fillMaxWidth()
            )

            GrapesWarningSecondaryButton(
                text = "Secondary Button Loading",
                state = GrapesButtonState.Loading.Determinate(0.35f),
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesWarningSecondaryButton(
                text = "Secondary Button",
                state = GrapesButtonState.Disabled,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesWarningSecondaryButton(
                text = "Secondary Button",
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
private fun PreviewGrapesAlertSecondaryButton() {
    GrapesTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
            modifier = Modifier.padding(GrapesTheme.dimensions.unit8)
        ) {
            val icon = @Composable { GrapesIconSet.Bell() }
            GrapesAlertSecondaryButton(
                text = "Secondary Button",
                state = GrapesButtonState.Enabled,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesAlertSecondaryButton(
                text = "Secondary Button",
                state = GrapesButtonState.Enabled,
                onClick = {},
                icon = icon,
                modifier = Modifier.fillMaxWidth()
            )

            GrapesAlertSecondaryButton(
                text = "Secondary Button Loading",
                state = GrapesButtonState.Loading.Determinate(0.35f),
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesAlertSecondaryButton(
                text = "Secondary Button",
                state = GrapesButtonState.Disabled,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            GrapesAlertSecondaryButton(
                text = "Secondary Button",
                state = GrapesButtonState.Disabled,
                icon = icon,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
