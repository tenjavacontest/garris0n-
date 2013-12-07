package com.garris0n.EntityGUI.InterfaceHandling.Types.Pig;

import com.garris0n.EntityGUI.InterfaceHandling.Page;
import com.garris0n.EntityGUI.InterfaceHandling.Types.Sheep.SettingsSheep;
import com.garris0n.EntityGUI.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.*;

public class PagePig extends Page{

    @Override
    public void spawn(Player player){

        SettingsPig settings = (SettingsPig) Main.interfaceHandler.getSettings(player);

        for(int i = 0; i < settings.getAmountToSpawn(); i++){

            Pig pig = (Pig) player.getWorld().spawnEntity(player.getLocation(), EntityType.PIG);

            if(settings.getBaby())
                pig.setBaby();

            pig.setSaddle(settings.getSaddle());


        }

    }

    @Override
    public String getInventoryTitle(){

        return ChatColor.BOLD + "Pig Menu";

    }

}
