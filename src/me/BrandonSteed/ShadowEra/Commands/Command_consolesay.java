package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import me.zd12.ShadowEra.SE_Messages;
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
          sender.sendMessage(SE_Messages.NO_PREMS);
          return true;
          }
          String message = StringUtils.join(args, " ");
          Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "[Server] " + message);
          player.sendMessage(SE_Messages.TAG_MOD + ChatColor.GOLD + "You have successfully said " + message + " as console!");
        return false;
    }
}