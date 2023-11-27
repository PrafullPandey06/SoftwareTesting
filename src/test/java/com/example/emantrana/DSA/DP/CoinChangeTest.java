package com.example.emantrana.DSA.DP;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CoinChangeTest {
    @Test
    void testChange() {
        CoinChange coinChange = new CoinChange();
        int[] coins = {1, 2, 5};

        assertEquals(4, coinChange.change(coins, 5));
        assertEquals(1, coinChange.change(coins, 1));
        assertEquals(2, coinChange.change(coins, 2));
    }

    @Test
    void testMinimumCoins() {
        CoinChange coinChange = new CoinChange();
        int[] coins = {1, 2, 5};

        assertEquals(3, coinChange.minimumCoins(coins, 11));
        assertEquals(0, coinChange.minimumCoins(coins, 0));
        assertEquals(1, coinChange.minimumCoins(coins, 1));
        assertEquals(1, coinChange.minimumCoins(coins, 2));
    }

    @Test
    void testIntegration() {
        CoinChange coinChange = new CoinChange();
        int[] coins = {1, 2, 5};

        int combinations = coinChange.change(coins, 5);
        int minimumCoins = coinChange.minimumCoins(coins, 11);

        // Integration test assertions
        assertEquals(4, combinations);
        assertEquals(3, minimumCoins);

    }
}
