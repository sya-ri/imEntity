package com.github.syari.yululi.imentity.type

import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.potion.PotionEffectType

object Sheep : DisguiseEntityType {
    override val disguiseType = DisguiseType.SHEEP
    override val health = 8.0
    override val potionEffects = mapOf<PotionEffectType, Int>()
    override val damageMultiplier = mapOf(
        EntityDamageEvent.DamageCause.FIRE to 2.0
    )
    override val icon = Material.SHEEP_SPAWN_EGG
    override val displayName = "ヒツジ"
    override val description = "毛が燃えれば痛いよね"
}
