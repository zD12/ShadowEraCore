package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import net.minecraft.util.org.apache.commons.lang3.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_forcecommand implements CommandExecutor {

    public ShadowEra plugin; 

    public Command_forcecommand(ShadowEra plugin) 
    {
        this.plugin = plugin;
    }
    
    @Override
    public boolean onCommand(final CommandSender sender, Command cmd, String label, String[] args)
    {
      int length = args.length;
      
      if (length == 0)
      {
        sender.sendMessage(ChatColor.WHITE + "/forcecommand <player> <command> [args.]");
        return true;
      }
      
      if (length == 1)
      {
        boolean playerFound = false;
        
        for (Player player : Bukkit.getServer().getOnlinePlayers())
        {
          if (args[0].equals(sender.getName()))
          {
            sender.sendMessage(ChatColor.RED + "Dumbass.");
            return true;
          }
          
          if (player.getName().equalsIgnoreCase(args[0]))
          {
            player.performCommand((StringUtils.join(args, " ")));
            playerFound = true;
            break;
          }
        }
        
        if (playerFound == false)
        {
          sender.sendMessage(ChatColor.DARK_RED + "Error: " + ChatColor.RED + args[0] + " was not found!");
          return true;
        }
        
        return true;
      }
      
      return true;
    }
}
