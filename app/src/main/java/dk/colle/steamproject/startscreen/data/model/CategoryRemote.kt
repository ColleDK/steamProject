package dk.colle.steamproject.startscreen.data.model

import com.google.gson.annotations.SerializedName

data class CategoryRemote(
    @SerializedName("id") val id: Int,
    @SerializedName("description") val description: String
)