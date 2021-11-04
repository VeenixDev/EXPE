package de.veenix.mmoengine.data.database;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class provides the functionality to get rows from a database query
 */
public class ResultRow {

    @Getter
    private final ArrayList<ResultEntry> items = new ArrayList<>();

    public ResultRow(Object... items) {
        Arrays.asList(items).forEach(i -> this.items.add(new ResultEntry(i)));
    }

    public boolean add(Object item) {
        return this.items.add(new ResultEntry(item));
    }

    public boolean remove(Object item) {
        return this.items.remove(new ResultEntry(item));
    }
}
