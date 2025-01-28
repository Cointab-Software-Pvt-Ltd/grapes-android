package com.spendesk.grapes.samples.compose.helper

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TooltipBox
import androidx.compose.material3.TooltipDefaults
import androidx.compose.material3.rememberTooltipState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.spendesk.grapes.compose.icons.GrapesIconSet
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author Kélian CLERC
 * @since 21/01/2025
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GrapesTooltipBox(text: String, modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    TooltipBox(
        positionProvider = TooltipDefaults.rememberPlainTooltipPositionProvider(),
        state = rememberTooltipState(isPersistent = false),
        tooltip = { TooltipContent(text, modifier) }
    ) {
        content()
    }
}

@Composable
fun TooltipContent(text: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .clip(GrapesTheme.shapes.radius4)
            .background(color = GrapesTheme.colors.backgroundSecondaryInfoDefault)
            .padding(GrapesTheme.dimensions.unit8),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit4),
    ) {
        GrapesIconSet.CircleInformation(tint = GrapesTheme.colors.contentInfoDefault)
        Text(
            text = text,
            style = GrapesTheme.typography.bodyM,
            color = GrapesTheme.colors.contentInfoDefault
        )
    }
}
