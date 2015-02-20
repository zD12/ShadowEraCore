package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_slime implements CommandExecutor {

    public ShadowEra plugin; // points to the main class

    public Command_slime(ShadowEra plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
           Player slime = Bukkit.getServer().getPlayer("Got_No_Friends");
           Player player = (Player) sender;
        if (slime != null)
        {
            player.sendMessage(ChatColor.GREEN + "The owner is " + ChatColor.BLUE + "online" + ChatColor.GREEN + "!");
            return true;

        }
        else if (slime == null)
        {
            player.sendMessage(ChatColor.GREEN + "The owner is " + ChatColor.DARK_RED + "offline" + ChatColor.GREEN + "!");
            return true;
        }

        else
        {

        }
        return false;

    }
    }