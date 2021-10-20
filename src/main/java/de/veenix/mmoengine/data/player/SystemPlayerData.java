package de.veenix.mmoengine.data.player;

import lombok.Getter;

import java.util.Map;

public class SystemPlayerData {

    @Getter
    private final Map<String, Object> data;
    @Getter
    private final String systemId;

    public SystemPlayerData(String systemId, Map<String, Object> data) {
        this.data = data;
        this.systemId = systemId;
    }

    public <T> T getValue(String key, Class<T> type) {
        if(!this.data.containsKey(key)) {
            return null;
        }

        Object value = this.data.get(key);

        try {
            return type.cast(value);
        } catch (ClassCastException exception) {
            exception.printStackTrace();
            return null;
        }
    }
}
