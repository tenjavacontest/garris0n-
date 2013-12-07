package com.garris0n.EntityGUI.InterfaceHandling;

import com.garris0n.EntityGUI.GUI.EntityGUI;
import com.garris0n.EntityGUI.GUI.GUIItemStack;
import com.garris0n.EntityGUI.InterfaceHandling.Items.MainMenuItem;
import com.garris0n.EntityGUI.InterfaceHandling.Items.PageHotbarItem;
import com.garris0n.EntityGUI.Util.Util;
import org.bukkit.entity.Player;

public abstract class Page{

    public MainMenuItem item;

    public abstract EntityGUI getGUI();

    public abstract EntityGUI getGUI(Player player);

    public void openGUI(Player player){

        getGUI().open(player);

    }

}
