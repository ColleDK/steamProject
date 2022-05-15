package dk.colle.steamproject.startscreen.data.model

import com.google.gson.annotations.SerializedName

data class AppDetailsResponse<T>(
    @SerializedName("response") val appList: T,
    @SerializedName("have_more_results") val haveMoreResults: Boolean,
    @SerializedName("last_appid") val lastAppId: Int
)
