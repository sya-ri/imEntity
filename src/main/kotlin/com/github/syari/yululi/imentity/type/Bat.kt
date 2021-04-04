package com.github.syari.yululi.imentity.type

import me.libraryaddict.disguise.disguisetypes.DisguiseType
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.potion.PotionEffectType

object Bat : DisguiseEntityType {
    override val disguiseType = DisguiseType.BAT
    override val health = 6.0
    override val potionEffects = mapOf(
        PotionEffectType.NIGHT_VISION to 0
    )
    override val icon = Material.BAT_SPAWN_EGG
    override val displayName = "コウモリ"
    override val description = "空を飛ぶことができ、夜でも周りがよく見える"

    override fun init(player: Player) {
        super.init(player)
        player.allowFlight = true
    }

    override fun deinit(player: Player) {
        super.deinit(player)
        player.allowFlight = false
    }
}
