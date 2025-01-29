package com.spendesk.grapes.compose.card

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.listitem.GrapesDivider
import com.spendesk.grapes.compose.listitem.GrapesInlineInformationItem
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author RomainGF
 * @since 17/08/2023
 */
@Composable
fun GrapesInformationCard(
    title: String,
    modifier: Modifier = Modifier,
    colors: CardColors = GrapesInformationCardDefaults.colors,
    border: BorderStroke = GrapesInformationCardDefaults.border,
    contentVerticalArrangement: Arrangement.Vertical = GrapesInformationCardDefaults.contentVerticalArrangement,
    content: @Composable ColumnScope.() -> Unit = {},
) {
    InformationCard(
        header = {
            Text(
                text = title,
                style = GrapesTheme.typography.titleS,
                modifier = Modifier.padding(GrapesTheme.dimensions.unit16),
                color = GrapesTheme.colors.contentPrimary,
            )
        },
        modifier = modifier,
        colors = colors,
        border = border,
        contentVerticalArrangement = contentVerticalArrangement,
        content = content,
    )
}

@Composable
fun GrapesInformationCard(
    title: String,
    @DrawableRes headerIcon: Int,
    onHeaderIconClicked: () -> Unit,
    modifier: Modifier = Modifier,
    iconColor: Color = GrapesInformationCardDefaults.iconColor,
    colors: CardColors = GrapesInformationCardDefaults.colors,
    border: BorderStroke = GrapesInformationCardDefaults.border,
    contentVerticalArrangement: Arrangement.Vertical = GrapesInformationCardDefaults.contentVerticalArrangement,
    content: @Composable ColumnScope.() -> Unit = {},
) {
    InformationCard(
        header = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = title,
                    style = GrapesTheme.typography.titleS,
                    color = GrapesTheme.colors.contentPrimary,
                    modifier = Modifier
                        .weight(1f)
                        .padding(GrapesTheme.dimensions.unit16),
                )
                IconButton(onHeaderIconClicked) {
                    Icon(
                        painter = painterResource(id = headerIcon),
                        contentDescription = null,
                        tint = iconColor,
                        modifier = Modifier.size(GrapesTheme.dimensions.sizeIconM)
                    )
                }
            }
        },
        modifier = modifier,
        colors = colors,
        border = border,
        contentVerticalArrangement = contentVerticalArrangement,
        content = content,
    )
}

@Composable
private fun InformationCard(
    header: @Composable () -> Unit,
    content: @Composable ColumnScope.() -> Unit,
    modifier: Modifier = Modifier,
    colors: CardColors = GrapesInformationCardDefaults.colors,
    border: BorderStroke = GrapesInformationCardDefaults.border,
    contentVerticalArrangement: Arrangement.Vertical = GrapesInformationCardDefaults.contentVerticalArrangement,
) {
    Card(
        modifier = modifier,
        colors = colors,
        border = border,
    ) {
        Column {
            header()
            GrapesDivider()
            Column(
                verticalArrangement = contentVerticalArrangement,
                content = content,
                modifier = Modifier.padding(GrapesTheme.dimensions.unit16),
            )
        }
    }
}

object GrapesInformationCardDefaults {

    private val borderThickness = 0.5.dp

    val colors: CardColors
        @Composable get() = CardDefaults.elevatedCardColors(
            containerColor = GrapesTheme.colors.backgroundPrimaryDefault,
        )

    val iconColor: Color
        @Composable get() = GrapesTheme.colors.contentPrimary

    val border: BorderStroke
        @Composable get() = BorderStroke(
            width = borderThickness,
            color = GrapesTheme.colors.borderDefault,
        )

    val contentVerticalArrangement: Arrangement.HorizontalOrVertical
        @Composable get() = Arrangement.spacedBy(GrapesTheme.dimensions.unit16)
}

@Preview
@Composable
private fun PreviewDescription(
    @PreviewParameter(DescriptionParameterProvider::class) texts: Pair<String, String>,
) {
    GrapesTheme {
        Surface(
            color = GrapesTheme.colors.backgroundSecondaryDefault,
        ) {
            GrapesInformationCard(
                title = texts.first,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
            ) {
                Text(texts.second)
            }
        }
    }
}

@Preview
@Composable
private fun PreviewWithIconDescription(
    @PreviewParameter(DescriptionParameterProvider::class) texts: Pair<String, String>,
) {
    GrapesTheme {
        Surface(
            color = GrapesTheme.colors.backgroundSecondaryDefault,
        ) {
            GrapesInformationCard(
                title = texts.first,
                headerIcon = R.drawable.ic_grapes_icon_cross_small,
                onHeaderIconClicked = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
            ) {
                Text(texts.second)
            }
        }
    }
}

private class DescriptionParameterProvider : PreviewParameterProvider<Pair<String, String>> {

    override val values = sequenceOf(
        "This is a simple example of a very very very long title" to "Lorem Ipsum is simply dummy text.",
        "Short title" to "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.",
        "This is a simple example of a very very very long title" to "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.",
    )
}

@Preview
@Composable
private fun PreviewDescriptionItems() {
    GrapesTheme {
        Surface(
            color = GrapesTheme.colors.backgroundSecondaryDefault,
        ) {
            GrapesInformationCard(
                title = "Description",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
            ) {
                GrapesInlineInformationItem(
                    title = "Subscription owner",
                    value = "Ben Hintz",
                )
                GrapesInlineInformationItem(
                    title = "Subscription owner",
                    value = "Ben Hintz",
                )
            }
        }
    }
}
