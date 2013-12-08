package com.garris0n.EntityGUI.InterfaceHandling;

import com.garris0n.EntityGUI.GUI.GUIItemStack;
import com.garris0n.EntityGUI.GUI.Runnables.GUIRunnable;
import com.garris0n.EntityGUI.GUI.Runnables.NormalClickType;
import com.garris0n.EntityGUI.Main;
import com.garris0n.EntityGUI.Util.EZItemStack;
import com.garris0n.EntityGUI.Util.Util;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class Settings{

    private int amountToSpawn = 1;
    private boolean fire = false;

    public boolean getFire(){

        return fire;

    }

    public void setFire(boolean fire){

        this.fire = fire;

    }

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

        items[18] = new GUIItemStack(new EZItemStack(Material.FIRE)
                .name(Util.redGreen(fire) + "Flaming")
                .lore(ChatColor.DARK_PURPLE + "Click to toggle."),
                new GUIRunnable(){

                    @Override
                    public void click(Player player, NormalClickType type, boolean shift){

                        if(Main.interfaceHandler.getSettings(player) != null)
                            Main.interfaceHandler.getSettings(player).setFire(!Main.interfaceHandler.getSettings(player).getFire());
                        Main.interfaceHandler.reDraw(player);

                    }

                    @Override
                    public void doubleClick(Player player){}

                    @Override
                    public void numberKeyClick(Player player, int key){}
                });

    }

}
