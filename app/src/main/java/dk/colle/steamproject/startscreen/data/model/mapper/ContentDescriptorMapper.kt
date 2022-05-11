package dk.colle.steamproject.startscreen.data.model.mapper

import dk.colle.steamproject.startscreen.data.model.ContentDescriptorRemote
import dk.colle.steamproject.startscreen.domain.model.ContentDescriptor

fun ContentDescriptorRemote.mapToDomain(): ContentDescriptor {
    return ContentDescriptor(
        ids = ids,
        notes = notes
    )
}