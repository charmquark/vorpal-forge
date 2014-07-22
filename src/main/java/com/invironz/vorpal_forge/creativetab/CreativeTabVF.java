package com.invironz.vorpal_forge.creativetab;

import com.invironz.vorpal_forge.init.VFItems;
import com.invironz.vorpal_forge.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabVF
{
    public static final CreativeTabs VF_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return VFItems.vorpalIngot;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return Reference.MOD_NAME;
        }
    };
}
