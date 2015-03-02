package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.SE_Messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_fakeleave extends BukkitCommand {

    @Override
    public boolean run(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (! (player.hasPermission("shadoweracore.command.fakeleave"))) {
          sender.sendMessage(SE_Messages.NO_PREMS);
          return true;
          }
          Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.GREEN + "-" + ChatColor.GRAY + "] " + player.getName());
          player.chat("/v");
          player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "ShadowEraMod" + ChatColor.DARK_GRAY + "] " + ChatColor.GOLD + " You have successfully left the game (not really but ya know what I mean xD)");       
        return false;
    }
}
