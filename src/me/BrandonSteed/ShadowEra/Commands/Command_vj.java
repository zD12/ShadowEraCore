package me.BrandonSteed.ShadowEra.Commands;

import java.util.Arrays;
import net.minecraft.util.org.apache.commons.lang3.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class Command_vj implements CommandExector;
{
  public ShadowEra plugin;
  
  public Command_vj(ShadowEra plugin)
  {
    this.plugin = plugin;
  }
  
  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    int length = args.length;
    
    if (length == 0)
    {
      sender.sendMessage(ChatColor.WHITE + "Slam the VJHammer over someone.");
      sender.sendMessage(ChatColor.WHITE + "/vj <player>");
    }
    
    if (length == 1)
    {
      boolean playerFound = false;
      
      for (Player player : Bukkit.getServer().getOnlinePlayers())
      {
        if (player.getName().equalsIgnoreCase(args[0]))
        {
          Bukkit.broadcastMessage(ChatColor.RED + sender.getName() + " - Slamming the VJHammer over " + player.getName() + ".");
          Bukkit.broadcastMessage(ChatColor.DARK_RED + "VjGamingUK2000 - I AM REALLY DISAPPOINTED IN YOU " + player.getName() + "!!!");
          Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "VjGamingUK2000 - YOU SHALL FACE MY DEEP N' POWERFUL PURPLE WRATH!!!");
          player.setVelocity(player.getVelocity().clone().add(new Vector(0, 50, 0)));
          player.getWorld().createExplosion(player.getLocation(), 4F);
          player.setVelocity(player.getVelocity().clone().add(new Vector(20, 50, 0)));
          player.setFireTicks(10000);
          player.setHealth(0.0);
          player.setFireTicks(10000);
          
          new BukkitRunnable()
          {
            @Override
            public void run()
            {
              player.setVelocity(player.getVelocity().clone().add(new Vector(0, 50, 20)));
              player.getWorld().strikeLightning(player.getLocation());
              player.setFireTicks(10000);
              player.setHealth(0.0);
              player.setFireTicks(10000);
            }
          }.runTaskLater(this, 2L * 20L);
          
          new BukkitRunnable()
          {
            @Override
            public void run()
            {
              for (final Player player : Bukkit.getOnlinePlayers())
              {
                // woman screaming
                player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
              }
              
              player.chat("NO!");
              player.chat("Please VjGamingUK! Please don't cast your purple powers on me?");
              Bukkit.broadcastMessage("§f<§7[§5Purple Overlord§7] §5VjGamingUK2000§f> Its too late, good day sir.");
              player.chat("I am a idiot.");
            }.runTaskLater(this, 3L * 20L);
            
            new BukkitRunnable()
            {
              @Override
              public void run()
              {
                for (final Player player : Bukkit.getOnlinePlayers())
                {
                  player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
                }
                player.chat(ChatColor.ITALIC + "screams");
              }
            }.runTaskLater(this, 4L * 20L);
            
            new BukkitRunnable()
            {
              @Override
              public void run()
              {
                for (final Player player : Bukkit.getOnlinePlayers())
                {
                  player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
                }
                
                for (int i = 0; i <= 100; i++)
                {
                  player.getWorld().strikeLightning(player.getLocation());
                }
                player.setFireTicks(10000);
                player.setHealth(0.0);
                player.setFireTicks(10000);
                player.kickPlayer(ChatColor.DARK_PURPLE + "The purple overlord of the VJHammer has spoken!");
                player.setBanned(true);
                
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has been banned!");
              }
            }.runTaskLater(this, 5L * 20L);
            
            playerFound = true;
            break;
          }
        }
        
        if (playerFound == false)
        {
          sender.sendMessage(ChatColor.DARK_RED + "Error: " + ChatColor.RED + "Couldn't find " + args[0] + ".");
          return true;
        }
        else
        {
          sender.sendMessage(ChatColor.RED + "null.");
        }
        
        return true;
      }
    }
    
    return true;
  }
}
