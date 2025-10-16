package com.spendesk.grapes.samples.compose

/**
 * @author Kélian CLERC
 * @since 17/01/2025
 */
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.badge.GrapesAlertBadge
import com.spendesk.grapes.compose.badge.GrapesNeutralBadge
import com.spendesk.grapes.compose.badge.GrapesPrimaryBadge
import com.spendesk.grapes.compose.callout.GrapesErrorCallout
import com.spendesk.grapes.compose.callout.GrapesInfoCallout
import com.spendesk.grapes.compose.callout.GrapesNeutralCallout
import com.spendesk.grapes.compose.callout.GrapesSuccessCallout
import com.spendesk.grapes.compose.callout.GrapesWarningCallout
import com.spendesk.grapes.compose.callout.atoms.GrapesCalloutContentBottomSignature
import com.spendesk.grapes.compose.callout.atoms.GrapesCalloutContentCTAPrimary
import com.spendesk.grapes.compose.callout.atoms.GrapesCalloutContentCTASecondary
import com.spendesk.grapes.compose.callout.molecules.GrapesCalloutContent
import com.spendesk.grapes.compose.callout.molecules.GrapesCalloutContentBottomCTA
import com.spendesk.grapes.compose.tag.GrapesErrorTag
import com.spendesk.grapes.compose.tag.GrapesInfoTag
import com.spendesk.grapes.compose.tag.GrapesNeutralTag
import com.spendesk.grapes.compose.tag.GrapesSuccessTag
import com.spendesk.grapes.compose.tag.GrapesWarningTag
import com.spendesk.grapes.compose.theme.GrapesTheme
import com.spendesk.grapes.samples.compose.helper.GrapesTooltipBox

@Composable
fun MessagingDestination() {
    val scroll = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scroll)
            .padding(GrapesTheme.dimensions.unit16),
    ) {
        Text("Badge", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit4))
        Badges()
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit16))

        Text("Empty state", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit4))
        Text("todo ...", style = GrapesTheme.typography.bodyS, color = GrapesTheme.colors.contentSecondaryBGPrimary)
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit16))

        Text("Tag", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit4))
        Tags()
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit16))

        Text("Message", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit4))
        Text("todo ...", style = GrapesTheme.typography.bodyS, color = GrapesTheme.colors.contentSecondaryBGPrimary)
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit16))

        Text("Toaster", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit4))
        Snackbar { Text("Message", style = GrapesTheme.typography.bodyL) }
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit16))

        Text("Callout", style = GrapesTheme.typography.titleL, color = GrapesTheme.colors.contentPrimary)
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit4))
        Callouts()
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit16))
    }
}

@Composable
private fun Badges() {
    Column(verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8)) {
        Row(horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8)) {

            GrapesTooltipBox("GrapesNeutralBadge") {
                GrapesNeutralBadge(1)
            }
            GrapesTooltipBox("GrapesAlertBadge") {
                GrapesAlertBadge(200, maxCount = 99)
            }
        }
        Row(horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8)) {
            GrapesTooltipBox("GrapesNeutralBadge") {
                GrapesNeutralBadge(1)
            }
            GrapesTooltipBox("GrapesPrimaryBadge") {
                GrapesPrimaryBadge(1)
            }
            GrapesTooltipBox("GrapesAlertBadge") {
                GrapesAlertBadge(1)
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun Tags() {
    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
        verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8)
    ) {
        GrapesTooltipBox("GrapesErrorTag") {
            GrapesErrorTag("Label", showIcon = true)
        }
        GrapesTooltipBox("GrapesNeutralTag") {
            GrapesNeutralTag("Label", showIcon = true)
        }
        GrapesTooltipBox("GrapesWarningTag") {
            GrapesWarningTag("Label", showIcon = true)
        }
        GrapesTooltipBox("GrapesInfoTag") {
            GrapesInfoTag("Label", showIcon = true)
        }
        GrapesTooltipBox("GrapesSuccessTag") {
            GrapesSuccessTag("Label", showIcon = true)
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun Callouts() {
    val title = "Message title"
    val description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nec lectus sed sem porttitor viverra. Vestibulum magna leo."
    Column(verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit16)) {
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8)
        ) {
            GrapesTooltipBox("GrapesErrorCallout") {
                GrapesErrorCallout(title, { CalloutWithCTAContent(description = description) })
            }
            GrapesTooltipBox("GrapesErrorCallout") {
                GrapesErrorCallout(title, {})
            }
            GrapesTooltipBox("GrapesErrorCallout") {
                GrapesErrorCallout(title, { CalloutWithAvatarContent(description = description) })
            }
        }
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8)
        ) {
            GrapesTooltipBox("GrapesWarningCallout") {
                GrapesWarningCallout(title, { CalloutWithCTAContent(description = description) })
            }
            GrapesTooltipBox("GrapesWarningCallout") {
                GrapesWarningCallout(title, {})
            }
            GrapesTooltipBox("GrapesWarningCallout") {
                GrapesWarningCallout(title, { CalloutWithAvatarContent(description = description) })
            }
        }
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8)
        ) {
            GrapesTooltipBox("GrapesInfoCallout") {
                GrapesInfoCallout(title, { CalloutWithCTAContent(description = description) })
            }
            GrapesTooltipBox("GrapesInfoCallout") {
                GrapesInfoCallout(title, {})
            }
            GrapesTooltipBox("GrapesInfoCallout") {
                GrapesInfoCallout(title, { CalloutWithAvatarContent(description = description) })
            }
        }
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8)
        ) {
            GrapesTooltipBox("GrapesSuccessCallout") {
                GrapesSuccessCallout(title, { CalloutWithCTAContent(description = description) })
            }
            GrapesTooltipBox("GrapesSuccessCallout") {
                GrapesSuccessCallout(title, {})
            }
            GrapesTooltipBox("GrapesSuccessCallout") {
                GrapesSuccessCallout(title, { CalloutWithAvatarContent(description = description) })
            }
        }
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8),
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit8)
        ) {
            GrapesTooltipBox("GrapesNeutralCallout") {
                GrapesNeutralCallout(title, { CalloutWithCTAContent(description = description) })
            }
            GrapesTooltipBox("GrapesNeutralCallout") {
                GrapesNeutralCallout(title, {})
            }
            GrapesTooltipBox("GrapesNeutralCallout") {
                GrapesNeutralCallout(title, { CalloutWithAvatarContent(description = description) })
            }
        }
    }
}

@Composable
private fun ColumnScope.CalloutWithAvatarContent(description: String) {
    GrapesCalloutContent(description = description) {
        GrapesCalloutContentBottomSignature(fullName = "Full Name")
    }
}

@Composable
private fun ColumnScope.CalloutWithCTAContent(description: String) {
    GrapesCalloutContent(description = description) {
        GrapesCalloutContentBottomCTA(
            primaryButton = { GrapesCalloutContentCTAPrimary(buttonText = "Action") {} },
            secondaryButton = { GrapesCalloutContentCTASecondary(buttonText = "Secondary Action") {} },
        )
    }
}

@Preview
@Composable
fun MessagingDestinationPreview() {
    GrapesTheme {
        MessagingDestination()
    }
}
