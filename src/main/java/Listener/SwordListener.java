package Listener;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class SwordListener implements Listener {
    @EventHandler
    public static void onJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        p.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(100.0);
    }
}
