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

    /**
     * Gets a data value with a defined type
     *
     * @param key The key of the data you want to access
     * @param type The class of the type you want to get returned
     * @param <T> The return type, it's the same as defined by type
     * @return The data value, or {@code null} if there is no key defined or the value is {@code null}
     */
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
