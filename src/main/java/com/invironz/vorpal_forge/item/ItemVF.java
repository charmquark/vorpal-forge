package com.invironz.vorpal_forge.item;

import com.invironz.vorpal_forge.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class ItemVF extends Item
{
    public ItemVF()
    {
        super();
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s:%s", Reference.MOD_ID, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return getUnlocalizedName();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(getUnwrappedUnlocalizedName());
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    protected String getUnwrappedUnlocalizedName()
    {
        return getUnwrappedUnlocalizedName(getUnlocalizedName());
    }
}
