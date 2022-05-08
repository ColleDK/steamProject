package dk.colle.steamproject.startscreen.data.model

import com.squareup.moshi.Json

interface GameRemote {
    @Json(name = "appID")
    val id: Int
    @Json(name = "name")
    val name: String
    @Json(name = "is_free")
    val isFree: Boolean
    @Json(name = "price_overview")
    val priceOverview: GamePriceOverviewRemote
}