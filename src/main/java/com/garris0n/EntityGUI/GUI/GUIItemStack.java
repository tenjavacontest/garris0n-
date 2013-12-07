package com.garris0n.EntityGUI.GUI;

import com.garris0n.EntityGUI.GUI.Runnables.GUIRunnable;
import com.garris0n.EntityGUI.Util.EZItemStack;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

public class GUIItemStack{

    private ItemStack item;
    private GUIRunnable runnable;

    public GUIItemStack(EZItemStack item, GUIRunnable runnable){

        this.item = item.toItemStack();
        this.runnable = runnable;

    }

    /**
     * Gets the ItemStack of this GUIItemStack.
     *
     * @return the ItemStack
     */
    public ItemStack getItemStack(){

        return item.clone();

    }

    /**
     * Called by an EntityGUI to in turn call the runnable.
     *
     * @param player the player
     * @param type the click type
     * @param key the key pressed (not always applicable)
     */
    public void click(Player player, ClickType type, int key){

        if(type.equals(ClickType.RIGHT))
            runnable.rightClick(player, false);

        else if(type.equals(ClickType.SHIFT_RIGHT))
            runnable.rightClick(player, true);

        else if(type.equals(ClickType.LEFT))
            runnable.leftClick(player, false);

        else if(type.equals(ClickType.SHIFT_LEFT))
            runnable.leftClick(player, true);

        else if(type.equals(ClickType.DOUBLE_CLICK))
            runnable.doubleClick(player);

        else if(type.equals(ClickType.NUMBER_KEY))
            runnable.numberKeyClick(player, key);

    }

}
