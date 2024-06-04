// ChessItemData.kt
package Data

import com.example.chess.R

data class ChessItemData(
    val firstString: String,
    val secondString: String,
    val logoResource: Int,
    val imageResource: Int
)

val chessItems = listOf(
    ChessItemData("Play Game", "10 min vs random", R.drawable.emoji_events_48dp_fill0_wght400_grad0_opsz48, R.drawable.chess_board),
    ChessItemData("Solve Puzzle", "Start your journey", R.drawable.extension_48dp_fill0_wght400_grad0_opsz48, R.drawable.puzzles),
    ChessItemData("Daily Puzzle", "Solved by 1,350,431", R.drawable.calendar_today_48dp_fill0_wght400_grad0_opsz48, R.drawable.chess_board),
    ChessItemData("Play Computer", "Scanner Friendly", R.drawable.smart_toy_48dp_fill0_wght400_grad0_opsz48, R.drawable.computer),
    ChessItemData("Take Lesson", "Description for Fourth Item", R.drawable.school_48dp_fill0_wght400_grad0_opsz48, R.drawable.trick)
)
