package com.garris0n.EntityGUI.InterfaceHandling;

import com.garris0n.EntityGUI.GUI.GUIItemStack;
import com.garris0n.EntityGUI.GUI.Runnables.GUIRunnable;
import com.garris0n.EntityGUI.GUI.Runnables.NormalClickType;
import com.garris0n.EntityGUI.InterfaceHandling.Types.Chicken.PageChicken;
import com.garris0n.EntityGUI.InterfaceHandling.Types.Chicken.SettingsChicken;
import com.garris0n.EntityGUI.InterfaceHandling.Types.Cow.PageCow;
import com.garris0n.EntityGUI.InterfaceHandling.Types.Cow.SettingsCow;
import com.garris0n.EntityGUI.InterfaceHandling.Types.Pig.PagePig;
import com.garris0n.EntityGUI.InterfaceHandling.Types.Pig.SettingsPig;
import com.garris0n.EntityGUI.InterfaceHandling.Types.Sheep.PageSheep;
import com.garris0n.EntityGUI.InterfaceHandling.Types.Sheep.SettingsSheep;
import com.garris0n.EntityGUI.Main;
import com.garris0n.EntityGUI.Util.EZItemStack;
import com.garris0n.EntityGUI.Util.Util;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public enum PageType{

    PIG(new PagePig(), SettingsPig.class, EntityType.PIG),
    COW(new PageCow(), SettingsCow.class, EntityType.COW),
    SHEEP(new PageSheep(), SettingsSheep.class, EntityType.SHEEP),
    CHICKEN(new PageChicken(), SettingsChicken.class, EntityType.CHICKEN);


    private Page page;
    private Class<? extends Settings> settings;
    private EntityType type;

    PageType(Page page, Class<? extends Settings> settings, EntityType type){

        this.page = page;
        this.settings = settings;
        this.type = type;

    }

    public Page getPage(){

        return this.page;

    }

    public Settings getNewSettings(){

        try{

            return settings.newInstance();

        }
        catch(InstantiationException e){
            e.printStackTrace();
        }
        catch(IllegalAccessException e){
            e.printStackTrace();
        }

        return null;

    }

    public GUIItemStack getGuiItem(){

        EZItemStack item = new EZItemStack(Material.MONSTER_EGG, 1, type.getTypeId()).name(ChatColor.AQUA + Util.capitalizeAllWords(type.toString()));

        final PageType pageType = this;

        GUIRunnable runnable = new GUIRunnable(){

            @Override
            public void click(Player player, NormalClickType type, boolean shift){

                Main.interfaceHandler.setPageType(player, pageType);
                Main.interfaceHandler.setSettings(player, getNewSettings());
                getPage().openGUI(player);

            }

            @Override
            public void doubleClick(Player player){}

            @Override
            public void numberKeyClick(Player player, int key){}

        };

        return new GUIItemStack(item, runnable);

    }

}
