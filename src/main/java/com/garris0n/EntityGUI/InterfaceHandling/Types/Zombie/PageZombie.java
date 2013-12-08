package com.garris0n.EntityGUI.InterfaceHandling.Types.Zombie;

import com.garris0n.EntityGUI.InterfaceHandling.Page;
import com.garris0n.EntityGUI.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.*;

public class PageZombie extends Page{


    @Override
    public void spawn(Player player){

        SettingsZombie settings = (SettingsZombie) Main.interfaceHandler.getSettings(player);

        for(int i = 0; i < settings.getAmountToSpawn(); i++){

            Zombie zombie = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);

            zombie.setBaby(settings.getBaby());

            if(settings.getFire())
                zombie.setFireTicks(1000);

            zombie.setVillager(settings.getVillager());

        }

    }

    @Override
    public String getInventoryTitle(){

        return ChatColor.BOLD + "Zombie Menu";

    }
}
