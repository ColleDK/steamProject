package dk.colle.steamproject.startscreen.domain.model

data class GameInformation(
    val type: String,
    val name: String,
    val id: Int,
    val requiredAge: Int,
    val isFree: Boolean,
    val description: String,
    val about: String,
    val shortDescription: String,
    val supportedLanguages: String,
    val headerImage: String,
    val website: String?,
    val pcRequirements: ComputerRequirements,
    val macRequirements: ComputerRequirements,
    val linuxRequirements: ComputerRequirements,
    val developers: List<String>,
    val publishers: List<String>,
    val priceOverview: PriceOverview,
    val packages: List<Int>,
    val packageGroups: List<PackageGroup>,
    val platforms: Platform,
    val metaCritic: MetaCritic,
    val categories: List<Category>,
    val genres: List<Genre>,
    val screenshots: List<Screenshot>,
    val recommendation: Recommendation,
    val release: Release,
    val supportInfo: SupportInfo,
    val background: String,
    val backgroundRaw: String,
    val contentDescriptor: ContentDescriptor
)
