package com.spendesk.grapes.compose.callout.atoms

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.spendesk.grapes.compose.button.primary.GrapesSecondaryButton

/**
 * @author jean-philippe
 * @since 30/10/2023, Monday
 **/

@Composable
fun GrapesCalloutContentCTASecondary(
    buttonText: String,
    onButtonClick: () -> Unit,
) {
    GrapesSecondaryButton(
        modifier = Modifier.fillMaxWidth(),
        text = buttonText,
        onClick = onButtonClick,
    )
}
