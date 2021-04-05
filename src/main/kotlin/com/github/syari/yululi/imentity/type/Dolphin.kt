package com.github.syari.yululi.imentity.type

import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.potion.PotionEffectType

object Dolphin : DisguiseEntityType {
    override val disguiseType = DisguiseType.DOLPHIN
    override val health = 10.0
    override val potionEffects = mapOf(
        PotionEffectType.DOLPHINS_GRACE to 0
    )
    override val damageMultiplier = mapOf<EntityDamageEvent.DamageCause, Double>()
    override val icon = Material.DOLPHIN_SPAWN_EGG
    override val displayName = "イルカ"
    override val description = "自分が好き"
}
