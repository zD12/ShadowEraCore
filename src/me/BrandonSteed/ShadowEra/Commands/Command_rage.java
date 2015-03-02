package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.SE_Messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_rage extends BukkitCommand {

    @Override
    public boolean run(CommandSender sender, Command cmd, String label, String[] args) {
          Player player = (Player) sender;
          if (! (player.hasPermission("shadoweracore.command.rage"))) {
          sender.sendMessage(SE_Messages.NO_PREMS);
          return true;
          }
          Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has exploded with FIERY RAGE!!!");
          Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has RAGEQUIT!");
          player.setHealth(0);
          player.kickPlayer(ChatColor.RED + "You exploded with fiery rage!");
        
        return true;

    }
}
