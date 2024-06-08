package Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.chess.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray) // Set the background color of the entire screen to black
    ) {

        TopAppBar(
            title = {
                Text(
                    text = "Jai",
                    color = Color.White // Set title text color to white
                )
            },
            navigationIcon = {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(
                        Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White // Set icon color to white
                    )
                }
            },
            actions = {
                IconButton(onClick = { /* Handle action icon click */ }) {
                    Icon(
                        Icons.Default.MoreVert,
                        contentDescription = null,
                        tint = Color.White // Set icon color to white
                    )
                }
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.DarkGray) // Set TopAppBar background color to black

        )

            Column {

                Row {

                    Image(
                        painter = painterResource(id = R.drawable.whatsapp_image_2024_01_29_at_09_11_24_4afa4278),
                        contentDescription = null,
                        Modifier
                            .padding(top = 50.dp)
                            .size(115.dp)
                    )
                    Text(
                        text = "jaiacharya23",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp,
                        modifier = Modifier
                            .padding(start = 20.dp, top = 70.dp)
                    )

                }
                Text(
                    text = "India",
                    color = Color.White,
                    modifier = Modifier
                        .padding(start = 150.dp)
                )
                Text(
                    text = "Joined 15 May 2023", color = Color.LightGray,
                )
            }

        }
    }
