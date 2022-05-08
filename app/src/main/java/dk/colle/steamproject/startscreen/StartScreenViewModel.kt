package dk.colle.steamproject.startscreen

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dk.colle.steamproject.startscreen.data.usecase.GetAllGamesUseCase
import dk.colle.steamproject.startscreen.domain.GameImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StartScreenViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val getAllGamesUseCase: GetAllGamesUseCase
) : ViewModel() {

    private val _games = MutableStateFlow<List<GameImpl>>(listOf())
    val games = _games.asStateFlow()

    init {
        getAllGames()
    }

    private fun getAllGames(){
        viewModelScope.launch {
            val result = getAllGamesUseCase()
            _games.value = result
        }
    }
}