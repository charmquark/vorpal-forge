package com.invironz.vorpal_forge.init.recipe;

import com.invironz.vorpal_forge.init.VFItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public final class VFItemRecipes extends VFRecipesBase
{
    public static void initialize()
    {
        Block   obsidian    = Blocks.obsidian;

        Item    agitator    = VFItems.agitator,
                ender       = VFItems.Matter.ender,
                energetic   = VFItems.Matter.energetic,
                gem         = VFItems.Matter.gem,
                grinder     = VFItems.grinder,
                hammer      = VFItems.Tool.hammer,
                resonant    = VFItems.Matter.resonant,
                singot      = VFItems.Ingot.subvorpal,
                smatter     = VFItems.Matter.subvorpal;

        String  diamond     = "gemDiamond",
                glowstone   = "dustGlowstone",
                redstone    = "dustRedstone";

        add(new ShapedOreRecipe(agitator,   "d d", "ooo", " o ",    'd', diamond,   'o', obsidian   ));
        add(new ShapedOreRecipe(grinder,    " d ", "dod", " d ",    'd', diamond,   'o', obsidian   ));
        add(new ShapedOreRecipe(hammer,     "sss", " o ", " o ",    's', singot,    'o', obsidian   ));

        add(new ShapelessOreRecipe(energetic,       gem,            smatter,        redstone,       redstone        ));
        add(new ShapelessOreRecipe(resonant,        ender,          glowstone,      redstone,       redstone        ));
    }
}
