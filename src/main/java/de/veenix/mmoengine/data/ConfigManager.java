package de.veenix.mmoengine.data;

import de.veenix.mmoengine.MmoEngine;
import lombok.AccessLevel;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class ConfigManager {

    @Getter(AccessLevel.PUBLIC)
    private static final ConfigManager instance = new ConfigManager();

    private final HashMap<String, FileConfiguration> configs = new HashMap<>();
    private final HashMap<String, Object> cachedValues = new HashMap<>();

    /**
     * Loads the default config of the engine
     */
    public void loadDefaultConfig() {
        JavaPlugin pluginInstance = MmoEngine.getInstance();

        pluginInstance.getConfig().options().copyDefaults(true);
        pluginInstance.saveConfig();
    }

    public FileConfiguration getDefaultConfig() {
        return MmoEngine.getInstance().getConfig();
    }

    /**
     * Adds a config to the manager to allow data caching and better config usage
     *
     * @param configName The name with which you can later access the config
     * @param configuration The configuration where you store your data inside
     * @return {@code true} if the config was added successfully, or {@code false} if an exception happened while adding the config
     */
    public boolean addConfig(String configName, FileConfiguration configuration) {
        try {
            configs.put(configName, configuration);
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    /**
     * Adds a config to the manager to allow data caching and better config usage
     *
     * This method creates a new config file under the given path
     *
     * @param configName The name with which you can later access the config
     * @param configPath The path to where a new config file should be created
     * @return {@code true} if the config was added successfully, or {@code false} if an exception happened while adding the config
     */
    public boolean addConfig(String configName, String configPath) {
        try {
            File configFile = new File(configPath);

            if(!configFile.exists()) {
                if(configFile.getParentFile().mkdirs()) {
                    if(!configFile.createNewFile()) {
                        return false;
                    }
                }
            }

            FileConfiguration config = YamlConfiguration.loadConfiguration(configFile);

            return addConfig(configName, config);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Removes a config from the manager
     *
     * @param configName The name of the config under which it was added
     * @return {@code true} if the config was successfully added, or {@code false} if an exception happened while removing the config
     */
    public boolean removeConfig(String configName) {
        try {
            this.configs.remove(configName);
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    /**
     * Get a {@code String} from the cache or the config
     *
     * @param configName The name of the config the data is stored inside
     * @param path The path to the value
     * @return The String containing the data from the config
     * @throws FileNotFoundException If there is no config with this name managed by the manager
     */
    public String getString(String configName, String path) throws FileNotFoundException {
        if(this.cachedValues.containsKey("cfg:" + configName + ":" + path)) {
            Object cachedValue = this.cachedValues.get("cfg:" + configName + ":" + path);

            if(cachedValue.getClass().getSimpleName().equals(String.class.getSimpleName())) {
                return (String) cachedValue;
            } else {
                throw new IllegalArgumentException("saved data is not a String!");
            }
        }

        if(this.configs.containsKey(configName)) {
            String data = this.configs.get(configName).getString(path);

            this.cachedValues.put("cfg:" + configName + ":" + path, data);

            return data;
        } else {
            throw new FileNotFoundException("config: '" + configName + ".yml' does not exist!");
        }
    }

    /**
     * Get an {@code Integer} from the cache or the config
     *
     * @param configName The name of the config the data is stored inside
     * @param path The path to the value
     * @return The Integer containing the data from the config
     * @throws FileNotFoundException If there is no config with this name managed by the manager
     */
    public Integer getInteger(String configName, String path) throws FileNotFoundException {
        if(this.cachedValues.containsKey("cfg:" + configName + ":" + path)) {
            Object cachedValue = this.cachedValues.get("cfg:" + configName + ":" + path);

            if(cachedValue.getClass().getSimpleName().equals(Integer.class.getSimpleName())) {
                return (Integer) cachedValue;
            } else {
                throw new IllegalArgumentException("saved data is not a Integer!");
            }
        }

        if(this.configs.containsKey(configName)) {
            Integer data = this.configs.get(configName).getInt(path);

            this.cachedValues.put("cfg:" + configName + ":" + path, data);

            return data;
        } else {
            throw new FileNotFoundException("config: '" + configName + ".yml' does not exist!");
        }
    }

    /**
     * Get a {@code Boolean} from the cache or the config
     *
     * @param configName The name of the config the data is stored inside
     * @param path The path to the value
     * @return The String containing the data from the config
     * @throws FileNotFoundException If there is no config with this name managed by the manager
     */
    public Boolean getBoolean(String configName, String path) throws FileNotFoundException {
        if(this.cachedValues.containsKey("cfg:" + configName + ":" + path)) {
            Object cachedValue = this.cachedValues.get("cfg:" + configName + ":" + path);

            if(cachedValue.getClass().getSimpleName().equals(Boolean.class.getSimpleName())) {
                return (Boolean) cachedValue;
            } else {
                throw new IllegalArgumentException("saved data is not a Boolean!");
            }
        }

        if(this.configs.containsKey(configName)) {
            Boolean data = this.configs.get(configName).getBoolean(path);

            this.cachedValues.put("cfg:" + configName + ":" + path, data);

            return data;
        } else {
            throw new FileNotFoundException("config: '" + configName + ".yml' does not exist!");
        }
    }

    /**
     * Get a {@code List} from the cache or the config
     *
     * @param configName The name of the config the data is stored inside
     * @param path The path to the value
     * @return The List containing the data from the config
     * @throws FileNotFoundException If there is no config with this name managed by the manager
     */
    public List<?> getList(String configName, String path) throws FileNotFoundException {
        if(this.cachedValues.containsKey("cfg:" + configName + ":" + path)) {
            Object cachedValue = this.cachedValues.get("cfg:" + configName + ":" + path);

            if(cachedValue.getClass().getSimpleName().equals(List.class.getSimpleName())) {
                return (List<?>) cachedValue;
            } else {
                throw new IllegalArgumentException("saved data is not a List!");
            }
        }

        if(this.configs.containsKey(configName)) {
            List<?> data = this.configs.get(configName).getList(path);

            this.cachedValues.put("cfg:" + configName + ":" + path, data);

            return data;
        } else {
            throw new FileNotFoundException("config: '" + configName + ".yml' does not exist!");
        }
    }

    /**
     * Get a {@code ItemStack} from the cache or the config
     *
     * @param configName The name of the config the data is stored inside
     * @param path The path to the value
     * @return The ItemStack containing the data from the config
     * @throws FileNotFoundException If there is no config with this name managed by the manager
     */
    public ItemStack getItemStack(String configName, String path) throws FileNotFoundException {
        if(this.cachedValues.containsKey("cfg:" + configName + ":" + path)) {
            Object cachedValue = this.cachedValues.get("cfg:" + configName + ":" + path);

            if(cachedValue.getClass().getSimpleName().equals(ItemStack.class.getSimpleName())) {
                return (ItemStack) cachedValue;
            } else {
                throw new IllegalArgumentException("saved data is not a ItemStack!");
            }
        }

        if(this.configs.containsKey(configName)) {
            ItemStack data = this.configs.get(configName).getItemStack(path);

            this.cachedValues.put("cfg:" + configName + ":" + path, data);

            return data;
        } else {
            throw new FileNotFoundException("config: '" + configName + ".yml' does not exist!");
        }
    }

    /**
     * Get a {@code ConfigurationSection} from the cache or the config
     *
     * @param configName The name of the config the data is stored inside
     * @param path The path to the value
     * @return The ConfigurationSection containing the data from the config
     * @throws FileNotFoundException If there is no config with this name managed by the manager
     */
    public ConfigurationSection getSection(String configName, String path) throws FileNotFoundException {
        if(this.cachedValues.containsKey("cfg:" + configName + ":" + path)) {
            Object cachedValue = this.cachedValues.get("cfg:" + configName + ":" + path);

            if(cachedValue.getClass().getSimpleName().equals(ConfigurationSection.class.getSimpleName())) {
                return (ConfigurationSection) cachedValue;
            } else {
                throw new IllegalArgumentException("saved data is not a ConfigurationSection!");
            }
        }

        if(this.configs.containsKey(configName)) {
            ConfigurationSection data = this.configs.get(configName).getConfigurationSection(path);

            this.cachedValues.put("cfg:" + configName + ":" + path, data);

            return data;
        } else {
            throw new FileNotFoundException("config: '" + configName + ".yml' does not exist!");
        }
    }

    /**
     * Get a {@code Block} from the cache or the config
     *
     * @param configName The name of the config the data is stored inside
     * @param path The path to the value
     * @return The Block containing the data from the config
     * @throws FileNotFoundException If there is no config with this name managed by the manager
     */
    public Block getBlock(String configName, String path) throws FileNotFoundException {
        if(this.cachedValues.containsKey("cfg:" + configName + ":" + path)) {
            Object cachedValue = this.cachedValues.get("cfg:" + configName + ":" + path);

            if(cachedValue.getClass().getSimpleName().equals(Block.class.getSimpleName())) {
                return (Block) cachedValue;
            } else {
                throw new IllegalArgumentException("saved data is not a Block!");
            }
        }

        if(this.configs.containsKey(configName)) {
            FileConfiguration config = this.configs.get(configName);

            BlockData blockData = MmoEngine.getInstance().getServer().createBlockData(Objects.requireNonNull(config.getString(path + ".blockData")));
            Material type = Material.getMaterial(Objects.requireNonNull(config.getString(path + ".type")));
            World world = Bukkit.getWorld(Objects.requireNonNull(config.getString(path + ".world")));
            int x = config.getInt(path + ".x"), y = config.getInt(path + ".y"), z = config.getInt(path + ".z");
            Location location = new Location(world, x, y, z);
            Biome biome = Biome.valueOf(config.getString(path + ".biome"));

            Block block = Objects.requireNonNull(world).getBlockAt(location);
            block.setBlockData(blockData);
            block.setBiome(biome);
            block.setType(Objects.requireNonNull(type));

            return block;
        } else {
            throw new FileNotFoundException("config '" + configName + ".yml' does not exist!");
        }
    }

    /**
     * Adds a block to the config
     *
     * Note: The saving of blocks is a custom implementation by the MMOE, therefore you HAVE TO use this manager to later read the block from the config
     *
     * Data structure:
     *
     * xyz: # The path to the block
     *  blockData: blockData as a String
     *  material: the material of the block
     *  world: the name of the world
     *  x: the x position of the block
     *  y: the y position of the block
     *  z: the z position of the block
     *  biome: the name of the biome
     *
     *
     * @param configName The name of the config under which it was added to the manager
     * @param path The path in the config where the block should be saved
     * @param block The Block that gets saved
     * @return {@code true} if the block was successfully added to the config, {@code false} if an exception happened while saving the block
     * @throws FileNotFoundException If there is no config with this name managed by the manager
     */
    public boolean setBlock(String configName, String path, Block block) throws FileNotFoundException {
        if(!this.configs.containsKey(configName)) {
            throw new FileNotFoundException("config '" + configName + ".yml' is not registered in the manager!");
        }

        try {
            FileConfiguration config = this.configs.get(configName);
            Location blockLocation = block.getLocation();

            config.set(path + ".blockData", block.getBlockData().getAsString());
            config.set(path + ".material", block.getType());
            config.set(path + ".world", Objects.requireNonNull(blockLocation.getWorld()).getName());
            config.set(path + ".x", blockLocation.getX());
            config.set(path + ".y", blockLocation.getY());
            config.set(path + ".z", blockLocation.getZ());
            config.set(path + ".biome", blockLocation.getBlock().getBiome());

            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    /**
     * Adds data to the config
     *
     * @param configName The name of the config under which it was added to the manager
     * @param path The path in the config where the data should be saved
     * @param obj The data that gets saved
     * @return {@code true} if the data was successfully added to the config, {@code false} if an exception happened while saving the data
     * @throws FileNotFoundException If there is no config with this name managed by the manager
     */
    public boolean set(String configName, String path, Object obj) throws FileNotFoundException {
        if(!this.configs.containsKey(configName)) {
            throw new FileNotFoundException("config '" + configName + ".yml' is not registered in the manager!");
        }

        try {
            this.configs.get(configName).set(path, obj);
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    /**
     * Saves the config to a given path
     *
     * @param configName The name of the config you want to save
     * @param filePath The path to the location you want to save the config to
     * @return {@code true} if the config was successfully saved, or {@code false} if an exception happened while saving the config
     */
    public boolean saveConfig(String configName, String filePath) {
        if(!this.configs.containsKey(configName)) {
            throw new IllegalArgumentException("there is no config with the name '" + configName + "' added to the manager!");
        }

        try {
            this.configs.get(configName).save(new File(filePath));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
