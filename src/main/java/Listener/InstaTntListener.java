package Listener;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class InstaTntListener implements Listener {
    @EventHandler
    public static void onTnt(BlockPlaceEvent event) {
        if(event.getBlock().getType() == Material.TNT) {
            event.getBlock().setType(Material.AIR);
            TNTPrimed tnt = (TNTPrimed) event.getBlock().getLocation().getWorld().spawnEntity(event.getBlock().getLocation().add(0.5, 0, 0.5), EntityType.PRIMED_TNT);
        }
    }
}
