package Listener;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public class BowListener implements Listener {
    @EventHandler
    public static void onBow(ProjectileLaunchEvent event) {
        if(event.getEntityType() == EntityType.ARROW) {
            event.getEntity().setBounce(true);
        }
    }
}
