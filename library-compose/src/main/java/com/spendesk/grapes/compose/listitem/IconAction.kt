package com.spendesk.grapes.compose.listitem

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.bucket.GrapesBucketContainer
import com.spendesk.grapes.compose.icons.GrapesIcon
import com.spendesk.grapes.compose.icons.GrapesSurface
import com.spendesk.grapes.compose.model.GrapesConfigurationStatus
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author Kélian CLERC
 * @since 07/12/2022
 */

@Composable
internal fun IconAction(iconActionConfiguration: ListItemConfiguration.IconAction, modifier: Modifier = Modifier) {
    val titleColor = when (iconActionConfiguration.status) {
        GrapesConfigurationStatus.ALERT -> GrapesTheme.colors.contentAlertDefault
        else -> GrapesTheme.colors.contentPrimary
    }

    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit16)
    ) {

        GrapesSurface(
            configuration = iconActionConfiguration.status,
        ) {
            GrapesIcon(
                icon = iconActionConfiguration.icon,
                configuration = iconActionConfiguration.status,
                modifier = Modifier.padding(GrapesTheme.dimensions.unit16).size(GrapesTheme.dimensions.sizeIconL)
            )
        }

        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit4)
        ) {
            Text(text = iconActionConfiguration.title, style = GrapesTheme.typography.titleL, color = titleColor)
            iconActionConfiguration.description?.let {
                Text(text = it, style = GrapesTheme.typography.bodyM, color = GrapesTheme.colors.neutralDark)
            }
        }
    }
}

@Preview
@Composable
private fun IconActionPreview() {
    val alertConfiguration = ListItemConfiguration.IconAction(
        title = "Title",
        icon = R.drawable.ic_grapes_icon_circle_check,
        status = GrapesConfigurationStatus.ALERT,
        description = "Description"
    )

    val infoConfigurationWithoutDescription = ListItemConfiguration.IconAction(
        title = "Title",
        icon = R.drawable.ic_grapes_icon_circle_check,
        status = GrapesConfigurationStatus.INFORMATION
    )

    val infoConfigurationWithDescription = ListItemConfiguration.IconAction(
        title = "Title",
        icon = R.drawable.ic_grapes_icon_circle_check,
        status = GrapesConfigurationStatus.INFORMATION,
        description = "Test description"
    )

    GrapesTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            IconAction(iconActionConfiguration = alertConfiguration)
            IconAction(iconActionConfiguration = infoConfigurationWithoutDescription)
            GrapesBucketContainer(
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth()
            ) {
                IconAction(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    iconActionConfiguration = infoConfigurationWithDescription
                )
            }
        }
    }
}
