
package HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ChessLayout (text1: String, text2: String, imageResource: Int){
    Card(
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(100.dp)
            .width(80.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = Color(27, 25, 32)),
    ) {
        Column {
            Text(
                modifier = Modifier
                    .padding(start = 20.dp),
                text = text1)
            Spacer(modifier = Modifier.height(14.dp))
            Image(
                painter = painterResource(id = imageResource),
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 20.dp)
                    .size(30.dp)

            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(modifier = Modifier
                .padding(start = 20.dp),
                text = text2,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                )
            )
        }
    }
}
