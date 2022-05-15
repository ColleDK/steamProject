package dk.colle.steamproject.startscreen.data.usecase

import dk.colle.steamproject.startscreen.data.AllGamesPagedService
import dk.colle.steamproject.startscreen.data.model.AppDetails
import dk.colle.steamproject.util.Result

class GetAllGamesPagedUseCase(
    private val allGamesPagedService: AllGamesPagedService
) {
    suspend operator fun invoke(
        key: String,
        pageSize: Int? = null,
        pageIndex: Int? = null
    ): Result<List<AppDetails>> {
        val result = pageIndex?.let {
            allGamesPagedService.getAllGames(apiKey = key, pageSize = pageSize ?: 0, page = it)
        } ?: allGamesPagedService.getAllGames(apiKey = key, pageSize = pageSize ?: 0)

        return Result.Success(data = result.appList.apps)
    }
}