package com.invironz.vorpal_forge.init.recipe;

import com.invironz.vorpal_forge.init.VFBlocks;
import com.invironz.vorpal_forge.init.VFItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class VFBlockRecipes extends VFRecipesBase
{
    public static void initialize()
    {
        Block   ctable      = Blocks.crafting_table,
                furnace     = Blocks.furnace,
                ironBars    = Blocks.iron_bars,
                obsidian    = Blocks.obsidian;

        Item    agitator    = VFItems.agitator,
                grinder     = VFItems.grinder,
                singot      = VFItems.Ingot.subvorpal,
                vingot      = VFItems.Ingot.vorpal,
                vmatter     = VFItems.Matter.vorpal;

        String  diamond     = "gemDiamond",
                glassPane   = "paneGlass",
                iron        = "ingotIron",
                ironBlock   = "blockIron";

        add(new ShapedOreRecipe(VFBlocks.calcinator,            " i ", "iri", "bfb",    'i', iron,      'r', ironBars,  'b', ironBlock, 'f', furnace    ));
        add(new ShapedOreRecipe(VFBlocks.etna,                  "   ", "s s", "sds",    's', singot,    'd', diamond                                    ));
        add(new ShapedOreRecipe(VFBlocks.gauntlet,              "i i", "ggg", "bfb",    'i', iron,      'g', grinder,   'b', ironBlock, 'f', ironBars   ));
        GameRegistry.addShapedRecipe(stack(VFBlocks.kiln),      "sss", "sfs", "sss",    's', singot,    'f', furnace                                    );
        add(new ShapedOreRecipe(VFBlocks.liquefactor,           "iii", "gab", "iii",    'i', iron,      'g', glassPane, 'a', agitator,  'b', ironBars   ));
        add(new ShapedOreRecipe(VFBlocks.liquefactor,           "iii", "bag", "iii",    'i', iron,      'g', glassPane, 'a', agitator,  'b', ironBars   ));
        add(new ShapedOreRecipe(VFBlocks.press,                 "odo", "d d", "ooo",    'o', obsidian,  'd', diamond                                    ));
        add(new ShapedOreRecipe(VFBlocks.rectifier,             "ooo", "ofo", "odo",    'o', obsidian,  'f', furnace,   'd', diamond                    ));
        add(new ShapedOreRecipe(VFBlocks.sieve,                 "i i", "fff", "i i",    'i', iron,      'f', ironBars                                   ));
        GameRegistry.addShapedRecipe(stack(VFBlocks.smithy),    "vvv", "oco", "ooo",    'v', vmatter,   'c', ctable,    'o', obsidian                   );
    }
}
