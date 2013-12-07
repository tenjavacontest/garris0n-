package com.garris0n.EntityGUI.InterfaceHandling;

import com.garris0n.EntityGUI.GUI.*;
import com.garris0n.EntityGUI.InterfaceHandling.Items.PageType;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class InterfaceHandler{

    public HashMap<String, Settings> settings = new HashMap<String, Settings>();
    public HashMap<String, PageType> pageTypes = new HashMap<String, PageType>();

    public void openMainMenu(Player player){

        GUISize size = GUISize.LARGE;
        GUIItemStack[] items = new GUIItemStack[size.getSize()];

        for(int i = 0; i < PageType.values().length; i++)
            items[i] = PageType.values()[i].getGuiItem();

        new EntityGUI(size, items, ChatColor.BLUE.toString() + ChatColor.BOLD + "EntityGUI Main Menu").open(player);

    }

    public void reDraw(Player player){

        if(!pageTypes.containsKey(player.getName())){

            player.sendMessage(ChatColor.RED + "Error: type not found.");
            player.closeInventory();
            return;

        }

        pageTypes.get(player.getName()).getPage().getGUI(player).open(player);

    }


}
