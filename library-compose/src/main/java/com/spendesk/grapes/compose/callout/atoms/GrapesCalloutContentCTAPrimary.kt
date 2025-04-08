package com.spendesk.grapes.compose.callout.atoms

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.spendesk.grapes.compose.button.primary.GrapesAlertPrimaryButton
import com.spendesk.grapes.compose.button.primary.GrapesBrandPrimaryButton
import com.spendesk.grapes.compose.button.primary.GrapesWarningPrimaryButton
import com.spendesk.grapes.compose.callout.CalloutType
import com.spendesk.grapes.compose.callout.GrapesCalloutType
import com.spendesk.grapes.compose.callout.LocalGrapesCalloutType
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author jean-philippe
 * @since 30/10/2023, Monday
 **/

@Composable
fun GrapesCalloutContentCTAPrimary(
    buttonText: String,
    onButtonClick: () -> Unit,
) {
    when (LocalGrapesCalloutType.current.type) {
        CalloutType.ERROR -> {
            GrapesAlertPrimaryButton(
                text = buttonText,
                onClick = onButtonClick,
                modifier = Modifier.fillMaxWidth()
            )
        }

        CalloutType.WARNING -> {
            GrapesWarningPrimaryButton(
                text = buttonText,
                onClick = onButtonClick,
                modifier = Modifier.fillMaxWidth()
            )
        }

        CalloutType.INFO,
        CalloutType.SUCCESS,
        CalloutType.NEUTRAL,
        -> {
            GrapesBrandPrimaryButton(
                text = buttonText,
                onClick = onButtonClick,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

private class GrapesCalloutTypeProvider : PreviewParameterProvider<GrapesCalloutType> {

    override val values: Sequence<GrapesCalloutType>
        get() = CalloutType.entries.map { GrapesCalloutType(it) }.asSequence()
}

@Preview
@Composable
private fun PreviewGrapesCalloutContentCTAPrimary(
    @PreviewParameter(GrapesCalloutTypeProvider::class) type: GrapesCalloutType,
) {
    GrapesTheme {
        CompositionLocalProvider(LocalGrapesCalloutType provides type) {
            GrapesCalloutContentCTAPrimary(
                buttonText = "Button",
                onButtonClick = {},
            )
        }
    }
}
