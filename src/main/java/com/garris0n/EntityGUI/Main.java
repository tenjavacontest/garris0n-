package com.garris0n.EntityGUI;

import com.garris0n.EntityGUI.Commands.CommandEntityGUI;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{


    public static Main instance;


    public void onEnable(){

        instance = this;
        registerCommands();

    }

    public void onDisable(){

        instance = null;

    }

    public void registerCommands(){

        getCommand("entitygui").setExecutor(new CommandEntityGUI());

    }


}
