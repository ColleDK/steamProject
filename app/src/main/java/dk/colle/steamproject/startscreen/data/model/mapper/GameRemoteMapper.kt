package dk.colle.steamproject.startscreen.data.model.mapper

import dk.colle.steamproject.startscreen.data.model.GameRemote
import dk.colle.steamproject.startscreen.domain.model.Game

fun GameRemote.mapToDomain() = Game(
    name = name,
    id = id.toString()
)