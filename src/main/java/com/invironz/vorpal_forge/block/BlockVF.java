package com.invironz.vorpal_forge.block;

import com.invironz.vorpal_forge.reference.Reference;
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
    }

    public BlockVF(String name)
    {
        this(name, Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s:%s", Reference.MOD_ID, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(getUnwrappedUnlocalizedName());
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
