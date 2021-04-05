package com.github.syari.yululi.imentity.type

import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.potion.PotionEffectType

object Llama : DisguiseEntityType {
    override val disguiseType = DisguiseType.LLAMA
    override val health = 22.0
    override val potionEffects = mapOf<PotionEffectType, Int>()
    override val damageMultiplier = mapOf<EntityDamageEvent.DamageCause, Double>()
    override val icon = Material.LLAMA_SPAWN_EGG
    override val displayName = "ラマ"
    override val description = "ちょっとかわいい"
}
