package com.invironz.vorpal_forge.block;

import com.invironz.vorpal_forge.creativetab.CreativeTabVF;
import com.invironz.vorpal_forge.reference.Reference;
import com.invironz.vorpal_forge.utility.LocalizationHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public abstract class BlockVF extends Block
{
    public BlockVF(String name, Material material)
    {
        super(material);
        setBlockName(name);
        setCreativeTab(CreativeTabVF.VF_TAB);
    }

    public BlockVF(String name)
    {
        this(name, Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return LocalizationHelper.unlocalizedBlockName(super.getUnlocalizedName());
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(LocalizationHelper.unwrappedUnlocalizedName(this));
    }
}
