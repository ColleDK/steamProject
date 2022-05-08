package dk.colle.steamproject.startscreen.data.model

import com.squareup.moshi.Json

interface GamePriceOverviewRemote {
    @Json(name = "final_formatted")
    val formattedPrice: String
    @Json(name = "initial_formatted")
    val initialFormattedPrice: String
    @Json(name = "discount_percent")
    val discountPercent: Float
    @Json(name = "final")
    val finalPrice: Int
    @Json(name = "initial")
    val initialPrice: Int
    @Json(name = "currency")
    val currency: String
}