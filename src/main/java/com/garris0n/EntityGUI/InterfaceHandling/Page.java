package com.garris0n.EntityGUI.InterfaceHandling;

import com.garris0n.EntityGUI.GUI.EntityGUI;
import com.garris0n.EntityGUI.GUI.GUIItemStack;
import com.garris0n.EntityGUI.InterfaceHandling.Items.MainMenuItem;
import org.bukkit.entity.Player;

public abstract class Page{

    public abstract EntityGUI getGUI();

    public abstract void openGUI(Player player);

}
