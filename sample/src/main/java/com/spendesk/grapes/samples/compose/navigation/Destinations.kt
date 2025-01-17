package com.spendesk.grapes.samples.compose.navigation

import kotlinx.serialization.Serializable

/**
 * @author Kélian CLERC
 * @since 17/01/2025
 */
sealed class Destinations {
    @Serializable
    object Home : Destinations()

    @Serializable
    object Buttons : Destinations()

    @Serializable
    object Cards : Destinations()

    @Serializable
    object Colors : Destinations()

    @Serializable
    object Controls : Destinations()

    @Serializable
    object Gauge : Destinations()

    @Serializable
    object Header : Destinations()

    @Serializable
    object Icons : Destinations()

    @Serializable
    object Inputs : Destinations()

    @Serializable
    object Lists : Destinations()

    @Serializable
    object Messaging : Destinations()

    @Serializable
    object Modal : Destinations()

    @Serializable
    object Navigation : Destinations()

    @Serializable
    object Shape : Destinations()

    @Serializable
    object Spacing : Destinations()

    @Serializable
    object Typography : Destinations()
}
