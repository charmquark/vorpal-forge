package com.invironz.vorpal_forge.item.matter;

import com.invironz.vorpal_forge.item.ItemVFMatter;
import com.invironz.vorpal_forge.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemEnchantedBook;
import net.minecraft.item.ItemStack;

public final class ItemVFEnergeticMatter extends ItemVFMatter
{
    public ItemVFEnergeticMatter()
    {
        super(Names.Item.Matter.ENERGETIC);
    }

    @Override
    public EnumRarity getRarity(ItemStack itemStack)
    {
        return EnumRarity.uncommon;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack itemStack, int pass)
    {
        return true;
    }
}
