package dk.colle.steamproject.startscreen.data.model

import com.google.gson.annotations.SerializedName

data class MetaCriticRemote(
    @SerializedName("score") val score: Int,
    @SerializedName("url") val url: String
)
