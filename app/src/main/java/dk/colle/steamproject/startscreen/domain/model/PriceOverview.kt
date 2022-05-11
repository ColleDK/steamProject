package dk.colle.steamproject.startscreen.domain.model

data class PriceOverview(
    val currency: String,
    val initialPrice: Int,
    val finalPrice: Int,
    val discountPercentage: Int,
    val initialPriceFormatted: String,
    val finalPriceFormatted: String
)
