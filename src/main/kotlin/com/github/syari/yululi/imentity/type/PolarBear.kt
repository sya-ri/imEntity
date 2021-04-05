package com.github.syari.yululi.imentity.type

import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.potion.PotionEffectType

object PolarBear : DisguiseEntityType {
    override val disguiseType = DisguiseType.POLAR_BEAR
    override val health = 30.0
    override val potionEffects = mapOf<PotionEffectType, Int>()
    override val damageMultiplier = mapOf<EntityDamageEvent.DamageCause, Double>()
    override val icon = Material.POLAR_BEAR_SPAWN_EGG
    override val displayName = "シロクマ"
    override val description = "かわいい"
}
