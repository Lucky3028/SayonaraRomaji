package click.seichi.sayonararomaji

import net.md_5.bungee.api.plugin.Plugin

class SayonaraRomaji : Plugin() {
    companion object {
        lateinit var PLUGIN: SayonaraRomaji
            private set
    }

    override fun onEnable() {
        PLUGIN = this

        proxy.pluginManager.registerListener(this, ChatEventListener())
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}