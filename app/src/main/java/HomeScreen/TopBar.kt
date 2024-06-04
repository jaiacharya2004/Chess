package HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.chess.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    Column {
        CenterAlignedTopAppBar(
            title = { Text(text = "Chess.com", color = Color.White) },
            navigationIcon = {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.pawn),
                        contentDescription = null,
                        modifier = Modifier.size(40.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Image(
                        painter = painterResource(id = R.drawable.trophy),
                        contentDescription = null,
                        modifier = Modifier.size(40.dp)
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