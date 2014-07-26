package com.invironz.vorpal_forge.init;

import com.invironz.vorpal_forge.item.ItemVF;
import com.invironz.vorpal_forge.item.ItemVFAgitator;
import com.invironz.vorpal_forge.item.ItemVFGrinder;
import com.invironz.vorpal_forge.item.ingot.ItemVFSubvorpalIngot;
import com.invironz.vorpal_forge.item.ingot.ItemVFVorpalIngot;
import com.invironz.vorpal_forge.item.matter.*;
import com.invironz.vorpal_forge.item.part.*;
import com.invironz.vorpal_forge.item.tool.*;
import com.invironz.vorpal_forge.reference.Names;
import com.invironz.vorpal_forge.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

public final class VFItems
{
    public static final class Armor
    {
        private static void initialize()
        {

        }
    }

    public static final class Ingot
    {
        public static final ItemVF subvorpalIngot   = new ItemVFSubvorpalIngot();
        public static final ItemVF vorpalIngot      = new ItemVFVorpalIngot();

        private static void initialize()
        {
            register(subvorpalIngot,    Names.Item.Ingot.SUBVORPAL);
            register(vorpalIngot,       Names.Item.Ingot.VORPAL);
        }
    }

    public static final class Matter
    {
        public static final ItemVF compactedMatter  = new ItemVFCompactedMatter();
        public static final ItemVF crudeMatter      = new ItemVFCrudeMatter();
        public static final ItemVF enderMatter      = new ItemVFEnderMatter();
        public static final ItemVF energeticMatter  = new ItemVFEnergeticMatter();
        public static final ItemVF gemMatter        = new ItemVFGemMatter();
        public static final ItemVF mundaneMatter    = new ItemVFMundaneMatter();
        public static final ItemVF rawMatter        = new ItemVFRawMatter();
        public static final ItemVF resonantMatter   = new ItemVFResonantMatter();
        public static final ItemVF subvorpalMatter  = new ItemVFSubvorpalMatter();
        public static final ItemVF vorpalMatter     = new ItemVFVorpalMatter();

        private static void initialize()
        {
            register(compactedMatter, Names.Item.Matter.COMPACTED);
            register(crudeMatter, Names.Item.Matter.CRUDE);
            register(enderMatter, Names.Item.Matter.ENDER);
            register(energeticMatter, Names.Item.Matter.ENERGETIC);
            register(gemMatter, Names.Item.Matter.GEM);
            register(mundaneMatter, Names.Item.Matter.MUNDANE);
            register(rawMatter, Names.Item.Matter.RAW);
            register(resonantMatter, Names.Item.Matter.RESONANT);
            register(subvorpalMatter, Names.Item.Matter.SUBVORPAL);
            register(vorpalMatter, Names.Item.Matter.VORPAL);
        }
    }

    public static final class Part
    {
        public static final ItemVF axeHead      = new ItemVFAxeHead();
        public static final ItemVF blade        = new ItemVFBlade();
        public static final ItemVF haft         = new ItemVFHaft();
        public static final ItemVF harness      = new ItemVFHarness();
        public static final ItemVF hilt         = new ItemVFHilt();
        public static final ItemVF hoeHead      = new ItemVFHoeHead();
        public static final ItemVF mattockHead  = new ItemVFMattockHead();
        public static final ItemVF pickHead     = new ItemVFPickHead();
        public static final ItemVF shovelHead   = new ItemVFShovelHead();

        private static void initialize()
        {
            register(axeHead,       Names.Item.Part.AXE_HEAD);
            register(blade,         Names.Item.Part.BLADE);
            register(haft,          Names.Item.Part.HAFT);
            register(harness,       Names.Item.Part.HARNESS);
            register(hilt,          Names.Item.Part.HILT);
            register(hoeHead,       Names.Item.Part.HOE_HEAD);
            register(mattockHead,   Names.Item.Part.MATTOCK_HEAD);
            register(pickHead,      Names.Item.Part.PICK_HEAD);
            register(shovelHead,    Names.Item.Part.SHOVEL_HEAD);
        }
    }

    public static final class Tool
    {
        public static final ItemVF axe      = new ItemVFAxe();
        public static final ItemVF hammer   = new ItemVFHammer();
        public static final ItemVF hoe      = new ItemVFHoe();
        public static final ItemVF mattock  = new ItemVFMattock();
        public static final ItemVF pick     = new ItemVFPick();
        public static final ItemVF shovel   = new ItemVFShovel();
        public static final ItemVF sword    = new ItemVFSword();

        private static void initialize()
        {
            register(axe,       Names.Item.Tool.AXE);
            register(hammer,    Names.Item.Tool.HAMMER);
            register(hoe,       Names.Item.Tool.HOE);
            register(mattock,   Names.Item.Tool.MATTOCK);
            register(pick,      Names.Item.Tool.PICK);
            register(shovel,    Names.Item.Tool.SHOVEL);
            register(sword,     Names.Item.Tool.SWORD);
        }
    }

    public static final ItemVF agitator = new ItemVFAgitator();
    public static final ItemVF grinder  = new ItemVFGrinder();

    public static void initialize()
    {
        register(agitator,  Names.Item.AGITATOR);
        register(grinder,   Names.Item.GRINDER);

        Armor.initialize();
        Ingot.initialize();
        Matter.initialize();
        Part.initialize();
        Tool.initialize();
    }

    private static void register(ItemVF item, String name)
    {
        GameRegistry.registerItem(item, name);
    }
}
