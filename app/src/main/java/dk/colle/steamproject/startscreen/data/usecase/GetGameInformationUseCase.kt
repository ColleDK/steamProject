package dk.colle.steamproject.startscreen.data.usecase

import dk.colle.steamproject.startscreen.data.GameDetailService
import dk.colle.steamproject.startscreen.data.model.mapper.mapToDomain
import dk.colle.steamproject.startscreen.domain.model.GameInformation
import dk.colle.steamproject.util.Result
import java.io.IOException

class GetGameInformationUseCase(
    private val gameDetailService: GameDetailService
) {
    suspend operator fun invoke(id: String): Result<GameInformation> {
        val result = gameDetailService.getGameInformation(id = id)
        return when (result.success) {
            true -> Result.Success(data = result.data.mapToDomain())
            false -> Result.Error(
                message = "Error retrieving game information with id $id",
                exception = IOException()
            )
        }
    }
}