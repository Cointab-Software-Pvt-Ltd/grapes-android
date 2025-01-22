package com.spendesk.grapes.samples.compose

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.spendesk.grapes.compose.appbar.GrapesTopAppBar
import com.spendesk.grapes.compose.appbar.GrapesTopAppBarBackIcon
import com.spendesk.grapes.compose.appbar.GrapesTopAppBarIconButton
import com.spendesk.grapes.compose.theme.GrapesTheme
import com.spendesk.grapes.samples.compose.navigation.Destinations
import com.spendesk.grapes.samples.home.HomeActivity
import dagger.hilt.android.AndroidEntryPoint

/**
 * @author : kelian
 * @since : 17/01/2025
 **/
@AndroidEntryPoint
class ComposeActivity : ComponentActivity() {

    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, ComposeActivity::class.java)
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GrapesTheme {
                val localContext = LocalContext.current
                val navController = rememberNavController()
                val currentScreen = navController.currentBackStackEntryAsState().value?.destination?.route ?: Destinations.Home::class.qualifiedName ?: ""
                val homeScreen = Destinations.Home::class.qualifiedName?.split(".")?.last()
                val sanitizedCurrentScreen = currentScreen.split(".").last()

                Scaffold(
                    topBar = {
                        GrapesTopAppBar(
                            title = sanitizedCurrentScreen,
                            navigationIcon = {
                                GrapesTopAppBarIconButton(
                                    icon = { if (sanitizedCurrentScreen != homeScreen) GrapesTopAppBarBackIcon() },
                                    onClick = { navController.popBackStack() }
                                )
                            }
                        )
                    },
                    containerColor = GrapesTheme.colors.backgroundSecondaryDefault
                ) { innerPadding ->
                    NavHost(navController, startDestination = Destinations.Home, modifier = Modifier.padding(innerPadding)) {
                        composable<Destinations.Home> {
                            HomeDestination(
                                onDestinationClicked = { destination ->
                                    navController.navigate(route = destination)
                                },
                                onOpenLegacyClicked = {
                                    localContext.startActivity(Intent(localContext, HomeActivity::class.java))
                                }
                            )
                        }
                        composable<Destinations.Buttons> { ButtonsDestination() }
                        composable<Destinations.Cards> { CardsDestination() }
                        composable<Destinations.Colors> { ColorsDestination() }
                        composable<Destinations.Controls> { ControlsDestination() }
                        composable<Destinations.Gauge> { GaugeDestination() }
                        composable<Destinations.Header> { HeaderDestination() }
                        composable<Destinations.Icons> { IconsDestination() }
                        composable<Destinations.Inputs> { InputsDestination() }
                        composable<Destinations.Lists> { ListDestination() }
                        composable<Destinations.Messaging> { MessagingDestination() }
                        composable<Destinations.Modal> { ModalDestination() }
                        composable<Destinations.Navigation> { NavigationDestination() }
                        composable<Destinations.Shape> { ShapeDestination() }
                        composable<Destinations.Size> { SizeDestination() }
                        composable<Destinations.Spacing> { SpacingDestination() }
                        composable<Destinations.Typography> { TypographyDestination() }
                    }
                }
            }
        }
    }
}
