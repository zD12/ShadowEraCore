package me.zd12.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import me.zd12.ShadowEra.SE_Messages;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_associated implements CommandExecutor
{
  public ShadowEra plugin;
  
  public Command_associated(ShadowEra plugin)
  {
    this.plugin = plugin;
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (sender.hasPermission("shadoweracore.command.associated") && sender instanceof Player)
    {
      int length = args.length;
      
      if (length == 0)
      {
        {
          sender.sendMessage(ChatColor.AQUA + "Associated servers: ");
          sender.sendMessage(ChatColor.DARK_PURPLE + "Total" + ChatColor.YELLOW + "Freedom" + ChatColor.RESET + ": play.totalfreedom.me");
          sender.sendMessage(ChatColor.DARK_BLUE + "Freedom" + ChatColor.DARK_GREEN + "OP" + ChatColor.RESET + ": fop.us.to");
          sender.sendMessage(ChatColor.GRAY + "You may apply for an associated placement at " + SE_Messages.FORUMS_URL);
        }
      return true;
    }
  }
      return true;
  }
}