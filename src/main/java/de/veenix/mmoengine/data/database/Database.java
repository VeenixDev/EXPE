package de.veenix.mmoengine.data.database;

public interface Database {

    boolean login(String username, String password);

    boolean close();

    DatabaseType getType();

    Result manualQuery(String query);

    String getOperation(LogicOperation operation);

    enum LogicOperation {
        GREATER_THAN,
        SMALLER_THAN,
        EQUALS,
        NOT_EQUALS,
        LIKE,
        CONTAINS
    }

    enum QueryOperation {
        SELECT,
        DELETE,
        ADD,
        MODIFY
    }
}
