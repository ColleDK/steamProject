package dk.colle.steamproject.startscreen.data.model.mapper

import dk.colle.steamproject.startscreen.data.model.GameInformationRemote
import dk.colle.steamproject.startscreen.domain.model.GameInformation

fun GameInformationRemote.mapToDomain(): GameInformation {
    return GameInformation(
        type = type,
        name = name,
        id = id,
        requiredAge = requiredAge,
        isFree = isFree,
        description = description,
        about = about,
        shortDescription = shortDescription,
        supportedLanguages = supportedLanguages,
        headerImage = headerImage,
        website = website,
        pcRequirements = pcRequirements.mapToDomain(),
        macRequirements = macRequirements.mapToDomain(),
        linuxRequirements = linuxRequirements.mapToDomain(),
        developers = developers,
        publishers = publishers,
        priceOverview = priceOverview.mapToDomain(),
        packages = packages,
        packageGroups = packageGroups.map { it.mapToDomain() },
        platforms = platforms.mapToDomain(),
        metaCritic = metaCritic.mapToDomain(),
        categories = categories.map { it.mapToDomain() },
        genres = genres.map { it.mapToDomain() },
        screenshots = screenshots.map { it.mapToDomain() },
        recommendation = recommendation.mapToDomain(),
        release = release.mapToDomain(),
        supportInfo = supportInfo.mapToDomain(),
        background = background,
        backgroundRaw = backgroundRaw,
        contentDescriptor = contentDescriptor.mapToDomain(),
    )
}