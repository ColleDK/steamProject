package dk.colle.steamproject.startscreen

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import dk.colle.steamproject.startscreen.data.AllGamesPagedCompanion
import dk.colle.steamproject.startscreen.data.model.AppDetails
import dk.colle.steamproject.startscreen.data.usecase.GetAllGamesUseCase
import dk.colle.steamproject.startscreen.data.usecase.GetAllGamesWithInformationUseCase
import dk.colle.steamproject.startscreen.data.usecase.GetGameInformationUseCase
import dk.colle.steamproject.startscreen.domain.model.GameInformation
import dk.colle.steamproject.startscreen.domain.paging.AllGamesSource
import dk.colle.steamproject.startscreen.ui.StartScreenUiModel
import dk.colle.steamproject.util.Consumable
import dk.colle.steamproject.util.NavigationRoutes
import dk.colle.steamproject.util.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StartScreenViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val allGamesSource: AllGamesSource
) : ViewModel() {

    private val _uiModel = MutableStateFlow<StartScreenUiModel>(StartScreenUiModel())
    val uiModel = _uiModel.asStateFlow()

    val games: Flow<PagingData<AppDetails>> = Pager(PagingConfig(AllGamesPagedCompanion.DEFAULT_PAGE_SIZE)) { allGamesSource }.flow.cachedIn(
        viewModelScope
    )

    private fun emitUiModel(
        games: List<GameInformation>? = null,
        error: Consumable<Result.Error>? = null,
        navigation: Consumable<NavigationRoutes>? = null
    ) {
        _uiModel.value = StartScreenUiModel(
            games = games ?: _uiModel.value.games,
            error = error ?: _uiModel.value.error,
            navigation = navigation ?: _uiModel.value.navigation
        )
    }
}