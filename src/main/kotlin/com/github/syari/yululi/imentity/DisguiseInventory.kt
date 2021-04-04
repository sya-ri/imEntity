package com.github.syari.yululi.imentity

import com.github.syari.spigot.api.inventory.inventory
import com.github.syari.spigot.api.item.editItemMeta
import com.github.syari.spigot.api.item.itemStack
import com.github.syari.yululi.imentity.type.Bat
import com.github.syari.yululi.imentity.type.Chicken
import com.github.syari.yululi.imentity.type.Cow
import com.github.syari.yululi.imentity.type.DisguiseEntityType.Companion.disguiseEntityType
import com.github.syari.yululi.imentity.type.Pig
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.meta.SkullMeta

object DisguiseInventory {
    private val list = listOf(
        Bat,
        Chicken,
        Cow,
        Pig
    )

    fun open(player: Player) {
        inventory("&9&l変身するエンティティを選択") {
            val playerHead = itemStack(Material.PLAYER_HEAD, "&cプレイヤー") {
                editItemMeta<SkullMeta> {
                    owningPlayer = player
                }
            }
            item(0, playerHead) {
                onClick {
                    player.disguiseEntityType = null
                }
            }
            list.forEachIndexed { index, type ->
                item(1 + index, type.icon, "&6" + type.displayName, type.lore.lines()) {
                    onClick {
                        player.disguiseEntityType = type
                        player.closeInventory()
                    }
                }
            }
        }.open(player)
    }
}
