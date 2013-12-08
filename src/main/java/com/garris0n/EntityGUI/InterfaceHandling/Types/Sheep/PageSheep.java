package com.garris0n.EntityGUI.InterfaceHandling.Types.Sheep;

import com.garris0n.EntityGUI.InterfaceHandling.Page;
import com.garris0n.EntityGUI.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.*;

public class PageSheep extends Page{


    @Override
    public void spawn(Player player){

        SettingsSheep settings = (SettingsSheep) Main.interfaceHandler.getSettings(player);

        for(int i = 0; i < settings.getAmountToSpawn(); i++){

            Sheep sheep = (Sheep) player.getWorld().spawnEntity(player.getLocation(), EntityType.SHEEP);

            if(settings.getBaby())
                sheep.setBaby();

            sheep.setColor(settings.getColor());

        }

    }

    @Override
    public String getInventoryTitle(){

        return ChatColor.BOLD + "Sheep Menu";

    }
}
