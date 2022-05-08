package dk.colle.steamproject.startscreen.data

import dk.colle.steamproject.NetworkApplistWrapper
import dk.colle.steamproject.startscreen.data.model.impl.GameRemoteImpl
import retrofit2.http.GET

interface AllGamesService {
    @GET("ISteamApps/GetAppList/v00002")
    suspend fun getAllGames(): NetworkApplistWrapper<List<GameRemoteImpl>>

}