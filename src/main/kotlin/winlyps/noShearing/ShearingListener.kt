package winlyps.noShearing

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerShearEntityEvent
import org.bukkit.plugin.Plugin

class ShearingListener(private val plugin: Plugin) : Listener {

    @EventHandler
    fun onPlayerShearEntity(event: PlayerShearEntityEvent) {
        // Cancel the shearing event
        event.isCancelled = true
    }
}