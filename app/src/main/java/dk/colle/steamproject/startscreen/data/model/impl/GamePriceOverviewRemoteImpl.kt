package dk.colle.steamproject.startscreen.data.model.impl

import com.google.gson.annotations.SerializedName
import dk.colle.steamproject.startscreen.data.model.GamePriceOverviewRemote

data class GamePriceOverviewRemoteImpl(
    @SerializedName("final_formatted") override val formattedPrice: String,
    @SerializedName("initial_formatted") override val initialFormattedPrice: String,
    @SerializedName("discount_percent") override val discountPercent: Float,
    @SerializedName("final") override val finalPrice: Int,
    @SerializedName("initial") override val initialPrice: Int,
    @SerializedName("currency") override val currency: String
): GamePriceOverviewRemote
