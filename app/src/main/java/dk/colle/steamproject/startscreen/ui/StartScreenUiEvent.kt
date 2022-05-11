package dk.colle.steamproject.startscreen.ui

import dk.colle.steamproject.util.Consumable
import dk.colle.steamproject.util.NavigationRoutes

sealed class StartScreenUiEvent{
    data class DisplayError(val data: Consumable<Error>): StartScreenUiEvent()
    data class Navigate(val destination: NavigationRoutes): StartScreenUiEvent()
}
