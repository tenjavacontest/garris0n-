package com.garris0n.EntityGUI.InterfaceHandling.Types.Cow;

import com.garris0n.EntityGUI.InterfaceHandling.Page;
import com.garris0n.EntityGUI.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PageCow extends Page{

    @Override
    public void spawn(Player player){

        SettingsCow settings = (SettingsCow) Main.interfaceHandler.getSettings(player);

    }

    @Override
    public String getInventoryTitle(){

        return ChatColor.BOLD + "Cow Menu";

    }
}
