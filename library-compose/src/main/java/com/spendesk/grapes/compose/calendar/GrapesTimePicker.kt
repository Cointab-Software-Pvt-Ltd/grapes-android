package com.spendesk.grapes.compose.calendar

import android.text.format.DateFormat
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TimeInput
import androidx.compose.material3.TimePickerDefaults
import androidx.compose.material3.TimePickerState
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.theme.GrapesTheme
import java.time.LocalTime

/**
 * Grapes time picker which lets the user selects a specific time by providing the hour, minutes and the am/pm format.
 *
 * @param initialHour Initial hour to be displayed in the picker
 * @param initialMinute Initial minute to be displayed in the picker
 * @param modifier The [Modifier] to be applied to this time picker
 * @param onTimeChange Callback when an hour or minute is changed in the picker
 * @param is24hFormat Whether the picker should be in 24-hour format or not. Default to the device setting
 */
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun GrapesTimePicker(
    initialHour: Int,
    initialMinute: Int,
    onTimeChange: (LocalTime) -> Unit,
    modifier: Modifier = Modifier,
    is24hFormat: Boolean = DateFormat.is24HourFormat(LocalContext.current),
) {
    val timerPickerState: TimePickerState = rememberTimePickerState(
        initialHour = initialHour,
        initialMinute = initialMinute,
        is24Hour = is24hFormat,
    )

    TimeInput(
        modifier = modifier,
        state = timerPickerState,
        colors = TimePickerDefaults.colors(
            periodSelectorBorderColor = GrapesTheme.colors.contentSelected,
            periodSelectorSelectedContainerColor = GrapesTheme.colors.backgroundSecondaryBrandDefault,
            periodSelectorUnselectedContainerColor = GrapesTheme.colors.backgroundPrimaryDefault,
            periodSelectorSelectedContentColor = GrapesTheme.colors.contentSelected,
            periodSelectorUnselectedContentColor = GrapesTheme.colors.contentPrimary,
            timeSelectorSelectedContainerColor = GrapesTheme.colors.backgroundSecondaryBrandDefault,
            timeSelectorUnselectedContainerColor = GrapesTheme.colors.backgroundPrimaryDefault,
            timeSelectorSelectedContentColor = GrapesTheme.colors.contentSelected,
            timeSelectorUnselectedContentColor = GrapesTheme.colors.contentPrimary,
            selectorColor = GrapesTheme.colors.contentSelected,
        )
    )

    LaunchedEffect(timerPickerState.hour, timerPickerState.minute) {
        onTimeChange(LocalTime.of(timerPickerState.hour, timerPickerState.minute))
    }
}

@Composable
@Preview(showBackground = true)
@Suppress("MagicNumber")
private fun PreviewGrapesTimePicker24Hour() {
    val now = LocalTime.of(16, 44, 0)

    GrapesTheme {
        GrapesTimePicker(
            initialHour = now.hour,
            initialMinute = now.minute,
            is24hFormat = true,
            onTimeChange = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
@Suppress("MagicNumber")
private fun PreviewGrapesTimePicker12Hour() {
    val now = LocalTime.of(16, 44, 0)

    GrapesTheme {
        GrapesTimePicker(
            initialHour = now.hour,
            initialMinute = now.minute,
            is24hFormat = false,
            onTimeChange = {},
        )
    }
}
