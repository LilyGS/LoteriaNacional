package mx.lasallebajio.loterianacional

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mx.lasallebajio.loterianacional.ui.screens.MainScreen
import mx.lasallebajio.loterianacional.ui.screens.CardsScreen


@Composable
fun NavigationApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "main_screen"){
        composable("main_screen"){
            MainScreen(navController)
        }

        composable("cards_screen"){
                CardsScreen(navController)
        }
    }
}