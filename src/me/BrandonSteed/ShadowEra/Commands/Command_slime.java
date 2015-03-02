package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_slime extends BukkitCommand {

    @Override
    public boolean run(CommandSender sender, Command cmd, String label, String[] args) {
           Player slime = Bukkit.getServer().getPlayer("Got_No_Friends");
           Player player = (Player) sender;
        if (slime != null)
        {
            player.sendMessage(ChatColor.GREEN + "The owner is " + ChatColor.GREEN + "online" + ChatColor.GREEN + "!");
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
