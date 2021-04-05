package com.github.syari.yululi.imentity.type

import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.potion.PotionEffectType

object Cat : DisguiseEntityType {
    override val disguiseType = DisguiseType.CAT
    override val health = 10.0
    override val potionEffects = mapOf<PotionEffectType, Int>()
    override val damageMultiplier = mapOf(
        EntityDamageEvent.DamageCause.FALL to 0.0
    )
    override val icon = Material.CAT_SPAWN_EGG
    override val displayName = "ネコ"
    override val description = "落ちても痛くない"
}
