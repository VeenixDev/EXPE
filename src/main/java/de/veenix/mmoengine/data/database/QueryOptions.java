package de.veenix.mmoengine.data.database;

import lombok.Getter;

import java.util.ArrayList;

public class QueryOptions {

    @Getter
    public final ArrayList<String> filters = new ArrayList<>();

    @Getter
    public final Database database;

    public QueryOptions(Database database) {
        this.database = database;
    }

    /**
     * Adds a filter to the QueryOptions
     *
     * @param field The field you want to compare
     * @param operation The operation you want to perform
     * @param value The value you want to compare against
     * @return {@code true} if the filter was added successfully
     */
    public boolean addFilter(String field, Database.LogicOperation operation, String value) {
        String filter = field + " " + this.database.getOperation(operation) + " " + value;

        return true;
    }
}
