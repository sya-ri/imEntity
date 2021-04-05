package com.github.syari.yululi.imentity.type

import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.potion.PotionEffectType

object Turtle : DisguiseEntityType {
    override val disguiseType = DisguiseType.TURTLE
    override val health = 30.0
    override val potionEffects = mapOf(
        PotionEffectType.WATER_BREATHING to 0,
        PotionEffectType.SLOW to 3
    )
    override val damageMultiplier = mapOf<EntityDamageEvent.DamageCause, Double>()
    override val icon = Material.TURTLE_SPAWN_EGG
    override val displayName = "カメ"
    override val description = "水でも生活できるが、歩くのが遅い"
}
