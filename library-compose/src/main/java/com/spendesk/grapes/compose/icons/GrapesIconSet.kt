package com.spendesk.grapes.compose.icons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.R
import com.spendesk.grapes.compose.theme.GrapesTheme

/**
 * @author : kelian
 * @since : 10/01/2025
 **/
@SuppressWarnings("LargeClass", "TooManyFunctions")
object GrapesIconSet {

    @Composable
    fun AdjustmentsHorizontal(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_adjustments_horizontal),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Archive(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_archive),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ArrowDown(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_arrow_down),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ArrowDownTray(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_arrow_down_tray),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ArrowLeft(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_arrow_left),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ArrowLeftRight(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_arrow_left_right),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ArrowPath(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_arrow_path),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ArrowRight(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_arrow_right),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ArrowRightRectangle(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_arrow_right_rectangle),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ArrowSplit(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_arrow_split),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ArrowTopRightSquare(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_arrow_top_right_square),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ArrowTurnLeft(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_arrow_turn_left),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ArrowTurnRight(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_arrow_turn_right),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ArrowUp(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_arrow_up),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ArrowUturnLeftDown(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_arrow_uturn_left_down),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ArrowUturnRightTop(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_arrow_uturn_right_top),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Backspace(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_backspace),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Banknote(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_banknote),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun BanknoteStrikeout(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_banknote_strikeout),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Bars3(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_bars_3),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun BarsArrowDown(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_bars_arrow_down),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Bed(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_bed),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Bell(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_bell),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun BellDesk(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_bell_desk),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Bike(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_bike),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun BuildingBank(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_building_bank),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun BuildingStorefront(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_building_storefront),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun BuildingsOffice(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_buildings_office),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Bus(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_bus),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Calculator(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_calculator),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Calendar(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_calendar),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CalendarArrowRight(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_calendar_arrow_right),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CalendarCheckmark(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_calendar_checkmark),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CalendarClock(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_calendar_clock),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Camera(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_camera),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CameraStrikeout(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_camera_strikeout),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Card(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_card),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CardArrowDown(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_card_arrow_down),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CardArrowUp(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_card_arrow_up),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CardLightning(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_card_lightning),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CardLockClose(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_card_lock_close),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CardLockOpen(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_card_lock_open),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CardRoundedArrows(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_card_rounded_arrows),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CardStack(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_card_stack),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CardStrikeout(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_card_strikeout),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CfoConnect(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_cfo_connect),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ChartPie(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_chart_pie),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Check(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_check),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ChevronDouble(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_chevron_double),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ChevronDoubleRight(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_chevron_double_right),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ChevronDown(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_chevron_down),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ChevronLeft(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_chevron_left),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ChevronRight(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_chevron_right),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ChevronUp(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_chevron_up),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CircleActive(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_circle_active),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CircleCheck(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_circle_check),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CircleCross(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_circle_cross),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CircleInformation(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_circle_information),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CircleMinus(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_circle_minus),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CirclePause(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_circle_pause),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CirclePlay(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_circle_play),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CirclePlus(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_circle_plus),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CircleQuestionFilled(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_circle_question_filled),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CircleQuestionOutline(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_circle_question_outline),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Clipboard(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_clipboard),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ClipboardPin(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_clipboard_pin),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ClockFilled(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_clock_filled),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ClockOutline(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_clock_outline),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CodeBracket(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_code_bracket),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Crop(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_crop),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun CrossSmall(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_cross_small),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Cube(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_cube),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun DollarCircleArrow(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_dollar_circle_arrow),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun EllipsisHorizontal(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_ellipsis_horizontal),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun EllipsisVertical(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_ellipsis_vertical),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Envelope(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_envelope),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun EnvelopeOpen(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_envelope_open),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Eye(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_eye),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun EyeStrikeout(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_eye_strikeout),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Facebook(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_facebook),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Flag(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_flag),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun FlagCheckered(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_flag_checkered),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Gas(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_gas),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Gear(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_gear),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun HexagoneCross(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_hexagone_cross),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun House(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_house),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Inbox(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_inbox),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun InboxStack(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_inbox_stack),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Instagram(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_instagram),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Invoice(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_invoice),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Key(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_key),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun LeftMenu(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_left_menu),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Lightning(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_lightning),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Link(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_link),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Linkedin(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_linkedin),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun LockClose(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_lock_close),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun LockOpen(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_lock_open),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun MagicWand(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_magic_wand),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun MagnifyingGlass(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_magnifying_glass),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun MapPin(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_map_pin),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Megaphone(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_megaphone),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Minus(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_minus),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun MinusSmall(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_minus_small),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Motorcycle(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_motorcycle),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun MouseSquareStack(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_mouse_square_stack),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Pdf(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_pdf),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Pen(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_pen),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Person(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_person),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun PersonGroup(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_person_group),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Phone(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_phone),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Photo(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_photo),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun PiggyBank(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_piggy_bank),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Pizza(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_pizza),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Plane(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_plane),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Plug(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_plug),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Plus(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_plus),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Puzzle(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_puzzle),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Receipt(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_receipt),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ReceiptChecked(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_receipt_checked),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ReceiptCross(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_receipt_cross),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ReceiptQuestion(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_receipt_question),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Robot(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_robot),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ShieldStar(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_shield_star),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun ShoppingCart(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_shopping_cart),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Slack(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_slack),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Sparkle(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_sparkle),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Spendesk(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_spendesk),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Square4(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_square_4),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun SquareStack(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_square_stack),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun StarFilled(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_star_filled),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun StarOutline(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_star_outline),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun SteeringWheel(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_steering_wheel),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Taxi(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_taxi),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Trash(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_trash),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun TriangleWarning(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_triangle_warning),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Wallet(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_wallet),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun X(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_x),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    fun Youtube(
        modifier: Modifier = Modifier,
        tint: Color = LocalContentColor.current,
        contentDescription: String? = null,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_grapes_icon_youtube),
            tint = tint,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
private fun IconsPreview() {
    GrapesTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                GrapesIconSet.AdjustmentsHorizontal()
                GrapesIconSet.Archive()
                GrapesIconSet.ArrowDown()
                GrapesIconSet.ArrowDownTray()
                GrapesIconSet.ArrowLeft()
                GrapesIconSet.ArrowLeftRight()
                GrapesIconSet.ArrowPath()
                GrapesIconSet.ArrowRight()
                GrapesIconSet.ArrowRightRectangle()
                GrapesIconSet.ArrowSplit()
                GrapesIconSet.ArrowTopRightSquare()
                GrapesIconSet.ArrowTurnLeft()
                GrapesIconSet.ArrowTurnRight()
                GrapesIconSet.ArrowUp()
                GrapesIconSet.ArrowUturnLeftDown()
                GrapesIconSet.ArrowUturnRightTop()
                GrapesIconSet.Backspace()
                GrapesIconSet.Banknote()
                GrapesIconSet.BanknoteStrikeout()
                GrapesIconSet.Bars3()
                GrapesIconSet.BarsArrowDown()
                GrapesIconSet.Bed()
                GrapesIconSet.Bell()
                GrapesIconSet.BellDesk()
                GrapesIconSet.Bike()
                GrapesIconSet.BuildingBank()
                GrapesIconSet.BuildingStorefront()
                GrapesIconSet.BuildingsOffice()
                GrapesIconSet.Bus()
                GrapesIconSet.Calculator()
                GrapesIconSet.Calendar()
                GrapesIconSet.CalendarArrowRight()
                GrapesIconSet.CalendarCheckmark()
                GrapesIconSet.CalendarClock()
                GrapesIconSet.Camera()
                GrapesIconSet.CameraStrikeout()
                GrapesIconSet.Card()
                GrapesIconSet.CardArrowDown()
                GrapesIconSet.CardArrowUp()
                GrapesIconSet.CardLightning()
                GrapesIconSet.CardLockClose()
                GrapesIconSet.CardLockOpen()
                GrapesIconSet.CardRoundedArrows()
                GrapesIconSet.CardStack()
                GrapesIconSet.CardStrikeout()
                GrapesIconSet.CfoConnect()
                GrapesIconSet.ChartPie()
                GrapesIconSet.Check()
                GrapesIconSet.ChevronDouble()
                GrapesIconSet.ChevronDoubleRight()
                GrapesIconSet.ChevronDown()
                GrapesIconSet.ChevronLeft()
                GrapesIconSet.ChevronRight()
                GrapesIconSet.ChevronUp()
                GrapesIconSet.CircleActive()
                GrapesIconSet.CircleCheck()
                GrapesIconSet.CircleCross()
                GrapesIconSet.CircleInformation()
                GrapesIconSet.CircleMinus()
                GrapesIconSet.CirclePause()
                GrapesIconSet.CirclePlay()
                GrapesIconSet.CirclePlus()
                GrapesIconSet.CircleQuestionFilled()
                GrapesIconSet.CircleQuestionOutline()
                GrapesIconSet.Clipboard()
                GrapesIconSet.ClipboardPin()
                GrapesIconSet.ClockFilled()
                GrapesIconSet.ClockOutline()
                GrapesIconSet.CodeBracket()
                GrapesIconSet.Crop()
                GrapesIconSet.CrossSmall()
                GrapesIconSet.Cube()
                GrapesIconSet.DollarCircleArrow()
                GrapesIconSet.EllipsisHorizontal()
                GrapesIconSet.EllipsisVertical()
                GrapesIconSet.Envelope()
                GrapesIconSet.EnvelopeOpen()
                GrapesIconSet.Eye()
                GrapesIconSet.EyeStrikeout()
                GrapesIconSet.Facebook()
                GrapesIconSet.Flag()
                GrapesIconSet.FlagCheckered()
                GrapesIconSet.Gas()
                GrapesIconSet.Gear()
                GrapesIconSet.HexagoneCross()
                GrapesIconSet.House()
                GrapesIconSet.Inbox()
                GrapesIconSet.InboxStack()
                GrapesIconSet.Instagram()
                GrapesIconSet.Invoice()
                GrapesIconSet.Key()
                GrapesIconSet.LeftMenu()
                GrapesIconSet.Lightning()
                GrapesIconSet.Link()
                GrapesIconSet.Linkedin()
                GrapesIconSet.LockClose()
                GrapesIconSet.LockOpen()
                GrapesIconSet.MagicWand()
                GrapesIconSet.MagnifyingGlass()
                GrapesIconSet.MapPin()
                GrapesIconSet.Megaphone()
                GrapesIconSet.Minus()
                GrapesIconSet.MinusSmall()
                GrapesIconSet.Motorcycle()
                GrapesIconSet.MouseSquareStack()
                GrapesIconSet.Pdf()
                GrapesIconSet.Pen()
                GrapesIconSet.Person()
                GrapesIconSet.PersonGroup()
                GrapesIconSet.Phone()
                GrapesIconSet.Photo()
                GrapesIconSet.PiggyBank()
                GrapesIconSet.Pizza()
                GrapesIconSet.Plane()
                GrapesIconSet.Plug()
                GrapesIconSet.Plus()
                GrapesIconSet.Puzzle()
                GrapesIconSet.Receipt()
                GrapesIconSet.ReceiptChecked()
                GrapesIconSet.ReceiptCross()
                GrapesIconSet.ReceiptQuestion()
                GrapesIconSet.Robot()
                GrapesIconSet.ShieldStar()
                GrapesIconSet.ShoppingCart()
                GrapesIconSet.Slack()
                GrapesIconSet.Sparkle()
                GrapesIconSet.Spendesk()
                GrapesIconSet.Square4()
                GrapesIconSet.SquareStack()
                GrapesIconSet.StarFilled()
                GrapesIconSet.StarOutline()
                GrapesIconSet.SteeringWheel()
                GrapesIconSet.Taxi()
                GrapesIconSet.Trash()
                GrapesIconSet.TriangleWarning()
                GrapesIconSet.Wallet()
                GrapesIconSet.X()
                GrapesIconSet.Youtube()
            }
        }
    }
}
