package com.garris0n.EntityGUI.Util;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.*;

public class EZItemStack{

    ItemStack item;

    public EZItemStack(ItemStack item){

        this.item = item.clone();

    }

    public EZItemStack(Material material){

        this.item = new ItemStack(material);

    }

    public EZItemStack(Material material, int amount){

        this.item = new ItemStack(material, amount);

    }

    public EZItemStack(Material material, int amount, short damage){

        this.item = new ItemStack(material, amount, damage);

    }

    public EZItemStack name(String name){

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);

        return this;

    }

    public EZItemStack lore(List<String> lore){

        ItemMeta meta = item.getItemMeta();
        meta.setLore(lore);
        item.setItemMeta(meta);

        return this;

    }

    public EZItemStack lore(String... lore){

        return lore(Arrays.asList(lore));

    }

    public EZItemStack addLore(String lore){

        ItemMeta meta = item.getItemMeta();
        ArrayList<String> loreList = (ArrayList<String>) meta.getLore();

        if(loreList == null)
            loreList = new ArrayList<String>();

        loreList.add(lore);
        meta.setLore(loreList);
        item.setItemMeta(meta);

        return this;

    }

    public EZItemStack enchant(Enchantment enchantment, int level){

        item.addUnsafeEnchantment(enchantment, level);

        return this;

    }

    public ItemStack toItemStack(){

        return this.item.clone();

    }

}
