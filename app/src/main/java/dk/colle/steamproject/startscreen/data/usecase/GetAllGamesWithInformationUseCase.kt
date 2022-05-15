package dk.colle.steamproject.startscreen.data.usecase

import dk.colle.steamproject.startscreen.domain.model.GameInformation
import dk.colle.steamproject.util.Result
import timber.log.Timber
import java.io.IOException

class GetAllGamesWithInformationUseCase(
    private val getAllGamesUseCase: GetAllGamesUseCase,
    private val getGameInformationUseCase: GetGameInformationUseCase
) {
    suspend operator fun invoke(): Result<List<GameInformation>>{
        return when(val allGames = getAllGamesUseCase.invoke()){
            is Result.Success -> {
                val gameInformations = allGames.data.map {
                    getGameInformationUseCase(it.id)
                }

                val informationResult = mutableListOf<GameInformation>()
                gameInformations.forEach {
                    when(it){
                        is Result.Success -> {
                            Timber.d("Adding game information for ${it.data.name}")
                            informationResult.add(it.data)
                        }
                    }
                }
                Result.Success(data = informationResult.toList())
            }
            else -> {
                Result.Error(message = "Error retrieving data from steam API", exception = IOException())
            }
        }
    }
}