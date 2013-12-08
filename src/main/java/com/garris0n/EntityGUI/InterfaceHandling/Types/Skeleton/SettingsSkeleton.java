package com.garris0n.EntityGUI.InterfaceHandling.Types.Skeleton;

import com.garris0n.EntityGUI.GUI.GUIItemStack;
import com.garris0n.EntityGUI.GUI.Runnables.GUIRunnable;
import com.garris0n.EntityGUI.GUI.Runnables.NormalClickType;
import com.garris0n.EntityGUI.InterfaceHandling.Settings;
import com.garris0n.EntityGUI.Main;
import com.garris0n.EntityGUI.Util.EZItemStack;
import com.garris0n.EntityGUI.Util.Util;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatTabCompleteEvent;

public class SettingsSkeleton extends Settings{

    private boolean bow = true;
    private boolean wither = false;

    public boolean getWither(){

        return wither;

    }

    public void setWither(boolean wither){

        this.wither = wither;

    }

    public boolean getBow(){

        return bow;

    }

    public void setBow(boolean bow){

        this.bow = bow;

    }

    @Override
    public void draw(GUIItemStack[] items){

        super.draw(items);

        items[19] = new GUIItemStack(new EZItemStack(Material.BOW)
                .name(Util.redGreen(bow) + "Bow")
                .lore(ChatColor.DARK_PURPLE + "Click to toggle."),
                new GUIRunnable(){

                    @Override
                    public void click(Player player, NormalClickType type, boolean shift){

                        if(Main.interfaceHandler.getSettings(player) != null)
                            ((SettingsSkeleton) Main.interfaceHandler.getSettings(player)).setBow(!((SettingsSkeleton) Main.interfaceHandler.getSettings(player)).getBow());
                        Main.interfaceHandler.reDraw(player);

                    }

                    @Override
                    public void doubleClick(Player player){}

                    @Override
                    public void numberKeyClick(Player player, int key){}
                });

        items[20] = new GUIItemStack(new EZItemStack(Material.SKULL_ITEM, 1, (short) 1)
                .name(Util.redGreen(wither) + "Wither")
                .lore(ChatColor.DARK_PURPLE + "Click to toggle."),
                new GUIRunnable(){

                    @Override
                    public void click(Player player, NormalClickType type, boolean shift){

                        if(Main.interfaceHandler.getSettings(player) != null)
                            ((SettingsSkeleton) Main.interfaceHandler.getSettings(player)).setWither(!((SettingsSkeleton) Main.interfaceHandler.getSettings(player)).getWither());
                        Main.interfaceHandler.reDraw(player);

                    }

                    @Override
                    public void doubleClick(Player player){}

                    @Override
                    public void numberKeyClick(Player player, int key){}
                });

    }

}
