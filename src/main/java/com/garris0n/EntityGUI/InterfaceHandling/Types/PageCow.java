package com.garris0n.EntityGUI.InterfaceHandling.Types;

import com.garris0n.EntityGUI.GUI.*;
import com.garris0n.EntityGUI.InterfaceHandling.Items.MainMenuItem;
import com.garris0n.EntityGUI.InterfaceHandling.Page;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PageCow extends Page{

    public PageCow(MainMenuItem item){

        this.item = item;

    }

    @Override
    public EntityGUI getGUI(){

        GUISize size = GUISize.EXTRA_LARGE;

        return new EntityGUI(size, new GUIItemStack[size.getSize()], ChatColor.BOLD + "Cow Menu");

    }

}
