package com.invironz.vorpal_forge.item;

public abstract class ItemVFPart extends ItemVF
{
    public ItemVFPart(String name)
    {
        super();
        setMaxStackSize(1);
        setUnlocalizedName(name);
    }
}
