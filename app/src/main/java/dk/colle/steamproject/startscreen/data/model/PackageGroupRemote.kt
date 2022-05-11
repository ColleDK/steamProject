package dk.colle.steamproject.startscreen.data.model

import com.google.gson.annotations.SerializedName

data class PackageGroupRemote(
    @SerializedName("name") val name: String,
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("selection_text") val selectionText: String,
    @SerializedName("save_text") val saveText: String,
    @SerializedName("display_type") val displayType: Int,
    @SerializedName("is_recurring_subscription") val isRecurringSubscription: String,
    @SerializedName("subs") val subscriptions: List<SubscriptionRemote>
)
