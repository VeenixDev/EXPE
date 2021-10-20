package de.veenix.mmoengine.system;

import lombok.Getter;

import java.util.Map;

public class SystemData {

    @Getter
    private final ISystem system;
    @Getter
    private final Map<String, Object> data;

    public SystemData(ISystem system, Map<String, Object> data) {
        this.system = system;
        this.data = data;
    }
}
