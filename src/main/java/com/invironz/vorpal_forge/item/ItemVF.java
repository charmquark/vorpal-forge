package com.invironz.vorpal_forge.item;

import com.invironz.vorpal_forge.creativetab.CreativeTabVF;
import com.invironz.vorpal_forge.reference.Reference;
import com.invironz.vorpal_forge.utility.LocalizationHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class ItemVF extends Item
{
    public ItemVF(String name)
    {
        super();
        setCreativeTab(CreativeTabVF.VF_TAB);
        setUnlocalizedName(name);
    }

    @Override
    public String getUnlocalizedName()
    {
        return LocalizationHelper.unlocalizedItemName(super.getUnlocalizedName());
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return getUnlocalizedName();
    }

    @Override
    public Item setUnlocalizedName(String name)
    {
        GameRegistry.registerItem(this, name);
        return super.setUnlocalizedName(name);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(LocalizationHelper.unwrappedUnlocalizedName(this));
    }
}
