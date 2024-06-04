package HomeScreen

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BottomBar() {
    Card {
        Column {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(170, 255, 52)),
                shape = ShapeDefaults.Small,
            ) {
                Text(text = "Play")
            }
            BottomAppBar(
                containerColor = Color.DarkGray,
                contentColor = Color.White
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    IconButton(onClick = { /* Handle navigation icon click */ }) {
                        Icon(
                            Icons.Default.Home, contentDescription = null
                        )
                    }
                    IconButton(onClick = { /* Handle action icon click */ }) {
                        Icon(
                            Icons.Default.Menu, contentDescription = null
                        )
                    }
                    IconButton(onClick = { /* Handle action icon click */ }) {
                        Icon(
                            Icons.Default.AccountCircle, contentDescription = null
                        )
                    }
                    IconButton(onClick = { /* Handle action icon click */ }) {
                        Icon(
                            Icons.Default.Notifications, contentDescription = null
                        )
                    }
                    IconButton(onClick = { /* Handle action icon click */ }) {
                        Icon(
                            Icons.Default.Settings, contentDescription = null
                        )
                    }
                }
            }
        }
    }
}
