package dk.colle.steamproject.startscreen.domain.model

data class PackageGroup(
    val name: String,
    val title: String,
    val description: String,
    val selectionText: String,
    val saveText: String,
    val displayType: Int,
    val isRecurringSubscription: String,
    val subscriptions: List<Subscription>
)
