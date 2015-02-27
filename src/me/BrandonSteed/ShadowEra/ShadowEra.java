package me.BrandonSteed.ShadowEra;

import me.BrandonSteed.ShadowEra.Commands.*;
import net.minecraft.util.org.apache.commons.lang3.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import me.BrandonSteed.ShadowEra.Listeners.PlayerListener;

public class ShadowEra extends JavaPlugin {
 public PlayerListener playerListener;
    public ShadowEra plugin;
     
    @Override
    public void onLoad() {
        plugin = this;
        playerListener = new PlayerListener(plugin);
    }
    
    public void onEnable()
     {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(plugin.playerListener, plugin);
         getCommand("rage").setExecutor((org.bukkit.command.CommandExecutor) new Command_rage(this));
        getCommand("announce").setExecutor((org.bukkit.command.CommandExecutor) new Command_announce(this));
        getCommand("administratemode").setExecutor((org.bukkit.command.CommandExecutor) new Command_administratemode(this));
        getCommand("slime").setExecutor((org.bukkit.command.CommandExecutor) new Command_slime(this));
        getCommand("promote").setExecutor((org.bukkit.command.CommandExecutor) new Command_promote(this));
        getCommand("nv").setExecutor((org.bukkit.command.CommandExecutor) new Command_nv(this));
        getCommand("fakeleave").setExecutor((org.bukkit.command.CommandExecutor) new Command_fakeleave(this));
        getCommand("serversay").setExecutor((org.bukkit.command.CommandExecutor) new Command_consolesay(this));
        getCommand("machat").setExecutor((org.bukkit.command.CommandExecutor) new Command_machat(this));
        getCommand("console").setExecutor((org.bukkit.command.CommandExecutor) new Command_console(this));
        getCommand("birthday").setExecutor((org.bukkit.command.CommandExecutor) new Command_birthday(this));
        getCommand("cc").setExecutor((org.bukkit.command.CommandExecutor) new Command_cc(this));
        getCommand("forcecommand").setExecutor((org.bukkit.command.CommandExecutor) new Command_forcecommand(this));
        getCommand("fuck").setExecutor((org.bukkit.command.CommandExecutor) new Command_fuck(this));
        getCommand("apply").setExecutor((org.bukkit.command.CommandExecutor) new Command_apply(this));
        
        getLogger().info("[ShadowEraCore] Plugin by ShadowEra Development Team.");
        Bukkit.broadcastMessage(ChatColor.BLUE + "[ShadowEraCore] " + ChatColor.DARK_PURPLE + "Plugin by ShadowEra Development Team sucessfully enabled!");
       
     }
     
     public void onDisable()
     {
        getLogger().info("[ShadowEraCore] Plugin going to sleep...");
        Bukkit.broadcastMessage(ChatColor.BLUE + "[ShadowEraCore] " + ChatColor.DARK_PURPLE + "Plugin going to sleep...");
        Bukkit.broadcastMessage(ChatColor.BLUE + "[ShadowEraCore] " + ChatColor.RED + "Warning: ShadowEraCore was disabled on the ShadowEra server! Please re-enable.");
     }

}
