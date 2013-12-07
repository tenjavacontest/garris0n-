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

public class SettingsAgeable extends Settings{

    private boolean baby;

    public void setBaby(boolean baby){

        this.baby = baby;

    }

    public boolean getBaby(){

        return baby;

    }

    @Override
    public void draw(GUIItemStack[] items){

        super.draw(items);
        items[18] = new GUIItemStack(new EZItemStack(Material.WHEAT)
                .name(Util.redGreen(baby) + "Baby")
                .lore(ChatColor.DARK_PURPLE + "Click to toggle."),
                new GUIRunnable(){

                    @Override
                    public void click(Player player, NormalClickType type, boolean shift){

                        if(Main.interfaceHandler.settings.containsKey(player.getName())){

                            ((SettingsAgeable)  Main.interfaceHandler.settings.get(player.getName())).setBaby(!getBaby());
                            Main.interfaceHandler.reDraw(player);

                        }

                    }

                    @Override
                    public void doubleClick(Player player){}

                    @Override
                    public void numberKeyClick(Player player, int key){}
                });

    }

}