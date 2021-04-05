package com.github.syari.yululi.imentity.type

import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.potion.PotionEffectType

object Squid : DisguiseEntityType {
    override val disguiseType = DisguiseType.SQUID
    override val health = 10.0
    override val potionEffects = mapOf(
        PotionEffectType.WATER_BREATHING to 0,
        PotionEffectType.BLINDNESS to 0
    )
    override val damageMultiplier = mapOf<EntityDamageEvent.DamageCause, Double>()
    override val icon = Material.SQUID_SPAWN_EGG
    override val displayName = "イカ"
    override val description = "水中でも呼吸することができるが、スミで周りが見えない"
}
