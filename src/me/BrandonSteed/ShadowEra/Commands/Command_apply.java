package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import me.zd12.ShadowEra.SE_Messages;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_apply implements CommandExecutor {

    public ShadowEra plugin; // points to the main class

    public Command_apply(ShadowEra plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
          Player player = (Player) sender;
          if (! (player.hasPermission("shadoweracore.command.apply"))) {
          sender.sendMessage(SE_Messages.NO_PREMS);
          return true;
          }
          if (args.length == 0) {
          player.sendMessage(SE_Messages.USAGE + "/promote <helper|alreadyhelper>");
          }
          
          else if (args[0].equalsIgnoreCase("helper")) {
          player.sendMessage(ChatColor.GREEN + "Hi, " + sender.getName() + "! Sorry, applications aren't open :c");
          }  
          
        return false;
       
    }      
}
