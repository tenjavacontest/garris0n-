package com.garris0n.EntityGUI.InterfaceHandling;

import com.garris0n.EntityGUI.GUI.GUIItemStack;
import com.garris0n.EntityGUI.InterfaceHandling.Items.PageHotbarItem;
import com.garris0n.EntityGUI.Util.Util;
import org.bukkit.ChatColor;

public class Settings{

    private int amountToSpawn = 1;

    public int getAmountToSpawn(){

        return amountToSpawn;

    }

    public void setAmountToSpawn(int amountToSpawn){

        this.amountToSpawn = amountToSpawn;

        if(this.amountToSpawn > 1000) //cap to prevent...excessiveness
            this.amountToSpawn = 1000;

        if(this.amountToSpawn < 1)
            this.amountToSpawn = 1;

    }

    public void draw(GUIItemStack[] items){

        for(int i = 0; i < 18; i++)
            items[i] = Util.getBorderItem();

        items[0] = PageHotbarItem.DELETE.getGuiItem();

        items[1] = PageHotbarItem.SPAWN.getGuiItem(ChatColor.GRAY + "Spawn Amount: " + ChatColor.DARK_GRAY + getAmountToSpawn());

        items[4] = PageHotbarItem.DOWN_TEN.getGuiItem(ChatColor.GRAY + "Spawn Amount: " + ChatColor.DARK_GRAY + getAmountToSpawn());
        items[5] = PageHotbarItem.DOWN_ONE.getGuiItem(ChatColor.GRAY + "Spawn Amount: " + ChatColor.DARK_GRAY + getAmountToSpawn());
        items[7] = PageHotbarItem.UP_ONE.getGuiItem(ChatColor.GRAY + "Spawn Amount: " + ChatColor.DARK_GRAY + getAmountToSpawn());
        items[8] = PageHotbarItem.UP_TEN.getGuiItem(ChatColor.GRAY + "Spawn Amount: " + ChatColor.DARK_GRAY + getAmountToSpawn());

    }

}
