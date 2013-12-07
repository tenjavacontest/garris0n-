package com.garris0n.EntityGUI;

import com.garris0n.EntityGUI.Commands.CommandEntityGUI;
import com.garris0n.EntityGUI.GUI.GUIHandler;
import com.garris0n.EntityGUI.InterfaceHandling.InterfaceHandler;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{


    public static Main instance;

    public static GUIHandler guiHandler;
    public static InterfaceHandler interfaceHandler;

    public void onEnable(){

        instance = this;
        guiHandler = new GUIHandler();
        interfaceHandler = new InterfaceHandler();

        registerCommands();
        registerEvents();

    }

    public void onDisable(){

        instance = null;
        guiHandler = null;
        interfaceHandler = null;

    }

    public void registerEvents(){

        PluginManager pluginManager = getServer().getPluginManager();

        pluginManager.registerEvents(guiHandler, this);

    }

    public void registerCommands(){

        getCommand("entitygui").setExecutor(new CommandEntityGUI());

    }


}
