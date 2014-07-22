package com.invironz.vorpal_forge.client.gui;

import com.invironz.vorpal_forge.handler.ConfigurationHandler;
import com.invironz.vorpal_forge.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

public class VFGuiConfig extends GuiConfig
{
    public VFGuiConfig(GuiScreen guiScreen)
    {
        super(
            guiScreen,
            new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
            Reference.MOD_ID,
            false,
            false,
            GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString())
        );
    }
}
