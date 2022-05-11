package dk.colle.steamproject.startscreen.data.model.mapper

import dk.colle.steamproject.startscreen.data.model.PlatformRemote
import dk.colle.steamproject.startscreen.domain.model.Platform

fun PlatformRemote.mapToDomain(): Platform {
    return Platform(
        windows = windows,
        mac = mac,
        linux = linux
    )
}