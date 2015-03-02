package me.BrandonSteed.ShadowEra.Modules;

import me.BrandonSteed.ShadowEra.ShadowEra;
import org.bukkit.Server;

public class ShadowEraModule
{

    protected final ShadowEra plugin;
    protected final Server server;

    public ShadowEraModule(ShadowEra plugin)
    {
        this.plugin = plugin;
        this.server = plugin.getServer();
    }
}
