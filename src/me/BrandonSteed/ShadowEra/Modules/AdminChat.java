package me.BrandonSteed.ShadowEra.Modules;

import me.BrandonSteed.ShadowEra.SE_Utils;
import me.BrandonSteed.ShadowEra.ShadowEra;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AdminChat extends ShadowEraModule
{
    public AdminChat(ShadowEra plugin) 
    {
        super(plugin);
    }
    
    public static void chat(CommandSender sender, String message)
    {
        for (Player p : Bukkit.getOnlinePlayers())
        {
            if (SE_Utils.ADMINS.contains(sender.getName()))
            {
                p.sendMessage("§f[§aStaff§f] §7" + sender.getName() + " §a§b>>  §f" + message);
            }
        }
    }
}
