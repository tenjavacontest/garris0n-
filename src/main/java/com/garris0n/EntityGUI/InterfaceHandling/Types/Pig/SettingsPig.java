package com.garris0n.EntityGUI.InterfaceHandling.Types.Pig;

import com.garris0n.EntityGUI.GUI.GUIItemStack;
import com.garris0n.EntityGUI.GUI.Runnables.GUIRunnable;
import com.garris0n.EntityGUI.GUI.Runnables.NormalClickType;
import com.garris0n.EntityGUI.InterfaceHandling.SettingsAgeable;
import com.garris0n.EntityGUI.Main;
import com.garris0n.EntityGUI.Util.EZItemStack;
import com.garris0n.EntityGUI.Util.Util;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class SettingsPig extends SettingsAgeable{

    private boolean saddle;

    public boolean getSaddle(){

        return saddle;

    }

    public void setSaddle(boolean saddle){

        this.saddle = saddle;

    }

    @Override
    public void draw(GUIItemStack[] items){

        super.draw(items);

        items[20] = new GUIItemStack(new EZItemStack(Material.SADDLE)
                .name(Util.redGreen(saddle) + "Saddle")
                .lore(ChatColor.DARK_PURPLE + "Click to toggle."),
                new GUIRunnable(){

                    @Override
                    public void click(Player player, NormalClickType type, boolean shift){

                        if(Main.interfaceHandler.getSettings(player) != null){

                            ((SettingsPig) Main.interfaceHandler.getSettings(player)).setSaddle(!getSaddle());
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
