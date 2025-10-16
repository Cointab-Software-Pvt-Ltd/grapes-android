package com.spendesk.grapes.compose.optiongroup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.optiongroup.internal.GrapesOptionGroupItem
import com.spendesk.grapes.compose.optiongroup.model.GrapesBlockOptionGroupUiModel
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author : RomainGF
 * @since : 30/08/2024
 **/
private val iconSize = 24.dp

@Composable
fun GrapesBlockOptionGroupItem(
    model: GrapesBlockOptionGroupUiModel,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    contentDescription: String = model.title,
) {
    GrapesOptionGroupItem(
        isSelected = model.isSelected,
        onClick = onClick,
        contentDescription = contentDescription,
        alignment = Alignment.CenterStart,
        modifier = modifier
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit16),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(
                horizontal = GrapesTheme.dimensions.unit16,
                vertical = GrapesTheme.dimensions.unit24,
            )
        ) {
            Icon(
                modifier = Modifier.size(iconSize),
                painter = painterResource(model.imageRes),
                contentDescription = null,
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit4),
            ) {
                Text(
                    text = model.title,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    style = GrapesTheme.typography.titleL,
                )
                Text(
                    text = model.description,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    style = GrapesTheme.typography.bodyM,
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun PreviewGrapesIconOptionGroupItem() {
    GrapesTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(16.dp)
        ) {
            GrapesBlockOptionGroupItem(
                model = GrapesBlockOptionGroupUiModel(
                    id = "",
                    imageRes = R.drawable.ic_grapes_icon_lock_close,
                    title = "A short title",
                    description = "Some description here to fill the space",
                    isSelected = false,
                ),
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )
            GrapesBlockOptionGroupItem(
                model = GrapesBlockOptionGroupUiModel(
                    id = "",
                    imageRes = R.drawable.ic_grapes_icon_lock_close,
                    title = "A short title",
                    description = "Some description here to fill the space",
                    isSelected = true,
                ),
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
