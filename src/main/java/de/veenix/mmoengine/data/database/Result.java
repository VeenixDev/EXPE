package de.veenix.mmoengine.data.database;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class provides you the data from a database operation
 *
 * Just to clear any confusion why there is an extra abstraction layer between the database and your code,
 * this is to support different databases without having to deal with their specific responses
 */
public class Result {

    @Getter
    private final ArrayList<ResultEntry> results = new ArrayList<>();

    /**
     * The constructor for the Result
     *
     * @param entries All entries for the result
     */
    public Result(ResultEntry... entries) {
        this.results.addAll(Arrays.asList(entries));
    }

    /**
     * Adds an entry to the results list
     *
     * @param entry The new entry
     * @return {@code true} if the list was changed as a result of this action
     */
    public boolean addResultEntry(ResultEntry entry) {
        return this.results.add(entry);
    }

    /**
     * Removes an entry from the results list
     *
     * @param entry The entry to remove
     * @return {@code true} if the list contained the entry
     */
    public boolean removeResultEntry(ResultEntry entry) {
        return this.results.remove(entry);
    }

}
