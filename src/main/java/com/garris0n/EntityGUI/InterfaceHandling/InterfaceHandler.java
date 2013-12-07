package com.garris0n.EntityGUI.InterfaceHandling;

import com.garris0n.EntityGUI.GUI.*;
import com.garris0n.EntityGUI.InterfaceHandling.Items.MainMenuItem;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class InterfaceHandler{

    public void openMainMenu(Player player){

        GUISize size = GUISize.LARGE;
        GUIItemStack[] items = new GUIItemStack[size.getSize()];

        for(int i = 0; i < MainMenuItem.values().length; i++)
            items[i] = MainMenuItem.values()[i].getGuiItem();

        new EntityGUI(size, items, ChatColor.DARK_AQUA.toString() + ChatColor.BOLD + "EntityGUI Main Menu");

    }


}
