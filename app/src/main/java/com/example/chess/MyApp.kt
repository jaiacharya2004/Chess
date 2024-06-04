package com.example.chess

import Data.ChessItem
import HomeScreen.BottomBar
import HomeScreen.ChessLayout
import HomeScreen.TopBar
import ViewModel.ChessViewModel
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyApp(chessViewModel: ChessViewModel) {
    val chessItems = chessViewModel.chessItems.observeAsState(initial = emptyList())

    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomBar() },
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.DarkGray
        ) {
            LazyColumn(
                modifier = Modifier.padding(top = 90.dp, bottom = 145.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(chessItems.value.size) { index ->
                    ChessItem(itemData = chessItems.value[index])
                }
                item {
                    Row {
                        ChessLayout("Blitz", "510", R.drawable.bolt_48dp_fill0_wght400_grad0_opsz48)
                        ChessLayout("Rapid", "400", R.drawable.timer_48dp_fill0_wght400_grad0_opsz48)
                        ChessLayout("Bullet", "300", R.drawable.rocket_launch_48dp_fill0_wght400_grad0_opsz48)
                        ChessLayout("All", "States", R.drawable.signal_cellular_alt_48dp_fill0_wght400_grad0_opsz48)
                    }
                }
            }
        }
    }
}
