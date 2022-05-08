package dk.colle.steamproject.startscreen.domain

import dk.colle.steamproject.startscreen.domain.interfaces.Game

data class GameImpl(
    override val name: String,
    override val id: String
): Game