package com.github.syari.yululi.imentity.type

import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.potion.PotionEffectType

object Rabbit : DisguiseEntityType {
    override val disguiseType = DisguiseType.RABBIT
    override val health = 3.0
    override val potionEffects = mapOf(
        PotionEffectType.JUMP to 1
    )
    override val damageMultiplier = mapOf<EntityDamageEvent.DamageCause, Double>()
    override val icon = Material.RABBIT_SPAWN_EGG
    override val displayName = "ウサギ"
    override val description = "高く跳ぶことができる"
}
