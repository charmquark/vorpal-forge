package com.invironz.vorpal_forge.init;

import com.invironz.vorpal_forge.item.ItemVFAgitator;
import com.invironz.vorpal_forge.item.ItemVFGrinder;
import com.invironz.vorpal_forge.item.ItemVFMatter;
import com.invironz.vorpal_forge.item.ingot.ItemVFSubvorpalIngot;
import com.invironz.vorpal_forge.item.ingot.ItemVFVorpalIngot;
import com.invironz.vorpal_forge.item.part.*;
import com.invironz.vorpal_forge.item.tool.ItemVFHammer;
import com.invironz.vorpal_forge.item.tool.ItemVFHarvester;
import com.invironz.vorpal_forge.item.tool.ItemVFMattock;
import com.invironz.vorpal_forge.item.tool.ItemVFSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class VFItems
{
    public static final class Armor
    {
        private static void preInitialize()
        {

        }
    }

    public static final class Ingot
    {
        public static Item  subvorpal,
                            vorpal;

        private static void preInitialize()
        {
            subvorpal   = new ItemVFSubvorpalIngot();
            vorpal      = new ItemVFVorpalIngot();
        }
    }

    public static final class Matter
    {
        public static ItemStack compacted,
                                crude,
                                ender,
                                energetic,
                                gem,
                                mundane,
                                raw,
                                resonant,
                                subvorpal,
                                vorpal;

        private static void preInitialize()
        {
            compacted   = new ItemStack(matter, 1, ItemVFMatter.SubType.COMPACTED);
            crude       = new ItemStack(matter, 1, ItemVFMatter.SubType.CRUDE);
            ender       = new ItemStack(matter, 1, ItemVFMatter.SubType.ENDER);
            energetic   = new ItemStack(matter, 1, ItemVFMatter.SubType.ENERGETIC);
            gem         = new ItemStack(matter, 1, ItemVFMatter.SubType.GEM);
            mundane     = new ItemStack(matter, 1, ItemVFMatter.SubType.MUNDANE);
            raw         = new ItemStack(matter, 1, ItemVFMatter.SubType.RAW);
            resonant    = new ItemStack(matter, 1, ItemVFMatter.SubType.RESONANT);
            subvorpal   = new ItemStack(matter, 1, ItemVFMatter.SubType.SUBVORPAL);
            vorpal      = new ItemStack(matter, 1, ItemVFMatter.SubType.VORPAL);
        }
    }

    public static final class Part
    {
        public static Item  blade,
                            haft,
                            harness,
                            harvesterHead,
                            hilt,
                            mattockHead;

        private static void preInitialize()
        {
            blade           = new ItemVFBlade();
            haft            = new ItemVFHaft();
            harness         = new ItemVFHarness();
            harvesterHead   = new ItemVFHarvesterHead();
            hilt            = new ItemVFHilt();
            mattockHead     = new ItemVFMattockHead();
        }
    }

    public static final class Tool
    {
        public static Item  hammer,
                            harvester,
                            mattock,
                            sword;

        private static void preInitialize()
        {
            hammer      = new ItemVFHammer();
            harvester   = new ItemVFHarvester();
            mattock     = new ItemVFMattock();
            sword       = new ItemVFSword();
        }
    }

    public static Item  agitator,
                        grinder,
                        matter;

    public static void preInitialize()
    {
        agitator    = new ItemVFAgitator();
        grinder     = new ItemVFGrinder();
        matter      = new ItemVFMatter();

        Armor.preInitialize();
        Ingot.preInitialize();
        Matter.preInitialize();
        Part.preInitialize();
        Tool.preInitialize();
    }
}
