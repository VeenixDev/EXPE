package de.veenix.mmoengine.system.listeners;

import de.veenix.mmoengine.system.SystemManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class BlockListeners implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onBlockBreak(BlockBreakEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockBurn(BlockBurnEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockCanBuild(BlockCanBuildEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockCook(BlockCookEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockDamage(BlockDamageEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockDispenseArmor(BlockDispenseArmorEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockDispense(BlockDispenseEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockDropItem(BlockDropItemEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockExp(BlockExpEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockExplode(BlockExplodeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockFade(BlockFadeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockFertilize(BlockFertilizeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockForm(BlockFormEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockFromTo(BlockFromToEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockGrow(BlockGrowEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockIgnite(BlockIgniteEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockMultiPlace(BlockMultiPlaceEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockPhysics(BlockPhysicsEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockPistonExtend(BlockPistonExtendEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockPistonRetract(BlockPistonRetractEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockPlace(BlockPlaceEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockReceiveGame(BlockReceiveGameEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockRedstone(BlockRedstoneEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockShearEntity(BlockShearEntityEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockSpread(BlockSpreadEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onCauldronLevelChange(CauldronLevelChangeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityBlockForm(EntityBlockFormEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onFluidLevelChange(FluidLevelChangeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onLeavesDecay(LeavesDecayEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onMoistureChange(MoistureChangeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onNotePlay(NotePlayEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onSignChange(SignChangeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onSpongeAbsorb(SpongeAbsorbEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }
}
