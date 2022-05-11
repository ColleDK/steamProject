package dk.colle.steamproject.startscreen.data.model.mapper

import dk.colle.steamproject.startscreen.data.model.ReleaseRemote
import dk.colle.steamproject.startscreen.domain.model.Release

fun ReleaseRemote.mapToDomain(): Release {
    return Release(
        isComingSoon = isComaingSoon,
        releaseDate = releaseDate
    )
}