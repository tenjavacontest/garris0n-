package com.garris0n.EntityGUI.InterfaceHandling.Types.Cow;

import com.garris0n.EntityGUI.InterfaceHandling.Page;
import org.bukkit.ChatColor;

public class PageCow extends Page{

    @Override
    public String getInventoryTitle(){

        return ChatColor.BOLD + "Cow Menu";

    }
}
