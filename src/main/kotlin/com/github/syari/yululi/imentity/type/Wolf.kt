package com.github.syari.yululi.imentity.type

import com.github.syari.spigot.api.event.events
import com.github.syari.yululi.imentity.Main.Companion.plugin
import com.github.syari.yululi.imentity.type.DisguiseEntityType.Companion.disguiseEntityType
import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.entity.EntityType
import org.bukkit.entity.Player
import org.bukkit.event.entity.EntityDamageByEntityEvent
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.potion.PotionEffectType

object Wolf : DisguiseEntityType {
    override val disguiseType = DisguiseType.WOLF
    override val health = 8.0
    override val potionEffects = mapOf<PotionEffectType, Int>()
    override val damageMultiplier = mapOf<EntityDamageEvent.DamageCause, Double>()
    override val icon = Material.WOLF_SPAWN_EGG
    override val displayName = "オオカミ"
    override val description = "スケルトンに強い"

    fun registerEvents() {
        plugin.events {
            event<EntityDamageByEntityEvent> {
                val attacker = it.damager as? Player ?: return@event
                if (attacker.disguiseEntityType == Wolf && it.entityType == EntityType.SKELETON) {
                    it.damage *= 2.0
                }
            }
        }
    }
}
