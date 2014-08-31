package com.invironz.vorpal_forge.init.recipe;

import com.invironz.vorpal_forge.init.VFItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public final class VFItemRecipes extends VFRecipesBase
{
    public static void initialize()
    {
        Block       obsidian    = Blocks.obsidian;

        Item        singot      = VFItems.Ingot.subvorpal;

        ItemStack   ender       = VFItems.Matter.ender,
                    gem         = VFItems.Matter.gem,
                    smatter     = VFItems.Matter.subvorpal;

        String      diamond     = "gemDiamond",
                    iron        = "ingotIron",
                    redstone    = "dustRedstone";

        add(new ShapedOreRecipe(VFItems.agitator,       "d d", "ooo", " o ",    'd', diamond,   'o', obsidian                   ));
        add(new ShapedOreRecipe(VFItems.convector,      "idi", "isi", "iii",    'd', diamond,   'i', iron,      's', smatter    ));
        add(new ShapedOreRecipe(VFItems.grinder,        " d ", "dod", " d ",    'd', diamond,   'o', obsidian                   ));

        add(new ShapedOreRecipe(VFItems.Tool.hammer,    "sss", " o ", " o ",    's', singot,    'o', obsidian                   ));

        add(new ShapelessOreRecipe(VFItems.Matter.energetic,    gem,            redstone,       redstone        ));
        add(new ShapelessOreRecipe(VFItems.Matter.resonant,     ender,          redstone,       redstone        ));
    }
}
