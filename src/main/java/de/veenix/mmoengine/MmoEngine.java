package de.veenix.mmoengine;

import de.veenix.mmoengine.data.ConfigManager;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MmoEngine extends JavaPlugin {

    @Getter
    private static JavaPlugin instance;

    @Override
    public void onLoad() {
        Bukkit.getConsoleSender().sendMessage("§8[§bMMOE§8] §7Engine is now loading...");
        instance = MmoEngine.getPlugin(MmoEngine.class);
        ConfigManager.getInstance().loadDefaultConfig();

        Bukkit.getConsoleSender().sendMessage("§8[§bMMOE§8] §7Engine is now loaded!");
    }

    @Override
    public void onEnable() {}

    @Override
    public void onDisable() {}
}
