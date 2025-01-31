package com.spendesk.grapes.compose.textfield

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.icons.GrapesIconSet
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author RomainGF
 * @since 07/11/2023
 **/
private val searchInputTextPaddingVertical = 11.dp
private val searchInputTextPaddingHorizontal = 8.dp

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun GrapesSearchInputPrimary(
    value: String,
    placeholder: String,
    clearContentDescription: String,
    onValueChange: (String) -> Unit,
    onClear: () -> Unit,
    modifier: Modifier = Modifier,
    helperText: String? = null,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    isError: Boolean = false,
    onClick: (() -> Unit)? = null,
    onKeyboardSearch: (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
) {
    val keyboardController = LocalSoftwareKeyboardController.current

    GrapesBaseTextField(
        value = value,
        placeholderValue = placeholder,
        onValueChange = onValueChange,
        modifier = modifier,
        helperText = helperText,
        enabled = enabled,
        readOnly = readOnly,
        singleLine = true,
        textStyle = GrapesTheme.typography.bodyM,
        colors = GrapesTextFieldDefaults.textFieldColors(
            backgroundColor = GrapesTheme.colors.backgroundPrimaryDefault,
            leadingIconColor = GrapesTheme.colors.contentDecorativeIcon,
            trailingIconColor = GrapesTheme.colors.contentDecorativeIcon,
            textColor = GrapesTheme.colors.contentPrimary,
            placeholderColor = GrapesTheme.colors.contentSecondaryBGPrimary,
            unfocusedBorderColor = GrapesTheme.colors.borderDefault,
            focusedBorderColor = GrapesTheme.colors.borderSelected,
        ),
        isError = isError,
        onClick = onClick,
        keyboardActions = KeyboardActions(
            onSearch = {
                onKeyboardSearch?.invoke()
                keyboardController?.hide()
            },
        ),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
        leadingIcon = leadingIcon,
        trailingIcon = {
            if (value.isNotEmpty()) {
                IconButton(onClick = onClear) {
                    GrapesIconSet.CircleCross(
                        contentDescription = clearContentDescription,
                        tint = GrapesTheme.colors.contentDecorativeIcon,
                    )
                }
            }
        },
        textPadding = GrapesTextFieldDefaults.textFieldPadding(
            bottom = searchInputTextPaddingVertical,
            end = searchInputTextPaddingHorizontal,
            start = searchInputTextPaddingHorizontal,
            top = searchInputTextPaddingVertical,
        ),
    )
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun GrapesSearchInputSecondary(
    value: String,
    placeholder: String,
    clearContentDescription: String,
    onValueChange: (String) -> Unit,
    onClear: () -> Unit,
    modifier: Modifier = Modifier,
    helperText: String? = null,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    isError: Boolean = false,
    onClick: (() -> Unit)? = null,
    onKeyboardSearch: (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
) {
    val keyboardController = LocalSoftwareKeyboardController.current

    GrapesBaseTextField(
        value = value,
        placeholderValue = placeholder,
        onValueChange = onValueChange,
        modifier = modifier.heightIn(min = GrapesTheme.dimensions.unit40),
        helperText = helperText,
        enabled = enabled,
        readOnly = readOnly,
        singleLine = true,
        textStyle = GrapesTheme.typography.bodyM,
        colors = GrapesTextFieldDefaults.textFieldColors(
            backgroundColor = GrapesTheme.colors.backgroundSecondaryDefault,
            leadingIconColor = GrapesTheme.colors.contentDecorativeIcon,
            trailingIconColor = GrapesTheme.colors.contentDecorativeIcon,
            textColor = GrapesTheme.colors.contentPrimary,
            placeholderColor = GrapesTheme.colors.contentSecondaryBGPrimary,
            unfocusedBorderColor = GrapesTheme.colors.borderDefault,
            focusedBorderColor = GrapesTheme.colors.borderSelected,
        ),
        isError = isError,
        onClick = onClick,
        keyboardActions = KeyboardActions(
            onSearch = {
                onKeyboardSearch?.invoke()
                keyboardController?.hide()
            },
        ),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
        leadingIcon = leadingIcon,
        trailingIcon = {
            if (value.isNotEmpty()) {
                IconButton(onClick = onClear) {
                    GrapesIconSet.CircleCross(
                        contentDescription = clearContentDescription,
                        tint = GrapesTheme.colors.contentDecorativeIcon,
                    )
                }
            }
        },
        textPadding = GrapesTextFieldDefaults.textFieldPadding(
            bottom = searchInputTextPaddingVertical,
            end = searchInputTextPaddingHorizontal,
            start = searchInputTextPaddingHorizontal,
            top = searchInputTextPaddingVertical,
        ),
    )
}

@Preview
@Composable
private fun Preview() {
    GrapesTheme {
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(32.dp),
            verticalArrangement = Arrangement.spacedBy(32.dp)
        ) {
            GrapesSearchInputPrimary(
                value = "",
                placeholder = "Search",
                clearContentDescription = "",
                onValueChange = {},
                onClear = {},
                leadingIcon = { GrapesIconSet.CrossSmall() },
            )
            GrapesSearchInputPrimary(
                value = "Value",
                placeholder = "Search",
                clearContentDescription = "",
                onValueChange = {},
                onClear = {},
                leadingIcon = { GrapesIconSet.CrossSmall() },
            )
            GrapesSearchInputSecondary(
                value = "",
                placeholder = "Search",
                clearContentDescription = "",
                onValueChange = {},
                onClear = {},
                leadingIcon = { GrapesIconSet.CrossSmall() },
            )
            GrapesSearchInputSecondary(
                value = "Value",
                placeholder = "Search",
                clearContentDescription = "",
                onValueChange = {},
                onClear = {},
                leadingIcon = { GrapesIconSet.CrossSmall() },
            )
        }
    }
}
