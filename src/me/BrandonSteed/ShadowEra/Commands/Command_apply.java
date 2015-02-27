package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Command_apply implements CommandExecutor {

    public ShadowEra plugin; // points to the main class

    public Command_apply(ShadowEra plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
          Player player = (Player) sender;
          if (! (player.hasPermission("shadoweracore.command.apply"))) {
          sender.sendMessage(ChatColor.DARK_RED + "You do not have access to that command.");
          return true;
          }
          if (args.length == 0) {
          player.sendMessage(ChatColor.RED + "Correct Usage is: /promote <helper | alreadyhelper>");
          }
          
          else if (args[0].equalsIgnoreCase("helper")) {
          user.sendMessage(ChatColor.GREEN + "Hello! Applications are not currently open! Please try when the server announces they are open!");
          }  
          
        return false;
       
    }      
}
