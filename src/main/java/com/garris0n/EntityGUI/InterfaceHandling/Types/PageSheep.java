package com.garris0n.EntityGUI.InterfaceHandling.Types;

import com.garris0n.EntityGUI.GUI.*;
import com.garris0n.EntityGUI.InterfaceHandling.Items.MainMenuItem;
import com.garris0n.EntityGUI.InterfaceHandling.Page;
import org.bukkit.ChatColor;

public class PageSheep extends Page{

    public PageSheep(MainMenuItem item){

        this.item = item;

    }

    @Override
    public EntityGUI getGUI(){

        GUISize size = GUISize.EXTRA_LARGE;

        GUIItemStack[] items = new GUIItemStack[size.getSize()];
        addHotbar(items);

        return new EntityGUI(size, items, ChatColor.BOLD + "Sheep Menu");

    }
}
