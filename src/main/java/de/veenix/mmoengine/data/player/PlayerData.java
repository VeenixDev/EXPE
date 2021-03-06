package de.veenix.mmoengine.data.player;

import de.veenix.mmoengine.MmoEngine;
import de.veenix.mmoengine.data.ConfigManager;
import de.veenix.mmoengine.system.SystemManager;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class PlayerData {

    @Getter
    private static final String configPath = MmoEngine.getInstance().getDataFolder().getAbsolutePath() + "/playerData";
    @Getter
    private final String configName;

    @Getter
    private final List<SystemPlayerData> systemData = new ArrayList<>();

    public PlayerData(Player player) {
        this.configName = "player_" + player.getUniqueId();

        if(!ConfigManager.getInstance().addConfig(this.configName, configPath)) {
            Bukkit.getConsoleSender().sendMessage("Couldn't create config file for player: " + player.getName());
        }

        if(!ConfigManager.getInstance().saveConfig(this.configName, configPath)) {
            Bukkit.getConsoleSender().sendMessage("Couldn't save config file for player: " + player.getName());
        }
    }
}
