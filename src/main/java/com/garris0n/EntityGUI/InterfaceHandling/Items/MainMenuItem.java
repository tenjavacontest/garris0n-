package com.garris0n.EntityGUI.InterfaceHandling.Items;

import com.garris0n.EntityGUI.GUI.GUIItemStack;
import com.garris0n.EntityGUI.GUI.Runnables.GUIRunnable;
import com.garris0n.EntityGUI.GUI.Runnables.NormalClickType;
import com.garris0n.EntityGUI.Util.EZItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public enum MainMenuItem{

    PIG(new EZItemStack(Material.MONSTER_EGG, 1, EntityType.PIG.getTypeId()).name(ChatColor.AQUA + "Pig"),
            new GUIRunnable(){

                @Override
                public void click(Player player, NormalClickType type, boolean shift){

                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Pig Menu");
                    //TODO: more menu thingystuff

                }

                @Override
                public void doubleClick(Player player){}

                @Override
                public void numberKeyClick(Player player, int key){}
            }),
    COW(new EZItemStack(Material.MONSTER_EGG, 1, EntityType.COW.getTypeId()).name(ChatColor.AQUA + "Cow"),
            new GUIRunnable(){

                @Override
                public void click(Player player, NormalClickType type, boolean shift){

                    player.sendMessage(ChatColor.AQUA + "Cow Menu");
                    //TODO: handle this too ಠ_ಠ

                }

                @Override
                public void doubleClick(Player player){}

                @Override
                public void numberKeyClick(Player player, int key){}
            });




    private EZItemStack item;
    private GUIRunnable runnable;

    MainMenuItem(EZItemStack item, GUIRunnable runnable){

        this.item = item;
        this.runnable = runnable;

    }

    public GUIItemStack getGuiItem(){

        return new GUIItemStack(item, runnable);

    }

}
