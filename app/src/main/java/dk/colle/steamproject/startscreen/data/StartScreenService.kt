package dk.colle.steamproject.startscreen.data

import dk.colle.steamproject.BuildConfig
import dk.colle.steamproject.startscreen.data.model.GameRemote
import retrofit2.http.GET

interface StartScreenService {
    @GET("${BuildConfig.STEAM_BASE_URL}market/apps?api_key={${BuildConfig.STEAM_API_KEY}}")
    suspend fun getAllGames(): List<GameRemote>

}