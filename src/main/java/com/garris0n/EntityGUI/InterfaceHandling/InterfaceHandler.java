package com.garris0n.EntityGUI.InterfaceHandling;

import com.garris0n.EntityGUI.GUI.*;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class InterfaceHandler{

    private HashMap<String, Settings> settings = new HashMap<String, Settings>();
    private HashMap<String, PageType> pageTypes = new HashMap<String, PageType>();

    public void setSettings(Player player, Settings settingsToSet){

        settings.put(player.getName(), settingsToSet);

    }

    public void setPageType(Player player, PageType pageType){

        pageTypes.put(player.getName(), pageType);

    }

    public Settings getSettings(Player player){

        return settings.get(player.getName());

    }

    public PageType getPageType(Player player){

        return pageTypes.get(player.getName());

    }

    public void openMainMenu(Player player){

        GUISize size = GUISize.EXTRA_LARGE;
        GUIItemStack[] items = new GUIItemStack[size.getSize()];

        for(int i = 0; i < PageType.values().length; i++)
            items[i] = PageType.values()[i].getGuiItem();

        new EntityGUI(size, items, ChatColor.BOLD + "Main Menu").open(player);

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
