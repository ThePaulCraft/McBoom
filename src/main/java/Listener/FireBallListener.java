package Listener;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class FireBallListener implements Listener {
    @EventHandler
    public static void onFireBall(PlayerInteractEvent event) {
        if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if(event.getItem().getType().equals(Material.FIRE_CHARGE)) {
                Player player = event.getPlayer();
                ItemStack item = player.getItemInHand();
                if(item.getAmount() == 1) {
                    if(player.getGameMode() != GameMode.CREATIVE)
                        player.setItemInHand(new ItemStack(Material.AIR));
                    event.setCancelled(true);
                } else {
                    if(player.getGameMode() != GameMode.CREATIVE)
                        item.setAmount(item.getAmount() - 1);
                    Location loc = player.getEyeLocation();
                    Fireball fireball = (Fireball) player.getEyeLocation().getWorld().spawnEntity(loc, EntityType.FIREBALL);
                    fireball.setVelocity( player.getEyeLocation().getDirection().normalize().multiply(1.2));
                    fireball.setShooter(player);
                    player.setItemInHand(item);
                    event.setCancelled(true);
                }
            }
        }
    }
}
