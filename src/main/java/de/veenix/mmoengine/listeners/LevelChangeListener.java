package de.veenix.mmoengine.listeners;

import de.veenix.mmoengine.system.SystemManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLevelChangeEvent;

public class LevelChangeListener implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onLevelChange(PlayerLevelChangeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }
}
