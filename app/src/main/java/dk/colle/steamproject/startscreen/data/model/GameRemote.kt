package dk.colle.steamproject.startscreen.data.model

import com.google.gson.annotations.SerializedName

data class GameRemote(
    @SerializedName("appid") val id: Int,
    @SerializedName("name") val name: String
)
