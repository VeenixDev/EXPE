package de.veenix.mmoengine.system.listeners;

import de.veenix.mmoengine.system.SystemManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.*;

public class EntityListeners implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onAreaEffectCloudApply(AreaEffectCloudApplyEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onArrowBodyCountChange(ArrowBodyCountChangeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onBatToggleSleep(BatToggleSleepEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onCreeperPower(CreeperPowerEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEnderDragonChangePhase(EnderDragonChangePhaseEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityAirChange(EntityAirChangeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityBreakDoor(EntityBreakDoorEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityBreed(EntityBreedEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityChangeBlock(EntityChangeBlockEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityCombustByBlock(EntityCombustByBlockEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityCombustByEntity(EntityCombustByEntityEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityCombust(EntityCombustEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityDamageByBlock(EntityDamageByBlockEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityDamage(EntityDamageEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityDeath(EntityDeathEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityDropItem(EntityDropItemEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityEnterBlock(EntityEnterBlockEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityLoveMode(EntityEnterLoveModeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityExhaustion(EntityExhaustionEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityExplode(EntityExplodeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityInteract(EntityInteractEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityPickupItem(EntityPickupItemEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityPlace(EntityPlaceEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityPortalEnter(EntityPortalEnterEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityPortalExit(EntityPortalExitEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityPortal(EntityPortalEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityPoseChange(EntityPoseChangeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityPotionEffect(EntityPotionEffectEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onRegainHealth(EntityRegainHealthEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityResurrect(EntityResurrectEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityShootBow(EntityShootBowEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntitySpawn(EntitySpawnEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntitySpellCast(EntitySpellCastEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityTame(EntityTameEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityTarget(EntityTargetEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityLivingEntity(EntityTargetLivingEntityEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityTeleport(EntityTeleportEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityToggleGlide(EntityToggleGlideEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityToggleSwim(EntityToggleSwimEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityTransform(EntityTransformEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityUnleash(EntityUnleashEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onExpBottle(ExpBottleEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onExplosionPrime(ExplosionPrimeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onFireworkExplode(FireworkExplodeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onFoodLevelChange(FoodLevelChangeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onHorseJump(HorseJumpEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onItemDespawn(ItemDespawnEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onItemMerge(ItemMergeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onItemSpawn(ItemSpawnEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onLingeringPotionSplash(LingeringPotionSplashEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onPiglinBarter(PiglinBarterEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onPigZap(PigZapEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onPigZombieAnger(PigZombieAngerEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerDeath(PlayerDeathEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerLeash(PlayerLeashEntityEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onPotionSplash(PotionSplashEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onProjectileHit(ProjectileHitEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onProjectileLaunch(ProjectileLaunchEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onSheepDyeWool(SheepDyeWoolEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onSheepRegrowWool(SheepRegrowWoolEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onSlimeSplit(SlimeSplitEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onSpawnerSpawn(SpawnerSpawnEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onStriderTemperatureChange(StriderTemperatureChangeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onVillagerAcquireTrade(VillagerAcquireTradeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onVillagerCareerChange(VillagerCareerChangeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

    @EventHandler(ignoreCancelled = true)
    public void onVillagerReplenishTrade(VillagerReplenishTradeEvent event) {
        SystemManager.getInstance().triggerSystem(event, event.getClass());
    }

}
