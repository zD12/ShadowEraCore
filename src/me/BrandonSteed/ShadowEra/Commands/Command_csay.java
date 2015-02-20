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
import net.minecraft.util.org.apache.commons.lang3.StringUtils;

public class Command_csay implements CommandExecutor {

    public ShadowEra plugin; // points to the main class

    public Command_csay(ShadowEra plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
         if (args.length == 0)
            {
                sender.sendMessage(ChatColor.DARK_RED + "null.");
            }
            
            if (args.length > 0)
            {
                Bukkit.broadcastMessage(String.format("§7[CONSOLE]§f<§4%s§f> %s", sender.getName(), StringUtils.join(args, " ")));
            }
            
        return false;
       
    }      
}
