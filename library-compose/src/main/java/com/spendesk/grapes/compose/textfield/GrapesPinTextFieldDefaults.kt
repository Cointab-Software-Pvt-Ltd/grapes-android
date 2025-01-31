package com.spendesk.grapes.compose.textfield

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author Kélian CLERC
 * @since 18/04/2023
 */
@Immutable
object GrapesPinTextFieldDefaults {

    val PinCharWidth = 48.dp
    val PinCharHeight = 62.dp
    val PinCharBorderWidth = 1.dp
    val PinCharPadding = 2.dp

    @Composable
    fun pinFieldColors(
        textColor: Color = GrapesTheme.colors.contentPrimary,
        disabledTextColor: Color = GrapesTheme.colors.contentDisable,
        focusTextColor: Color = GrapesTheme.colors.contentSelected,
        errorTextColor: Color = GrapesTheme.colors.contentAlertDefault,
        disabledBorderColor: Color = GrapesTheme.colors.contentDisable,
        focusedErrorBorderColor: Color = GrapesTheme.colors.borderAlertDefault,
        errorBorderColor: Color = GrapesTheme.colors.borderAlertDecorative,
        focusedEnabledBorderColor: Color = GrapesTheme.colors.borderSelected,
        enabledBorderColor: Color = GrapesTheme.colors.borderDefault
    ): GrapesPinColors = DefaultsPinColor(
        textColor = textColor,
        disabledTextColor = disabledTextColor,
        focusTextColor = focusTextColor,
        errorTextColor = errorTextColor,
        disabledBorderColor = disabledBorderColor,
        focusedErrorBorderColor = focusedErrorBorderColor,
        errorBorderColor = errorBorderColor,
        focusedEnabledBorderColor = focusedEnabledBorderColor,
        enabledBorderColor = enabledBorderColor,
    )
}

@Immutable
class DefaultsPinColor(
    private val textColor: Color,
    private val disabledTextColor: Color,
    private val focusTextColor: Color,
    private val errorTextColor: Color,
    private val disabledBorderColor: Color,
    private val focusedErrorBorderColor: Color,
    private val errorBorderColor: Color,
    private val focusedEnabledBorderColor: Color,
    private val enabledBorderColor: Color
) : GrapesPinColors {

    override fun textColor(isEnabled: Boolean, isError: Boolean, isSelected: Boolean): Color =
        when {
            isEnabled.not() -> disabledTextColor
            isError -> errorTextColor
            isSelected && isEnabled -> focusTextColor
            else -> textColor
        }

    override fun borderColor(isEnabled: Boolean, isError: Boolean, isSelected: Boolean): Color =
        when {
            isEnabled.not() -> disabledBorderColor
            isSelected && isError -> focusedErrorBorderColor
            isError -> errorBorderColor
            isSelected && isEnabled -> focusedEnabledBorderColor
            else -> enabledBorderColor
        }
}

interface GrapesPinColors {

    fun textColor(isEnabled: Boolean, isError: Boolean, isSelected: Boolean): Color

    fun borderColor(isEnabled: Boolean, isError: Boolean, isSelected: Boolean): Color
}
