package dk.colle.steamproject.startscreen.data.model.mapper

import dk.colle.steamproject.startscreen.data.model.CategoryRemote
import dk.colle.steamproject.startscreen.domain.model.Category

fun CategoryRemote.mapToDomain(): Category {
    return Category(
        id = id,
        description = description
    )
}