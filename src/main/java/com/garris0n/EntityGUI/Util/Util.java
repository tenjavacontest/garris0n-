package com.garris0n.EntityGUI.Util;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;

/**
 * Static Util class.
 */
public class Util{

    /**
     * Does a check to see if we can just open in the current inventory or if we have to make a new one.
     *
     * @param player the player
     * @param title the title of the inventory to be opened
     * @return
     */
    public static boolean openInventoryMatches(Player player, String title){

        return !player.getOpenInventory().getTopInventory().equals(player.getInventory()) &&
                player.getOpenInventory().getTopInventory().getType().equals(InventoryType.CHEST) &&
                player.getOpenInventory().getTopInventory().getTitle().equals(title);

    }


}
