package de.veenix.mmoengine.data.database.sql;

import de.veenix.mmoengine.data.database.*;
import lombok.Getter;
import org.apache.commons.lang.NotImplementedException;

import java.sql.*;
import java.util.List;

public class MySQL implements Database {

    @Getter
    private final String HOSTNAME;
    @Getter
    private final short PORT;
    @Getter
    private final String DATABASE_NAME;
    @Getter
    private Connection connection;

    @Getter
    private final String URL;

    /**
     * The constructor for the MySQL connection
     *
     * @param hostname The hostname at which your database is located
     * @param port The port to connect to your database
     * @param databaseName The name of your database
     */
    public MySQL(String hostname, short port, String databaseName) {
        this.HOSTNAME = hostname;
        this.PORT = port;
        this.DATABASE_NAME = databaseName;

        this.URL = "jdbc:mysql://" + this.HOSTNAME + ":" + this.PORT + "/" + this.DATABASE_NAME;
    }

    /**
     * Establishes a connection to the database
     *
     * @param username The username with which you authenticate at your database
     * @param password The password for the username to login
     * @return {@code true} if the login and establishment of the connection was successful,
     *              or {@code} false if an exception happened while establishing the connection
     */
    public boolean login(String username, String password) {
        try {
            this.connection = DriverManager.getConnection(this.URL, username, password);
            return true;
        } catch (SQLException exception) {
            exception.printStackTrace();
            return false;
        }
    }

    /**
     * Closes the connection to the database
     *
     * @return {@code true} if the connection was closed or didn't exist, or {@code false} if an exception happened while closing the connection
     */
    public boolean close() {
        try {
            if(this.connection != null && !this.connection.isClosed()) {
                this.connection.close();
                return true;
            }
            return true;
        } catch (SQLException exception) {
            exception.printStackTrace();
            return false;
        }
    }

    /**
     * @return This is an SQL database
     */
    public DatabaseType getType() {
        return DatabaseType.SQL;
    }

    /**
     * Transforms the Operation into valid SQL commands which will be used to generate
     *
     * @param operation The operation you want to make
     * @return A string containing the valid operation for your language
     */
    public String getOperation(LogicOperation operation) {
        if(operation == LogicOperation.GREATER_THAN) {
            return "GT";
        } else if(operation == LogicOperation.SMALLER_THAN) {
            return "LT";
        } else if(operation == LogicOperation.EQUALS) {
            return "EQ";
        } else if(operation == LogicOperation.NOT_EQUALS) {
            return "NOT";
        } else if(operation == LogicOperation.CONTAINS) {
            return "CONTAINS";
        } else if(operation == LogicOperation.LIKE) {
            return "LIKE";
        } else {
            return null;
        }
    }

    /**
     * Queries the SQL database by a manual sql statement.
     *
     * NOTE: This sql statement is not checked or verified by the engine, the engine only converts the result into a {@link de.veenix.mmoengine.data.database.Result}
     *
     * @param query The SQL statement you want to execute
     * @return The result of the query
     */
    public Result manualQuery(String query) {
        try {
            PreparedStatement statement = this.connection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();
            int columns = resultSet.getMetaData().getColumnCount();

            // Convert ResultSet to Result
            Result result = new Result();

            while(resultSet.next()) {
                ResultRow row = new ResultRow();

                for(int i = 0; i < columns; i++) {
                    row.add(resultSet.getObject(i));
                }

                result.addResultEntry(new ResultEntry(row));
            }

            return result;
        } catch (SQLException exception) {
            exception.printStackTrace();
            return null;
        }
    }

    /**
     * Queries over the database to provide the content of your database
     *
     * NOTE: Currently, not implemented in the current version of the engine,
     * since I want to implement an own language to make it simpler add support for new databases
     *
     * @param table The name of the Table
     * @param options The options you can choose to filter your query
     * @param limit The maximum amount of {@code ResultEntry}'s the query will output
     * @param fields The fields you want to receive in the result
     * @return The result of the query
     */
    public Result query(String table, QueryOptions options, int limit, List<String> fields) throws NotImplementedException {
        throw new NotImplementedException();
    }

}
