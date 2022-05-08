package dk.colle.steamproject.startscreen.data.model

interface GamePriceOverviewRemote {
    val formattedPrice: String
    val initialFormattedPrice: String
    val discountPercent: Float
    val finalPrice: Int
    val initialPrice: Int
    val currency: String
}