package com.garris0n.EntityGUI.InterfaceHandling;

import com.garris0n.EntityGUI.GUI.GUIItemStack;
import com.garris0n.EntityGUI.InterfaceHandling.Items.PageHotbarItem;
import com.garris0n.EntityGUI.Util.Util;

public class Settings{

    private int amountToSpawn = 0;

    public int getAmountToSpawn(){

        return amountToSpawn;

    }

    public void setAmountToSpawn(int amountToSpawn){

        this.amountToSpawn = amountToSpawn;

    }

    public void draw(GUIItemStack[] items){

        for(int i = 0; i < 18; i++)
            items[i] = Util.getBorderItem();

        items[0] = PageHotbarItem.DELETE.getGuiItem();

    }

}
