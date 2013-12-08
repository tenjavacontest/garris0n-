package com.garris0n.EntityGUI.InterfaceHandling.Types.Silverfish;

import com.garris0n.EntityGUI.InterfaceHandling.Page;
import com.garris0n.EntityGUI.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.*;

public class PageSilverfish extends Page{


    @Override
    public void spawn(Player player){

        SettingsSilverfish settings = (SettingsSilverfish) Main.interfaceHandler.getSettings(player);

        for(int i = 0; i < settings.getAmountToSpawn(); i++){

            Silverfish silverfish = (Silverfish) player.getWorld().spawnEntity(player.getLocation(), EntityType.SILVERFISH);

            if(settings.getFire())
                silverfish.setFireTicks(1000);

        }

    }

    @Override
    public String getInventoryTitle(){

        return ChatColor.BOLD + "Silverfish Menu";

    }
}
