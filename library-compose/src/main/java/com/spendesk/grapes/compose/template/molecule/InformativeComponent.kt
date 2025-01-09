package com.spendesk.grapes.compose.template.molecule

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author Kélian CLERC
 * @since 28/09/2022
 */
@Composable
internal fun InformativeComponent(
    middlePart: @Composable () -> Unit,
    bottomPart: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    contentWindowInsets: WindowInsets = WindowInsets.systemBars,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    listOf(GrapesTheme.colors.primaryNormal, GrapesTheme.colors.primaryDark)
                )
            )
            .padding(GrapesTheme.dimensions.spacing3)
            .windowInsetsPadding(contentWindowInsets),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        middlePart()
        Spacer(modifier = Modifier.weight(1f))
        bottomPart()
    }
}
