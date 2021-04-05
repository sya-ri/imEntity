package com.github.syari.yululi.imentity.type

import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.potion.PotionEffectType

object Panda : DisguiseEntityType {
    override val disguiseType = DisguiseType.PANDA
    override val health = 20.0
    override val potionEffects = mapOf<PotionEffectType, Int>()
    override val damageMultiplier = mapOf<EntityDamageEvent.DamageCause, Double>()
    override val icon = Material.PANDA_SPAWN_EGG
    override val displayName = "パンダ"
    override val description = "かわいい"
}
