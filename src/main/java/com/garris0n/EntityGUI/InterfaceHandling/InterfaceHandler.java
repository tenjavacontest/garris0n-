package com.garris0n.EntityGUI.InterfaceHandling;

import com.garris0n.EntityGUI.GUI.*;
import com.garris0n.EntityGUI.InterfaceHandling.Items.MainMenuItem;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class InterfaceHandler{

    public HashMap<String, Settings> settings = new HashMap<String, Settings>();

    public void openMainMenu(Player player){

        GUISize size = GUISize.LARGE;
        GUIItemStack[] items = new GUIItemStack[size.getSize()];

        for(int i = 0; i < MainMenuItem.values().length; i++)
            items[i] = MainMenuItem.values()[i].getGuiItem();

        new EntityGUI(size, items, ChatColor.BLUE.toString() + ChatColor.BOLD + "EntityGUI Main Menu").open(player);

    }

    public void reDraw(Player player){

        //TODO: redraw menu

    }


}
