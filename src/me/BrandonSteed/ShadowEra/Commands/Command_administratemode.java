package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import me.zd12.ShadowEra.SE_Messages;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Command_administratemode implements CommandExecutor {

    public ShadowEra plugin; // points to the main class

    public Command_administratemode(ShadowEra plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
          Player player = (Player) sender;
          if (! (player.hasPermission("shadoweracore.command.administratemode"))) {
          sender.sendMessage(SE_Messages.NO_PREMS);
          return true;
          }
          if (args.length == 0) {
          player.sendMessage(SE_Messages.USAGE + "/administratemode [on|off]");
          }
          
          else if (args[0].equalsIgnoreCase("on")) {
          player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
          player.chat("/fly");
          player.sendMessage(ChatColor.GREEN + "ShadowEra" + ChatColor.RED + " >>" + ChatColor.GREEN + " You have activated administration mode, please do /administrationmode off to disable :D");
          }   
          
          else if (args[0].equalsIgnoreCase("off")) {
          player.chat("/heal");
          player.chat("/fly");
          player.sendMessage(SE_Messages.TAG_MOD + ChatColor.GREEN + "You have disabled administration mode!");
          } 
        return false;
       
    }      
}