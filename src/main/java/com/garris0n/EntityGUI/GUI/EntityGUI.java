package com.garris0n.EntityGUI.GUI;

import com.garris0n.EntityGUI.Main;
import com.garris0n.EntityGUI.Util.Util;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
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
     * Dispatches a click to its appropriate item.
     *
     * @param event the click event
     */
    public void click(InventoryClickEvent event){

        if(event.getSlot() != event.getRawSlot()) //make sure the click was in the "top" inventory
            return;

        event.setCancelled(true);

        if(items[event.getSlot()] == null)
            return;

        items[event.getSlot()].click((Player) event.getWhoClicked(), event.getClick(), event.getHotbarButton());

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
                if(items[i] != null)
                    inventory.setItem(i, items[i].getItemStack());

        return inventory;

    }

    /**
     * Opens this GUI to a player,
     *
     * @param player the player
     */
    public void open(Player player){

        if(Util.openInventoryMatches(player, title, size.getSize())){

            openInside(player);
            return;

        }

        player.openInventory(getInventory());
        Main.guiHandler.menuOpened(player, this);

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
                if(items[i] != null)
                    inventory.setItem(i, items[i].getItemStack());

        Main.guiHandler.menuOpened(player, this);

    }


}