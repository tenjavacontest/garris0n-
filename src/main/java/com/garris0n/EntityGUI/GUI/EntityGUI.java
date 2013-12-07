package com.garris0n.EntityGUI.GUI;

import com.garris0n.EntityGUI.Main;
import com.garris0n.EntityGUI.Util.Util;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class EntityGUI{

    private GUISize size;
    private GUIItemStack[] items;
    private String title;

    public EntityGUI(GUISize size, GUIItemStack[] items, String title){

        if(title.length() > 32)
            throw new IllegalArgumentException("Title of EntityGUi is too long.");

        this.size = size;
        this.items = items;
        this.title = title;

    }

    /**
     * Gets the inventory for this EntityGUI.
     *
     * @return the inventory
     */
    public Inventory getInventory(){

        Inventory inventory = Bukkit.getServer().createInventory(null, size.getSize(), title);

        for(int i = 0; i < size.getSize(); i++)
            if(items.length > i)
                inventory.setItem(i, items[i].getItemStack());

        return inventory;

    }

    /**
     * Opens this GUI to a player,
     *
     * @param player the player
     */
    public void open(Player player){

        Main.handler.menuOpened(player, this);

        if(Util.openInventoryMatches(player, title, size.getSize())){

            openInside(player);
            return;

        }

        player.openInventory(getInventory());

    }

    /**
     * We use this method because opening the inventory resets your cursor and is annoying.
     * This allows us to, in some cases, open inside their current inventory, which
     * is more smooth.
     *
     * @param player the player
     */
    private void openInside(Player player){

        Inventory inventory = player.getOpenInventory().getTopInventory();

        for(int i = 0; i < size.getSize(); i++)
            if(items.length > i)
                inventory.setItem(i, items[i].getItemStack());

    }


}




















