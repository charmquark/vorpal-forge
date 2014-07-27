package com.invironz.vorpal_forge.item.ingot;

import com.invironz.vorpal_forge.item.ItemVFIngot;
import com.invironz.vorpal_forge.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public final class ItemVFSubvorpalIngot extends ItemVFIngot
{
    public ItemVFSubvorpalIngot()
    {
        super(Names.Item.Ingot.SUBVORPAL);
    }

    @Override
    public EnumRarity getRarity(ItemStack itemStack)
    {
        return EnumRarity.rare;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack itemStack, int pass)
    {
        return true;
    }
}
