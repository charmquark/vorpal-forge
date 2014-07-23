package com.invironz.vorpal_forge.init;

import com.invironz.vorpal_forge.item.ItemVF;
import com.invironz.vorpal_forge.item.ItemVFGrinder;
import com.invironz.vorpal_forge.item.ingot.ItemVFSubvorpalIngot;
import com.invironz.vorpal_forge.item.ingot.ItemVFVorpalIngot;
import com.invironz.vorpal_forge.item.matter.*;
import com.invironz.vorpal_forge.item.tool.ItemVFHammer;
import com.invironz.vorpal_forge.reference.Names;
import com.invironz.vorpal_forge.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class VFItems
{
    public static final ItemVF subvorpalIngot   = new ItemVFSubvorpalIngot();
    public static final ItemVF vorpalIngot      = new ItemVFVorpalIngot();

    public static final ItemVF compactedMatter  = new ItemVFCompactedMatter();
    public static final ItemVF crudeMatter      = new ItemVFCrudeMatter();
    public static final ItemVF energeticMatter  = new ItemVFEnergeticMatter();
    public static final ItemVF gemMatter        = new ItemVFGemMatter();
    public static final ItemVF mundaneMatter    = new ItemVFMundaneMatter();
    public static final ItemVF rawMatter        = new ItemVFRawMatter();
    public static final ItemVF subvorpalMatter  = new ItemVFSubvorpalMatter();
    public static final ItemVF vorpalMatter     = new ItemVFVorpalMatter();

    public static final ItemVF hammer   = new ItemVFHammer();

    public static final ItemVF grinder  = new ItemVFGrinder();

    public static void initialize()
    {
        GameRegistry.registerItem(subvorpalIngot,   Names.Item.Ingot.SUBVORPAL);
        GameRegistry.registerItem(vorpalIngot,      Names.Item.Ingot.VORPAL);

        GameRegistry.registerItem(compactedMatter,  Names.Item.Matter.COMPACTED);
        GameRegistry.registerItem(crudeMatter,      Names.Item.Matter.CRUDE);
        GameRegistry.registerItem(energeticMatter,  Names.Item.Matter.ENERGETIC);
        GameRegistry.registerItem(gemMatter,        Names.Item.Matter.GEM);
        GameRegistry.registerItem(mundaneMatter,    Names.Item.Matter.MUNDANE);
        GameRegistry.registerItem(rawMatter,        Names.Item.Matter.RAW);
        GameRegistry.registerItem(subvorpalMatter,  Names.Item.Matter.SUBVORPAL);
        GameRegistry.registerItem(vorpalMatter,     Names.Item.Matter.VORPAL);

        GameRegistry.registerItem(hammer,           Names.Item.Tool.HAMMER);

        GameRegistry.registerItem(grinder,          Names.Item.GRINDER);
    }
}
