package dk.colle.steamproject.startscreen.data

import dk.colle.steamproject.NetworkInformationWrapper
import dk.colle.steamproject.startscreen.data.model.GameInformationRemote
import retrofit2.http.GET
import retrofit2.http.Query

interface GameDetailService {

    @GET("api/appdetails")
    suspend fun getGameInformation(@Query("appids") id: String): NetworkInformationWrapper<GameInformationRemote>
}