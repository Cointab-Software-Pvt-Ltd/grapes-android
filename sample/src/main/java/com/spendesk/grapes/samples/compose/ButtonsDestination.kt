package com.spendesk.grapes.samples.compose

/**
 * @author Kélian CLERC
 * @since 17/01/2025
 */
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.button.GrapesButton
import com.spendesk.grapes.compose.button.GrapesButtonState
import com.spendesk.grapes.compose.button.GrapesButtonStyleDefaults
import com.spendesk.grapes.compose.button.GrapesGoogleButton
import com.spendesk.grapes.compose.button.GrapesMicrosoftButton
import com.spendesk.grapes.compose.button.GrapesQuickActionButton
import com.spendesk.grapes.compose.button.GrapesSamlButton
import com.spendesk.grapes.compose.icons.GrapesIconSet
import com.spendesk.grapes.compose.theme.GrapesTheme
import com.spendesk.grapes.samples.R

@Composable
fun ButtonsDestination() {
    val scroll = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scroll)
            .padding(GrapesTheme.dimensions.unit16),
    ) {
        Text("Button primary", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit8))
        ButtonPrimary()
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit16))

        Text("Button secondary", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit8))
        ButtonSecondary()
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit16))

        Text("Button tertiary", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit8))
        ButtonTertiary()
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit16))

        Text("Button alert", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit8))
        ButtonAlert()
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit16))

        Text("Button warning", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit8))
        ButtonWarning()
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit16))

        Text("Button SSO", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit8))
        MarketingButtons()
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit16))
    }
}

@Composable
private fun ButtonPrimary() {
    Column(
        verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit16),
    ) {
        GrapesButton("Label", buttonStyle = GrapesButtonStyleDefaults.primary, state = GrapesButtonState.Enabled, modifier = Modifier.fillMaxWidth(), onClick = {})
        GrapesButton("Label", buttonStyle = GrapesButtonStyleDefaults.primary, state = GrapesButtonState.Disabled, modifier = Modifier.fillMaxWidth(), onClick = {})
        GrapesButton("Label", buttonStyle = GrapesButtonStyleDefaults.primary, state = GrapesButtonState.ShowCircularIndicator, modifier = Modifier.fillMaxWidth(), onClick = {})
        Text("Floating action button", style = GrapesTheme.typography.titleS, color = GrapesTheme.colors.contentPrimary)
        FloatingActionButton(
            shape = GrapesTheme.shapes.radius1000,
            containerColor = GrapesTheme.colors.backgroundPrimaryBrandDefault,
            contentColor = GrapesTheme.colors.contentComplementary,
            onClick = {}
        ) {
            GrapesIconSet.CirclePlus()
        }
        FloatingActionButton(
            shape = GrapesTheme.shapes.radius1000,
            containerColor = GrapesTheme.colors.backgroundPrimaryBrandDefault,
            contentColor = GrapesTheme.colors.contentComplementary,
            onClick = {}
        ) {
            Row(modifier = Modifier.padding(horizontal = GrapesTheme.dimensions.unit16)) {
                GrapesIconSet.CirclePlus()
                Spacer(modifier = Modifier.width(GrapesTheme.dimensions.unit8))
                Text("Label", style = GrapesTheme.typography.bodyL, color = GrapesTheme.colors.contentComplementary)
            }
        }
    }
}

@Composable
private fun ButtonSecondary() {
    Column(
        verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit16),
    ) {
        GrapesButton("Label", buttonStyle = GrapesButtonStyleDefaults.secondary, state = GrapesButtonState.Enabled, modifier = Modifier.fillMaxWidth(), onClick = {})
        GrapesButton("Label", buttonStyle = GrapesButtonStyleDefaults.secondary, state = GrapesButtonState.Disabled, modifier = Modifier.fillMaxWidth(), onClick = {})
        GrapesButton("Label", buttonStyle = GrapesButtonStyleDefaults.secondary, state = GrapesButtonState.ShowCircularIndicator, modifier = Modifier.fillMaxWidth(), onClick = {})
        Text("Button icon secondary", style = GrapesTheme.typography.titleS, color = GrapesTheme.colors.contentPrimary)
        GrapesQuickActionButton(label = "Label", icon = R.drawable.ic_grapes_icon_puzzle, onClick = {})
    }
}

@Composable
private fun ButtonTertiary() {
    Column(
        verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit16),
    ) {
        GrapesButton("Label", buttonStyle = GrapesButtonStyleDefaults.tertiary, state = GrapesButtonState.Enabled, modifier = Modifier.fillMaxWidth(), onClick = {})
        GrapesButton("Label", buttonStyle = GrapesButtonStyleDefaults.tertiary, state = GrapesButtonState.Disabled, modifier = Modifier.fillMaxWidth(), onClick = {})
        GrapesButton("Label", buttonStyle = GrapesButtonStyleDefaults.tertiary, state = GrapesButtonState.ShowCircularIndicator, modifier = Modifier.fillMaxWidth(), onClick = {})
    }
}

@Composable
private fun ButtonAlert() {
    Column(
        verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit16),
    ) {
        GrapesButton("Label", buttonStyle = GrapesButtonStyleDefaults.alert, state = GrapesButtonState.Enabled, modifier = Modifier.fillMaxWidth(), onClick = {})
        GrapesButton("Label", buttonStyle = GrapesButtonStyleDefaults.alert, state = GrapesButtonState.Disabled, modifier = Modifier.fillMaxWidth(), onClick = {})
        GrapesButton("Label", buttonStyle = GrapesButtonStyleDefaults.alert, state = GrapesButtonState.ShowCircularIndicator, modifier = Modifier.fillMaxWidth(), onClick = {})
    }
}

@Composable
private fun ButtonWarning() {
    Column(
        verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit16),
    ) {
        GrapesButton("Label", buttonStyle = GrapesButtonStyleDefaults.warning, state = GrapesButtonState.Enabled, modifier = Modifier.fillMaxWidth(), onClick = {})
        GrapesButton("Label", buttonStyle = GrapesButtonStyleDefaults.warning, state = GrapesButtonState.Disabled, modifier = Modifier.fillMaxWidth(), onClick = {})
        GrapesButton("Label", buttonStyle = GrapesButtonStyleDefaults.warning, state = GrapesButtonState.ShowCircularIndicator, modifier = Modifier.fillMaxWidth(), onClick = {})
    }
}

@Composable
private fun MarketingButtons() {
    Column(
        verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit16),
    ) {
        GrapesGoogleButton("Sign in with Google", onClick = {})
        GrapesMicrosoftButton("Sign in with Microsoft", onClick = {})
        GrapesSamlButton("Sign in with SAML", onClick = {})
    }
}

@Preview
@Composable
fun ButtonsDestinationPreview() {
    GrapesTheme {
        ButtonsDestination()
    }
}
