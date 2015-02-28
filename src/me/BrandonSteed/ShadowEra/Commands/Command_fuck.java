package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Command_fuck implements CommandExecutor {

  public ShadowEra plugin;
  
  public Command_fuck(ShadowEra plugin)
  {
    this.plugin = plugin;
  }
  
  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player) sender;
    
    int length = args.length;
    
    if (length == 0)
    {
      sender.sendMessage(ChatColor.WHITE + "Sic the Fuckhammer on people!");
      sender.sendMessage(ChatColor.WHITE + "/fuck <player>");
      return true;
    }
    
    if (length == 1)
    {
      boolean playerFound = false;
      
      for (Player player : Bukkit.getServer().getOnlinePlayers())
      {
        if (player.getName().equalsIgnoreCase(args[0]))
        {
          for (int i = 0; i <= 200; i++)
          {
            player.getWorld().strikeLightning(player.getLocation());
          }
          player.setHealth(0.0);
          player.setFireTicks(10000);
          Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> WHAT THE FUCK IS WRONG WITH YOU, YOU FUCKING DUMBASS???");
          Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> THIS IS THE SERVER SPEAKING, YOU ARE ON MOTHER FUCKING THIN ICE, YOU HEAR ME??");
          Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> I WILL RIP YOUR ENTIRE ASS APART, YOUR CLOSE TO PERMBAN!!!");
          Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> I WILL RIP ALL YOUR ORGANS OUT, YOU FUCKFACE!");
          Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> I WILL RAPE YOUR ENTIRE NIGGA FAMILY IF YOU DO THAT FUCKING BULLSHIT AGAIN!!!");
          Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> IF YOU BREAK ONE MORE MOTHER FUCKING BLOCK, IT'S PERMBAN FUCKING BITCH!!!");
          Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> I BET YOU'RE NOT EVEN LISTENING, YOU PIECE OF FUCKING SHIT! YOU DO THAT SHIT AGAIN, ITS PERMBAN YOU SHITHEAD!!!");
          Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> YOU'RE ON FUCKING THIN ICE!!!");
          Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> IF YOU BREAK ONE MORE FUCKING BLOCK, ITS PERMBAN, ILL PERMBAN YOUR ASS!!!!!");
          Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> NOW GET YOUR FUCKING SHIT TOGETHER YOU FUCKING SHITTY TWATTY ASSHOLE");
          
          new BukkitRunnable()
          {
            @Override
            public void run()
            {
              
              player.chat("What did I do Notch!?");
              Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> DON'T YOU DARE FUCKING ANSWER ME BACK YOU PIECE OF FUCKING SHIT! YOU KNOW WHAT YOU DID FUCKING BITCH!");
              player.chat("I didn't do anything...");
              Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> IF YOU FUCKING BACKTALK ME ONE MORE TIME, WATCH BY TOMORROW WHEN I COME TO YOUR HOUSE AND FUCKING TALK TO YOUR FUCKING PARENTS!");          player.chat("Noooooo!");
              player.chat("Please! My parents will kill me if you do.");
              Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> I DON'T FUCKING CARE, ITS TOO LATE WHEN YOU FUCKING IGNORED ME YOU DUMBASS, GOOD DAY DICKHEAD");
              Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> YOU STUPID FUCKING IDIOT.");
              Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> GO FUCKING KILL YOURSELF YOU WORTHLESS PIECE OF FUCKING SHIT.");
              Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> NOBODY FUCKING CARES ABOUT YOU.");
              Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> YOUR PARENTS FUCKING HATE YOU, YOU'RE FUCKING ADOPTED YOU STUPID FUCK.");
              Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> YOUR PARENTS THINK YOU'RE A WORTHLESS PIECE OF SHIT, NO ONE LIKES YOU.");
              Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> EVERYBODY HATES YOU, YOU STUPID FUCKING IDIOT.");
              Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> GO DIE, NO ONE WANTS YOU IN THIS WORLD. YOU TRY ANY FUNNY SHIT AGAIN...");
              Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> I WILL KILL YOUR FAMILY YOU FUCKING IDIOT.");
              // Not fully sure if Bukkit.getIP() will display the users IP address or the servers IP address.  Regardless, it's unlikely the user knows different.
              Bukkit.broadcastMessage("<" + ChatColor.GOLD + "Notch" + ChatColor.WHITE + "> I WILL TRACK DOWN YOUR IP, " + Bukkit.getIp() + " TO FIND WHERE YOUR HOUSE IS AND I WILL FUCKING KILL ALL MEMBERS OF YOUR FAMILY FUCKTARD!");
              player.chat("I'm freaking done. Please, ban me!");                  
            }
          }.runTaskLater((Plugin) this, 3L * 20L);
          
          new BukkitRunnable()
          {
            @Override
            public void run()
            {
              p.performCommand("tempban " + player.getName() + " 5m");
            }
          }.runTaskLater((Plugin) this, 5L * 20L);
          
          playerFound = true;
          break;
        }
      }
      
      if (playerFound == false)
      {
        sender.sendMessage(ChatColor.DARK_RED + "Error: " + ChatColor.RED + args[0] + " was not found!");
      }
      else
      {
        sender.sendMessage(ChatColor.DARK_RED + "Incorrect arguments!");
      }
      
      return true;
    }

    return true;
  }
}

// For the record, I don't approve of this command.. Very NSFW!
