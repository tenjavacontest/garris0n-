package com.garris0n.EntityGUI.InterfaceHandling.Items;

import com.garris0n.EntityGUI.GUI.GUIItemStack;
import com.garris0n.EntityGUI.GUI.Runnables.GUIRunnable;
import com.garris0n.EntityGUI.GUI.Runnables.NormalClickType;
import com.garris0n.EntityGUI.Main;
import com.garris0n.EntityGUI.Util.EZItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public enum PageHotbarItem{

    DELETE(new EZItemStack(Material.STAINED_CLAY, 0, (short) 14)
            .name(ChatColor.RED.toString() + ChatColor.BOLD + "Delete")
            .lore(ChatColor.DARK_PURPLE + "Click to delete your progress", ChatColor.DARK_PURPLE + "go back to the Main Menu."),
            new GUIRunnable(){

                @Override
                public void click(Player player, NormalClickType type, boolean shift){

                    Main.interfaceHandler.openMainMenu(player);

                }

                @Override
                public void doubleClick(Player player){}

                @Override
                public void numberKeyClick(Player player, int key){}
            });

    private EZItemStack item;
    private GUIRunnable runnable;

    PageHotbarItem(EZItemStack item, GUIRunnable runnable){

        this.item = item;
        this.runnable = runnable;

    }

    public GUIItemStack getGuiItem(){

        return new GUIItemStack(item, runnable);

    }

}
