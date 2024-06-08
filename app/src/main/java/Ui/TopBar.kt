package HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.chess.R
import com.example.chess.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(navController: NavController) {
    Column {
        CenterAlignedTopAppBar(
            title = { Text(text = "Chess.com", color = Color.White) },
            navigationIcon = {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.whatsapp_image_2024_01_29_at_09_11_24_4afa4278),
                        contentDescription = null,
                        modifier = Modifier.size(45.dp)
                            .aspectRatio(1f)
                            .clickable {
                                navController.navigate(Screen.Profile.route)
                            }
                    )
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(id = R.drawable.trophy),
                        contentDescription = null,
                        modifier = Modifier.size(35.dp)
                    )
                }
            },
            actions = {
                Image(
                    painter = painterResource(id = R.drawable.friend),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
            },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color(0xFF2A2A2A))
        )
    }
}