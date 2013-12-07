package com.garris0n.EntityGUI.InterfaceHandling.Types.Pig;

import com.garris0n.EntityGUI.InterfaceHandling.Page;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PagePig extends Page{

    @Override
    public void spawn(Player player){



    }

    @Override
    public String getInventoryTitle(){

        return ChatColor.BOLD + "Pig Menu";

    }

}
