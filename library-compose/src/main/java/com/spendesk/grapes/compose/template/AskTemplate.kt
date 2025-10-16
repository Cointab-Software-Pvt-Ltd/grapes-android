package com.spendesk.grapes.compose.template

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.button.primary.GrapesComplementaryTertiaryButton
import com.spendesk.grapes.compose.button.primary.GrapesSecondaryButton
import com.spendesk.grapes.compose.template.molecule.InformativeComponent
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author Kélian CLERC
 * @since 06/10/2022
 */
@Composable
private fun AskTemplate(
    header: @Composable () -> Unit,
    title: @Composable () -> Unit,
    description: @Composable () -> Unit,
    callToAction: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    contentWindowInsets: WindowInsets = WindowInsets.systemBars,
) {
    InformativeComponent(
        middlePart = {
            Column(
                modifier = Modifier.padding(GrapesTheme.dimensions.unit8),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit16)
            ) {
                header()
                title()
                description()
            }
        },
        bottomPart = callToAction,
        contentWindowInsets = contentWindowInsets,
        modifier = modifier
    )
}

@Composable
fun AskTemplate(
    @DrawableRes headerImageRes: Int? = null,
    title: String,
    description: String?,
    callToAction: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    contentWindowInsets: WindowInsets = WindowInsets.systemBars,
) {
    val header = @Composable {
        if (headerImageRes != null) {
            Image(painter = painterResource(id = headerImageRes), contentDescription = null)
        }
    }

    val titleText = @Composable {
        Text(
            text = title,
            style = GrapesTheme.typography.titleXl.copy(fontSize = 32.sp),
            color = GrapesTheme.colors.contentComplementary,
            textAlign = TextAlign.Center
        )
    }

    val descriptionText = @Composable {
        if (description != null) {
            Text(
                text = description,
                style = GrapesTheme.typography.bodyL,
                color = GrapesTheme.colors.contentComplementary,
                textAlign = TextAlign.Center
            )
        }
    }

    AskTemplate(
        header = header,
        title = titleText,
        description = descriptionText,
        callToAction = callToAction,
        contentWindowInsets = contentWindowInsets,
        modifier = modifier,
    )
}

@Preview
@Composable
fun Preview() {
    val cta = @Composable {
        Column(verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit12)) {
            GrapesSecondaryButton(
                text = "Main button",
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
            )

            GrapesComplementaryTertiaryButton(
                text = "Secondary button",
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }

    GrapesTheme {
        AskTemplate(
            headerImageRes = R.drawable.ic_google_logo,
            title = "Hello, i'm a great title",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            callToAction = cta
        )
    }
}
