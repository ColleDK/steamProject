package dk.colle.steamproject.startscreen.data.model.mapper

import dk.colle.steamproject.startscreen.data.model.GenreRemote
import dk.colle.steamproject.startscreen.domain.model.Genre

fun GenreRemote.mapToDomain(): Genre {
    return Genre(
        id = id,
        description = description
    )
}