package com.garris0n.EntityGUI;

import com.garris0n.EntityGUI.Commands.CommandEntityGUI;
import com.garris0n.EntityGUI.GUI.GUIHandler;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{


    public static Main instance;

    public static GUIHandler handler;

    public void onEnable(){

        instance = this;
        handler = new GUIHandler();

        registerCommands();
        registerEvents();

    }

    public void onDisable(){

        instance = null;
        handler = null;

    }

    public void registerEvents(){

        PluginManager pluginManager = getServer().getPluginManager();

        pluginManager.registerEvents(handler, this);

    }

    public void registerCommands(){

        getCommand("entitygui").setExecutor(new CommandEntityGUI());

    }


}
