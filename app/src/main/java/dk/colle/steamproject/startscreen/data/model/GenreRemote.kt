package dk.colle.steamproject.startscreen.data.model

import com.google.gson.annotations.SerializedName

data class GenreRemote(
    @SerializedName("id") val id: String,
    @SerializedName("description") val description: String
)
