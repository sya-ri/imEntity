package com.github.syari.yululi.imentity.type

import com.github.syari.spigot.api.event.events
import com.github.syari.yululi.imentity.Main.Companion.plugin
import com.github.syari.yululi.imentity.type.DisguiseEntityType.Companion.disguiseEntityType
import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.event.player.PlayerItemConsumeEvent
import org.bukkit.potion.PotionEffectType

object Parrot : DisguiseEntityType {
    override val disguiseType = DisguiseType.PARROT
    override val health = 6.0
    override val potionEffects = mapOf(
        PotionEffectType.SLOW_FALLING to 0,
        PotionEffectType.JUMP to 2
    )
    override val damageMultiplier = mapOf<EntityDamageEvent.DamageCause, Double>()
    override val icon = Material.PARROT_SPAWN_EGG
    override val displayName = "オウム"
    override val description = "ちょっとだけ飛べるが、クッキーを食べると死ぬ"

    fun registerEvents() {
        plugin.events {
            event<PlayerItemConsumeEvent> {
                if (it.player.disguiseEntityType == Parrot && it.item.type == Material.COOKIE) {
                    it.player.health = 0.0
                }
            }
        }
    }
}
