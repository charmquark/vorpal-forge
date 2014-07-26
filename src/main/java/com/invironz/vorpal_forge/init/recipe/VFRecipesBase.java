package com.invironz.vorpal_forge.init.recipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public abstract class VFRecipesBase
{
    public static void add(IRecipe recipe)
    {
        GameRegistry.addRecipe(recipe);
    }

    public static ItemStack stack(Block block)
    {
        return new ItemStack(block);
    }

    public static ItemStack stack(Item item)
    {
        return new ItemStack(item);
    }
}
