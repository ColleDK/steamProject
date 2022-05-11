package dk.colle.steamproject.startscreen.data.model.mapper

import dk.colle.steamproject.startscreen.data.model.MetaCriticRemote
import dk.colle.steamproject.startscreen.domain.model.MetaCritic

fun MetaCriticRemote.mapToDomain(): MetaCritic {
    return MetaCritic(
        score = score, url = url
    )
}