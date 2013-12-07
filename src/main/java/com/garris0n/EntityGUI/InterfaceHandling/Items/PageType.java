package com.garris0n.EntityGUI.InterfaceHandling.Items;

import com.garris0n.EntityGUI.GUI.GUIItemStack;
import com.garris0n.EntityGUI.GUI.Runnables.GUIRunnable;
import com.garris0n.EntityGUI.GUI.Runnables.NormalClickType;
import com.garris0n.EntityGUI.InterfaceHandling.Page;
import com.garris0n.EntityGUI.InterfaceHandling.Types.Cow.PageCow;
import com.garris0n.EntityGUI.InterfaceHandling.Types.Pig.PagePig;
import com.garris0n.EntityGUI.InterfaceHandling.Types.Sheep.PageSheep;
import com.garris0n.EntityGUI.Util.EZItemStack;
import com.garris0n.EntityGUI.Util.Util;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public enum PageType{

    PIG(new PagePig(this), EntityType.PIG),
    COW(new PageCow(this), EntityType.COW),
    SHEEP(new PageSheep(this), EntityType.SHEEP);


    private Page page;
    private EntityType type;

    PageType(Page page, EntityType type){

        this.page = page;
        this.type = type;

    }

    public Page getPage(){

        return this.page;

    }

    public GUIItemStack getGuiItem(){

        EZItemStack item = new EZItemStack(Material.MONSTER_EGG, 1, type.getTypeId()).name(ChatColor.AQUA + Util.capitalizeAllWords(type.toString()));

        GUIRunnable runnable = new GUIRunnable(){

            @Override
            public void click(Player player, NormalClickType type, boolean shift){

                getPage().openGUI(player);

            }

            @Override
            public void doubleClick(Player player){}

            @Override
            public void numberKeyClick(Player player, int key){}

        };

        return new GUIItemStack(item, runnable);

    }

}
