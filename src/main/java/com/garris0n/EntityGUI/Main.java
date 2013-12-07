package com.garris0n.EntityGUI;

import com.garris0n.EntityGUI.Commands.CommandEntityGUI;
import com.garris0n.EntityGUI.GUI.GUIHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{


    public static Main instance;

    GUIHandler handler;

    public void onEnable(){

        instance = this;

        handler = new GUIHandler();

        registerCommands();

    }

    public void onDisable(){

        instance = null;

    }

    public void registerCommands(){

        getCommand("entitygui").setExecutor(new CommandEntityGUI());

    }


}
