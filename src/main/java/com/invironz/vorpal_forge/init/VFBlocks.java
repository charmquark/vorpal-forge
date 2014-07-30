package com.invironz.vorpal_forge.init;

import com.invironz.vorpal_forge.block.*;
import com.invironz.vorpal_forge.reference.Names;
import com.invironz.vorpal_forge.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class VFBlocks
{
    public static Block calcinator,
                        etna,
                        gauntlet,
                        kiln,
                        liquefactor,
                        press,
                        rectifier,
                        sieve,
                        smithy;

    public static void preInitialize()
    {
        calcinator  = new BlockVFCalcinator();
        etna        = new BlockVFEtna();
        gauntlet    = new BlockVFGauntlet();
        kiln        = new BlockVFKiln();
        liquefactor = new BlockVFLiquefactor();
        press       = new BlockVFPress();
        rectifier   = new BlockVFRectifier();
        sieve       = new BlockVFSieve();
        smithy      = new BlockVFSmithy();
    }
}
