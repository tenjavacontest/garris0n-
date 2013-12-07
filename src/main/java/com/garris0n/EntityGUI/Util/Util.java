package com.garris0n.EntityGUI.Util;

import com.garris0n.EntityGUI.GUI.GUIItemStack;
import com.garris0n.EntityGUI.GUI.Runnables.GUIRunnable;
import com.garris0n.EntityGUI.GUI.Runnables.NormalClickType;
import org.bukkit.ChatColor;
import org.bukkit.Material;
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
    public static boolean openInventoryMatches(Player player, String title, int size){

        return !player.getOpenInventory().getTopInventory().equals(player.getInventory()) &&
                player.getOpenInventory().getTopInventory().getType().equals(InventoryType.CHEST) &&
                player.getOpenInventory().getTopInventory().getTitle().equals(title) &&
                player.getOpenInventory().getTopInventory().getSize() == size;

    }

    /**
     * Simple method to capitalize the first letter of a string.
     *
     * @param string the string
     * @return the capitalized string
     */
    public static String capitalize(String string){

        char[] chars = string.toLowerCase().toCharArray();

        chars[0] = Character.toUpperCase(chars[0]);

        return new String(chars);

    }

    /**
     * Slightly less simple method to capitalize the first letter
     * of every word in a String.
     *
     * @param string the string
     * @return the capitalized string
     */
    public static String capitalizeAllWords(String string){

        if(!string.contains(" "))
            return capitalize(string);

        StringBuilder builder = new StringBuilder();

        String[] split = string.split(" ");

        for(String s : split)
            builder.append(" ").append(capitalize(string));

        return builder.substring(1);

    }

    /**
     * Gets a GuiItemStack for use as a border.
     *
     * @return a border item
     */
    public static GUIItemStack getBorderItem(){

        EZItemStack item = new EZItemStack(Material.WALL_SIGN).name(ChatColor.RESET.toString());

        return new GUIItemStack(item, new GUIRunnable(){

            @Override
            public void click(Player player, NormalClickType type, boolean shift){}

            @Override
            public void doubleClick(Player player){}

            @Override
            public void numberKeyClick(Player player, int key){}
        });

    }

}
