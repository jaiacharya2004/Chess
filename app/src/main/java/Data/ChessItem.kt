package Data

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ChessItem(itemData: ChessItemData) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(105.dp)
            .background(color = Color.DarkGray)
    ) {
        Image(
            painter = painterResource(id = itemData.imageResource),
            contentDescription = null,
            modifier = Modifier.size(100.dp)
        )
        Spacer(modifier = Modifier.width(26.dp))
        Column {
            Text(
                text = itemData.firstString,
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp, color = Color.White),
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = itemData.secondString,
                style = TextStyle(fontSize = 14.sp, color = Color.Gray)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = itemData.logoResource),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    }
}
