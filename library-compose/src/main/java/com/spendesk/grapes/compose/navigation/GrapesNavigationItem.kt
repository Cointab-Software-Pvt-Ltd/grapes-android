package com.spendesk.grapes.compose.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.icons.GrapesIconSet
import com.spendesk.grapes.compose.theme.GrapesTheme
import com.spendesk.grapes.compose.theme.carbon7

/**
 * @author : kelian
 * @since : 03/02/2025
 **/
@Composable
fun NavigationItem(
    text: String,
    iconSlot: @Composable () -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .clip(GrapesTheme.shapes.radius12)
            .background(GrapesTheme.colors.backgroundPrimaryDefault)
            .border(1.dp, GrapesTheme.colors.borderDefault, GrapesTheme.shapes.radius12)
            .clickable(role = Role.Button, onClick = onClick)
            .padding(vertical = GrapesTheme.dimensions.unit16)
            .padding(start = GrapesTheme.dimensions.unit16, end = GrapesTheme.dimensions.unit8),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .clip(GrapesTheme.shapes.radius8)
                .background(carbon7)
                .padding(GrapesTheme.dimensions.unit8),
            contentAlignment = Alignment.Center,
        ) { iconSlot() }
        Spacer(Modifier.width(GrapesTheme.dimensions.unit16))
        Text(
            text = text,
            style = GrapesTheme.typography.titleL,
            color = GrapesTheme.colors.contentPrimary,
            modifier = Modifier.weight(1f)
        )
        Spacer(Modifier.width(GrapesTheme.dimensions.unit16))
        GrapesIconSet.ChevronRight(
            modifier = Modifier.size(GrapesTheme.dimensions.sizeIconXl),
            tint = GrapesTheme.colors.contentPrimary
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NavigationItemPreview() {
    GrapesTheme {
        NavigationItem(
            text = "Settings",
            iconSlot = { GrapesIconSet.Gear() },
            onClick = {},
            modifier = Modifier.padding(GrapesTheme.dimensions.unit16)
        )
    }
}
