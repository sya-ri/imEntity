package com.github.syari.yululi.imentity.type

import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.potion.PotionEffectType

object Cow : DisguiseEntityType {
    override val disguiseType = DisguiseType.COW
    override val health = 10.0
    override val potionEffects = mapOf<PotionEffectType, Int>()
    override val icon = Material.COW_SPAWN_EGG
    override val displayName = "ウシ"
    override val description = "牛でしかない"
}
