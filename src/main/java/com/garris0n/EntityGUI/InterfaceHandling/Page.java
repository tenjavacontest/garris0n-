package com.garris0n.EntityGUI.InterfaceHandling;

import com.garris0n.EntityGUI.GUI.*;
import com.garris0n.EntityGUI.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Page{


    public String getInventoryTitle(){

        return ChatColor.BOLD + "Entity Menu";

    }

    public EntityGUI getGUI(Player player){

        if(!Main.interfaceHandler.settings.containsKey(player.getName()))
            return null;

        GUISize size = GUISize.EXTRA_LARGE;

        GUIItemStack[] items = new GUIItemStack[size.getSize()];

        Main.interfaceHandler.settings.get(player.getName()).draw(items);

        return new EntityGUI(size, items, getInventoryTitle());

    }

    public void openGUI(Player player){

        getGUI(player).open(player);

    }

}
