package dk.colle.steamproject.startscreen.data.model.mapper

import dk.colle.steamproject.startscreen.data.model.ComputerRequirementsRemote
import dk.colle.steamproject.startscreen.domain.model.ComputerRequirements

fun ComputerRequirementsRemote.mapToDomain(): ComputerRequirements{
    return ComputerRequirements(
        minimum = minimum,
        recommended = recommended
    )
}