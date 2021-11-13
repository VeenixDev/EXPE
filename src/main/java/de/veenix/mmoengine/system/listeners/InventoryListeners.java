package de.veenix.mmoengine.system.listeners;

import de.veenix.mmoengine.system.SystemManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.*;

public class InventoryListeners implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onBrewEvent(BrewEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBrewingStandFuel(BrewingStandFuelEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onCraftItem(CraftItemEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onFurnaceBurn(FurnaceBurnEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onFurnaceExtract(FurnaceExtractEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onFurnaceSmelt(FurnaceSmeltEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onFurnaceStartSmelt(FurnaceStartSmeltEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onInventoryClick(InventoryClickEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onInventoryClose(InventoryCloseEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onInventoryCreative(InventoryCreativeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onInventoryDrag(InventoryDragEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onInventoryInteract(InventoryInteractEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onInventoryMoveItem(InventoryMoveItemEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onInventoryOpen(InventoryOpenEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onInventoryPickupItem(InventoryPickupItemEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onPrepareAnvil(PrepareAnvilEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onPrepareItemCraft(PrepareItemCraftEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onPrepareSmithing(PrepareSmithingEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onSmithItem(SmithItemEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onTradeSelect(TradeSelectEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }
}
