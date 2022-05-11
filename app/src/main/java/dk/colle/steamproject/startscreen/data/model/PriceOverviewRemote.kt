package dk.colle.steamproject.startscreen.data.model

import com.google.gson.annotations.SerializedName

data class PriceOverviewRemote(
    @SerializedName("currency") val currency: String,
    @SerializedName("initial") val initialPrice: Int,
    @SerializedName("final") val finalPrice: Int,
    @SerializedName("discount_percent") val discountPercentage: Int,
    @SerializedName("initial_formatted") val initialPriceFormatted: String,
    @SerializedName("final_formatted") val finalPriceFormatted: String
)
