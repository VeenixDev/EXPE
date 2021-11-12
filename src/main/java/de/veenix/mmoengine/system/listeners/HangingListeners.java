package de.veenix.mmoengine.system.listeners;

import de.veenix.mmoengine.system.SystemManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.hanging.HangingPlaceEvent;

public class HangingListeners implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onHangingBreakByEntity(HangingBreakByEntityEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onHangingBreak(HangingBreakEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onHangingPlace(HangingPlaceEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }
}
