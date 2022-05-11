package dk.colle.steamproject.startscreen.data.model

import com.google.gson.annotations.SerializedName
import dk.colle.steamproject.startscreen.domain.model.Category
import dk.colle.steamproject.startscreen.domain.model.ComputerRequirements
import dk.colle.steamproject.startscreen.domain.model.ContentDescriptor
import dk.colle.steamproject.startscreen.domain.model.Genre
import dk.colle.steamproject.startscreen.domain.model.MetaCritic
import dk.colle.steamproject.startscreen.domain.model.PackageGroup
import dk.colle.steamproject.startscreen.domain.model.Platform
import dk.colle.steamproject.startscreen.domain.model.PriceOverview
import dk.colle.steamproject.startscreen.domain.model.Recommendation
import dk.colle.steamproject.startscreen.domain.model.Release
import dk.colle.steamproject.startscreen.domain.model.Screenshot
import dk.colle.steamproject.startscreen.domain.model.SupportInfo

data class GameInformationRemote(
    @SerializedName("type") val type: String,
    @SerializedName("name") val name: String,
    @SerializedName("steam_appid") val id: Int,
    @SerializedName("required_age") val requiredAge: Int,
    @SerializedName("is_free") val isFree: Boolean,
    @SerializedName("detailed_description") val description: String,
    @SerializedName("about_the_game") val about: String,
    @SerializedName("short_description") val shortDescription: String,
    @SerializedName("supported_languages") val supportedLanguages: String,
    @SerializedName("header_image") val headerImage: String,
    @SerializedName("website") val website: String?,
    @SerializedName("pc_requirements") val pcRequirements: ComputerRequirementsRemote,
    @SerializedName("mac_requirements") val macRequirements: ComputerRequirementsRemote,
    @SerializedName("linux_requirements") val linuxRequirements: ComputerRequirementsRemote,
    @SerializedName("developers") val developers: List<String>,
    @SerializedName("publishers") val publishers: List<String>,
    @SerializedName("price_overview") val priceOverview: PriceOverviewRemote,
    @SerializedName("packages") val packages: List<Int>,
    @SerializedName("package_groups") val packageGroups: List<PackageGroupRemote>,
    @SerializedName("platforms") val platforms: PlatformRemote,
    @SerializedName("metacritic") val metaCritic: MetaCriticRemote,
    @SerializedName("categories") val categories: List<CategoryRemote>,
    @SerializedName("genres") val genres: List<GenreRemote>,
    @SerializedName("screenshots") val screenshots: List<ScreenshotRemote>,
    @SerializedName("recommendations") val recommendation: RecommendationRemote,
    @SerializedName("release_date") val release: ReleaseRemote,
    @SerializedName("support_info") val supportInfo: SupportInfoRemote,
    @SerializedName("background") val background: String,
    @SerializedName("background_raw") val backgroundRaw: String,
    @SerializedName("content_descriptors") val contentDescriptor: ContentDescriptorRemote
)