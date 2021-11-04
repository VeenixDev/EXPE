package de.veenix.mmoengine.system;

import lombok.Getter;

import java.util.HashMap;

public class SystemManager {

    @Getter
    private static final SystemManager instance = new SystemManager();

    @Getter
    private final HashMap<String, SystemData> systems = new HashMap<>();

    /**
     * Adds a custom system that will then be managed by the engine
     *
     * @param systemId The ID under which the system is then available
     * @param sysData The Data which the system should save FOR EVERY player
     * @return {@code true} if there was no problem adding the system, or {@code false} if there is already a system registered with the ID
     */
    public boolean addSystem(String systemId, SystemData sysData) {
        if(this.systems.containsKey(systemId)) {
            return false;
        }
        this.systems.put(systemId, sysData);
        return true;
    }
}
