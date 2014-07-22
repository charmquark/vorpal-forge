package com.invironz.vorpal_forge;

import com.invironz.vorpal_forge.handler.ConfigurationHandler;
import com.invironz.vorpal_forge.init.VFItems;
import com.invironz.vorpal_forge.proxy.IProxy;
import com.invironz.vorpal_forge.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class VorpalForge
{
    @Mod.Instance(Reference.MOD_ID)
    public static VorpalForge instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInitialization(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.initialize(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        VFItems.initialize();
    }

    @Mod.EventHandler
    public void initialization(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInitialization(FMLPostInitializationEvent event)
    {

    }
}
