package com.github.syari.yululi.imentity.type

import com.github.syari.spigot.api.uuid.UUIDPlayer
import me.libraryaddict.disguise.DisguiseAPI
import me.libraryaddict.disguise.disguisetypes.DisguiseType
import me.libraryaddict.disguise.disguisetypes.MobDisguise
import org.bukkit.Material
import org.bukkit.attribute.Attribute
import org.bukkit.entity.Player
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

interface DisguiseEntityType {
    val disguiseType: DisguiseType
    val health: Double
    val potionEffects: Map<PotionEffectType, Int>
    val damageMultiplier: Map<EntityDamageEvent.DamageCause, Double>
    val icon: Material
    val displayName: String
    val description: String
    val lore
        get() = """
            &a$description
            
            &6体力: &c${"||".repeat(health.toInt())}
        """.trimIndent()

    fun init(player: Player) {
        DisguiseAPI.disguiseEntity(player, MobDisguise(disguiseType))
        player.getAttribute(Attribute.GENERIC_MAX_HEALTH)?.baseValue = health
        potionEffects.forEach { (type, level) ->
            player.addPotionEffect(PotionEffect(type, Int.MAX_VALUE, level, false, false, true))
        }
    }

    fun deinit(player: Player) {
        DisguiseAPI.undisguiseToAll(player)
        player.getAttribute(Attribute.GENERIC_MAX_HEALTH)?.baseValue = 20.0
        potionEffects.keys.forEach(player::removePotionEffect)
    }

    companion object {
        private val disguiseEntityTypes = mutableMapOf<UUIDPlayer, DisguiseEntityType>()

        var Player.disguiseEntityType
            get() = disguiseEntityTypes[UUIDPlayer.from(this)]
            set(value) {
                val uuidPlayer = UUIDPlayer.from(this)
                disguiseEntityTypes[uuidPlayer]?.let {
                    if (value == it) return
                    disguiseEntityTypes.remove(uuidPlayer)
                    it.deinit(this)
                }
                if (value != null) {
                    value.init(this)
                    disguiseEntityTypes[uuidPlayer] = value
                }
            }
    }
}
