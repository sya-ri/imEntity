package com.github.syari.yululi.imentity.type

import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.potion.PotionEffectType

object Pig : DisguiseEntityType {
    override val disguiseType = DisguiseType.PIG
    override val health = 10.0
    override val potionEffects = mapOf<PotionEffectType, Int>()
    override val damageMultiplier = mapOf<EntityDamageEvent.DamageCause, Double>()
    override val icon = Material.PIG_SPAWN_EGG
    override val displayName = "ブタ"
    override val description = "豚だよね"
}
