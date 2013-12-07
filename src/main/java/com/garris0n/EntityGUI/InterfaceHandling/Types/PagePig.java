package com.garris0n.EntityGUI.InterfaceHandling.Types;

import com.garris0n.EntityGUI.GUI.*;
import com.garris0n.EntityGUI.InterfaceHandling.Items.MainMenuItem;
import com.garris0n.EntityGUI.InterfaceHandling.Page;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PagePig extends Page{

    public PagePig(MainMenuItem item){

        this.item = item;

    }

    @Override
    public EntityGUI getGUI(){

        GUISize size = GUISize.EXTRA_LARGE;

        GUIItemStack[] items = new GUIItemStack[size.getSize()];
        addHotbar(items);

        return new EntityGUI(size, items, ChatColor.BOLD + "Pig Menu");

    }

    @Override
    public void openGUI(Player player){

        getGUI().open(player);

    }
}
