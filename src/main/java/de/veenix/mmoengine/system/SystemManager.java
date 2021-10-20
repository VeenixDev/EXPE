package de.veenix.mmoengine.system;

import lombok.Getter;

import java.util.HashMap;

public class SystemManager {

    @Getter
    private static final SystemManager instance = new SystemManager();

    @Getter
    private final HashMap<String, SystemData> systems = new HashMap<>();

    public boolean addSystem(String systemId, SystemData sysData) {
        if(this.systems.containsKey(systemId)) {
            return false;
        }
        this.systems.put(systemId, sysData);
        return true;
    }
}
