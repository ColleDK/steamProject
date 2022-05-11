package dk.colle.steamproject.startscreen.data.model.mapper

import dk.colle.steamproject.startscreen.data.model.SupportInfoRemote
import dk.colle.steamproject.startscreen.domain.model.SupportInfo

fun SupportInfoRemote.mapToDomain(): SupportInfo {
    return SupportInfo(
        url = url,
        email = email
    )
}