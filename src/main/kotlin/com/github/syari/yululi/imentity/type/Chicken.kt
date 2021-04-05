package com.github.syari.yululi.imentity.type

import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.potion.PotionEffectType

object Chicken : DisguiseEntityType {
    override val disguiseType = DisguiseType.CHICKEN
    override val health = 4.0
    override val potionEffects = mapOf<PotionEffectType, Int>(
        PotionEffectType.SLOW_FALLING to 0
    )
    override val damageMultiplier = mapOf<EntityDamageEvent.DamageCause, Double>()
    override val icon = Material.CHICKEN_SPAWN_EGG
    override val displayName = "ニワトリ"
    override val description = "落ちるのがゆっくりになる"
}
