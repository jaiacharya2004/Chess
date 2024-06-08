package com.example.chess

import Screens.AccountScreen
import Screens.ProfileScreen
import ViewModel.ChessViewModel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {

    private val chessViewModel: ChessViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = Screen.Home.route) {
                composable(Screen.Home.route) {
                    HomeScreen(navController, chessViewModel)
                }
                composable(Screen.Profile.route) {
                    ProfileScreen(navController)
                }
                composable(Screen.Account.route) {
                    AccountScreen(navController)
                }
            }
        }
    }
}
