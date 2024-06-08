package ViewModel

import Data.ChessItemData
import Data.chessItems
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChessViewModel : ViewModel() {
    private val _chessItems = MutableLiveData<List<ChessItemData>>()
    val chessItems: LiveData<List<ChessItemData>> get() = _chessItems

    init {
        _chessItems.value = Data.chessItems // Ensure you reference the Data package explicitly
    }
}