package com.spendesk.grapes.compose.badge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.model.GrapesConfigurationStatus
import com.spendesk.grapes.compose.theme.GrapesTheme
import com.spendesk.grapes.compose.theme.extensions.backgroundColorFor
import com.spendesk.grapes.compose.theme.extensions.neutralContentColorFor

/**
 * @author Kélian CLERC
 * @since 02/12/2022
 */

@Deprecated("Replaced by GrapesTag or new GrapesBadge")
@Composable
fun LegacyGrapesBadge(
    content: String,
    configuration: GrapesConfigurationStatus,
    modifier: Modifier = Modifier
) {
    val backgroundColor = GrapesTheme.colors.backgroundColorFor(configuration)
    val contentColor = GrapesTheme.colors.neutralContentColorFor(configuration)
    Text(
        text = content,
        modifier = modifier
            .background(backgroundColor, GrapesTheme.shapes.radius1000)
            .padding(horizontal = GrapesTheme.dimensions.unit16, vertical = GrapesTheme.dimensions.unit4),
        style = GrapesTheme.typography.titleL,
        color = contentColor
    )
}

@Preview
@Composable
fun GrapesBadgePreview() {
    GrapesTheme {
        Column(verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit4)) {
            LegacyGrapesBadge(content = "Message Inline Success", configuration = GrapesConfigurationStatus.SUCCESS)
            LegacyGrapesBadge(content = "Message Inline Information", configuration = GrapesConfigurationStatus.INFORMATION)
            LegacyGrapesBadge(content = "Message Inline Neutral", configuration = GrapesConfigurationStatus.NEUTRAL)
            LegacyGrapesBadge(content = "Message Inline Alert", configuration = GrapesConfigurationStatus.ALERT)
            LegacyGrapesBadge(content = "Message Inline Warning", configuration = GrapesConfigurationStatus.WARNING)
            LegacyGrapesBadge(content = "Message Inline Blocked", configuration = GrapesConfigurationStatus.BLOCKED)
        }
    }
}
