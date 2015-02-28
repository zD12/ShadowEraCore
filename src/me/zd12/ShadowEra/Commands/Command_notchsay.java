package me.zd12.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import me.zd12.ShadowEra.SE_Messages;
import net.minecraft.util.org.apache.commons.lang3.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_notchsay implements CommandExecutor {

    public ShadowEra plugin; // points to the main class

    public Command_notchsay(ShadowEra plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;    
        if (! (player.hasPermission("shadoweracore.command.notchsay"))) {
          sender.sendMessage(SE_Messages.NO_PREMS);
          return true;
       }
        String message = StringUtils.join(args, " ");
        
        Bukkit.broadcastMessage(SE_Messages.NOTCH + message);
        return false;

    }
}