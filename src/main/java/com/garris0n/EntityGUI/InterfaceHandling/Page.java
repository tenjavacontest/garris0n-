package com.garris0n.EntityGUI.InterfaceHandling;

import com.garris0n.EntityGUI.GUI.EntityGUI;
import com.garris0n.EntityGUI.GUI.GUIItemStack;
import com.garris0n.EntityGUI.InterfaceHandling.Items.MainMenuItem;
import com.garris0n.EntityGUI.Util.EZItemStack;
import com.garris0n.EntityGUI.Util.Util;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public abstract class Page{

    public MainMenuItem item;

    public abstract EntityGUI getGUI();

    public abstract void openGUI(Player player);

    public void addHotbar(GUIItemStack[] items){

        for(int i = 9; i < 18; i++)
            items[i] = Util.getBorderItem();

        items[0] = new GUIItemStack()

    }

}
