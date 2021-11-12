package examples;

import de.veenix.mmoengine.system.System;
import de.veenix.mmoengine.system.SystemHandler;
import de.veenix.mmoengine.system.SystemManager;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class LevelSystem extends JavaPlugin implements System, Listener {

    @SystemHandler(systemId = "example_levelSys", event = PlayerLevelChangeEvent.class)
    public void onLevelChange(PlayerLevelChangeEvent event) {
        Player player = event.getPlayer();

        if (event.getOldLevel() < event.getNewLevel()) {
           player.sendMessage("You leveled up, your now level " + event.getNewLevel());
        } else {
            player.sendMessage("Your level decreased, keep pushing to level up!");
        }
    }

    public void onEnable() {
        SystemManager systemManager = SystemManager.getInstance();

        systemManager.addSystem(this);
    }

}
