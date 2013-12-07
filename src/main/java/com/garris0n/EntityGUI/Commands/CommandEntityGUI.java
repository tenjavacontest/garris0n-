package com.garris0n.EntityGUI.Commands;

import com.garris0n.EntityGUI.Main;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class CommandEntityGUI implements CommandExecutor{


    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args){

        if(!(commandSender instanceof Player)){

            commandSender.sendMessage("This command can only be executed by players.");
            return false;

        }

        Main.interfaceHandler.openMainMenu((Player) commandSender);

        return true;

    }
}
