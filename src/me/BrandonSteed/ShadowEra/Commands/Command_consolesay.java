package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import net.minecraft.util.org.apache.commons.lang3.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_consolesay implements CommandExecutor {

    public ShadowEra plugin; // points to the main class

    public Command_consolesay(ShadowEra plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (! (player.hasPermission("shadoweracore.command.consolesay"))) {
          sender.sendMessage(ChatColor.DARK_RED + "You do not have access to that command.");
          return true;
          }
          String message = StringUtils.join(args, " ");
          Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "[Server] " + message);
          player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "ShadowEraMod" + ChatColor.DARK_GRAY + "]" + ChatColor.GOLD + " You have successfully said " + message + " as console!");
          
        
        return false;

    }
    }