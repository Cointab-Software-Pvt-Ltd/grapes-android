package com.spendesk.grapes.compose.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.internal.Slot
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author : RomainGF
 * @since : 03/01/2024
 **/
@Composable
fun GrapesSection(
    title: String,
    modifier: Modifier = Modifier,
    action: @Composable (GrapesSectionActionScope.() -> Unit)? = null,
    elevation: CardElevation = CardDefaults.cardElevation(),
    content: @Composable () -> Unit,
) {
    Card(
        modifier = modifier,
        shape = GrapesTheme.shapes.radius12,
        elevation = elevation,
        colors = CardDefaults.cardColors(
            containerColor = GrapesTheme.colors.backgroundPrimaryDefault,
            contentColor = GrapesTheme.colors.contentPrimary,
        ),
    ) {
        Column(
            modifier = Modifier
                .padding(vertical = GrapesTheme.dimensions.unit8)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    text = title,
                    style = GrapesTheme.typography.titleS,
                    color = GrapesTheme.colors.contentSecondaryBGSecondary,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .weight(1f)
                        .padding(
                            horizontal = GrapesTheme.dimensions.unit16,
                            vertical = GrapesTheme.dimensions.unit8,
                        )
                )
                if (action != null) {
                    Box {
                        GrapesSectionActionScope.action()
                    }
                }
            }
            content()
        }
    }
}

object GrapesSectionActionScope {

    @Composable
    fun Action(
        title: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        onClick: () -> Unit,
    ) {
        TextButton(
            onClick = onClick,
            contentPadding = PaddingValues(
                horizontal = GrapesTheme.dimensions.unit16,
                vertical = 0.dp,
            ),
            shape = GrapesTheme.shapes.radius8,
            enabled = enabled,
            colors = ButtonColors(
                contentColor = GrapesTheme.colors.contentBrandDefault,
                containerColor = GrapesTheme.colors.backgroundPrimaryDefault,
                disabledContentColor = GrapesTheme.colors.contentDisable,
                disabledContainerColor = GrapesTheme.colors.backgroundPrimaryDefault,
            ),
            modifier = modifier
                .widthIn(min = GrapesTheme.dimensions.unit48)
                .height(GrapesTheme.dimensions.unit32)
        ) {
            Text(
                text = title,
                style = GrapesTheme.typography.titleS,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

@Preview
@Preview(fontScale = 2f)
@Composable
private fun PreviewGrapesSectionWithAction() {
    GrapesTheme {
        GrapesSection(
            title = "Some section title",
            action = {
                Action(
                    title = "Actionable",
                    onClick = {},
                    enabled = true,
                )
            },
        ) {
            Slot(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            )
        }
    }
}

@Preview
@Composable
private fun PreviewGrapesSectionWithActionDisabled() {
    GrapesTheme {
        GrapesSection(
            title = "Some section title",
            action = {
                Action(
                    title = "Actionable",
                    onClick = {},
                    enabled = false,
                )
            },
        ) {
            Slot(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            )
        }
    }
}

@Preview
@Composable
private fun PreviewGrapesSectionWithoutAction() {
    GrapesTheme {
        GrapesSection(
            title = "Some section title",
            action = null,
        ) {
            Slot(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            )
        }
    }
}
