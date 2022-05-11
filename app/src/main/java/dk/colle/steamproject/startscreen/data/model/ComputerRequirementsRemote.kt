package dk.colle.steamproject.startscreen.data.model

import com.google.gson.annotations.SerializedName

data class ComputerRequirementsRemote(
    @SerializedName("minimum") val minimum: String,
    @SerializedName("recommended") val recommended: String
)
