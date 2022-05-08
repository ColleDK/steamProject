package dk.colle.steamproject.startscreen.data.model.impl

import com.google.gson.annotations.SerializedName
import dk.colle.steamproject.startscreen.data.model.GameRemote

data class GameRemoteImpl(
    @SerializedName("appid") override val id: Int,
    @SerializedName("name") override val name: String
): GameRemote
