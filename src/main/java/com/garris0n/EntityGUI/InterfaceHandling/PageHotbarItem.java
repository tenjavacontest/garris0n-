package com.garris0n.EntityGUI.InterfaceHandling;

import com.garris0n.EntityGUI.GUI.GUIItemStack;
import com.garris0n.EntityGUI.GUI.Runnables.GUIRunnable;
import com.garris0n.EntityGUI.GUI.Runnables.NormalClickType;
import com.garris0n.EntityGUI.Main;
import com.garris0n.EntityGUI.Util.EZItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public enum PageHotbarItem{

    DELETE(new EZItemStack(Material.REDSTONE_BLOCK)
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
            }),
    SPAWN(new EZItemStack(Material.MONSTER_EGG)
            .name(ChatColor.AQUA.toString() + ChatColor.BOLD + "Spawn")
            .lore(ChatColor.DARK_PURPLE + "Click to spawn this entity."),
            new GUIRunnable(){

                @Override
                public void click(Player player, NormalClickType type, boolean shift){

                    if(Main.interfaceHandler.getPageType(player) != null)
                        Main.interfaceHandler.getPageType(player).getPage().spawn(player);

                }

                @Override
                public void doubleClick(Player player){}

                @Override
                public void numberKeyClick(Player player, int key){}
            }),
    DOWN_TEN(new EZItemStack(Material.STAINED_CLAY, 1, (short) 14)
            .name(ChatColor.RED.toString() + ChatColor.BOLD + "Spawn Amount -10")
            .lore(ChatColor.DARK_PURPLE + "Click to reduce the spawn amount by ten."),
            new GUIRunnable(){

                @Override
                public void click(Player player, NormalClickType type, boolean shift){

                    if(Main.interfaceHandler.getSettings(player) != null)
                        Main.interfaceHandler.getSettings(player).setAmountToSpawn(Main.interfaceHandler.getSettings(player).getAmountToSpawn() - 10);
                    Main.interfaceHandler.reDraw(player);

                }

                @Override
                public void doubleClick(Player player){}

                @Override
                public void numberKeyClick(Player player, int key){}
            }),
    DOWN_ONE(new EZItemStack(Material.STAINED_CLAY, 1, (short) 6)
            .name(ChatColor.RED.toString() + ChatColor.BOLD + "Spawn Amount -1")
            .lore(ChatColor.DARK_PURPLE + "Click to reduce the spawn amount by one."),
            new GUIRunnable(){

                @Override
                public void click(Player player, NormalClickType type, boolean shift){

                    if(Main.interfaceHandler.getSettings(player) != null)
                        Main.interfaceHandler.getSettings(player).setAmountToSpawn(Main.interfaceHandler.getSettings(player).getAmountToSpawn() - 1);
                    Main.interfaceHandler.reDraw(player);

                }

                @Override
                public void doubleClick(Player player){}

                @Override
                public void numberKeyClick(Player player, int key){}
            }),
    UP_ONE(new EZItemStack(Material.STAINED_CLAY, 1, (short) 5)
            .name(ChatColor.GREEN.toString() + ChatColor.BOLD + "Spawn Amount +1")
            .lore(ChatColor.DARK_PURPLE + "Click to increase the spawn amount by one."),
            new GUIRunnable(){

                @Override
                public void click(Player player, NormalClickType type, boolean shift){

                    if(Main.interfaceHandler.getSettings(player) != null)
                        Main.interfaceHandler.getSettings(player).setAmountToSpawn(Main.interfaceHandler.getSettings(player).getAmountToSpawn() + 1);
                    Main.interfaceHandler.reDraw(player);

                }

                @Override
                public void doubleClick(Player player){}

                @Override
                public void numberKeyClick(Player player, int key){}
            }),
    UP_TEN(new EZItemStack(Material.STAINED_CLAY, 1, (short) 13)
            .name(ChatColor.GREEN.toString() + ChatColor.BOLD + "Spawn Amount +10")
            .lore(ChatColor.DARK_PURPLE + "Click to increase the spawn amount by ten."),
            new GUIRunnable(){

                @Override
                public void click(Player player, NormalClickType type, boolean shift){

                    if(Main.interfaceHandler.getSettings(player) != null)
                        Main.interfaceHandler.getSettings(player).setAmountToSpawn(Main.interfaceHandler.getSettings(player).getAmountToSpawn() + 10);
                    Main.interfaceHandler.reDraw(player);

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

    /**
     * Gets the gui item for this PageHotbarItem.
     *
     * @return the gui item
     */
    public GUIItemStack getGuiItem(){

        return new GUIItemStack(item, runnable);

    }

    /**
     * Same functionality as getGuiItem() but with the ability to tag on an extra line of lore.
     * For use to display the number of entities to be spawned.
     *
     * @param extraLore the extra lore
     * @return the gui item
     */
    public GUIItemStack getGuiItem(String extraLore){

        return new GUIItemStack(item.lore(extraLore), runnable);

    }


}
