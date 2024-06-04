package com.example.chess
import ViewModel.ChessViewModel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.chess.ui.theme.ChessTheme

class MainActivity : ComponentActivity() {


        private val chessViewModel: ChessViewModel by viewModels()

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                ChessTheme {
                    MyApp(chessViewModel)
                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ChessTheme {
        MyApp(chessViewModel = ChessViewModel())
    }
}