package dk.colle.steamproject.startscreen.data.usecase

import dk.colle.steamproject.startscreen.data.model.mapper.mapToDomain
import dk.colle.steamproject.startscreen.data.AllGamesService
import dk.colle.steamproject.startscreen.domain.model.Game
import dk.colle.steamproject.util.Result

class GetAllGamesUseCase(
    private val allGamesService: AllGamesService
) {
    suspend operator fun invoke(): Result<List<Game>> {
        return Result.Success(
            data = allGamesService.getAllGames().applist.apps.map {
                it.mapToDomain()
            }
        )
    }
}