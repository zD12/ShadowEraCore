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

public class Command_promote implements CommandExecutor {

    public ShadowEra plugin; // points to the main class

    public Command_promote(ShadowEra plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
          Player player = (Player) sender;
          if (! (player.hasPermission("shadoweracore.command.promote"))) {
          sender.sendMessage(ChatColor.DARK_RED + "You do not have access to that command.");
          return true;
          }
          if (args.length == 0) {
          player.sendMessage(ChatColor.RED + "Correct Usage is: /promote <player> <helper / moderator / admin / coowner / developer / owner");
          }
          
          Player user = player.getServer().getPlayer(args[0]);
          
          if (user == null) {
                    player.sendMessage(ChatColor.RED + "Invalid Player");
                    return true;
                }
          
          else if (args[0].equalsIgnoreCase("helper")) {
          player.chat("/manuadd " + user.getName() + " helper");
          Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.GREEN + "Staff" + ChatColor.GRAY + "] " + ChatColor.DARK_RED + player.getName() + ChatColor.GRAY  + " set " + ChatColor.DARK_RED + user.getName() + " as a helper!");
          user.sendMessage(ChatColor.GREEN + "Congrats :D");
          }  
          
          else if (args[0].equalsIgnoreCase("coowner")) {
          player.chat("/manuadd " + user.getName() + " coowner");
          Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.GREEN + "Staff" + ChatColor.GRAY + "] " + ChatColor.DARK_RED + player.getName() + ChatColor.GRAY  + " set " + ChatColor.DARK_RED + user.getName() + " as a Co Owner!");
          user.sendMessage(ChatColor.GREEN + "Congrats :D");
          } 
          
          else if (args[0].equalsIgnoreCase("moderator")) {
          player.chat("/manuadd " + user.getName() + " moderator");
          Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.GREEN + "Staff" + ChatColor.GRAY + "] " + ChatColor.DARK_RED + player.getName() + ChatColor.GRAY  + " set " + ChatColor.DARK_RED + user.getName() + " as a moderator!");
          user.sendMessage(ChatColor.GREEN + "Congrats :D");
          } 
        return false;
       
    }      
}
