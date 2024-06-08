package HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.chess.R
import com.example.chess.Screen

@Composable
fun BottomBar(navController: NavController) {
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
                    Column {


                    IconButton(onClick = { /* Handle navigation icon click */ }) {
                        Image(
                            painter = painterResource(id = R.drawable.pawn),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp)
                        )
                    }
                        Text(
                            text = "Home",
                            style = MaterialTheme.typography.labelLarge ,// Optional: Apply a specific text style
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                    }
                    Column {
                        IconButton(onClick = { /* Handle action icon click */ }) {
                            Image(
                                painter = painterResource(id = R.drawable.puzzle),
                                contentDescription = null,
                                modifier = Modifier.size(35.dp)
                            )
                        }
                        Text(
                            text = "Puzzle",
                            style = MaterialTheme.typography.labelLarge ,// Optional: Apply a specific text style
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                    }

                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.school_40dp_fill0_wght400_grad0_opsz40),
                            contentDescription = null,
                            modifier = Modifier.size(45.dp)
                        )

                        Text(
                            text = "Lesson",
                            style = MaterialTheme.typography.labelLarge,// Optional: Apply a specific text style
                            modifier = Modifier.padding(bottom = 4.dp, start = 6.dp)
                        )
                    }

                   Column {
                       IconButton(onClick = { /* Handle action icon click */ }) {
                           Image(
                               painter = painterResource(id = R.drawable.watch),
                               contentDescription = null,
                               modifier = Modifier.size(35.dp)
                           )
                       }
                       Text(
                           text = "Watch",
                           style = MaterialTheme.typography.labelLarge ,// Optional: Apply a specific text style
                           modifier = Modifier.padding(bottom = 4.dp, start = 6.dp)
                       )
                   }

                    Column {
                        IconButton(onClick = { /* Handle action icon click */ }) {
                            Icon(
                                Icons.Default.Menu, contentDescription = null,
                                modifier = Modifier.size(25.dp)
                            )
                        }
                        Text(
                            text = "More",
                            style = MaterialTheme.typography.labelLarge ,// Optional: Apply a specific text style
                            modifier = Modifier.padding(bottom = 4.dp, start = 6.dp)
                        )
                    }

                }
            }
        }
    }
}