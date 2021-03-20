package Listener;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class SoupListener implements Listener {
    @EventHandler
    public static void onSoup(PlayerInteractEvent event) {
        if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            Material m = event.getPlayer().getItemInHand().getType();
            if(m == Material.BEETROOT_SOUP || m == Material.MUSHROOM_STEW) {
                if(event.getPlayer().getHealth() >= 20)
                    return;
                if(event.getPlayer().getHealth() >= 17)
                    event.getPlayer().setHealth(20);
                if(event.getPlayer().getHealth() <= 17)
                    event.getPlayer().setHealth(event.getPlayer().getHealth() + 3.0);
                event.getPlayer().setItemInHand(new ItemStack(Material.BOWL));
            }
        }
    }
}
