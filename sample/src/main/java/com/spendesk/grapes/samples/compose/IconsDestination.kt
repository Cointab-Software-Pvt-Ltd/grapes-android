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
        item(key = "AdjustmentsHorizontal") {
            IconDisplay("AdjustmentsHorizontal") {
                GrapesIconSet.AdjustmentsHorizontal()
            }
        }
        item(key = "Archive") {
            IconDisplay("Archive") {
                GrapesIconSet.Archive()
            }
        }
        item(key = "ArrowDown") {
            IconDisplay("ArrowDown") {
                GrapesIconSet.ArrowDown()
            }
        }
        item(key = "ArrowDownTray") {
            IconDisplay("ArrowDownTray") {
                GrapesIconSet.ArrowDownTray()
            }
        }
        item(key = "ArrowLeft") {
            IconDisplay("ArrowLeft") {
                GrapesIconSet.ArrowLeft()
            }
        }
        item(key = "ArrowLeftRight") {
            IconDisplay("ArrowLeftRight") {
                GrapesIconSet.ArrowLeftRight()
            }
        }
        item(key = "ArrowPath") {
            IconDisplay("ArrowPath") {
                GrapesIconSet.ArrowPath()
            }
        }
        item(key = "ArrowRight") {
            IconDisplay("ArrowRight") {
                GrapesIconSet.ArrowRight()
            }
        }
        item(key = "ArrowRightRectangle") {
            IconDisplay("ArrowRightRectangle") {
                GrapesIconSet.ArrowRightRectangle()
            }
        }
        item(key = "ArrowSplit") {
            IconDisplay("ArrowSplit") {
                GrapesIconSet.ArrowSplit()
            }
        }
        item(key = "ArrowTopRightSquare") {
            IconDisplay("ArrowTopRightSquare") {
                GrapesIconSet.ArrowTopRightSquare()
            }
        }
        item(key = "ArrowTurnLeft") {
            IconDisplay("ArrowTurnLeft") {
                GrapesIconSet.ArrowTurnLeft()
            }
        }
        item(key = "ArrowTurnRight") {
            IconDisplay("ArrowTurnRight") {
                GrapesIconSet.ArrowTurnRight()
            }
        }
        item(key = "ArrowUp") {
            IconDisplay("ArrowUp") {
                GrapesIconSet.ArrowUp()
            }
        }
        item(key = "ArrowUturnLeftDown") {
            IconDisplay("ArrowUturnLeftDown") {
                GrapesIconSet.ArrowUturnLeftDown()
            }
        }
        item(key = "ArrowUturnRightTop") {
            IconDisplay("ArrowUturnRightTop") {
                GrapesIconSet.ArrowUturnRightTop()
            }
        }
        item(key = "Backspace") {
            IconDisplay("Backspace") {
                GrapesIconSet.Backspace()
            }
        }
        item(key = "Banknote") {
            IconDisplay("Banknote") {
                GrapesIconSet.Banknote()
            }
        }
        item(key = "BanknoteStrikeout") {
            IconDisplay("BanknoteStrikeout") {
                GrapesIconSet.BanknoteStrikeout()
            }
        }
        item(key = "Bars3") {
            IconDisplay("Bars3") {
                GrapesIconSet.Bars3()
            }
        }
        item(key = "BarsArrowDown") {
            IconDisplay("BarsArrowDown") {
                GrapesIconSet.BarsArrowDown()
            }
        }
        item(key = "Bed") {
            IconDisplay("Bed") {
                GrapesIconSet.Bed()
            }
        }
        item(key = "Bell") {
            IconDisplay("Bell") {
                GrapesIconSet.Bell()
            }
        }
        item(key = "BellDesk") {
            IconDisplay("BellDesk") {
                GrapesIconSet.BellDesk()
            }
        }
        item(key = "Bike") {
            IconDisplay("Bike") {
                GrapesIconSet.Bike()
            }
        }
        item(key = "BuildingBank") {
            IconDisplay("BuildingBank") {
                GrapesIconSet.BuildingBank()
            }
        }
        item(key = "BuildingStorefront") {
            IconDisplay("BuildingStorefront") {
                GrapesIconSet.BuildingStorefront()
            }
        }
        item(key = "BuildingsOffice") {
            IconDisplay("BuildingsOffice") {
                GrapesIconSet.BuildingsOffice()
            }
        }
        item(key = "Bus") {
            IconDisplay("Bus") {
                GrapesIconSet.Bus()
            }
        }
        item(key = "Calculator") {
            IconDisplay("Calculator") {
                GrapesIconSet.Calculator()
            }
        }
        item(key = "Calendar") {
            IconDisplay("Calendar") {
                GrapesIconSet.Calendar()
            }
        }
        item(key = "CalendarArrowRight") {
            IconDisplay("CalendarArrowRight") {
                GrapesIconSet.CalendarArrowRight()
            }
        }
        item(key = "CalendarCheckmark") {
            IconDisplay("CalendarCheckmark") {
                GrapesIconSet.CalendarCheckmark()
            }
        }
        item(key = "CalendarClock") {
            IconDisplay("CalendarClock") {
                GrapesIconSet.CalendarClock()
            }
        }
        item(key = "Camera") {
            IconDisplay("Camera") {
                GrapesIconSet.Camera()
            }
        }
        item(key = "CameraStrikeout") {
            IconDisplay("CameraStrikeout") {
                GrapesIconSet.CameraStrikeout()
            }
        }
        item(key = "Car") {
            IconDisplay("Car") {
                GrapesIconSet.Car()
            }
        }
        item(key = "Card") {
            IconDisplay("Card") {
                GrapesIconSet.Card()
            }
        }
        item(key = "CardArrowDown") {
            IconDisplay("CardArrowDown") {
                GrapesIconSet.CardArrowDown()
            }
        }
        item(key = "CardArrowUp") {
            IconDisplay("CardArrowUp") {
                GrapesIconSet.CardArrowUp()
            }
        }
        item(key = "CardLightning") {
            IconDisplay("CardLightning") {
                GrapesIconSet.CardLightning()
            }
        }
        item(key = "CardLockClose") {
            IconDisplay("CardLockClose") {
                GrapesIconSet.CardLockClose()
            }
        }
        item(key = "CardLockOpen") {
            IconDisplay("CardLockOpen") {
                GrapesIconSet.CardLockOpen()
            }
        }
        item(key = "CardRoundedArrows") {
            IconDisplay("CardRoundedArrows") {
                GrapesIconSet.CardRoundedArrows()
            }
        }
        item(key = "CardStack") {
            IconDisplay("CardStack") {
                GrapesIconSet.CardStack()
            }
        }
        item(key = "CardStrikeout") {
            IconDisplay("CardStrikeout") {
                GrapesIconSet.CardStrikeout()
            }
        }
        item(key = "CfoConnect") {
            IconDisplay("CfoConnect") {
                GrapesIconSet.CfoConnect()
            }
        }
        item(key = "ChartPie") {
            IconDisplay("ChartPie") {
                GrapesIconSet.ChartPie()
            }
        }
        item(key = "Check") {
            IconDisplay("Check") {
                GrapesIconSet.Check()
            }
        }
        item(key = "ChevronDouble") {
            IconDisplay("ChevronDouble") {
                GrapesIconSet.ChevronDouble()
            }
        }
        item(key = "ChevronDoubleRight") {
            IconDisplay("ChevronDoubleRight") {
                GrapesIconSet.ChevronDoubleRight()
            }
        }
        item(key = "ChevronDown") {
            IconDisplay("ChevronDown") {
                GrapesIconSet.ChevronDown()
            }
        }
        item(key = "ChevronLeft") {
            IconDisplay("ChevronLeft") {
                GrapesIconSet.ChevronLeft()
            }
        }
        item(key = "ChevronRight") {
            IconDisplay("ChevronRight") {
                GrapesIconSet.ChevronRight()
            }
        }
        item(key = "ChevronUp") {
            IconDisplay("ChevronUp") {
                GrapesIconSet.ChevronUp()
            }
        }
        item(key = "CircleActive") {
            IconDisplay("CircleActive") {
                GrapesIconSet.CircleActive()
            }
        }
        item(key = "CircleCheck") {
            IconDisplay("CircleCheck") {
                GrapesIconSet.CircleCheck()
            }
        }
        item(key = "CircleCross") {
            IconDisplay("CircleCross") {
                GrapesIconSet.CircleCross()
            }
        }
        item(key = "CircleInformation") {
            IconDisplay("CircleInformation") {
                GrapesIconSet.CircleInformation()
            }
        }
        item(key = "CircleMinus") {
            IconDisplay("CircleMinus") {
                GrapesIconSet.CircleMinus()
            }
        }
        item(key = "CirclePause") {
            IconDisplay("CirclePause") {
                GrapesIconSet.CirclePause()
            }
        }
        item(key = "CirclePlay") {
            IconDisplay("CirclePlay") {
                GrapesIconSet.CirclePlay()
            }
        }
        item(key = "CirclePlus") {
            IconDisplay("CirclePlus") {
                GrapesIconSet.CirclePlus()
            }
        }
        item(key = "CircleQuestionFilled") {
            IconDisplay("CircleQuestionFilled") {
                GrapesIconSet.CircleQuestionFilled()
            }
        }
        item(key = "CircleQuestionOutline") {
            IconDisplay("CircleQuestionOutline") {
                GrapesIconSet.CircleQuestionOutline()
            }
        }
        item(key = "Clipboard") {
            IconDisplay("Clipboard") {
                GrapesIconSet.Clipboard()
            }
        }
        item(key = "ClipboardPin") {
            IconDisplay("ClipboardPin") {
                GrapesIconSet.ClipboardPin()
            }
        }
        item(key = "ClockFilled") {
            IconDisplay("ClockFilled") {
                GrapesIconSet.ClockFilled()
            }
        }
        item(key = "ClockOutline") {
            IconDisplay("ClockOutline") {
                GrapesIconSet.ClockOutline()
            }
        }
        item(key = "CodeBracket") {
            IconDisplay("CodeBracket") {
                GrapesIconSet.CodeBracket()
            }
        }
        item(key = "Crop") {
            IconDisplay("Crop") {
                GrapesIconSet.Crop()
            }
        }
        item(key = "CrossSmall") {
            IconDisplay("CrossSmall") {
                GrapesIconSet.CrossSmall()
            }
        }
        item(key = "Cube") {
            IconDisplay("Cube") {
                GrapesIconSet.Cube()
            }
        }
        item(key = "DollarCircleArrow") {
            IconDisplay("DollarCircleArrow") {
                GrapesIconSet.DollarCircleArrow()
            }
        }
        item(key = "EllipsisHorizontal") {
            IconDisplay("EllipsisHorizontal") {
                GrapesIconSet.EllipsisHorizontal()
            }
        }
        item(key = "EllipsisVertical") {
            IconDisplay("EllipsisVertical") {
                GrapesIconSet.EllipsisVertical()
            }
        }
        item(key = "Envelope") {
            IconDisplay("Envelope") {
                GrapesIconSet.Envelope()
            }
        }
        item(key = "EnvelopeOpen") {
            IconDisplay("EnvelopeOpen") {
                GrapesIconSet.EnvelopeOpen()
            }
        }
        item(key = "Eye") {
            IconDisplay("Eye") {
                GrapesIconSet.Eye()
            }
        }
        item(key = "EyeStrikeout") {
            IconDisplay("EyeStrikeout") {
                GrapesIconSet.EyeStrikeout()
            }
        }
        item(key = "Facebook") {
            IconDisplay("Facebook") {
                GrapesIconSet.Facebook()
            }
        }
        item(key = "Flag") {
            IconDisplay("Flag") {
                GrapesIconSet.Flag()
            }
        }
        item(key = "FlagCheckered") {
            IconDisplay("FlagCheckered") {
                GrapesIconSet.FlagCheckered()
            }
        }
        item(key = "Gas") {
            IconDisplay("Gas") {
                GrapesIconSet.Gas()
            }
        }
        item(key = "Gear") {
            IconDisplay("Gear") {
                GrapesIconSet.Gear()
            }
        }
        item(key = "HexagoneCross") {
            IconDisplay("HexagoneCross") {
                GrapesIconSet.HexagoneCross()
            }
        }
        item(key = "House") {
            IconDisplay("House") {
                GrapesIconSet.House()
            }
        }
        item(key = "Inbox") {
            IconDisplay("Inbox") {
                GrapesIconSet.Inbox()
            }
        }
        item(key = "InboxStack") {
            IconDisplay("InboxStack") {
                GrapesIconSet.InboxStack()
            }
        }
        item(key = "Instagram") {
            IconDisplay("Instagram") {
                GrapesIconSet.Instagram()
            }
        }
        item(key = "Invoice") {
            IconDisplay("Invoice") {
                GrapesIconSet.Invoice()
            }
        }
        item(key = "Key") {
            IconDisplay("Key") {
                GrapesIconSet.Key()
            }
        }
        item(key = "LeftMenu") {
            IconDisplay("LeftMenu") {
                GrapesIconSet.LeftMenu()
            }
        }
        item(key = "Lightning") {
            IconDisplay("Lightning") {
                GrapesIconSet.Lightning()
            }
        }
        item(key = "Link") {
            IconDisplay("Link") {
                GrapesIconSet.Link()
            }
        }
        item(key = "Linkedin") {
            IconDisplay("Linkedin") {
                GrapesIconSet.Linkedin()
            }
        }
        item(key = "LockClose") {
            IconDisplay("LockClose") {
                GrapesIconSet.LockClose()
            }
        }
        item(key = "LockOpen") {
            IconDisplay("LockOpen") {
                GrapesIconSet.LockOpen()
            }
        }
        item(key = "MagicWand") {
            IconDisplay("MagicWand") {
                GrapesIconSet.MagicWand()
            }
        }
        item(key = "MagnifyingGlass") {
            IconDisplay("MagnifyingGlass") {
                GrapesIconSet.MagnifyingGlass()
            }
        }
        item(key = "MapPin") {
            IconDisplay("MapPin") {
                GrapesIconSet.MapPin()
            }
        }
        item(key = "Megaphone") {
            IconDisplay("Megaphone") {
                GrapesIconSet.Megaphone()
            }
        }
        item(key = "Minus") {
            IconDisplay("Minus") {
                GrapesIconSet.Minus()
            }
        }
        item(key = "MinusSmall") {
            IconDisplay("MinusSmall") {
                GrapesIconSet.MinusSmall()
            }
        }
        item(key = "Motorcycle") {
            IconDisplay("Motorcycle") {
                GrapesIconSet.Motorcycle()
            }
        }
        item(key = "MouseSquareStack") {
            IconDisplay("MouseSquareStack") {
                GrapesIconSet.MouseSquareStack()
            }
        }
        item(key = "Pdf") {
            IconDisplay("Pdf") {
                GrapesIconSet.Pdf()
            }
        }
        item(key = "Pen") {
            IconDisplay("Pen") {
                GrapesIconSet.Pen()
            }
        }
        item(key = "Person") {
            IconDisplay("Person") {
                GrapesIconSet.Person()
            }
        }
        item(key = "PersonGroup") {
            IconDisplay("PersonGroup") {
                GrapesIconSet.PersonGroup()
            }
        }
        item(key = "Phone") {
            IconDisplay("Phone") {
                GrapesIconSet.Phone()
            }
        }
        item(key = "Photo") {
            IconDisplay("Photo") {
                GrapesIconSet.Photo()
            }
        }
        item(key = "PiggyBank") {
            IconDisplay("PiggyBank") {
                GrapesIconSet.PiggyBank()
            }
        }
        item(key = "Pizza") {
            IconDisplay("Pizza") {
                GrapesIconSet.Pizza()
            }
        }
        item(key = "Plane") {
            IconDisplay("Plane") {
                GrapesIconSet.Plane()
            }
        }
        item(key = "Plug") {
            IconDisplay("Plug") {
                GrapesIconSet.Plug()
            }
        }
        item(key = "Plus") {
            IconDisplay("Plus") {
                GrapesIconSet.Plus()
            }
        }
        item(key = "Puzzle") {
            IconDisplay("Puzzle") {
                GrapesIconSet.Puzzle()
            }
        }
        item(key = "Receipt") {
            IconDisplay("Receipt") {
                GrapesIconSet.Receipt()
            }
        }
        item(key = "ReceiptChecked") {
            IconDisplay("ReceiptChecked") {
                GrapesIconSet.ReceiptChecked()
            }
        }
        item(key = "ReceiptCross") {
            IconDisplay("ReceiptCross") {
                GrapesIconSet.ReceiptCross()
            }
        }
        item(key = "ReceiptQuestion") {
            IconDisplay("ReceiptQuestion") {
                GrapesIconSet.ReceiptQuestion()
            }
        }
        item(key = "Robot") {
            IconDisplay("Robot") {
                GrapesIconSet.Robot()
            }
        }
        item(key = "ShieldStar") {
            IconDisplay("ShieldStar") {
                GrapesIconSet.ShieldStar()
            }
        }
        item(key = "ShoppingCart") {
            IconDisplay("ShoppingCart") {
                GrapesIconSet.ShoppingCart()
            }
        }
        item(key = "Slack") {
            IconDisplay("Slack") {
                GrapesIconSet.Slack()
            }
        }
        item(key = "Sparkle") {
            IconDisplay("Sparkle") {
                GrapesIconSet.Sparkle()
            }
        }
        item(key = "Spendesk") {
            IconDisplay("Spendesk") {
                GrapesIconSet.Spendesk()
            }
        }
        item(key = "Square4") {
            IconDisplay("Square4") {
                GrapesIconSet.Square4()
            }
        }
        item(key = "SquareStack") {
            IconDisplay("SquareStack") {
                GrapesIconSet.SquareStack()
            }
        }
        item(key = "StarFilled") {
            IconDisplay("StarFilled") {
                GrapesIconSet.StarFilled()
            }
        }
        item(key = "StarOutline") {
            IconDisplay("StarOutline") {
                GrapesIconSet.StarOutline()
            }
        }
        item(key = "SteeringWheel") {
            IconDisplay("SteeringWheel") {
                GrapesIconSet.SteeringWheel()
            }
        }
        item(key = "Taxi") {
            IconDisplay("Taxi") {
                GrapesIconSet.Taxi()
            }
        }
        item(key = "Trash") {
            IconDisplay("Trash") {
                GrapesIconSet.Trash()
            }
        }
        item(key = "TriangleWarning") {
            IconDisplay("TriangleWarning") {
                GrapesIconSet.TriangleWarning()
            }
        }
        item(key = "Wallet") {
            IconDisplay("Wallet") {
                GrapesIconSet.Wallet()
            }
        }
        item(key = "X") {
            IconDisplay("X") {
                GrapesIconSet.X()
            }
        }
        item(key = "Youtube") {
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
