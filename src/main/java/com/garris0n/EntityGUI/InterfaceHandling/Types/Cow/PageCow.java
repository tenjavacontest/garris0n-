package com.garris0n.EntityGUI.InterfaceHandling.Types.Cow;

import com.garris0n.EntityGUI.InterfaceHandling.Page;
import com.garris0n.EntityGUI.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.*;

public class PageCow extends Page{

    @Override
    public void spawn(Player player){

        SettingsCow settings = (SettingsCow) Main.interfaceHandler.getSettings(player);

        for(int i = 0; i < settings.getAmountToSpawn(); i++){

            Cow cow = (Cow) player.getWorld().spawnEntity(player.getLocation(), EntityType.COW);

            if(settings.getBaby())
                cow.setBaby();

            if(settings.getFire())
                cow.setFireTicks(1000);

        }

    }

    @Override
    public String getInventoryTitle(){

        return ChatColor.BOLD + "Cow Menu";

    }
}
