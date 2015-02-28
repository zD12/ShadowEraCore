package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.minecraft.util.org.apache.commons.lang3.StringUtils;

public class Command_console implements CommandExecutor {

    public ShadowEra plugin; // points to the main class

    public Command_console(ShadowEra plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
         player Player = (Player) sender;
         if (! (player.hasPermission("shadoweracore.command.console"))) {
          sender.sendMessage(ChatColor.DARK_RED + "You do not have access to that command.");
          return true;
         }
         
         if (args.length == 0)
            {
                sender.sendMessage(ChatColor.DARK_RED + "null.");
            }
            
         else if (args[0].equalsIgnoreCase("say"))
            {
                if (args.length == 1)
                {
                    player.sendMessage(ChatColor.RED + "Usage: /console say <message>");
                    event.setCancelled(true);
                    return;
                }
                if (args.length > 0)
                {
                Bukkit.broadcastMessage(String.format("§7[Console: " + sender.getName() + " §c ", StringUtils.join(args, " ")));
                }
            }    

            
        else if (args[0].equalsIgnoreCase("runcmd"))
            {
                if (args.length == 1)
                {
                    player.sendMessage(ChatColor.RED + "Usage: /console runcmd <command>");
                    event.setCancelled(true);
                    return;
                }
                String command = "";
                for (i = 1; i < args.length; i++)
                {
                    command = command + args[i] + " ";
                }
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), command.trim());
                event.setCancelled(true);
                return;
            }    
        return false;
    }
    }      
}
