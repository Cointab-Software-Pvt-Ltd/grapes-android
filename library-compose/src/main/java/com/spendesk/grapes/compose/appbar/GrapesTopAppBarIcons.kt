package com.spendesk.grapes.compose.appbar

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author : RomainGF
 * @since : 31/07/2024
 **/
@Composable
fun GrapesTopAppBarIconButton(
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    enabled: Boolean = true,
) {
    IconButton(
        modifier = modifier,
        content = icon,
        onClick = onClick,
        enabled = enabled,
    )
}

@Composable
fun GrapesTopAppBarBackIcon(
    modifier: Modifier = Modifier,
) {
    Icon(
        modifier = modifier.size(GrapesTheme.dimensions.sizeIconXl),
        imageVector = ImageVector.vectorResource(R.drawable.ic_grapes_icon_arrow_left),
        contentDescription = stringResource(id = R.string.grapes_top_app_bar_back_icon_description),
        tint = GrapesTheme.colors.contentPrimary,
    )
}

@Composable
fun GrapesTopAppBarCloseIcon(
    modifier: Modifier = Modifier,
) {
    Icon(
        modifier = modifier.size(GrapesTheme.dimensions.sizeIconXl),
        imageVector = ImageVector.vectorResource(R.drawable.ic_grapes_icon_cross_small),
        contentDescription = stringResource(id = R.string.grapes_top_app_bar_close_icon_description),
        tint = GrapesTheme.colors.contentPrimary
    )
}

@Composable
fun GrapesTopAppBarMoreIcon(
    modifier: Modifier = Modifier,
) {
    Icon(
        modifier = modifier.size(GrapesTheme.dimensions.sizeIconXl),
        imageVector = ImageVector.vectorResource(R.drawable.ic_grapes_icon_ellipsis_vertical),
        contentDescription = stringResource(id = R.string.grapes_top_app_bar_more_icon_description),
        tint = GrapesTheme.colors.contentPrimary
    )
}
