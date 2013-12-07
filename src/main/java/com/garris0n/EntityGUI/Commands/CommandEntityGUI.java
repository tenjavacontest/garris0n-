package com.garris0n.EntityGUI.Commands;

import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class CommandEntityGUI implements CommandExecutor{


    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args){

        if(!(commandSender instanceof Player)){

            commandSender.sendMessage("This command can only be executed by players.");
            return false;

        }

        //TODO: Actually handle command.

        return true;

    }
}
