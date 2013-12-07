package com.garris0n.EntityGUI.GUI.Runnables;

import org.bukkit.entity.Player;

public interface GUIRunnable{

    /**
     * Called on a left click.
     *
     * @param player the player
     * @param shift true if this click was a shift click, false otherwise
     */
    public void leftClick(Player player, boolean shift);

    /**
     * Called on a right click.
     *
     * @param player the player
     * @param shift true if this click was a shift click, false otherwise
     */
    public void rightClick(Player player, boolean shift);

    /**
     * Called on a double click.
     * NOTE: Do not use this in conjunction with a left click;
     * the left click is always fired before a double click.
     *
     * @param player the player
     */
    public void doubleClick(Player player);

    /**
     * Called on a number key (hotbar) click.
     * The key is 0-8.
     *
     * @param player the player
     * @param key the key
     */
    public void numberKeyClick(Player player, int key);


}
