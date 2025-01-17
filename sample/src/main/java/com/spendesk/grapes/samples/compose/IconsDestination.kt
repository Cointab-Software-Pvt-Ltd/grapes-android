package com.spendesk.grapes.samples.compose

/**
 * @author Kélian CLERC
 * @since 17/01/2025
 */
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spendesk.grapes.compose.icons.GrapesIconSet
import com.spendesk.grapes.compose.theme.GrapesTheme

@Composable
fun IconsDestination() {
    LazyVerticalGrid(modifier = Modifier.fillMaxSize(), columns = GridCells.Fixed(4)) {
        item {
            IconDisplay("AdjustmentsHorizontal") {
                GrapesIconSet.AdjustmentsHorizontal()
            }
        }
        item {
            IconDisplay("Archive") {
                GrapesIconSet.Archive()
            }
        }
        item {
            IconDisplay("ArrowDown") {
                GrapesIconSet.ArrowDown()
            }
        }
        item {
            IconDisplay("ArrowDownTray") {
                GrapesIconSet.ArrowDownTray()
            }
        }
        item {
            IconDisplay("ArrowLeft") {
                GrapesIconSet.ArrowLeft()
            }
        }
        item {
            IconDisplay("ArrowLeftRight") {
                GrapesIconSet.ArrowLeftRight()
            }
        }
        item {
            IconDisplay("ArrowPath") {
                GrapesIconSet.ArrowPath()
            }
        }
        item {
            IconDisplay("ArrowRight") {
                GrapesIconSet.ArrowRight()
            }
        }
        item {
            IconDisplay("ArrowRightRectangle") {
                GrapesIconSet.ArrowRightRectangle()
            }
        }
        item {
            IconDisplay("ArrowSplit") {
                GrapesIconSet.ArrowSplit()
            }
        }
        item {
            IconDisplay("ArrowTopRightSquare") {
                GrapesIconSet.ArrowTopRightSquare()
            }
        }
        item {
            IconDisplay("ArrowTurnLeft") {
                GrapesIconSet.ArrowTurnLeft()
            }
        }
        item {
            IconDisplay("ArrowTurnRight") {
                GrapesIconSet.ArrowTurnRight()
            }
        }
        item {
            IconDisplay("ArrowUp") {
                GrapesIconSet.ArrowUp()
            }
        }
        item {
            IconDisplay("ArrowUturnLeftDown") {
                GrapesIconSet.ArrowUturnLeftDown()
            }
        }
        item {
            IconDisplay("ArrowUturnRightTop") {
                GrapesIconSet.ArrowUturnRightTop()
            }
        }
        item {
            IconDisplay("Backspace") {
                GrapesIconSet.Backspace()
            }
        }
        item {
            IconDisplay("Banknote") {
                GrapesIconSet.Banknote()
            }
        }
        item {
            IconDisplay("BanknoteStrikeout") {
                GrapesIconSet.BanknoteStrikeout()
            }
        }
        item {
            IconDisplay("Bars3") {
                GrapesIconSet.Bars3()
            }
        }
        item {
            IconDisplay("BarsArrowDown") {
                GrapesIconSet.BarsArrowDown()
            }
        }
        item {
            IconDisplay("Bed") {
                GrapesIconSet.Bed()
            }
        }
        item {
            IconDisplay("Bell") {
                GrapesIconSet.Bell()
            }
        }
        item {
            IconDisplay("BellDesk") {
                GrapesIconSet.BellDesk()
            }
        }
        item {
            IconDisplay("Bike") {
                GrapesIconSet.Bike()
            }
        }
        item {
            IconDisplay("BuildingBank") {
                GrapesIconSet.BuildingBank()
            }
        }
        item {
            IconDisplay("BuildingStorefront") {
                GrapesIconSet.BuildingStorefront()
            }
        }
        item {
            IconDisplay("BuildingsOffice") {
                GrapesIconSet.BuildingsOffice()
            }
        }
        item {
            IconDisplay("Bus") {
                GrapesIconSet.Bus()
            }
        }
        item {
            IconDisplay("Calculator") {
                GrapesIconSet.Calculator()
            }
        }
        item {
            IconDisplay("Calendar") {
                GrapesIconSet.Calendar()
            }
        }
        item {
            IconDisplay("CalendarArrowRight") {
                GrapesIconSet.CalendarArrowRight()
            }
        }
        item {
            IconDisplay("CalendarCheckmark") {
                GrapesIconSet.CalendarCheckmark()
            }
        }
        item {
            IconDisplay("CalendarClock") {
                GrapesIconSet.CalendarClock()
            }
        }
        item {
            IconDisplay("Camera") {
                GrapesIconSet.Camera()
            }
        }
        item {
            IconDisplay("CameraStrikeout") {
                GrapesIconSet.CameraStrikeout()
            }
        }
        item {
            IconDisplay("Car") {
                GrapesIconSet.Car()
            }
        }
        item {
            IconDisplay("Card") {
                GrapesIconSet.Card()
            }
        }
        item {
            IconDisplay("CardArrowDown") {
                GrapesIconSet.CardArrowDown()
            }
        }
        item {
            IconDisplay("CardArrowUp") {
                GrapesIconSet.CardArrowUp()
            }
        }
        item {
            IconDisplay("CardLightning") {
                GrapesIconSet.CardLightning()
            }
        }
        item {
            IconDisplay("CardLockClose") {
                GrapesIconSet.CardLockClose()
            }
        }
        item {
            IconDisplay("CardLockOpen") {
                GrapesIconSet.CardLockOpen()
            }
        }
        item {
            IconDisplay("CardRoundedArrows") {
                GrapesIconSet.CardRoundedArrows()
            }
        }
        item {
            IconDisplay("CardStack") {
                GrapesIconSet.CardStack()
            }
        }
        item {
            IconDisplay("CardStrikeout") {
                GrapesIconSet.CardStrikeout()
            }
        }
        item {
            IconDisplay("CfoConnect") {
                GrapesIconSet.CfoConnect()
            }
        }
        item {
            IconDisplay("ChartPie") {
                GrapesIconSet.ChartPie()
            }
        }
        item {
            IconDisplay("Check") {
                GrapesIconSet.Check()
            }
        }
        item {
            IconDisplay("ChevronDouble") {
                GrapesIconSet.ChevronDouble()
            }
        }
        item {
            IconDisplay("ChevronDoubleRight") {
                GrapesIconSet.ChevronDoubleRight()
            }
        }
        item {
            IconDisplay("ChevronDown") {
                GrapesIconSet.ChevronDown()
            }
        }
        item {
            IconDisplay("ChevronLeft") {
                GrapesIconSet.ChevronLeft()
            }
        }
        item {
            IconDisplay("ChevronRight") {
                GrapesIconSet.ChevronRight()
            }
        }
        item {
            IconDisplay("ChevronUp") {
                GrapesIconSet.ChevronUp()
            }
        }
        item {
            IconDisplay("CircleActive") {
                GrapesIconSet.CircleActive()
            }
        }
        item {
            IconDisplay("CircleCheck") {
                GrapesIconSet.CircleCheck()
            }
        }
        item {
            IconDisplay("CircleCross") {
                GrapesIconSet.CircleCross()
            }
        }
        item {
            IconDisplay("CircleInformation") {
                GrapesIconSet.CircleInformation()
            }
        }
        item {
            IconDisplay("CircleMinus") {
                GrapesIconSet.CircleMinus()
            }
        }
        item {
            IconDisplay("CirclePause") {
                GrapesIconSet.CirclePause()
            }
        }
        item {
            IconDisplay("CirclePlay") {
                GrapesIconSet.CirclePlay()
            }
        }
        item {
            IconDisplay("CirclePlus") {
                GrapesIconSet.CirclePlus()
            }
        }
        item {
            IconDisplay("CircleQuestionFilled") {
                GrapesIconSet.CircleQuestionFilled()
            }
        }
        item {
            IconDisplay("CircleQuestionOutline") {
                GrapesIconSet.CircleQuestionOutline()
            }
        }
        item {
            IconDisplay("Clipboard") {
                GrapesIconSet.Clipboard()
            }
        }
        item {
            IconDisplay("ClipboardPin") {
                GrapesIconSet.ClipboardPin()
            }
        }
        item {
            IconDisplay("ClockFilled") {
                GrapesIconSet.ClockFilled()
            }
        }
        item {
            IconDisplay("ClockOutline") {
                GrapesIconSet.ClockOutline()
            }
        }
        item {
            IconDisplay("CodeBracket") {
                GrapesIconSet.CodeBracket()
            }
        }
        item {
            IconDisplay("Crop") {
                GrapesIconSet.Crop()
            }
        }
        item {
            IconDisplay("CrossSmall") {
                GrapesIconSet.CrossSmall()
            }
        }
        item {
            IconDisplay("Cube") {
                GrapesIconSet.Cube()
            }
        }
        item {
            IconDisplay("DollarCircleArrow") {
                GrapesIconSet.DollarCircleArrow()
            }
        }
        item {
            IconDisplay("EllipsisHorizontal") {
                GrapesIconSet.EllipsisHorizontal()
            }
        }
        item {
            IconDisplay("EllipsisVertical") {
                GrapesIconSet.EllipsisVertical()
            }
        }
        item {
            IconDisplay("Envelope") {
                GrapesIconSet.Envelope()
            }
        }
        item {
            IconDisplay("EnvelopeOpen") {
                GrapesIconSet.EnvelopeOpen()
            }
        }
        item {
            IconDisplay("Eye") {
                GrapesIconSet.Eye()
            }
        }
        item {
            IconDisplay("EyeStrikeout") {
                GrapesIconSet.EyeStrikeout()
            }
        }
        item {
            IconDisplay("Facebook") {
                GrapesIconSet.Facebook()
            }
        }
        item {
            IconDisplay("Flag") {
                GrapesIconSet.Flag()
            }
        }
        item {
            IconDisplay("FlagCheckered") {
                GrapesIconSet.FlagCheckered()
            }
        }
        item {
            IconDisplay("Gas") {
                GrapesIconSet.Gas()
            }
        }
        item {
            IconDisplay("Gear") {
                GrapesIconSet.Gear()
            }
        }
        item {
            IconDisplay("HexagoneCross") {
                GrapesIconSet.HexagoneCross()
            }
        }
        item {
            IconDisplay("House") {
                GrapesIconSet.House()
            }
        }
        item {
            IconDisplay("Inbox") {
                GrapesIconSet.Inbox()
            }
        }
        item {
            IconDisplay("InboxStack") {
                GrapesIconSet.InboxStack()
            }
        }
        item {
            IconDisplay("Instagram") {
                GrapesIconSet.Instagram()
            }
        }
        item {
            IconDisplay("Invoice") {
                GrapesIconSet.Invoice()
            }
        }
        item {
            IconDisplay("Key") {
                GrapesIconSet.Key()
            }
        }
        item {
            IconDisplay("LeftMenu") {
                GrapesIconSet.LeftMenu()
            }
        }
        item {
            IconDisplay("Lightning") {
                GrapesIconSet.Lightning()
            }
        }
        item {
            IconDisplay("Link") {
                GrapesIconSet.Link()
            }
        }
        item {
            IconDisplay("Linkedin") {
                GrapesIconSet.Linkedin()
            }
        }
        item {
            IconDisplay("LockClose") {
                GrapesIconSet.LockClose()
            }
        }
        item {
            IconDisplay("LockOpen") {
                GrapesIconSet.LockOpen()
            }
        }
        item {
            IconDisplay("MagicWand") {
                GrapesIconSet.MagicWand()
            }
        }
        item {
            IconDisplay("MagnifyingGlass") {
                GrapesIconSet.MagnifyingGlass()
            }
        }
        item {
            IconDisplay("MapPin") {
                GrapesIconSet.MapPin()
            }
        }
        item {
            IconDisplay("Megaphone") {
                GrapesIconSet.Megaphone()
            }
        }
        item {
            IconDisplay("Minus") {
                GrapesIconSet.Minus()
            }
        }
        item {
            IconDisplay("MinusSmall") {
                GrapesIconSet.MinusSmall()
            }
        }
        item {
            IconDisplay("Motorcycle") {
                GrapesIconSet.Motorcycle()
            }
        }
        item {
            IconDisplay("MouseSquareStack") {
                GrapesIconSet.MouseSquareStack()
            }
        }
        item {
            IconDisplay("Pdf") {
                GrapesIconSet.Pdf()
            }
        }
        item {
            IconDisplay("Pen") {
                GrapesIconSet.Pen()
            }
        }
        item {
            IconDisplay("Person") {
                GrapesIconSet.Person()
            }
        }
        item {
            IconDisplay("PersonGroup") {
                GrapesIconSet.PersonGroup()
            }
        }
        item {
            IconDisplay("Phone") {
                GrapesIconSet.Phone()
            }
        }
        item {
            IconDisplay("Photo") {
                GrapesIconSet.Photo()
            }
        }
        item {
            IconDisplay("PiggyBank") {
                GrapesIconSet.PiggyBank()
            }
        }
        item {
            IconDisplay("Pizza") {
                GrapesIconSet.Pizza()
            }
        }
        item {
            IconDisplay("Plane") {
                GrapesIconSet.Plane()
            }
        }
        item {
            IconDisplay("Plug") {
                GrapesIconSet.Plug()
            }
        }
        item {
            IconDisplay("Plus") {
                GrapesIconSet.Plus()
            }
        }
        item {
            IconDisplay("Puzzle") {
                GrapesIconSet.Puzzle()
            }
        }
        item {
            IconDisplay("Receipt") {
                GrapesIconSet.Receipt()
            }
        }
        item {
            IconDisplay("ReceiptChecked") {
                GrapesIconSet.ReceiptChecked()
            }
        }
        item {
            IconDisplay("ReceiptCross") {
                GrapesIconSet.ReceiptCross()
            }
        }
        item {
            IconDisplay("ReceiptQuestion") {
                GrapesIconSet.ReceiptQuestion()
            }
        }
        item {
            IconDisplay("Robot") {
                GrapesIconSet.Robot()
            }
        }
        item {
            IconDisplay("ShieldStar") {
                GrapesIconSet.ShieldStar()
            }
        }
        item {
            IconDisplay("ShoppingCart") {
                GrapesIconSet.ShoppingCart()
            }
        }
        item {
            IconDisplay("Slack") {
                GrapesIconSet.Slack()
            }
        }
        item {
            IconDisplay("Sparkle") {
                GrapesIconSet.Sparkle()
            }
        }
        item {
            IconDisplay("Spendesk") {
                GrapesIconSet.Spendesk()
            }
        }
        item {
            IconDisplay("Square4") {
                GrapesIconSet.Square4()
            }
        }
        item {
            IconDisplay("SquareStack") {
                GrapesIconSet.SquareStack()
            }
        }
        item {
            IconDisplay("StarFilled") {
                GrapesIconSet.StarFilled()
            }
        }
        item {
            IconDisplay("StarOutline") {
                GrapesIconSet.StarOutline()
            }
        }
        item {
            IconDisplay("SteeringWheel") {
                GrapesIconSet.SteeringWheel()
            }
        }
        item {
            IconDisplay("Taxi") {
                GrapesIconSet.Taxi()
            }
        }
        item {
            IconDisplay("Trash") {
                GrapesIconSet.Trash()
            }
        }
        item {
            IconDisplay("TriangleWarning") {
                GrapesIconSet.TriangleWarning()
            }
        }
        item {
            IconDisplay("Wallet") {
                GrapesIconSet.Wallet()
            }
        }
        item {
            IconDisplay("X") {
                GrapesIconSet.X()
            }
        }
        item {
            IconDisplay("Youtube") {
                GrapesIconSet.Youtube()
            }
        }
    }
}

@Composable
fun IconDisplay(iconName: String, icon: @Composable () -> Unit) {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
    ) {
        icon()
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            iconName,
            style = GrapesTheme.typography.bodyS,
            color = GrapesTheme.colors.contentPrimary,
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
        )
    }

}

@Preview
@Composable
fun IconsDestinationPreview() {
    GrapesTheme {
        IconsDestination()
    }
}
