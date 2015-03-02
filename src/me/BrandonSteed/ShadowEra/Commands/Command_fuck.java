/* package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.ShadowEra;
import me.zd12.ShadowEra.SE_Messages;
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
      sender.sendMessage(SE_Messages.USAGE + "/fuck <player>");
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
          Bukkit.broadcastMessage(SE_Messages.NOTCH + "WHAT THE FUCK IS WRONG WITH YOU, YOU FUCKING DUMBASS???");
          Bukkit.broadcastMessage(SE_Messages.NOTCH + "THIS IS THE SERVER SPEAKING, YOU ARE ON MOTHER FUCKING THIN ICE, YOU HEAR ME??");
          Bukkit.broadcastMessage(SE_Messages.NOTCH + "I WILL RIP YOUR ENTIRE ASS APART, YOUR CLOSE TO PERMBAN!!!");
          Bukkit.broadcastMessage(SE_Messages.NOTCH + "I WILL RIP ALL YOUR ORGANS OUT, YOU FUCKFACE!");
          Bukkit.broadcastMessage(SE_Messages.NOTCH + "I WILL RAPE YOUR ENTIRE NIGGA FAMILY IF YOU DO THAT FUCKING BULLSHIT AGAIN!!!");
          Bukkit.broadcastMessage(SE_Messages.NOTCH + "IF YOU BREAK ONE MORE MOTHER FUCKING BLOCK, IT'S PERMBAN FUCKING BITCH!!!");
          Bukkit.broadcastMessage(SE_Messages.NOTCH + "I BET YOU'RE NOT EVEN LISTENING, YOU PIECE OF FUCKING SHIT! YOU DO THAT SHIT AGAIN, ITS PERMBAN YOU SHITHEAD!!!");
          Bukkit.broadcastMessage(SE_Messages.NOTCH + "YOU'RE ON FUCKING THIN ICE!!!");
          Bukkit.broadcastMessage(SE_Messages.NOTCH + "IF YOU BREAK ONE MORE FUCKING BLOCK, ITS PERMBAN, ILL PERMBAN YOUR ASS!!!!!");
          Bukkit.broadcastMessage(SE_Messages.NOTCH + "NOW GET YOUR FUCKING SHIT TOGETHER YOU FUCKING SHITTY TWATTY ASSHOLE");
          
          new BukkitRunnable()
          {
            @Override
            public void run()
            {
              
              player.chat("What did I do Notch!?");
              Bukkit.broadcastMessage(SE_Messages.NOTCH + "DON'T YOU DARE FUCKING ANSWER ME BACK YOU PIECE OF FUCKING SHIT! YOU KNOW WHAT YOU DID FUCKING BITCH!");
              player.chat("I didn't do anything...");
              Bukkit.broadcastMessage(SE_Messages.NOTCH + "IF YOU FUCKING BACKTALK ME ONE MORE TIME, WATCH BY TOMORROW WHEN I COME TO YOUR HOUSE AND FUCKING TALK TO YOUR FUCKING PARENTS!");          player.chat("Noooooo!");
              player.chat("Please! My parents will kill me if you do.");
              Bukkit.broadcastMessage(SE_Messages.NOTCH + "I DON'T FUCKING CARE, ITS TOO LATE WHEN YOU FUCKING IGNORED ME YOU DUMBASS, GOOD DAY DICKHEAD");
              Bukkit.broadcastMessage(SE_Messages.NOTCH + "YOU STUPID FUCKING IDIOT.");
              Bukkit.broadcastMessage(SE_Messages.NOTCH + "GO FUCKING KILL YOURSELF YOU WORTHLESS PIECE OF FUCKING SHIT.");
              Bukkit.broadcastMessage(SE_Messages.NOTCH + "NOBODY FUCKING CARES ABOUT YOU.");
              Bukkit.broadcastMessage(SE_Messages.NOTCH + "YOUR PARENTS FUCKING HATE YOU, YOU'RE FUCKING ADOPTED YOU STUPID FUCK.");
              Bukkit.broadcastMessage(SE_Messages.NOTCH + "YOUR PARENTS THINK YOU'RE A WORTHLESS PIECE OF SHIT, NO ONE LIKES YOU.");
              Bukkit.broadcastMessage(SE_Messages.NOTCH + "EVERYBODY HATES YOU, YOU STUPID FUCKING IDIOT.");
              Bukkit.broadcastMessage(SE_Messages.NOTCH + "GO DIE, NO ONE WANTS YOU IN THIS WORLD. YOU TRY ANY FUNNY SHIT AGAIN...");
              Bukkit.broadcastMessage(SE_Messages.NOTCH + "I WILL KILL YOUR FAMILY YOU FUCKING IDIOT.");
              Bukkit.broadcastMessage(SE_Messages.NOTCH + "I WILL TRACK DOWN YOUR IP, " + player.getAddress() + " TO FIND WHERE YOUR HOUSE IS AND I WILL FUCKING KILL ALL MEMBERS OF YOUR FAMILY FUCKTARD!");
              player.chat("I'm freaking done. Ban me!");                  
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
        sender.sendMessage(SE_Messages.NO_PLAYER);
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
*/
// For the record, I don't approve of this command.. Very NSFW! -@zD12
// VJ you need to improve it. Make this not a command with swearing in it and make it a banning command.
