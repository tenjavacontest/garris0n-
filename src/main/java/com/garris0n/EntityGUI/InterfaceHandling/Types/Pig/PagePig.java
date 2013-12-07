package com.garris0n.EntityGUI.InterfaceHandling.Types.Pig;

import com.garris0n.EntityGUI.GUI.*;
import com.garris0n.EntityGUI.InterfaceHandling.Items.PageType;
import com.garris0n.EntityGUI.InterfaceHandling.Page;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PagePig extends Page{

    public PagePig(PageType item){

        this.item = item;

    }

    @Override
    public EntityGUI getGUI(){

        GUISize size = GUISize.EXTRA_LARGE;

        GUIItemStack[] items = new GUIItemStack[size.getSize()];

        return new EntityGUI(size, items, ChatColor.BOLD + "Pig Menu");

    }

    @Override
    public EntityGUI getGUI(Player player){

        return getGUI(); //TODO: actually do something here with settings

    }

}
