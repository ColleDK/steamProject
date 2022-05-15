package dk.colle.steamproject.startscreen.data.model

import com.google.gson.annotations.SerializedName

data class AppDetails(
    @SerializedName("appid") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("last_modified") val modified: Long,
    @SerializedName("price_change_number") val priceChangeNumber: Long
)
