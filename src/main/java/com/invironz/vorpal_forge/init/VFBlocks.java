package com.invironz.vorpal_forge.init;

import com.invironz.vorpal_forge.block.*;
import com.invironz.vorpal_forge.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class VFBlocks
{
    public static final BlockVF calcinator  = new BlockVFCalcinator();
    public static final BlockVF etna        = new BlockVFEtna();
    public static final BlockVF gauntlet    = new BlockVFGauntlet();
    public static final BlockVF kiln        = new BlockVFKiln();
    public static final BlockVF liquefactor = new BlockVFLiquefactor();
    public static final BlockVF press       = new BlockVFPress();
    public static final BlockVF rectifier   = new BlockVFRectifier();
    public static final BlockVF sieve       = new BlockVFSieve();
    public static final BlockVF smithy      = new BlockVFSmithy();

    public static void initialize()
    {
        GameRegistry.registerBlock(calcinator,  Names.Block.CALCINATOR);
        GameRegistry.registerBlock(etna,        Names.Block.ETNA);
        GameRegistry.registerBlock(gauntlet,    Names.Block.GAUNTLET);
        GameRegistry.registerBlock(kiln,        Names.Block.KILN);
        GameRegistry.registerBlock(liquefactor, Names.Block.LIQUEFACTOR);
        GameRegistry.registerBlock(press,       Names.Block.PRESS);
        GameRegistry.registerBlock(rectifier,   Names.Block.RECTIFIER);
        GameRegistry.registerBlock(sieve,       Names.Block.SIEVE);
        GameRegistry.registerBlock(smithy,      Names.Block.SMITHY);
    }
}
