package com.github.syari.yululi.imentity.type

import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.potion.PotionEffectType

object Fox : DisguiseEntityType {
    override val disguiseType = DisguiseType.FOX
    override val health = 10.0
    override val potionEffects = mapOf<PotionEffectType, Int>()
    override val damageMultiplier = mapOf<EntityDamageEvent.DamageCause, Double>()
    override val icon = Material.TURTLE_SPAWN_EGG
    override val displayName = "キツネ"
    override val description = "かわいい"
}
