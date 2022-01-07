package de.veenix.mmoengine.money;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

/**
 * For the money in your mmo simply extend this class and define all methods and constructor parameters,
 * for more help look at the examples.
 *
 * NOTE: I recommend storing the money data inside a database(See Database examples) and save after every action
 */
@Getter
public abstract class Money {

    private final String currencyName;
    private final boolean allowDebt;

    private float inflation;
    @Setter
    private double initialBalance;
    @Setter
    private RoundingOptions roundingOptions;

    public Money(String currencyName, float inflation, RoundingOptions roundingOptions, boolean allowDebt, double initialBalance) {
        this.currencyName = currencyName;
        this.allowDebt = allowDebt;

        setInflation(inflation);
        setRoundingOptions(roundingOptions);
        setInitialBalance(initialBalance);
    }

    /**
     * Sets the inflation of the currency but keeps in a valid region
     *
     * @param inflation The inflation of the currency
     */
    public void setInflation(float inflation) {
        this.inflation = Math.abs(inflation);
    }

    /**
     * Add money to the balance of the player
     *
     * @param player The player which gets more money to his balance
     * @param amount The amount of money he gets
     * @return {@code true} if the transaction was successful or, {@code false} if the transaction wasn't successful
     */
    abstract boolean addMoneyToPlayer(Player player, double amount);

    /**
     * Remove money from the balance of the player
     *
     * @param player The player from which the money gets removed
     * @param amount The amount of money that is removed
     * @return {@code true} if the transaction was successful or not, {@code false} if the transaction wasn't successful
     */
    abstract boolean removeMoneyFromPlayer(Player player, double amount);

    /**
     * Sets the balance of the player to 0 or any other initial value
     *
     * @param player The player which receives an reset
     * @return {@code true} if the reset was successful or, {@code false} there was an error while resetting the player
     */
    abstract boolean resetPlayersBalance(Player player);

    /**
     * Saves the balance from the player to a persistent data system (e.g. a database)
     *
     * @param player The player you want to save the data from
     * @return {@code true} if the data was successfully saved or, {@code false} if the data couldn't be saved
     */
    abstract boolean savePlayerMoney(Player player, double newAmount);

    /**
     * Gets the balance from a given player
     *
     * @param player The player from which the balance is requested
     * @return The amount of money in the balance of the player
     */
    abstract double getBalanceOfPlayer(Player player);


    /**
     * Calculates to value for any baseValue
     *
     * @param baseValue The base value for which the value should be calculated
     * @return The current Value of this item considering the inflation of the currency
     */
    public final double calculateValue(double baseValue) {
        double ret = baseValue;

        ret *= this.inflation;

        switch (this.roundingOptions) {
            case UP:
                ret = Math.ceil(ret);
                break;
            case DOWN:
                ret = Math.floor(ret);
                break;
            case NORMAL:
                ret = Math.round(ret);
                break;
            case NONE:
            default:
                break;
        }

        return ret;
    }

    /**
     * Options on how the currency should be rounded
     */
    enum RoundingOptions {
        NONE,
        UP,
        DOWN,
        NORMAL
    }
}
