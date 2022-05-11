package dk.colle.steamproject.startscreen

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dk.colle.steamproject.startscreen.data.usecase.GetAllGamesUseCase
import dk.colle.steamproject.startscreen.data.usecase.GetGameInformationUseCase
import dk.colle.steamproject.startscreen.domain.model.Game
import dk.colle.steamproject.startscreen.ui.StartScreenUiModel
import dk.colle.steamproject.util.Consumable
import dk.colle.steamproject.util.NavigationRoutes
import dk.colle.steamproject.util.Result
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StartScreenViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val getAllGamesUseCase: GetAllGamesUseCase,
    private val getGameInformationUseCase: GetGameInformationUseCase
) : ViewModel() {
//
//    private val _games = MutableStateFlow<List<Game>>(listOf())
//    val games = _games.asStateFlow()

    private val _uiModel = MutableStateFlow<StartScreenUiModel>(StartScreenUiModel())
    val uiModel = _uiModel.asStateFlow()

    init {
        getAllGames()
    }

    private fun getAllGames(){
        viewModelScope.launch {
            when(val result = getAllGamesUseCase()){
                is Result.Success -> {
                    emitUiModel(games = result.data)
                }
                is Result.Error -> {
                    emitUiModel(error = Consumable(data = result))
                }
            }
        }
    }

    fun getGameInformation(id: String){
        viewModelScope.launch {
            when(val result = getGameInformationUseCase(id = id.toInt())){
                is Result.Success -> {
                    Log.d("APP","Result ${result.data}")
                }
                is Result.Error -> {
                    Log.d("APP","Error ${result.exception}")
                }
            }
        }
    }

    private fun emitUiModel(
        games: List<Game>? = null,
        error: Consumable<Result.Error>? = null,
        navigation: Consumable<NavigationRoutes>? = null
    ){
        _uiModel.value = StartScreenUiModel(
            games = games ?: _uiModel.value.games,
            error = error ?: _uiModel.value.error,
            navigation = navigation ?: _uiModel.value.navigation
        )
    }
}