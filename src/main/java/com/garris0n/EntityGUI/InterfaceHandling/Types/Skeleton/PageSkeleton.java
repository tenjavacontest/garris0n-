package com.garris0n.EntityGUI.InterfaceHandling.Types.Skeleton;

import com.garris0n.EntityGUI.InterfaceHandling.Page;
import com.garris0n.EntityGUI.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;

public class PageSkeleton extends Page{


    @Override
    public void spawn(Player player){

        SettingsSkeleton settings = (SettingsSkeleton) Main.interfaceHandler.getSettings(player);

        for(int i = 0; i < settings.getAmountToSpawn(); i++){

            Skeleton skeleton = (Skeleton) player.getWorld().spawnEntity(player.getLocation(), EntityType.SKELETON);

            if(settings.getFire())
                skeleton.setFireTicks(1000);

            if(settings.getBow())
                skeleton.getEquipment().setItemInHand(new ItemStack(Material.BOW));

            if(settings.getWither()){

                skeleton.setSkeletonType(Skeleton.SkeletonType.WITHER);
                skeleton.getEquipment().setItemInHand(new ItemStack(Material.STONE_SWORD));

            }

        }

    }

    @Override
    public String getInventoryTitle(){

        return ChatColor.BOLD + "Skeleton Menu";

    }
}
