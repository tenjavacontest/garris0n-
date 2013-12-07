package com.garris0n.EntityGUI.InterfaceHandling.Items;

import com.garris0n.EntityGUI.GUI.GUIItemStack;
import com.garris0n.EntityGUI.GUI.Runnables.GUIRunnable;
import com.garris0n.EntityGUI.GUI.Runnables.NormalClickType;
import com.garris0n.EntityGUI.InterfaceHandling.Page;
import com.garris0n.EntityGUI.InterfaceHandling.Types.PageCow;
import com.garris0n.EntityGUI.InterfaceHandling.Types.PagePig;
import com.garris0n.EntityGUI.Util.EZItemStack;
import com.garris0n.EntityGUI.Util.Util;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.lang.reflect.InvocationTargetException;

public enum MainMenuItem{

    PIG(PagePig.class, EntityType.PIG),
    COW(PageCow.class, EntityType.COW);


    private Class<? extends Page> clazz;
    private EntityType type;

    MainMenuItem(Class<? extends Page> clazz, EntityType type){

        this.clazz = clazz;
        this.type = type;

    }

    public Page getPage(){

        try{

            return clazz.getConstructor(MainMenuItem.class).newInstance(this);

        }
        catch(InstantiationException e){
            e.printStackTrace();
        }
        catch(IllegalAccessException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e){
            e.printStackTrace();
        }
        catch(InvocationTargetException e){
            e.printStackTrace();
        }

        return null;

    }

    public GUIItemStack getGuiItem(){

        EZItemStack item = new EZItemStack(Material.MONSTER_EGG, 1, type.getTypeId()).name(ChatColor.AQUA + Util.capitalizeAllWords(type.toString()));

        GUIRunnable runnable = new GUIRunnable(){

            @Override
            public void click(Player player, NormalClickType type, boolean shift){

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
