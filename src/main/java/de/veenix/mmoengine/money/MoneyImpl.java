package de.veenix.mmoengine.money;

import lombok.Getter;
import org.bukkit.entity.Player;

import java.util.HashMap;

/**
 * This is one of the most basic implementations of the money system,
 * it's not persistent and very limited
 *
 * NOTE: I would recommend you to write your own implementation, otherwise after every server reboot the balance of every player is reset
 */
public class MoneyImpl extends Money {

    @Getter
    private final HashMap<Player, Double> money = new HashMap<>();

    public MoneyImpl(String name, float inflation, double startBalance) {
        super(name, inflation, RoundingOptions.UP, false, startBalance);
    }

    @Override
    boolean addMoneyToPlayer(Player player, double amount) {
        return savePlayerMoney(player, getBalanceOfPlayer(player) + amount);
    }

    @Override
    boolean removeMoneyFromPlayer(Player player, double amount) {
        double balance = getBalanceOfPlayer(player);

        if(!(balance - amount < 0 && isAllowDebt())) {
            return false;
        }

        return savePlayerMoney(player, balance - amount);
    }

    @Override
    boolean resetPlayersBalance(Player player) {
        return savePlayerMoney(player, getInitialBalance());
    }

    @Override
    boolean savePlayerMoney(Player player, double newAmount) {
        return money.put(player, newAmount) != null;
    }

    @Override
    double getBalanceOfPlayer(Player player) {
        return money.containsKey(player) ? money.get(player) : 0;
    }


}
