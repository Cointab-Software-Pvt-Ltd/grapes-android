package com.spendesk.grapes.compose.button.core

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.button.NoRippleInteractionSource
import com.spendesk.grapes.compose.button.primary.GrapesPrimaryDefault
import com.spendesk.grapes.compose.icons.GrapesIconSet
import com.spendesk.grapes.compose.theme.GrapesTheme

@Composable
internal fun BasicButton(
    text: String,
    colors: GrapesButtonColors,
    state: GrapesButtonState,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: @Composable (() -> Unit)? = null,
    border: BorderStroke? = null,
    alignment: Alignment = Alignment.Center,
) {
    Button(
        enabled = state != GrapesButtonState.Disabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = colors.containerColor,
            contentColor = colors.contentColor,
            disabledContainerColor = colors.disabledContainerColor,
            disabledContentColor = colors.disabledContentColor,
        ),
        shape = GrapesTheme.shapes.radius8,
        border = border,
        contentPadding = PaddingValues(0.dp),
        interactionSource = if (state is GrapesButtonState.Loading) {
            NoRippleInteractionSource()
        } else {
            remember { MutableInteractionSource() }
        },
        onClick = onClick,
        modifier = modifier
            .heightIn(min = GrapesTheme.dimensions.unit48)
            .height(IntrinsicSize.Min)
            .width(IntrinsicSize.Min)
    ) {
        Box(
            contentAlignment = alignment,
            modifier = Modifier.fillMaxSize()
        ) {
            if (state is GrapesButtonState.Loading) {
                GrapesPrimaryButtonProgressIndicator(
                    state = state,
                    color = colors.loadingColor,
                    modifier = Modifier.fillMaxSize()
                )
            }
            GrapesButtonContent(
                text = text,
                icon = icon,
                modifier = Modifier.padding(ButtonDefaults.ContentPadding)
            )
        }
    }
}

@Composable
internal fun GrapesButtonContent(
    text: String,
    icon: @Composable (() -> Unit)?,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
        modifier = modifier.width(IntrinsicSize.Max)
    ) {
        if (icon != null) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(GrapesTheme.dimensions.unit16)
            ) {
                icon()
            }
        }

        Text(
            text = text,
            style = GrapesTheme.typography.bodyL,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
private fun GrapesPrimaryButtonProgressIndicator(
    state: GrapesButtonState.Loading,
    color: Color,
    modifier: Modifier = Modifier,
) {
    when (state) {
        is GrapesButtonState.Loading.Indeterminate -> {
            LinearProgressIndicator(
                strokeCap = StrokeCap.Butt,
                color = color,
                trackColor = Color.Transparent,
                gapSize = 0.dp,
                modifier = modifier
            )
        }

        is GrapesButtonState.Loading.Determinate -> {
            LinearProgressIndicator(
                strokeCap = StrokeCap.Butt,
                color = color,
                trackColor = Color.Transparent,
                gapSize = 0.dp,
                progress = { state.progress },
                drawStopIndicator = {},
                modifier = modifier
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
@Preview(showBackground = true, fontScale = 2f)
private fun PreviewGrapesBasicButton() {
    GrapesTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
            modifier = Modifier.padding(GrapesTheme.dimensions.unit8),
        ) {
            val icon = @Composable { GrapesIconSet.Bell() }
            Text(text = "Full width", style = GrapesTheme.typography.titleL)
            BasicButton(
                text = "Basic Button Full Width",
                state = GrapesButtonState.Enabled,
                colors = GrapesPrimaryDefault.brandColors(),
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            BasicButton(
                text = "Basic Button Full Width",
                icon = icon,
                state = GrapesButtonState.Enabled,
                colors = GrapesPrimaryDefault.brandColors(),
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            BasicButton(
                text = "Basic Button Full Width",
                icon = icon,
                state = GrapesButtonState.Disabled,
                colors = GrapesPrimaryDefault.brandColors(),
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )

            Text(text = "Text overflow", style = GrapesTheme.typography.titleL)
            BasicButton(
                text = "Basic Button with a long title which should exceed the button size",
                state = GrapesButtonState.Enabled,
                colors = GrapesPrimaryDefault.brandColors(),
                onClick = {},
            )

            BasicButton(
                text = "Basic Button with a long title which should exceed the button size",
                icon = icon,
                state = GrapesButtonState.Enabled,
                colors = GrapesPrimaryDefault.brandColors(),
                onClick = {},
            )

            BasicButton(
                text = "Basic Button with a long title which should exceed the button size",
                icon = icon,
                state = GrapesButtonState.Disabled,
                colors = GrapesPrimaryDefault.brandColors(),
                onClick = {},
            )

            Text(text = "Simple", style = GrapesTheme.typography.titleL)
            BasicButton(
                text = "Basic Button",
                state = GrapesButtonState.Enabled,
                colors = GrapesPrimaryDefault.brandColors(),
                onClick = {},
            )

            BasicButton(
                text = "Basic Button",
                icon = icon,
                state = GrapesButtonState.Enabled,
                colors = GrapesPrimaryDefault.brandColors(),
                onClick = {},
            )

            BasicButton(
                text = "Basic Button",
                icon = icon,
                state = GrapesButtonState.Disabled,
                colors = GrapesPrimaryDefault.brandColors(),
                onClick = {},
            )
        }
    }
}
