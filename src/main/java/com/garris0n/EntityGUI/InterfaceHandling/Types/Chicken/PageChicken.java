package com.garris0n.EntityGUI.InterfaceHandling.Types.Chicken;

import com.garris0n.EntityGUI.InterfaceHandling.Page;
import com.garris0n.EntityGUI.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.*;

public class PageChicken extends Page{


    @Override
    public void spawn(Player player){

        SettingsChicken settings = (SettingsChicken) Main.interfaceHandler.getSettings(player);

        for(int i = 0; i < settings.getAmountToSpawn(); i++){

            Chicken chicken = (Chicken) player.getWorld().spawnEntity(player.getLocation(), EntityType.CHICKEN);

            if(settings.getBaby())
                chicken.setBaby();

            if(settings.getFire())
                chicken.setFireTicks(1000);

        }

    }

    @Override
    public String getInventoryTitle(){

        return ChatColor.BOLD + "Chicken Menu";

    }
}
