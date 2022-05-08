package dk.colle.steamproject.startscreen.data.usecase.impl

import dk.colle.steamproject.startscreen.data.AllGamesService
import dk.colle.steamproject.startscreen.data.model.mapper.mapToDomain
import dk.colle.steamproject.startscreen.data.usecase.GetAllGamesUseCase
import dk.colle.steamproject.startscreen.domain.GameImpl

class GetAllGamesUseCaseImpl(
    private val allGamesService: AllGamesService
) : GetAllGamesUseCase {

    override suspend operator fun invoke(): List<GameImpl> {
        return allGamesService.getAllGames().applist.apps?.map {
            it.mapToDomain()
        } ?: emptyList()
    }
}