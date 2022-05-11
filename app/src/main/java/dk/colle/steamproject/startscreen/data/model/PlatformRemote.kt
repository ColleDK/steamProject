package dk.colle.steamproject.startscreen.data.model

import com.google.gson.annotations.SerializedName

data class PlatformRemote(
    @SerializedName("windows") val windows: Boolean,
    @SerializedName("mac") val mac: Boolean,
    @SerializedName("linux") val linux: Boolean
)
