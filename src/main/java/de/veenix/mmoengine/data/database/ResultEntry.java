package de.veenix.mmoengine.data.database;

import lombok.Getter;

/**
 * This class is a single entry from a database operation
 */
public class ResultEntry {

    @Getter
    private final Object value;
    @Getter
    private final Class<?> clazz;

    public ResultEntry(Object value) {
        this.value = value;
        this.clazz = value.getClass();
    }
}
