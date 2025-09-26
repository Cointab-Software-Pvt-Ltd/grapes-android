package com.spendesk.grapes.compose.icons

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.theme.GrapesTheme
import com.spendesk.grapes.compose.theme.apricot20
import com.spendesk.grapes.compose.theme.blue20
import com.spendesk.grapes.compose.theme.brightForest
import com.spendesk.grapes.compose.theme.brightGrolive
import com.spendesk.grapes.compose.theme.brightLemon
import com.spendesk.grapes.compose.theme.brightOcean
import com.spendesk.grapes.compose.theme.brightPeach
import com.spendesk.grapes.compose.theme.carbon10
import com.spendesk.grapes.compose.theme.carbon7
import com.spendesk.grapes.compose.theme.emerald20
import com.spendesk.grapes.compose.theme.raspberry20

/**
 * @author : RomainGF
 * @since : 03/01/2024
 **/
@Composable
fun GrapesHighlightIconPrimary(
    modifier: Modifier = Modifier,
    painter: Painter = painterResource(R.drawable.ic_grapes_icon_lock_close),
    contentDescription: String? = null,
    size: GrapesHighlightIconSize,
) {
    GrapesHighlightIcon(
        painter = painter,
        contentDescription = contentDescription,
        tint = GrapesTheme.colors.contentSelected,
        containerColor = GrapesTheme.colors.backgroundSecondaryBrandDefault,
        borderColor = GrapesTheme.colors.backgroundSecondaryBrandDefault,
        size = size,
        modifier = modifier,
    )
}

@Composable
fun GrapesHighlightIconAlert(
    size: GrapesHighlightIconSize,
    modifier: Modifier = Modifier,
    painter: Painter = painterResource(R.drawable.ic_grapes_icon_circle_cross),
    contentDescription: String? = null,
) {
    GrapesHighlightIcon(
        painter = painter,
        contentDescription = contentDescription,
        tint = GrapesTheme.colors.contentAlertDefault,
        containerColor = GrapesTheme.colors.backgroundSecondaryAlertDefault,
        borderColor = GrapesTheme.colors.backgroundSecondaryAlertDefault,
        size = size,
        modifier = modifier,
    )
}

@Composable
fun GrapesHighlightIconWarning(
    size: GrapesHighlightIconSize,
    modifier: Modifier = Modifier,
    painter: Painter = painterResource(R.drawable.ic_grapes_icon_triangle_warning),
    contentDescription: String? = null,
) {
    GrapesHighlightIcon(
        painter = painter,
        contentDescription = contentDescription,
        tint = GrapesTheme.colors.contentWarningDefault,
        containerColor = GrapesTheme.colors.backgroundSecondaryWarningDefault,
        borderColor = GrapesTheme.colors.backgroundSecondaryWarningDefault,
        size = size,
        modifier = modifier,
    )
}

@Composable
fun GrapesHighlightIconSuccess(
    size: GrapesHighlightIconSize,
    modifier: Modifier = Modifier,
    painter: Painter = painterResource(R.drawable.ic_grapes_icon_circle_check),
    contentDescription: String? = null,
) {
    GrapesHighlightIcon(
        painter = painter,
        contentDescription = contentDescription,
        tint = GrapesTheme.colors.contentSuccessDefault,
        containerColor = GrapesTheme.colors.backgroundSecondarySuccessDefault,
        borderColor = GrapesTheme.colors.backgroundSecondarySuccessDefault,
        size = size,
        modifier = modifier,
    )
}

@Composable
fun GrapesHighlightIconNeutral(
    size: GrapesHighlightIconSize,
    modifier: Modifier = Modifier,
    painter: Painter = painterResource(R.drawable.ic_grapes_icon_lock_close),
    contentDescription: String? = null,
) {
    GrapesHighlightIcon(
        painter = painter,
        contentDescription = contentDescription,
        tint = GrapesTheme.colors.contentSecondaryBGSecondary,
        containerColor = GrapesTheme.colors.neutralLightest,
        borderColor = GrapesTheme.colors.neutralLighter,
        size = size,
        modifier = modifier,
    )
}

@Composable
fun GrapesHighlightIconInfo(
    size: GrapesHighlightIconSize,
    modifier: Modifier = Modifier,
    painter: Painter = painterResource(R.drawable.ic_grapes_icon_circle_information),
    contentDescription: String? = null,
) {
    GrapesHighlightIcon(
        painter = painter,
        contentDescription = contentDescription,
        tint = GrapesTheme.colors.contentInfoDefault,
        containerColor = GrapesTheme.colors.backgroundSecondaryInfoDefault,
        borderColor = GrapesTheme.colors.backgroundSecondaryInfoDefault,
        size = size,
        modifier = modifier,
    )
}

@Composable
fun GrapesHighlightIcon(
    size: GrapesHighlightIconSize,
    tint: Color,
    containerColor: Color,
    painter: Painter,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
) {
    GrapesHighlightIcon(
        painter = painter,
        contentDescription = contentDescription,
        tint = tint,
        containerColor = containerColor,
        borderColor = containerColor,
        size = size,
        modifier = modifier,
    )
}

@Composable
private fun GrapesHighlightIcon(
    painter: Painter,
    contentDescription: String?,
    tint: Color,
    containerColor: Color,
    borderColor: Color,
    size: GrapesHighlightIconSize,
    modifier: Modifier = Modifier,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .size(size.getContainerSize())
            .clip(size.getShape())
            .background(containerColor)
            .border(1.dp, borderColor, size.getShape())
    ) {
        Icon(
            painter = painter,
            contentDescription = contentDescription,
            tint = tint,
            modifier = Modifier.size(size.getIconSize()),
        )
    }
}

enum class GrapesHighlightIconSize {
    SMALL,
    MEDIUM,
    LARGE,
    EXTRA_LARGE;

    @Composable
    fun getContainerSize(): Dp = when (this) {
        SMALL -> GrapesTheme.dimensions.unit24
        MEDIUM -> GrapesTheme.dimensions.unit32
        LARGE -> GrapesTheme.dimensions.unit40
        EXTRA_LARGE -> GrapesTheme.dimensions.unit56
    }

    @Composable
    fun getIconSize(): Dp = when (this) {
        SMALL -> GrapesTheme.dimensions.sizeIconS
        MEDIUM -> GrapesTheme.dimensions.sizeIconM
        LARGE -> GrapesTheme.dimensions.sizeIconL
        EXTRA_LARGE -> GrapesTheme.dimensions.sizeIconXl
    }

    @Composable
    fun getShape(): Shape = when (this) {
        SMALL -> GrapesTheme.shapes.radius4
        MEDIUM -> GrapesTheme.shapes.radius8
        LARGE -> GrapesTheme.shapes.radius8
        EXTRA_LARGE -> GrapesTheme.shapes.radius12
    }
}

@Preview
@Composable
private fun GrapesHighlightIconPreview(
    @PreviewParameter(SizeParameterProvider::class) size: GrapesHighlightIconSize,
) {
    GrapesTheme {
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            GrapesHighlightIconPrimary(
                size = size,
            )
            GrapesHighlightIconAlert(
                size = size,
            )
            GrapesHighlightIconInfo(
                size = size,
            )
            GrapesHighlightIconWarning(
                size = size,
            )
            GrapesHighlightIconSuccess(
                size = size,
            )
            GrapesHighlightIconNeutral(
                size = size,
            )
        }
    }
}

@Preview
@Composable
private fun GrapesHighlightIconPreviewNoBorder() {
    GrapesTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            GrapesHighlightIcon(
                painter = painterResource(R.drawable.ic_grapes_icon_puzzle),
                contentDescription = null,
                tint = GrapesTheme.colors.contentPrimary,
                containerColor = GrapesTheme.colors.backgroundSecondaryBrandPressed,
                borderColor = GrapesTheme.colors.backgroundSecondaryBrandPressed,
                size = GrapesHighlightIconSize.LARGE,
            )

            GrapesHighlightIcon(
                painter = painterResource(R.drawable.ic_grapes_icon_puzzle),
                contentDescription = null,
                tint = GrapesTheme.colors.contentPrimary,
                containerColor = GrapesTheme.colors.backgroundSecondaryDefault,
                borderColor = GrapesTheme.colors.backgroundSecondaryDefault,
                size = GrapesHighlightIconSize.LARGE,
            )
            GrapesHighlightIcon(
                painter = painterResource(R.drawable.ic_grapes_icon_puzzle),
                contentDescription = null,
                tint = GrapesTheme.colors.contentPrimary,
                containerColor = brightLemon,
                borderColor = brightLemon,
                size = GrapesHighlightIconSize.LARGE,
            )
            GrapesHighlightIcon(
                painter = painterResource(R.drawable.ic_grapes_icon_puzzle),
                contentDescription = null,
                tint = GrapesTheme.colors.contentPrimary,
                containerColor = brightGrolive,
                borderColor = brightGrolive,
                size = GrapesHighlightIconSize.LARGE,
            )
            GrapesHighlightIcon(
                painter = painterResource(R.drawable.ic_grapes_icon_puzzle),
                contentDescription = null,
                tint = GrapesTheme.colors.contentPrimary,
                containerColor = brightOcean,
                borderColor = brightOcean,
                size = GrapesHighlightIconSize.LARGE,
            )
            GrapesHighlightIcon(
                painter = painterResource(R.drawable.ic_grapes_icon_puzzle),
                contentDescription = null,
                tint = GrapesTheme.colors.contentPrimary,
                containerColor = apricot20,
                borderColor = apricot20,
                size = GrapesHighlightIconSize.LARGE,
            )
            GrapesHighlightIcon(
                painter = painterResource(R.drawable.ic_grapes_icon_puzzle),
                contentDescription = null,
                tint = GrapesTheme.colors.contentPrimary,
                containerColor = brightPeach,
                borderColor = brightPeach,
                size = GrapesHighlightIconSize.LARGE,
            )
            GrapesHighlightIcon(
                painter = painterResource(R.drawable.ic_grapes_icon_puzzle),
                contentDescription = null,
                tint = GrapesTheme.colors.contentPrimary,
                containerColor = carbon7,
                borderColor = carbon7,
                size = GrapesHighlightIconSize.LARGE,
            )
            GrapesHighlightIcon(
                painter = painterResource(R.drawable.ic_grapes_icon_puzzle),
                contentDescription = null,
                tint = GrapesTheme.colors.contentPrimary,
                containerColor = blue20,
                borderColor = blue20,
                size = GrapesHighlightIconSize.LARGE,
            )
            GrapesHighlightIcon(
                painter = painterResource(R.drawable.ic_grapes_icon_puzzle),
                contentDescription = null,
                tint = GrapesTheme.colors.contentPrimary,
                containerColor = emerald20,
                borderColor = emerald20,
                size = GrapesHighlightIconSize.LARGE,
            )
            GrapesHighlightIcon(
                painter = painterResource(R.drawable.ic_grapes_icon_puzzle),
                contentDescription = null,
                tint = GrapesTheme.colors.contentPrimary,
                containerColor = brightForest,
                borderColor = brightForest,
                size = GrapesHighlightIconSize.LARGE,
            )
            GrapesHighlightIcon(
                painter = painterResource(R.drawable.ic_grapes_icon_puzzle),
                contentDescription = null,
                tint = GrapesTheme.colors.contentPrimary,
                containerColor = raspberry20,
                borderColor = raspberry20,
                size = GrapesHighlightIconSize.LARGE,
            )
            GrapesHighlightIcon(
                painter = painterResource(R.drawable.ic_grapes_icon_puzzle),
                contentDescription = null,
                tint = GrapesTheme.colors.contentPrimary,
                containerColor = carbon10,
                borderColor = carbon10,
                size = GrapesHighlightIconSize.LARGE,
            )

        }
    }
}

private class SizeParameterProvider : PreviewParameterProvider<GrapesHighlightIconSize> {
    override val values = GrapesHighlightIconSize.entries.asSequence()
}
