package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.SE_Messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_fr extends BukkitCommand
{
  @Override
  public boolean run(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player) sender;
    
    int length = args.length;
    
    if (length == 0)
    {
      sender.sendMessage("/fr [on | off]");
      return true;
    }
    
    if (args[0].equalsIgnoreCase("on"))
    {
      Bukkit.broadcastMessage(ChatColor.AQUA + sender.getName() + " - Freezing all players");
      
      for (Player player : Bukkit.getOnlinePlayers())
      {
        player.setFlySpeed((float) 0.0); 
        player.setWalkSpeed((float) 0.0); 
      }
      
      sender.sendMessage(ChatColor.GRAY + "All players frozen.");
      return true;
    }
    
    else if (args[0].equalsIgnoreCase("off"))
    {
      Bukkit.broadcastMessage(ChatColor.AQUA + sender.getName() + " - Unfreezing all players");
      
      for (Player player : Bukkit.getOnlinePlayers())
      {
        player.setFlySpeed((float) 1.0);
        player.setWalkSpeed((float) 1.0);
      }
      
      sender.sendMessage(ChatColor.GRAY + "All players unfrozen.");
      return true;
    }
    
    return true;
  }
}
