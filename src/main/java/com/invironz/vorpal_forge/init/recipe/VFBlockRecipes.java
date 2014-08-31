package com.invironz.vorpal_forge.init.recipe;

import com.invironz.vorpal_forge.init.VFBlocks;
import com.invironz.vorpal_forge.init.VFItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class VFBlockRecipes extends VFRecipesBase
{
    public static void initialize()
    {
        Block       ctable      = Blocks.crafting_table,
                    furnace     = Blocks.furnace,
                    ironBars    = Blocks.iron_bars,
                    obsidian    = Blocks.obsidian;

        Item        agitator    = VFItems.agitator,
                    convector   = VFItems.convector,
                    grinder     = VFItems.grinder,
                    nstar       = Items.nether_star,
                    singot      = VFItems.Ingot.subvorpal;

        ItemStack   vmatter     = VFItems.Matter.vorpal;

        String      diamond     = "gemDiamond",
                    glassPane   = "paneGlass",
                    iron        = "ingotIron",
                    ironBlock   = "blockIron";

        add(new ShapedOreRecipe(VFBlocks.calcinator,            " i ", "i i", "bfb",    'i', iron,      'b', ironBlock, 'f', furnace                    ));
        add(new ShapedOreRecipe(VFBlocks.etna,                  "   ", "s s", "scs",    'c', convector, 's', singot                                     ));
        add(new ShapedOreRecipe(VFBlocks.gauntlet,              "i i", "ggg", "bfb",    'i', iron,      'g', grinder,   'b', ironBlock, 'f', ironBars   ));
        add(new ShapedOreRecipe(VFBlocks.kiln,                  "sss", "sns", "sss",    's', singot,    'n', nstar                                      ));
        add(new ShapedOreRecipe(VFBlocks.liquefactor,           "iii", "gag", "iii",    'i', iron,      'g', glassPane, 'a', agitator                   ));
        add(new ShapedOreRecipe(VFBlocks.press,                 "odo", "d d", "ooo",    'o', obsidian,  'd', diamond                                    ));
        add(new ShapedOreRecipe(VFBlocks.rectifier,             "ooo", "o o", "oco",    'c', convector, 'o', obsidian                                   ));
        add(new ShapedOreRecipe(VFBlocks.sieve,                 "i i", "iai", "iii",    'i', iron,      'a', agitator                                   ));
        add(new ShapedOreRecipe(VFBlocks.smithy,                "vvv", "oco", "ooo",    'v', vmatter,   'c', ctable,    'o', obsidian                   ));
    }
}
