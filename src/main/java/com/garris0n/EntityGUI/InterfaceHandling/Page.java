package com.garris0n.EntityGUI.InterfaceHandling;

import com.garris0n.EntityGUI.GUI.*;
import com.garris0n.EntityGUI.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public abstract class Page{

    public abstract void spawn(Player player);

    public abstract String getInventoryTitle();

    public EntityGUI getGUI(Player player){

        if(Main.interfaceHandler.getSettings(player) == null)
            return null;

        GUISize size = GUISize.EXTRA_LARGE;

        GUIItemStack[] items = new GUIItemStack[size.getSize()];

        Main.interfaceHandler.getSettings(player).draw(items);

        return new EntityGUI(size, items, getInventoryTitle());

    }

    public void openGUI(Player player){

        getGUI(player).open(player);

    }

}
