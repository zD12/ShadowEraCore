package me.BrandonSteed.ShadowEra;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerListener implements Listener
{
    public PlayerListener(ShadowEraCore plugin)
    {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
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
                        if (player.hasPermission("vjshadowera.event.thor"))
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
                    
                }
            }
        }
    }
}
