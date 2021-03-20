package de.thepaulcraft.boom;

import Listener.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Boom extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new FireBallListener(), this);
        manager.registerEvents(new InstaTntListener(), this);
        manager.registerEvents(new BowListener(), this);
        manager.registerEvents(new SwordListener(), this);
        manager.registerEvents(new SoupListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
