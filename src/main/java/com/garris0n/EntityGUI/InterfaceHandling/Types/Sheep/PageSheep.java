package com.garris0n.EntityGUI.InterfaceHandling.Types.Sheep;

import com.garris0n.EntityGUI.InterfaceHandling.Page;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PageSheep extends Page{


    @Override
    public void spawn(Player player){
        //TODO: spawn
    }

    @Override
    public String getInventoryTitle(){

        return ChatColor.BOLD + "Sheep Menu";

    }
}
