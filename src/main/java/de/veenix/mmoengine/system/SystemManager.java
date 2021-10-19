package de.veenix.mmoengine.system;

import lombok.Getter;

import java.util.HashMap;

public class SystemManager {

    @Getter
    private static final SystemManager instance = new SystemManager();

    private final HashMap<String, ISystem> systems = new HashMap<>();

    public boolean addSystem(String systemId, ISystem system) {
        if(this.systems.containsKey(systemId)) {
            return false;
        }
        this.systems.put(systemId, system);
        return true;
    }

    public void removeSystem(String systemId) {
        this.systems.remove(systemId);
    }

    public ISystem getSystem(String systemId) {
        return this.systems.get(systemId);
    }
}
