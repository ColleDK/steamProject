package dk.colle.steamproject.startscreen.data.model.mapper

import dk.colle.steamproject.startscreen.data.model.SubscriptionRemote
import dk.colle.steamproject.startscreen.domain.model.Subscription

fun SubscriptionRemote.mapToDomain(): Subscription{
    return Subscription(
        id = id,
        savingPercentage = savingPercentage,
        optionText = optionText,
        optionDescription = optionDescription,
        canGetFreeLicense = canGetFreeLicense,
        isFreeLicense = isFreeLicense,
        priceWithDiscount = priceWithDiscount
    )
}