package dk.colle.steamproject.startscreen.data.model.mapper

import dk.colle.steamproject.startscreen.data.model.RecommendationRemote
import dk.colle.steamproject.startscreen.domain.model.Recommendation

fun RecommendationRemote.mapToDomain(): Recommendation {
    return Recommendation(
        totalRecommendations = totalRecommendations
    )
}