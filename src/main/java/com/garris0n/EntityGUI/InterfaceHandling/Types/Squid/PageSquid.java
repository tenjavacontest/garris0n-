package com.garris0n.EntityGUI.InterfaceHandling.Types.Squid;

import com.garris0n.EntityGUI.InterfaceHandling.Page;
import com.garris0n.EntityGUI.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.*;

public class PageSquid extends Page{


    @Override
    public void spawn(Player player){

        SettingsSquid settings = (SettingsSquid) Main.interfaceHandler.getSettings(player);

        for(int i = 0; i < settings.getAmountToSpawn(); i++){

            Squid squid = (Squid) player.getWorld().spawnEntity(player.getLocation(), EntityType.SQUID);

            if(settings.getFire())
                squid.setFireTicks(1000);

        }

    }

    @Override
    public String getInventoryTitle(){

        return ChatColor.BOLD + "Squid Menu";

    }
}
