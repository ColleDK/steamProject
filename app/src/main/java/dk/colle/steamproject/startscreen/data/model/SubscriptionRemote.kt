package dk.colle.steamproject.startscreen.data.model

import com.google.gson.annotations.SerializedName

data class SubscriptionRemote(
    @SerializedName("packageid") val id: String,
    @SerializedName("percent_savings_text") val savingPercentageText: String,
    @SerializedName("percent_savings") val savingPercentage: Int,
    @SerializedName("option_text") val optionText: String,
    @SerializedName("option_description") val optionDescription: String,
    @SerializedName("can_get_free_license") val canGetFreeLicense: String,
    @SerializedName("is_free_license") val isFreeLicense: Boolean,
    @SerializedName("price_in_cents_with_discount") val priceWithDiscount: Int
)
