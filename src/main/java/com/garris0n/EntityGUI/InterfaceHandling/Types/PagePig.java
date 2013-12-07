package com.garris0n.EntityGUI.InterfaceHandling.Types;

import com.garris0n.EntityGUI.GUI.*;
import com.garris0n.EntityGUI.GUI.Runnables.GUIRunnable;
import com.garris0n.EntityGUI.GUI.Runnables.NormalClickType;
import com.garris0n.EntityGUI.InterfaceHandling.Page;
import com.garris0n.EntityGUI.Util.EZItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class PagePig extends Page{


    @Override
    public EntityGUI getGUI(){

        GUISize size = GUISize.MEDIUM;

        return new EntityGUI(size, new GUIItemStack[size.getSize()], ChatColor.BOLD + "Pig Menu");

    }

    @Override
    public void openGUI(Player player){

        getGUI().open(player);

    }
}
