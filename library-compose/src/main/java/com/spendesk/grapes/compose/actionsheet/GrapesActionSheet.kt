package com.spendesk.grapes.compose.actionsheet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.SheetValue
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.icons.GrapesIconSet
import com.spendesk.grapes.compose.theme.GrapesTheme

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun GrapesActionSheet(
    title: String,
    message: String,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
    state: SheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = true,
    ),
    textAlign: TextAlign = TextAlign.Start,
    actions: @Composable ColumnScope.() -> Unit,
) {
    ModalBottomSheet(
        onDismissRequest = onDismiss,
        sheetState = state,
        contentColor = GrapesTheme.colors.contentPrimary,
        containerColor = GrapesTheme.colors.backgroundPrimaryDefault,
        modifier = modifier,
    ) {
        GrapesActionSheetContent(
            title = title,
            textAlign = textAlign,
            message = message,
            actions = actions,
        )
    }
}

@Composable
fun GrapesActionSheetContent(
    title: String,
    message: String,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Start,
    actions: @Composable ColumnScope.() -> Unit,
) {
    Column(modifier = modifier) {
        Text(
            text = title,
            textAlign = textAlign,
            style = GrapesTheme.typography.titleXxl,
            modifier = Modifier
                .padding(horizontal = GrapesTheme.dimensions.unit24)
                .fillMaxWidth()
        )
        Spacer(Modifier.height(GrapesTheme.dimensions.unit8))
        Text(
            text = message,
            textAlign = textAlign,
            style = GrapesTheme.typography.bodyS,
            modifier = Modifier
                .padding(horizontal = GrapesTheme.dimensions.unit24)
                .fillMaxWidth()
        )
        Spacer(Modifier.height(GrapesTheme.dimensions.unit24))
        actions()
        Spacer(Modifier.height(GrapesTheme.dimensions.unit16))
    }
}

@Preview
@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun PreviewActionSheet() {
    val density = LocalDensity.current
    val state = remember {
        SheetState(
            skipPartiallyExpanded = true,
            density = density,
            initialValue = SheetValue.Expanded,
        )
    }

    GrapesTheme {
        GrapesActionSheet(
            title = "Title",
            message = "Message",
            onDismiss = {},
            actions = {
                GrapesActionSheetButton(
                    text = "Action",
                    onClick = {},
                    icon = { GrapesIconSet.Crop() },
                    modifier = Modifier.fillMaxWidth()
                )
                GrapesActionSheetButton(
                    text = "Action",
                    onClick = {},
                    icon = { GrapesIconSet.Crop() },
                    enabled = false,
                    modifier = Modifier.fillMaxWidth()
                )
                GrapesActionSheetButton(
                    text = "Action",
                    onClick = {},
                    colors = GrapesActionSheetDefaults.alertColors(),
                    icon = { GrapesIconSet.Crop() },
                    modifier = Modifier.fillMaxWidth()
                )
                GrapesActionSheetButton(
                    text = "Action",
                    onClick = {},
                    colors = GrapesActionSheetDefaults.brandColors(),
                    icon = { GrapesIconSet.Crop() },
                    modifier = Modifier.fillMaxWidth()
                )
            },
            state = state,
        )
    }
}
