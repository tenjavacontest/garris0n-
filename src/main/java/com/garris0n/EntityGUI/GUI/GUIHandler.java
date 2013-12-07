package com.garris0n.EntityGUI.GUI;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

import java.util.HashMap;

public class GUIHandler implements Listener{

    public HashMap<String, EntityGUI> guiPlayers = new HashMap<String, EntityGUI>();

    public void menuOpened(Player player, EntityGUI gui){

        guiPlayers.put(player.getName(), gui);

    }

    public void menuClosed(Player player){

        guiPlayers.remove(player.getName());

    }

    @EventHandler
    public void onClose(InventoryCloseEvent event){

        menuClosed((Player) event.getPlayer());

    }


}
