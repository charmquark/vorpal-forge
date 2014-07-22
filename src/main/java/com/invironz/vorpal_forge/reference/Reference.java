package com.invironz.vorpal_forge.reference;

public class Reference
{
    private static final String _MC_VERSION = "1.7.10";
    private static final String _MOD_VERSION = "1.0";
    private static final String _PKG = "com.invironz.vorpal_forge";

    private static final String _PROXY_PKG = _PKG + ".proxy";


    public static final String MOD_ID = "VorpalForge";
    public static final String MOD_NAME = "Vorpal Forge";
    public static final String VERSION = _MC_VERSION + "-" + _MOD_VERSION;

    public static final String CLIENT_PROXY_CLASS = _PROXY_PKG + ".ClientProxy";
    public static final String GUI_FACTORY_CLASS = _PKG + ".client.gui.GuiFactory";
    public static final String SERVER_PROXY_CLASS = _PROXY_PKG + ".ServerProxy";
}
