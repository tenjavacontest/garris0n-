package com.garris0n.EntityGUI.InterfaceHandling.Types.Creeper;

import com.garris0n.EntityGUI.InterfaceHandling.Page;
import com.garris0n.EntityGUI.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.*;

public class PageCreeper extends Page{


    @Override
    public void spawn(Player player){

        SettingsCreeper settings = (SettingsCreeper) Main.interfaceHandler.getSettings(player);

        for(int i = 0; i < settings.getAmountToSpawn(); i++){

            Creeper creeper = (Creeper) player.getWorld().spawnEntity(player.getLocation(), EntityType.CREEPER);

            if(settings.getFire())
                creeper.setFireTicks(1000);

            creeper.setPowered(settings.getPowered());

        }

    }

    @Override
    public String getInventoryTitle(){

        return ChatColor.BOLD + "Creeper Menu";

    }
}
