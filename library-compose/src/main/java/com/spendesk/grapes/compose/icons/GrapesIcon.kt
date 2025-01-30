package com.spendesk.grapes.compose.icons

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.extensions.GrapesIcons
import com.spendesk.grapes.compose.model.GrapesConfigurationStatus
import com.spendesk.grapes.compose.theme.GrapesTheme
import com.spendesk.grapes.compose.theme.extensions.contentColorFor

/**
 * @author : danyboucanova
 * @since : 13/06/2022, Thu
 **/
@Composable
fun GrapesIcon(
    configuration: GrapesConfigurationStatus,
    modifier: Modifier = Modifier,
    contentDescription: String? = null
) {
    GrapesIcon(
        icon = GrapesIcons.iconFor(configuration),
        configuration = configuration,
        modifier = modifier,
        contentDescription = contentDescription
    )
}

@Composable
fun GrapesIcon(
    @DrawableRes icon: Int,
    configuration: GrapesConfigurationStatus,
    modifier: Modifier = Modifier,
    contentDescription: String? = null
) {
    GrapesIcon(
        modifier = modifier,
        icon = icon,
        contentDescription = contentDescription,
        tint = GrapesTheme.colors.contentColorFor(configuration)
    )
}

@Composable
fun GrapesIcon(
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    tint: Color = GrapesTheme.colors.contentPrimary
) {
    Icon(
        modifier = modifier,
        painter = painterResource(id = icon),
        contentDescription = contentDescription,
        tint = tint
    )
}

@Preview
@Composable
private fun GrapesIconPreview() {
    GrapesTheme {
        Column(verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit16)) {
            GrapesIcon(
                icon = R.drawable.ic_grapes_icon_circle_check,
                configuration = GrapesConfigurationStatus.INFORMATION,
                modifier = Modifier.size(GrapesTheme.dimensions.sizeIconS)
            )
            GrapesIcon(
                icon = R.drawable.ic_grapes_icon_circle_check,
                configuration = GrapesConfigurationStatus.INFORMATION,
                modifier = Modifier.size(GrapesTheme.dimensions.sizeIconM)
            )
            GrapesIcon(
                icon = R.drawable.ic_grapes_icon_circle_check,
                configuration = GrapesConfigurationStatus.INFORMATION,
                modifier = Modifier.size(GrapesTheme.dimensions.sizeIconL)
            )
            GrapesIcon(
                icon = R.drawable.ic_grapes_icon_circle_check,
                configuration = GrapesConfigurationStatus.INFORMATION,
                modifier = Modifier.size(GrapesTheme.dimensions.sizeIconXl)
            )
        }
    }
}
