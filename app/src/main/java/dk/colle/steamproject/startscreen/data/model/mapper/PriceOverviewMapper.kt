package dk.colle.steamproject.startscreen.data.model.mapper

import dk.colle.steamproject.startscreen.data.model.PriceOverviewRemote
import dk.colle.steamproject.startscreen.domain.model.PriceOverview

fun PriceOverviewRemote.mapToDomain(): PriceOverview{
    return PriceOverview(
        currency = currency,
        initialPrice = initialPrice,
        finalPrice = finalPrice,
        discountPercentage = discountPercentage,
        initialPriceFormatted = initialPriceFormatted,
        finalPriceFormatted = finalPriceFormatted
    )
}