package me.BrandonSteed.ShadowEra.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Sound;

public class Command_cc implements CommandExecutor
{
  public ShadowEra plugin;
  
  public Command_cc(ShadowEra plugin)
  {
    this.plugin = plugin;
  }
  
  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (sender.hasPermission("shadoweracore.command.cc") && sender instanceof Player)
    {
      int length = args.length;
      
      if (length == 0)
      {
        for (Player p : Bukkit.getOnlinePlayers())
        {
          p.playSound(p.getLocation(), Sound.FIREWORK_BLAST, 1, 1);
        }
        
        for (int i = 0; i <= 100; i++)
        {
          Bukkit.broadcastMessage("");
        }
        Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "Chat cleared by " + sender.getName() + ".");
      }
      
      if (length == 1)
      {
        boolean playerFound = false;
        
        for (Player playerToClear : Bukkit.getServer().getOnlinePlayers())
        {
          if (playerToClear.getName().equalsIgnoreCase(args[0]))
          {
            for (int i = 0; i <= 100; i++)
            {
              playerToClear.sendMessage("");
            }
            playerToClear.sendMessage(ChatColor.DARK_PURPLE + "Your chat was cleared by " + sender.getName() + ".");
            playerToClear.playSound(playerToClear.getLocation(), Sound.FIREWORK_BLAST, 1, 1);
            sender.sendMessage(ChatColor.DARK_PURPLE + "Cleared " + playerToClear.getName() + "'s chat.");
            playFound = true;
            break;
          }
        }
        
        if (playerFound == false)
        {
          sender.sendMessage(ChatColor.DARK_RED + "Error: " + ChatColor.RED + "Couldn't find " + args[0] + ".");
        }
        else
        {
          sender.sendMessage(ChatColor.WHITE + "/cc:" + ChatColor.YELLOW + "Clear the entire server's chat.");
          sender.sendMessage(ChatColor.WHITE + "/cc <player>: " + ChatColor.YELLOW + "Clear someone's chat.");
        }
        
        return true;
      }
    }
    
    return true;
  }
}
