package com.garris0n.EntityGUI.InterfaceHandling;

import com.garris0n.EntityGUI.GUI.EntityGUI;
import com.garris0n.EntityGUI.InterfaceHandling.Items.PageType;
import org.bukkit.entity.Player;

public abstract class Page{

    public PageType item;

    public abstract EntityGUI getGUI();

    public abstract EntityGUI getGUI(Player player);

    public void openGUI(Player player){

        getGUI().open(player);

    }

}
