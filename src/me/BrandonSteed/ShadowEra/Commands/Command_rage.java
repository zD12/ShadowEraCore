package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import me.zd12.ShadowEra.SE_Messages;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_rage implements CommandExecutor {

    public ShadowEra plugin; // points to the main class

    public Command_rage(ShadowEra plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
          Player player = (Player) sender;
          if (! (player.hasPermission("shadoweracore.command.rage"))) {
          sender.sendMessage(SE_Messages.NO_PREMS);
          return true;
          }
          Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has exploded with FIERY RAGE!!!");
          Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has RAGEQUIT!");
          player.setHealth(0);
          player.kickPlayer(ChatColor.RED + "You exploded with fiery rage!");
        
        return false;

    }
}