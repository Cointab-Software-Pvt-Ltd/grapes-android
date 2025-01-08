package com.spendesk.grapes.compose.button

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author : kelian
 * @since : 30/10/2024
 **/
@Composable
fun GrapesQuickActionButton(
    label: String,
    @DrawableRes icon: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    QuickActionButton(
        buttonContent = {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = null,
                tint = GrapesTheme.colors.structureComplementary,
                modifier = Modifier.size(GrapesTheme.dimensions.sizing2)
            )
        },
        labelContent = {
            Text(
                text = label,
                textAlign = TextAlign.Center,
                color = GrapesTheme.colors.neutralDarker
            )
        },
        onClick = onClick,
        modifier = modifier,
    )
}

@Composable
private fun QuickActionButton(
    buttonContent: @Composable () -> Unit,
    labelContent: @Composable () -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    // To make the ripple happen on the button part of it, the mutable interaction source is shared between the button and the column.
    val mutableInteractionSource = remember { MutableInteractionSource() }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable(
            interactionSource = mutableInteractionSource,
            indication = null,
            onClick = onClick
        )
    ) {
        Button(
            modifier = Modifier.size(QuickActionButtonDefaults.buttonSize),
            onClick = onClick,
            colors = QuickActionButtonDefaults.buttonColors,
            border = QuickActionButtonDefaults.buttonBorder,
            shape = QuickActionButtonDefaults.buttonShape,
            contentPadding = QuickActionButtonDefaults.buttonPadding,
            interactionSource = mutableInteractionSource,
        ) {
            buttonContent()
        }
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.spacing2))
        labelContent()
    }
}

@Preview
@Composable
private fun GrapesQuickActionButtonPreview() {
    GrapesTheme {
        var clickCount by remember { mutableStateOf(0) }

        Column(
            modifier = Modifier
                .background(GrapesTheme.colors.structureBackground)
                .padding(GrapesTheme.dimensions.spacing3)
        ) {
            GrapesQuickActionButton(
                label = "Label $clickCount",
                icon = R.drawable.ic_add,
                onClick = { clickCount++ }, // Let's make sure onClick is not triggered twice by the interaction source sharing.
            )
        }
    }
}
