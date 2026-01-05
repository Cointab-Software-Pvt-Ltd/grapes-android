package com.spendesk.grapes.compose.messaging

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.button.primary.GrapesBrandPrimaryButton
import com.spendesk.grapes.compose.icons.GrapesHighlightIconInfo
import com.spendesk.grapes.compose.icons.GrapesHighlightIconSize
import com.spendesk.grapes.compose.theme.GrapesTheme

@Composable
fun GrapesEmptyState(
    title: String,
    description: String,
    modifier: Modifier = Modifier,
    icon: @Composable () -> Unit = {
        GrapesHighlightIconInfo(size = GrapesHighlightIconSize.EXTRA_LARGE)
    },
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(
            horizontal = GrapesTheme.dimensions.unit24,
            vertical = GrapesTheme.dimensions.unit32,
        )
    ) {
        EmptyStateContent(
            title = title,
            description = description,
            icon = icon,
        )
    }
}

@Composable
fun GrapesEmptyState(
    title: String,
    description: String,
    actionText: String,
    onActionClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: @Composable () -> Unit = {
        GrapesHighlightIconInfo(size = GrapesHighlightIconSize.EXTRA_LARGE)
    },
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(
            horizontal = GrapesTheme.dimensions.unit24,
            vertical = GrapesTheme.dimensions.unit32,
        )
    ) {
        EmptyStateContent(
            title = title,
            description = description,
            icon = icon,
        )
        Spacer(Modifier.height(GrapesTheme.dimensions.unit24))
        GrapesBrandPrimaryButton(
            text = actionText,
            onClick = onActionClick,
        )
    }
}

@Composable
fun ColumnScope.EmptyStateContent(
    title: String,
    description: String,
    icon: @Composable () -> Unit,
) {
    icon()
    Spacer(Modifier.height(GrapesTheme.dimensions.unit24))
    Text(
        text = title,
        color = GrapesTheme.colors.contentPrimary,
        style = GrapesTheme.typography.titleL,
        textAlign = TextAlign.Center,
    )
    Spacer(Modifier.height(GrapesTheme.dimensions.unit8))
    Text(
        text = description,
        color = GrapesTheme.colors.contentSecondaryBGPrimary,
        style = GrapesTheme.typography.bodyM,
        textAlign = TextAlign.Center,
    )
}

@Composable
@Preview(showBackground = true)
private fun PreviewGrapesEmptyStatWithAction() {
    GrapesTheme {
        GrapesEmptyState(
            title = "No messages yet",
            description = "Start a conversation to see your messages here.",
            actionText = "Start Chat",
            onActionClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun PreviewGrapesEmptyState() {
    GrapesTheme {
        GrapesEmptyState(
            title = "No messages yet",
            description = "Start a conversation to see your messages here.",
        )
    }
}
