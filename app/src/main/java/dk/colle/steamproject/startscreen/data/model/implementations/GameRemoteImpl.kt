package dk.colle.steamproject.startscreen.data.model.implementations

import dk.colle.steamproject.startscreen.data.model.GamePriceOverviewRemote
import dk.colle.steamproject.startscreen.data.model.GameRemote

data class GameRemoteImpl(
    override val id: Int,
    override val name: String,
    override val isFree: Boolean,
    override val priceOverview: GamePriceOverviewRemote
): GameRemote
