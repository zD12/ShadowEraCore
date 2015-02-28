package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_fakeleave implements CommandExecutor {

    public ShadowEra plugin; // points to the main class
    
    public Command_fakeleave(ShadowEra plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (! (player.hasPermission("shadoweracore.command.fakeleave"))) {
          sender.sendMessage(ChatColor.DARK_RED + "You do not have access to that command.");
          return true;
          }
          Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.GREEN + "-" + ChatColor.GRAY + "] " + player.getName());
          player.chat("/v");
          player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "ShadowEraMod" + ChatColor.DARK_GRAY + "] " + ChatColor.GOLD + " You have successfully left the game (not really but ya know what I mean xD)");       
        return false;
    }
}