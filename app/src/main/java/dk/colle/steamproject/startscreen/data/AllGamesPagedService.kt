package dk.colle.steamproject.startscreen.data

import dk.colle.steamproject.NetworkAppsWrapper
import dk.colle.steamproject.startscreen.data.model.AppDetails
import dk.colle.steamproject.startscreen.data.model.AppDetailsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface AllGamesPagedService {
    @GET("IStoreService/GetAppList/v1")
    suspend fun getAllGames(
        @Query("key") apiKey: String,
        @Query("max_results") pageSize: Int = AllGamesPagedCompanion.DEFAULT_PAGE_SIZE,
        @Query("last_appid") page: Int
    ): AppDetailsResponse<NetworkAppsWrapper<List<AppDetails>>>

    @GET("IStoreService/GetAppList/v1")
    suspend fun getAllGames(
        @Query("key") apiKey: String,
        @Query("max_results") pageSize: Int = AllGamesPagedCompanion.DEFAULT_PAGE_SIZE
    ): AppDetailsResponse<NetworkAppsWrapper<List<AppDetails>>>
}

object AllGamesPagedCompanion{
    const val DEFAULT_PAGE_SIZE = 50
}