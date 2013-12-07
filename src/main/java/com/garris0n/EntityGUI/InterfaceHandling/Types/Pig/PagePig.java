package com.garris0n.EntityGUI.InterfaceHandling.Types.Pig;

import com.garris0n.EntityGUI.GUI.*;
import com.garris0n.EntityGUI.InterfaceHandling.Page;
import com.garris0n.EntityGUI.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PagePig extends Page{

    @Override
    public EntityGUI getGUI(Player player){

        if(!Main.interfaceHandler.settings.containsKey(player.getName()) || !(Main.interfaceHandler.settings.get(player.getName()) instanceof SettingsPig))
            return null;

        GUISize size = GUISize.EXTRA_LARGE;

        GUIItemStack[] items = new GUIItemStack[size.getSize()];

        Main.interfaceHandler.settings.get(player.getName()).draw(items);

        return new EntityGUI(size, items, ChatColor.BOLD + "Pig Menu");

    }

}
