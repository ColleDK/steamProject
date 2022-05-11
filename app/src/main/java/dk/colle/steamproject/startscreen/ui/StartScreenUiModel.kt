package dk.colle.steamproject.startscreen.ui

import dk.colle.steamproject.startscreen.domain.model.Game
import dk.colle.steamproject.util.Consumable
import dk.colle.steamproject.util.NavigationRoutes
import dk.colle.steamproject.util.Result

data class StartScreenUiModel(
    val games: List<Game>? = null,
    val error: Consumable<Result.Error>? = null,
    val navigation: Consumable<NavigationRoutes>? = null
)
