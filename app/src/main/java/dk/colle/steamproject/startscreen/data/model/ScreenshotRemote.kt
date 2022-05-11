package dk.colle.steamproject.startscreen.data.model

import com.google.gson.annotations.SerializedName

data class ScreenshotRemote(
    @SerializedName("id") val id: Int,
    @SerializedName("path_thumbnail") val thumbnailUrl: String,
    @SerializedName("path_full") val fullArtUrl: String
)
