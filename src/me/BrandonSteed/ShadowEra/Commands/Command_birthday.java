package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.Material;


public class Command_birthday implements CommandExecutor {

    public ShadowEra plugin; // points to the main class

    public Command_birthday(ShadowEra plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
          Player player = (Player) sender;
          if (! (player.hasPermission("shadoweracore.command.rage"))) {
          sender.sendMessage(ChatColor.DARK_RED + "You do not have access to that command.");
          return true;
          }
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          
        {
           final int firstEmpty = player.getInventory().firstEmpty();
            if (firstEmpty >= 0)
            {
                player.getInventory().setItem(player.getInventory().getHeldItemSlot(), new ItemStack(Material.CAKE, 1));
            } 
        }
        
        final ItemStack heldItem = new ItemStack(Material.CAKE);
        final ItemMeta heldItemMeta = heldItem.getItemMeta();
        heldItemMeta.setDisplayName((new StringBuilder()).append(ChatColor.WHITE).append("Generals ").append(ChatColor.DARK_GRAY).append("Birthday!").toString());
        heldItem.setItemMeta(heldItemMeta);
        
        return false;
    }

}
