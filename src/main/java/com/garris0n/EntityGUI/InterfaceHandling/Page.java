package com.garris0n.EntityGUI.InterfaceHandling;

import com.garris0n.EntityGUI.GUI.EntityGUI;
import org.bukkit.entity.Player;

public abstract class Page{


    public abstract EntityGUI getGUI(Player player);

    public void openGUI(Player player){

        getGUI(player).open(player);

    }

}
