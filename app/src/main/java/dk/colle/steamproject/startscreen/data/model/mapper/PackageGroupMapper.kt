package dk.colle.steamproject.startscreen.data.model.mapper

import dk.colle.steamproject.startscreen.data.model.PackageGroupRemote
import dk.colle.steamproject.startscreen.domain.model.PackageGroup

fun PackageGroupRemote.mapToDomain(): PackageGroup{
    return PackageGroup(
        name = name,
        title = title,
        description = description,
        selectionText = selectionText,
        saveText = saveText,
        displayType = displayType,
        isRecurringSubscription = isRecurringSubscription,
        subscriptions = subscriptions.map { it.mapToDomain() }
    )
}