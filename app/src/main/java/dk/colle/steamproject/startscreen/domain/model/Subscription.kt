package dk.colle.steamproject.startscreen.domain.model

data class Subscription(
    val id: String,
    val savingPercentage: Int,
    val optionText: String,
    val optionDescription: String,
    val canGetFreeLicense: String,
    val isFreeLicense: Boolean,
    val priceWithDiscount: Int
)
