package com.garris0n.EntityGUI.InterfaceHandling.Types.Sheep;

import com.garris0n.EntityGUI.GUI.GUIItemStack;
import com.garris0n.EntityGUI.GUI.Runnables.GUIRunnable;
import com.garris0n.EntityGUI.GUI.Runnables.NormalClickType;
import com.garris0n.EntityGUI.InterfaceHandling.SettingsAgeable;
import com.garris0n.EntityGUI.Main;
import com.garris0n.EntityGUI.Util.EZItemStack;
import com.garris0n.EntityGUI.Util.Util;
import org.bukkit.*;
import org.bukkit.entity.Player;

public class SettingsSheep extends SettingsAgeable{

    private DyeColor color = DyeColor.WHITE;

    public DyeColor getColor(){

        return color;

    }

    public void setColor(DyeColor color){

        this.color = color;

    }

    public void nextColor(){

        this.color = Util.rotate(color);

    }

    @Override
    public void draw(GUIItemStack[] items){

        super.draw(items);

        items[19] = new GUIItemStack(new EZItemStack(Material.WOOL, 1, color.getWoolData())
                .name(ChatColor.GREEN + "Wool Color")
                .lore(ChatColor.DARK_PURPLE + "Click to change."),
                new GUIRunnable(){

                    @Override
                    public void click(Player player, NormalClickType type, boolean shift){

                        ((SettingsSheep) Main.interfaceHandler.getSettings(player)).nextColor();
                        Main.interfaceHandler.reDraw(player);

                    }

                    @Override
                    public void doubleClick(Player player){}

                    @Override
                    public void numberKeyClick(Player player, int key){}
                });

    }


}
