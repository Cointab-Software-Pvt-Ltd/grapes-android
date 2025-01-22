package com.spendesk.grapes.samples.compose

/**
 * @author Kélian CLERC
 * @since 17/01/2025
 */
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.card.GrapesCard
import com.spendesk.grapes.compose.theme.GrapesTheme
import com.spendesk.grapes.samples.compose.navigation.Destinations

@Composable
fun HomeDestination(
    onDestinationClicked: (Destinations) -> Unit,
    onOpenLegacyClicked: () -> Unit,
) {
    LazyVerticalGrid(modifier = Modifier.fillMaxSize(), columns = GridCells.Fixed(2)) {
        item(key = "Design tokens", span = { GridItemSpan(maxLineSpan) }) {
            GridHeader(text = "Design tokens")
        }
        item(key = "Colors") {
            GridItem(
                text = "Colors",
                onClick = {
                    onDestinationClicked(Destinations.Colors)
                }
            )
        }
        item(key = "Icons") {
            GridItem(
                text = "Icons",
                onClick = {
                    onDestinationClicked(Destinations.Icons)
                }
            )
        }
        item(key = "Shape") {
            GridItem(
                text = "Shape",
                onClick = {
                    onDestinationClicked(Destinations.Shape)
                }
            )
        }
        item(key = "Spacing") {
            GridItem(
                text = "Spacing",
                onClick = {
                    onDestinationClicked(Destinations.Spacing)
                }
            )
        }
        item(key = "Size") {
            GridItem(
                text = "Size",
                onClick = {
                    onDestinationClicked(Destinations.Size)
                }
            )
        }
        item(key = "Typography") {
            GridItem(
                text = "Typography",
                onClick = {
                    onDestinationClicked(Destinations.Typography)
                }
            )
        }

        item(key = "Components", span = { GridItemSpan(maxLineSpan) }) {
            GridHeader(text = "Components")
        }

        item(key = "Buttons") {
            GridItem(
                text = "Buttons",
                onClick = {
                    onDestinationClicked(Destinations.Buttons)
                }
            )
        }

        item(key = "Cards") {
            GridItem(
                text = "Cards",
                onClick = {
                    onDestinationClicked(Destinations.Cards)
                }
            )
        }

        item(key = "Controls") {
            GridItem(
                text = "Controls",
                onClick = {
                    onDestinationClicked(Destinations.Controls)
                }
            )
        }

        item(key = "Gauge") {
            GridItem(
                text = "Gauge",
                onClick = {
                    onDestinationClicked(Destinations.Gauge)
                }
            )
        }

        item(key = "Header") {
            GridItem(
                text = "Header",
                onClick = {
                    onDestinationClicked(Destinations.Header)
                }
            )
        }

        item(key = "Inputs") {
            GridItem(
                text = "Inputs",
                onClick = {
                    onDestinationClicked(Destinations.Inputs)
                }
            )
        }

        item(key = "Lists") {
            GridItem(
                text = "Lists",
                onClick = {
                    onDestinationClicked(Destinations.Lists)
                }
            )
        }

        item(key = "Messaging") {
            GridItem(
                text = "Messaging",
                onClick = {
                    onDestinationClicked(Destinations.Messaging)
                }
            )
        }

        item(key = "Modal") {
            GridItem(
                text = "Modal",
                onClick = {
                    onDestinationClicked(Destinations.Modal)
                }
            )
        }

        item(key = "Navigation") {
            GridItem(
                text = "Navigation",
                onClick = {
                    onDestinationClicked(Destinations.Navigation)
                }
            )
        }

        item(key = "Grapes Legacy", span = { GridItemSpan(maxLineSpan) }) {
            GridHeader(text = "Grapes Legacy")
        }

        item(key = "Legacy Sample") {
            GridItem(
                text = "Legacy Sample",
                onClick = onOpenLegacyClicked
            )
        }
    }
}

@Composable
private fun GridHeader(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        style = GrapesTheme.typography.titleL,
        color = GrapesTheme.colors.contentInfoDefault  ,
        modifier = modifier
            .fillMaxWidth()
            .background(GrapesTheme.colors.backgroundSecondaryInfoDefault)
            .padding(GrapesTheme.dimensions.spacing3)
    )
}

@Composable
private fun GridItem(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    GrapesCard(onClick = onClick, modifier = modifier.padding(GrapesTheme.dimensions.spacing2)) {
        Box(modifier = Modifier.fillMaxSize().height(GrapesTheme.dimensions.sizing7), contentAlignment = Alignment.Center) {
            Text(
                text = text,
                style = GrapesTheme.typography.titleL,
                color = GrapesTheme.colors.contentPrimary,
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Preview
@Composable
fun HomeDestinationPreview() {
    GrapesTheme {
        HomeDestination({}, {})
    }
}
