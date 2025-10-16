package com.spendesk.grapes.compose.header

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.theme.GrapesTheme

@Composable
fun GrapesHeader(
    supplierName: String,
    title: String,
    subtitle: String?,
    description: String?,
    date: String,
    supplierImage: @Composable () -> Unit,
    identifierTag: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    extraContent: (@Composable () -> Unit)? = null,
) {
    GrapesHeader(
        supplierName = supplierName,
        title = AnnotatedString(title),
        subtitle = subtitle,
        description = description,
        date = date,
        supplierImage = supplierImage,
        identifierTag = identifierTag,
        modifier = modifier,
        extraContent = extraContent,
    )
}

@Composable
fun GrapesHeader(
    supplierName: String,
    title: AnnotatedString,
    subtitle: String?,
    description: String?,
    date: String,
    supplierImage: @Composable () -> Unit,
    identifierTag: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    extraContent: (@Composable () -> Unit)? = null,
) {
    Column(
        modifier = modifier
            .background(GrapesTheme.colors.backgroundPrimaryDefault)
            .padding(all = GrapesTheme.dimensions.unit16)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            supplierImage()
            Spacer(modifier = Modifier.width(GrapesTheme.dimensions.unit16))
            Text(
                text = supplierName,
                style = GrapesTheme.typography.titleL,
                color = GrapesTheme.colors.contentPrimary
            )
        }
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit40))
        Text(
            text = title,
            style = GrapesTheme.typography.headingXl,
            color = GrapesTheme.colors.contentPrimary
        )
        subtitle?.let {
            Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit4))
            Text(
                text = it,
                style = GrapesTheme.typography.bodyL,
                color = GrapesTheme.colors.contentSecondaryBGPrimary
            )
        }
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit24))
        description?.let {
            Text(
                text = it,
                style = GrapesTheme.typography.bodyL,
                color = GrapesTheme.colors.contentPrimary
            )
            Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit4))
        }
        Text(
            text = date,
            style = GrapesTheme.typography.bodyL,
            color = GrapesTheme.colors.contentSecondaryBGPrimary
        )
        Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit40))
        identifierTag()
        extraContent?.let {
            Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit16))
            it()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GrapesHeaderPreview() {
    GrapesTheme {
        GrapesHeader(
            supplierImage = {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(Color.Gray)
                )
            },
            supplierName = "Supplier Name",
            title = "Header Title",
            subtitle = "Header Subtitle",
            description = "Header Description",
            date = "Header Date",
            identifierTag = { Text("Identifier") }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun GrapesAnnotatedHeaderPreview() {
    GrapesTheme {
        GrapesHeader(
            supplierImage = {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(Color.Gray)
                )
            },
            supplierName = "Supplier Name",
            title = buildAnnotatedString {
                withStyle(style = SpanStyle(textDecoration = TextDecoration.LineThrough)) {
                    append("Header Title")
                }
            },
            subtitle = "Header Subtitle",
            description = "Header Description",
            date = "Header Date",
            identifierTag = { Text("Identifier") }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun GrapesHeaderWithExtraContentPreview() {
    GrapesTheme {
        GrapesHeader(
            supplierImage = {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(Color.Gray)
                )
            },
            supplierName = "Supplier Name",
            title = "Header Title",
            subtitle = "Header Subtitle",
            description = "Header Description",
            date = "Header Date",
            identifierTag = { Text("Identifier") },
            extraContent = {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(Color.LightGray)
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun GrapesHeaderWithExtraContentVeryLongPreview() {
    GrapesTheme {
        GrapesHeader(
            supplierImage = {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(Color.Gray)
                )
            },
            supplierName = "Supplier Name which is very long to see",
            title = "Header Title name which is very long also to see",
            subtitle = "Header Subtitle which is very long also to see",
            description = "Header Description which is very long also to see",
            date = "Header Date which is very long also to see",
            identifierTag = { Text("Identifier") },
            extraContent = {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(Color.LightGray)
                )
            }
        )
    }
}
