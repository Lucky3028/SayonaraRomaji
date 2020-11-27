package click.seichi.sayonararomaji

import click.seichi.sayonararomaji.SayonaraRomaji.Companion.PLUGIN
import net.md_5.bungee.api.ProxyServer
import net.md_5.bungee.api.connection.ProxiedPlayer
import net.md_5.bungee.api.event.ChatEvent
import net.md_5.bungee.api.plugin.Listener
import net.md_5.bungee.event.EventHandler

class ChatEventListener : Listener {
    @EventHandler
    fun onPlayerChat(event: ChatEvent) {
        if (event.isCancelled || event.isCommand || event.sender !is ProxiedPlayer) return

        val serverInstance = ProxyServer.getInstance() ?: return
        serverInstance.scheduler.runAsync(PLUGIN) {
            serverInstance.logger.info("Player chatted: ${event.message}")
        }

        event.isCancelled = true
    }

    private fun japanize() {

    }
}