package com.spendesk.grapes.compose.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author : kelian
 * @since : 30/10/2024
 **/
@Immutable
object QuickActionButtonDefaults {

    val buttonSize = 48.dp

    val buttonColors: ButtonColors
        @Composable
        @ReadOnlyComposable
        get() = ButtonColors(
            containerColor = GrapesTheme.colors.backgroundPrimaryDefault,
            contentColor = GrapesTheme.colors.contentPrimary,
            disabledContainerColor = GrapesTheme.colors.backgroundPrimaryDisabled,
            disabledContentColor = GrapesTheme.colors.contentDisable,
        )

    val buttonBorder: BorderStroke
        @Composable
        @ReadOnlyComposable
        get() = BorderStroke(1.dp, GrapesTheme.colors.borderDefault)

    val buttonShape: Shape
        @Composable
        @ReadOnlyComposable
        get() = GrapesTheme.shapes.radius8

    val buttonPadding: PaddingValues
        @Composable
        @ReadOnlyComposable
        get() = PaddingValues(GrapesTheme.dimensions.unit16)
}
