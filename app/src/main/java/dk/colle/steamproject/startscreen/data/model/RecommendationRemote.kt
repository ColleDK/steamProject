package dk.colle.steamproject.startscreen.data.model

import com.google.gson.annotations.SerializedName

data class RecommendationRemote(
    @SerializedName("total") val totalRecommendations: Int
)