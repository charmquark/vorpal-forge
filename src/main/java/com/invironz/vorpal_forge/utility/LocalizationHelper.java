package com.invironz.vorpal_forge.utility;

import com.invironz.vorpal_forge.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class LocalizationHelper
{
    private static final String PREFIX_BLOCK    = "tile." + Reference.MOD_ID + ":";
    private static final String PREFIX_ITEM     = "item." + Reference.MOD_ID + ":";

    public static String unlocalizedBlockName(String name)
    {
        return PREFIX_BLOCK + unwrappedName(name);
    }

    public static String unlocalizedItemName(String name)
    {
        return PREFIX_ITEM + unwrappedName(name);
    }

    public static String unwrappedName(String name)
    {
        return name.substring(name.indexOf(".") + 1);
    }

    public static String unwrappedUnlocalizedName(Block block)
    {
        return unwrappedName(block.getUnlocalizedName());
    }

    public static String unwrappedUnlocalizedName(Item item)
    {
        return unwrappedName(item.getUnlocalizedName());
    }
}
