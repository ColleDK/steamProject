package dk.colle.steamproject.startscreen.data.usecase

import dk.colle.steamproject.startscreen.domain.GameImpl

interface GetAllGamesUseCase {
    suspend operator fun invoke(): List<GameImpl>
}