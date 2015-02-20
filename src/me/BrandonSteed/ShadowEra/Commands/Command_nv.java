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

public class Command_nv implements CommandExecutor {

    public ShadowEra plugin; // points to the main class

    public Command_nv(ShadowEra plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
          Player player = (Player) sender;
          if (! (player.hasPermission("shadoweracore.command.nv"))) {
          sender.sendMessage(ChatColor.DARK_RED + "You do not have access to that command.");
          return true;
          }
          if (args.length == 0) {
          player.sendMessage(ChatColor.RED + "Correct Usage is: /nv <on | off>");
          }
          
          else if (args[0].equalsIgnoreCase("on")) {
          player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 2000000, 1));
          player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "ShadowEraMod" + ChatColor.DARK_GRAY + "]" + ChatColor.GOLD + " You have activated nightvision, please do /nv off to disable :D");
          }   
          
          else if (args[0].equalsIgnoreCase("off")) {
          player.chat("/heal");
          player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "ShadowEraMod" + ChatColor.DARK_GRAY + "] " + ChatColor.GOLD + " You have disabled nightvision!");
          } 
        return false;
       
    }      
}