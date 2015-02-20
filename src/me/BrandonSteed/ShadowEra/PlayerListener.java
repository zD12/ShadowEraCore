package me.BrandonSteed.ShadowEra;
 
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
 
public class PlayerListener implements Listener
{
 
        public ShadowEra plugin;
       
        public PlayerListener(ShadowEra instance){
                plugin = instance;
        }
     
 @EventHandler
    public void onPlayerChat(PlayerChatEvent event) {
        if(event.getMessage().equalsIgnoreCase("/pl") || event.getMessage().equalsIgnoreCase("/plugins") || event.getMessage().equalsIgnoreCase("/bukkit:plugins") || event.getMessage().equalsIgnoreCase("/bukkit:pl"))
        event.getPlayer().sendMessage(ChatColor.GREEN + "This command is blocked!!");
        event.setCancelled(true);

    }
        
        @EventHandler(priority = EventPriority.HIGHEST)
        public void onPlayerJoin(PlayerJoinEvent e)
        {
                e.getPlayer().sendMessage(ChatColor.RED + "This server is using ShadowEraCore!");
                e.getPlayer().sendMessage(ChatColor.RED + "To get the source go to github.com/GotNoFriends/ShadowEraCore");
        }
      
  @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerInteract(PlayerInteractEvent event)
    {
        final Player player = event.getPlayer();
        
        switch (event.getAction())
        {
            case RIGHT_CLICK_AIR:
            case RIGHT_CLICK_BLOCK:
            {
                switch (event.getMaterial())
                {
                    case DIAMOND_AXE:
                    {
                        if (player.hasPermission("shadoweracore.event.thor"))
                        {
                            for (int i = 0; i <= 100; i++)
                            {
                                player.getWorld().strikeLightning(player.getTargetBlock(null, 500).getLocation());
                            }
                            player.getWorld().createExplosion(player.getTargetBlock(null, 500).getLocation(), 4F);
                        }
                        else
                        {
                            event.setCancelled(true);
                        }
         
                        break;
                    }
                }
            }
            
            case LEFT_CLICK_AIR:
            case LEFT_CLICK_BLOCK:
            {
                switch (event.getMaterial())
                {
                    // none yet
                }  
       
            }
        
        }
    }
}
