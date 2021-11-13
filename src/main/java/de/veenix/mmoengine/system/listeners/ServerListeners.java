package de.veenix.mmoengine.system.listeners;

import de.veenix.mmoengine.system.SystemManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.*;

public class ServerListeners implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onBroadcastMessage(BroadcastMessageEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onMapInitialize(MapInitializeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onPluginDisable(PluginDisableEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onPluginEnable(PluginEnableEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlugin(PluginEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onRemoteServerCommand(RemoteServerCommandEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onServerCommand(ServerCommandEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onServerListPing(ServerListPingEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onServerLoadEvent(ServerLoadEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onService(ServiceEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onServiceRegister(ServiceRegisterEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onServiceUnregister(ServiceUnregisterEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onTabComplete(TabCompleteEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }
}
