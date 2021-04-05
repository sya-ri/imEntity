package com.github.syari.yululi.imentity.type

import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.potion.PotionEffectType

object Horse : DisguiseEntityType {
    override val disguiseType = DisguiseType.HORSE
    override val health = 15.0
    override val potionEffects = mapOf(
        PotionEffectType.SPEED to 0,
        PotionEffectType.JUMP to 0
    )
    override val damageMultiplier = mapOf<EntityDamageEvent.DamageCause, Double>()
    override val icon = Material.HORSE_SPAWN_EGG
    override val displayName = "ウマ"
    override val description = "速く走れ、高く跳べる"
}
