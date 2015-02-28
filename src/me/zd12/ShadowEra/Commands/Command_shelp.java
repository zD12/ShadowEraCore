package me.zd12.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Sound;

public class Command_shelp implements CommandExecutor
{
  public ShadowEra plugin;
  
  public Command_shelp(ShadowEra plugin)
  {
    this.plugin = plugin;
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (sender.hasPermission("shadoweracore.command.shelp") && sender instanceof Player)
    {
      int length = args.length;
      
      if (length == 0)
      {
        for (Player p : Bukkit.getOnlinePlayers())
        {
          sender.sendMessage("Proper usage:  '/shelp user'");
        }
      }
      
      if (length == 1)
      {
        boolean playerFound = false;
        
        for (Player playerToClear : Bukkit.getServer().getOnlinePlayers())
        {
          if (playerToClear.getName().equalsIgnoreCase(args[0]))
          {
            {
              playerToClear.sendMessage("Hey " + playerToClear.getDisplayName() + ", you're awesome!");
              playerToClear.sendMessage("We'd miss you if you left.");
              playerToClear.sendMessage("You should talk about it, before you do anything you can't undo.");
              playerToClear.sendMessage("1-800-273-8255, it's okay.  Let's just talk.");
              playerToClear.setExp(5000);
            }
                        playerToClear.playSound(playerToClear.getLocation(), Sound.LEVEL_UP, 1, 1);
            playerFound = true;
            break;
          }
        }
        
        if (playerFound == false)
        {
          sender.sendMessage(ChatColor.DARK_RED + "Error: " + ChatColor.RED + "Couldn't find " + args[0] + ".");
        }
        else
        {
          sender.sendMessage(ChatColor.YELLOW + "/shelp <player>: " + ChatColor.WHITE + "Send suicide help information.");
        }
        
        return true;
      }
    }
    
    return true;
  }
}
