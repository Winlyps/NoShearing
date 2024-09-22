package winlyps.noShearing

import org.bukkit.plugin.java.JavaPlugin

class NoShearing : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(ShearingListener(this), this)
        logger.info("NoShearing plugin has been enabled.")
    }

    override fun onDisable() {
        logger.info("NoShearing plugin has been disabled.")
    }
}