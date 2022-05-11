package dk.colle.steamproject.startscreen.data.model

import com.google.gson.annotations.SerializedName

data class ContentDescriptorRemote(
    @SerializedName("ids") val ids: List<Int>,
    @SerializedName("notes") val notes: String
)