package com.garris0n.EntityGUI.InterfaceHandling.Types.Creeper;

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

public class SettingsCreeper extends Settings{

    private boolean powered = false;

    public boolean getPowered(){

        return powered;

    }

    public void setPowered(boolean powered){

        this.powered = powered;

    }

    @Override
    public void draw(GUIItemStack[] items){

        super.draw(items);

        items[19] = new GUIItemStack(new EZItemStack(Material.REDSTONE_TORCH_ON)
                .name(Util.redGreen(powered) + "Powered (Lightning)")
                .lore(ChatColor.DARK_PURPLE + "Click to toggle"),
                new GUIRunnable(){

                    @Override
                    public void click(Player player, NormalClickType type, boolean shift){

                        if(Main.interfaceHandler.getSettings(player) != null)
                            ((SettingsCreeper) Main.interfaceHandler.getSettings(player)).setPowered(!((SettingsCreeper) Main.interfaceHandler.getSettings(player)).getPowered());
                        Main.interfaceHandler.reDraw(player);

                    }

                    @Override
                    public void doubleClick(Player player){}

                    @Override
                    public void numberKeyClick(Player player, int key){}
                });

    }

}
