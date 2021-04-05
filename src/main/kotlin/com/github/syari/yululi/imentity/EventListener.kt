package com.github.syari.yululi.imentity

import com.github.syari.spigot.api.event.events
import com.github.syari.yululi.imentity.Main.Companion.plugin
import com.github.syari.yululi.imentity.type.DisguiseEntityType.Companion.disguiseEntityType
import org.bukkit.entity.Player
import org.bukkit.event.entity.EntityDamageEvent

object EventListener {
    fun register() {
        plugin.events {
            event<EntityDamageEvent> {
                val player = it.entity as? Player ?: return@event
                val disguiseEntityType = player.disguiseEntityType ?: return@event
                val damageMultiplier = disguiseEntityType.damageMultiplier[it.cause] ?: return@event
                it.damage *= damageMultiplier
            }
        }
    }
}
