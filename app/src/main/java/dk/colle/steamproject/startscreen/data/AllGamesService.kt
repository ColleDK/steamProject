package dk.colle.steamproject.startscreen.data

import dk.colle.steamproject.NetworkApplistWrapper
import dk.colle.steamproject.NetworkInformationWrapper
import dk.colle.steamproject.startscreen.data.model.GameInformationRemote
import dk.colle.steamproject.startscreen.data.model.GameRemote
import dk.colle.steamproject.startscreen.domain.model.GameInformation
import retrofit2.http.GET
import retrofit2.http.Query

interface AllGamesService {
    @GET("ISteamApps/GetAppList/v00002")
    suspend fun getAllGames(): NetworkApplistWrapper<List<GameRemote>>
}