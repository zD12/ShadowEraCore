package me.BrandonSteed.ShadowEra.Commands.NoSlash;

import me.zd12.ShadowEra.SE_Messages;
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
          sender.sendMessage(SE_Messages.NO_PREMS);
          return true;  // No idea how to fix this..
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
                    p.sendMessage(SE_Messages.USAGE + ".pluginon <plugin>");  // This command is 'dot' based, not actual slashes..
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
                    p.sendMessage(SE_Messages.NO_PLAYER);
                }
                event.setCancelled(true);
            }
        }
    }
}
