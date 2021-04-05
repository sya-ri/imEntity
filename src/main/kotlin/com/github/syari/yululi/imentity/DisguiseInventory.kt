package com.github.syari.yululi.imentity

import com.github.syari.spigot.api.inventory.inventory
import com.github.syari.spigot.api.item.editItemMeta
import com.github.syari.spigot.api.item.itemStack
import com.github.syari.yululi.imentity.type.* // ktlint-disable no-wildcard-imports
import com.github.syari.yululi.imentity.type.DisguiseEntityType.Companion.disguiseEntityType
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.meta.SkullMeta

object DisguiseInventory {
    private val list = listOf(
        Bat,
        Cat,
        Chicken,
        Cow,
        Dolphin,
        Fox,
        Horse,
        Llama,
        Panda,
        Parrot,
        Pig,
        PolarBear,
        Rabbit,
        Sheep,
        Squid,
        Turtle,
        Wolf
    )

    fun open(player: Player) {
        inventory("&9&l変身するエンティティを選択", 2) {
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
