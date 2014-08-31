package com.invironz.vorpal_forge.reference;

public class Names
{
    public static final class Block
    {
        public static final String CALCINATOR   =  "calcinator";
        public static final String ETNA         =        "etna";
        public static final String GAUNTLET     =    "gauntlet";
        public static final String KILN         =        "kiln";
        public static final String LIQUEFACTOR  = "liquefactor";
        public static final String PRESS        =       "press";
        public static final String RECTIFIER    =   "rectifier";
        public static final String SIEVE        =       "sieve";
        public static final String SMITHY       =      "smithy";
    }

    public static final class Item
    {
        public static final class Armor
        {
            public static final String BOOTS        =      "boots";
            public static final String CHESTPLATE   = "chestplate";
            public static final String HELMET       =     "helmet";
            public static final String LEGGINGS     =   "leggings";
        }

        public static final class Ingot
        {
            public static final String SUBVORPAL    = "subvorpal_ingot";
            public static final String VORPAL       =    "vorpal_ingot";
        }

        public static final class Matter
        {
            public static final String COMPACTED    = "compacted_matter";
            public static final String CRUDE        =     "crude_matter";
            public static final String ENDER        =     "ender_matter";
            public static final String ENERGETIC    = "energetic_matter";
            public static final String GEM          =       "gem_matter";
            public static final String MUNDANE      =   "mundane_matter";
            public static final String RAW          =       "raw_matter";
            public static final String RESONANT     =  "resonant_matter";
            public static final String SUBVORPAL    = "subvorpal_matter";
            public static final String VORPAL       =    "vorpal_matter";
        }

        public static final class Part
        {
            public static final String BLADE            =          "blade";
            public static final String HAFT             =           "haft";
            public static final String HARNESS          =        "harness";
            public static final String HARVESTER_HEAD   = "harvester_head";
            public static final String HILT             =           "hilt";
            public static final String MATTOCK_HEAD     =   "mattock_head";
        }

        public static final class Tool
        {
            public static final String HAMMER       =     "hammer";
            public static final String HARVESTER    =  "harvester";
            public static final String MATTOCK      =    "mattock";
            public static final String SWORD        =      "sword";
        }

        public static final String AGITATOR     = "agitator";
        public static final String CONVECTOR    = "convector";
        public static final String GRINDER      = "grinder";
        public static final String MATTER       = "matter";

        public static final String[] MATTER_SUBS = new String[] {
                "compacted",
                "crude",
                "ender",
                "energetic",
                "gem",
                "mundane",
                "raw",
                "resonant",
                "subvorpal",
                "vorpal"
        };

        public static String getMatter(int i) {
            return MATTER_SUBS[i] + "_" + MATTER;
        }
    }
}
