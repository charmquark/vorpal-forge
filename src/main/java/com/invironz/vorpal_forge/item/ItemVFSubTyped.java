package com.invironz.vorpal_forge.item;

import com.invironz.vorpal_forge.reference.Names;
import com.invironz.vorpal_forge.utility.LocalizationHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public abstract class ItemVFSubTyped extends ItemVF
{
    protected IIcon[] icons;
    protected int     maxSubType;

    public ItemVFSubTyped(String name, int maxSubType)
    {
        super(name);
        setHasSubtypes(true);
        icons = new IIcon[maxSubType + 1];
        this.maxSubType = maxSubType;
    }

    @Override
    public IIcon getIconFromDamage(int damage)
    {
        return getIconFromDamageForRenderPass(damage, 0);
    }

    @Override
    public IIcon getIconFromDamageForRenderPass(int damage, int n)
    {
        return icons[damage];
    }

    @Override
    public void getSubItems(Item item, CreativeTabs creativeTabs, List list)
    {
        for (int i = 0; i <= maxSubType; ++i)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return getUnlocalizedSubTypeName(itemStack.getItemDamage());
    }

    public abstract String getUnlocalizedSubTypeName(int subType);

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        for (int i = 0; i < icons.length; ++i)
        {
            icons[i] = iconRegister.registerIcon(LocalizationHelper.unwrappedName(getUnlocalizedSubTypeName(i)));
        }
    }
}
