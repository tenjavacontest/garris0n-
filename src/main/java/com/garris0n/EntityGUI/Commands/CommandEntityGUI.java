package com.garris0n.EntityGUI.Commands;

import com.garris0n.EntityGUI.GUI.*;
import com.garris0n.EntityGUI.GUI.Runnables.GUIRunnable;
import com.garris0n.EntityGUI.Util.EZItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class CommandEntityGUI implements CommandExecutor{


    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args){

        if(!(commandSender instanceof Player)){

            commandSender.sendMessage("This command can only be executed by players.");
            return false;

        }

        GUIItemStack item1 = new GUIItemStack(new EZItemStack(Material.COMMAND).name(ChatColor.RESET + "Say hi"), new GUIRunnable(){

            @Override
            public void leftClick(Player player, boolean shift){

                player.chat("left click, shift: " + shift);

            }

            @Override
            public void rightClick(Player player, boolean shift){

                player.chat("right click, shift: " + shift);

            }

            @Override
            public void doubleClick(Player player){

                player.chat("double click");

            }

            @Override
            public void numberKeyClick(Player player, int key){

                player.chat("number click, key: " + key);

            }
        });

        GUISize size = GUISize.MEDIUM;
        GUIItemStack[] items = new GUIItemStack[size.getSize()];
        items[0] = item1;

        new EntityGUI(size, items, "Testing Inventory").open((Player) commandSender);

        return true;

    }
}
