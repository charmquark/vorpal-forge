package com.invironz.vorpal_forge.init.recipe;

import com.invironz.vorpal_forge.init.VFItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public final class VFItemRecipes extends VFRecipesBase
{
    public static void initialize()
    {
        Block   obsidian    = Blocks.obsidian;

        String  diamond     = "gemDiamond",
                glowstone   = "dustGlowstone",
                redstone    = "dustRedstone";

        // basics
        add(new ShapedOreRecipe(VFItems.agitator,       "d d", "ooo", " o ",    'd', diamond, 'o', obsidian));
        add(new ShapedOreRecipe(VFItems.grinder,        " d ", "dod", " d ",    'd', diamond, 'o', obsidian));

        // matters
        add(new ShapelessOreRecipe(VFItems.Matter.energeticMatter, VFItems.Matter.gemMatter, VFItems.Matter.subvorpalMatter, redstone, redstone));
        add(new ShapelessOreRecipe(VFItems.Matter.resonantMatter, VFItems.Matter.enderMatter, glowstone, redstone, redstone));

        //tools
        add(new ShapedOreRecipe(VFItems.Tool.hammer,    "sss", " o ", " o ",    's', VFItems.Ingot.subvorpalIngot, 'o', obsidian));
    }
}
