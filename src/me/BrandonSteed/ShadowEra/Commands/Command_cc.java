package me.BrandonSteed.ShadowEra.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

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
      Player player = (Player) sender;
      
      for (final Player p : Bukkit.getOnlinePlayers())
      {
        p.playSound(player.getLocation(), Sound.FIREWORK_BLAST, 1, 1);
      }
      
      for (int i = 0; i <= 100; i++)
      {
        Bukkit.broadcastMessage("");
      }
      Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "Chat cleared by " + sender.getName() + ".");
      
      return true;
    }
    
    return true;
  }
}
