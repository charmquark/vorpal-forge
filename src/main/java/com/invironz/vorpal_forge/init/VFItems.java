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
import net.minecraft.item.Item;

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
        public static Item  compacted,
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
            compacted   = new ItemVFCompactedMatter();
            crude       = new ItemVFCrudeMatter();
            ender       = new ItemVFEnderMatter();
            energetic   = new ItemVFEnergeticMatter();
            gem         = new ItemVFGemMatter();
            mundane     = new ItemVFMundaneMatter();
            raw         = new ItemVFRawMatter();
            resonant    = new ItemVFResonantMatter();
            subvorpal   = new ItemVFSubvorpalMatter();
            vorpal      = new ItemVFVorpalMatter();
        }
    }

    public static final class Part
    {
        public static Item  axeHead,
                            blade,
                            haft,
                            harness,
                            hilt,
                            hoeHead,
                            mattockHead,
                            pickHead,
                            shovelHead;

        private static void preInitialize()
        {
            axeHead      = new ItemVFAxeHead();
            blade        = new ItemVFBlade();
            haft         = new ItemVFHaft();
            harness      = new ItemVFHarness();
            hilt         = new ItemVFHilt();
            hoeHead      = new ItemVFHoeHead();
            mattockHead  = new ItemVFMattockHead();
            pickHead     = new ItemVFPickHead();
            shovelHead   = new ItemVFShovelHead();
        }
    }

    public static final class Tool
    {
        public static Item  axe,
                            hammer,
                            hoe,
                            mattock,
                            pick,
                            shovel,
                            sword;

        private static void preInitialize()
        {
            axe      = new ItemVFAxe();
            hammer   = new ItemVFHammer();
            hoe      = new ItemVFHoe();
            mattock  = new ItemVFMattock();
            pick     = new ItemVFPick();
            shovel   = new ItemVFShovel();
            sword    = new ItemVFSword();
        }
    }

    public static Item  agitator,
                        grinder;

    public static void preInitialize()
    {
        agitator    = new ItemVFAgitator();
        grinder     = new ItemVFGrinder();

        Armor.preInitialize();
        Ingot.preInitialize();
        Matter.preInitialize();
        Part.preInitialize();
        Tool.preInitialize();
    }
}
