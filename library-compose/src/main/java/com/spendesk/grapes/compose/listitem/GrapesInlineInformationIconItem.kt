package com.spendesk.grapes.compose.listitem

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * Author: dany
 * Since: 05/11/2024, Tue
 */
@Composable
fun GrapesInlineInformationIconItem(
    @DrawableRes icon: Int,
    description: String,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.spacing3),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = null,
        )
        Text(
            text = description,
            style = GrapesTheme.typography.bodyL,
            modifier = Modifier.weight(1f),
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun PreviewGrapesInlineInformationIconItem() {
    GrapesTheme {
        GrapesInlineInformationIconItem(
            modifier = Modifier.padding(GrapesTheme.dimensions.spacing3),
            icon = R.drawable.ic_google_logo,
            description = "This is some kind of potential description",
        )
    }
}
