package com.garris0n.EntityGUI.GUI;

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



    }


}
