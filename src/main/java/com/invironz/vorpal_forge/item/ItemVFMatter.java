package com.invironz.vorpal_forge.item;

import com.invironz.vorpal_forge.reference.Names;
import com.invironz.vorpal_forge.utility.LocalizationHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;

public final class ItemVFMatter extends ItemVFSubTyped
{
    public static final class SubType
    {
        public static final int COMPACTED   = 0,
                                CRUDE       = 1,
                                ENDER       = 2,
                                ENERGETIC   = 3,
                                GEM         = 4,
                                MUNDANE     = 5,
                                RAW         = 6,
                                RESONANT    = 7,
                                SUBVORPAL   = 8,
                                VORPAL      = 9;

        public static final int MAX = VORPAL;
    }

    public ItemVFMatter()
    {
        super(Names.Item.MATTER, SubType.MAX);
        setMaxStackSize(64);
    }

    public String getUnlocalizedSubTypeName(int subType)
    {
        return LocalizationHelper.unlocalizedItemName(Names.Item.getMatter(subType));
    }
}
