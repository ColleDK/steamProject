package dk.colle.steamproject.startscreen.data.model

import com.google.gson.annotations.SerializedName

data class ReleaseRemote(
    @SerializedName("coming_soon") val isComaingSoon: Boolean,
    @SerializedName("date") val releaseDate: String
)