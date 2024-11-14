package com.pilzbros.disccrafting;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class DiscCrafting extends JavaPlugin {
    public void onEnable() {
        ShapedRecipe disk = new ShapedRecipe(new ItemStack(Material.RECORD_12, 1));
        disk.shape(new String[]{"###", "#*#", "###"}).setIngredient('#', Material.COAL_BLOCK).setIngredient('*', Material.LAPIS_BLOCK);
        Bukkit.getServer().addRecipe(disk);
        ShapedRecipe disk2 = new ShapedRecipe(new ItemStack(Material.RECORD_11, 1));
        disk2.shape(new String[]{"###", "#*#", "###"}).setIngredient('#', Material.COAL_BLOCK).setIngredient('*', Material.ANVIL);
        Bukkit.getServer().addRecipe(disk2);
        ShapedRecipe disk3 = new ShapedRecipe(new ItemStack(Material.RECORD_10, 1));
        disk3.shape(new String[]{"###", "#*#", "###"}).setIngredient('#', Material.COAL_BLOCK).setIngredient('*', Material.EYE_OF_ENDER);
        Bukkit.getServer().addRecipe(disk3);
        ShapedRecipe disk4 = new ShapedRecipe(new ItemStack(Material.RECORD_9, 1));
        disk4.shape(new String[]{"###", "#*#", "###"}).setIngredient('#', Material.COAL_BLOCK).setIngredient('*', Material.QUARTZ_BLOCK);
        Bukkit.getServer().addRecipe(disk4);
        ShapedRecipe disk5 = new ShapedRecipe(new ItemStack(Material.RECORD_8, 1));
        disk5.shape(new String[]{"###", "#*#", "###"}).setIngredient('#', Material.COAL_BLOCK).setIngredient('*', Material.OBSIDIAN);
        Bukkit.getServer().addRecipe(disk5);
        ShapedRecipe disk6 = new ShapedRecipe(new ItemStack(Material.RECORD_7, 1));
        disk6.shape(new String[]{"###", "#*#", "###"}).setIngredient('#', Material.COAL_BLOCK).setIngredient('*', Material.NETHER_BRICK_ITEM);
        Bukkit.getServer().addRecipe(disk6);
        ShapedRecipe disk7 = new ShapedRecipe(new ItemStack(Material.RECORD_6, 1));
        disk7.shape(new String[]{"###", "#*#", "###"}).setIngredient('#', Material.COAL_BLOCK).setIngredient('*', Material.ENDER_PEARL);
        Bukkit.getServer().addRecipe(disk7);
        ShapedRecipe disk8 = new ShapedRecipe(new ItemStack(Material.RECORD_5, 1));
        disk8.shape(new String[]{"###", "#*#", "###"}).setIngredient('#', Material.COAL_BLOCK).setIngredient('*', Material.CACTUS);
        Bukkit.getServer().addRecipe(disk8);
        ShapedRecipe disk9 = new ShapedRecipe(new ItemStack(Material.RECORD_4, 1));
        disk9.shape(new String[]{"###", "#*#", "###"}).setIngredient('#', Material.COAL_BLOCK).setIngredient('*', Material.REDSTONE_BLOCK);
        Bukkit.getServer().addRecipe(disk9);
        ShapedRecipe disk10 = new ShapedRecipe(new ItemStack(Material.RECORD_3, 1));
        disk10.shape(new String[]{"###", "#*#", "###"}).setIngredient('#', Material.COAL_BLOCK).setIngredient('*', Material.REDSTONE_LAMP_OFF);
        Bukkit.getServer().addRecipe(disk10);
    }

    public void onDisable() {
        Bukkit.getServer().clearRecipes();
    }
}