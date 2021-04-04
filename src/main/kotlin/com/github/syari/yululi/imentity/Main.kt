package com.github.syari.yululi.imentity

import com.github.syari.spigot.api.command.command
import com.github.syari.spigot.api.inventory.CustomInventory
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin

@Suppress("unused")
class Main : JavaPlugin() {
    companion object {
        internal lateinit var plugin: JavaPlugin
    }

    init {
        plugin = this
    }

    override fun onEnable() {
        CustomInventory.onEnable(this)
        command("d") {
            execute {
                (sender as? Player)?.let(DisguiseInventory::open)
            }
        }
    }
}
