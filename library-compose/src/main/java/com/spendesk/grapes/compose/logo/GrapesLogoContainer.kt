package com.spendesk.grapes.compose.logo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author : RomainGF
 * @since : 03/01/2024
 **/

/**
 * Container for a logo with a maximum size of [GrapesTheme.dimensions.unit32],
 * clipped in a [GrapesTheme.shapes.radius4]
 */
@Composable
fun GrapesMediumLogoContainer(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit = {},
) {
    Box(
        contentAlignment = Alignment.Center,
        content = content,
        modifier = modifier
            .clip(GrapesTheme.shapes.radius4)
            .size(GrapesTheme.dimensions.unit32),
    )
}

/**
 * Container for a logo with a maximum size of [GrapesTheme.dimensions.unit40],
 * clipped in a [GrapesTheme.shapes.radius8]
 */
@Composable
fun GrapesLargeLogoContainer(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit = {},
) {
    Box(
        contentAlignment = Alignment.Center,
        content = content,
        modifier = modifier
            .clip(GrapesTheme.shapes.radius8)
            .size(GrapesTheme.dimensions.unit40),
    )
}

/**
 * Container for a card logo.
 */
@Composable
fun GrapesCardLogoContainer(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit = {},
) {
    Box(
        contentAlignment = Alignment.Center,
        content = content,
        modifier = modifier
            .width(51.dp)
            .height(32.dp),
    )
}

@Preview
@Composable
private fun GrapesMediumLogoContainerPreview() {
    GrapesTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            GrapesMediumLogoContainer {
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(Color.Red)
                )
            }
            GrapesLargeLogoContainer {
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(Color.Red)
                )
            }
            GrapesCardLogoContainer {
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(Color.Red)
                )
            }
        }
    }
}
