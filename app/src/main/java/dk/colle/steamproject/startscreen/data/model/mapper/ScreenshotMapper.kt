package dk.colle.steamproject.startscreen.data.model.mapper

import dk.colle.steamproject.startscreen.data.model.ScreenshotRemote
import dk.colle.steamproject.startscreen.domain.model.Screenshot

fun ScreenshotRemote.mapToDomain(): Screenshot {
    return Screenshot(
        id = id,
        thumbnailUrl = thumbnailUrl,
        fullArtUrl = fullArtUrl
    )
}