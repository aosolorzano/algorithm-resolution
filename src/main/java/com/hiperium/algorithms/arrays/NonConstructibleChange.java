package com.hiperium.algorithms.arrays;

import java.util.Arrays;

/**
 * Given an array of positive integers representing the values of coins in your possession, write a function that
 * returns the minimum amount of change (the minimum sum of money) that you CANNOT create. The given coins can have
 * any positive integer value and aren't necessarily unique (i.e., you can have multiple coins of the same value).
 * For example, if you're given <span>coins = [1, 2, 5]</span>, the minimum amount of change that you can't create is
 * <span>4</span>. If you're given no coins, the minimum amount of change that you can't create is <span>1</span>.
 */
public final class NonConstructibleChange {
    private NonConstructibleChange() {
    }

    public static int getNonConstructibleChange(Integer[] coins) {
        Arrays.sort(coins);
        int currentChangeCreated = 0;
        for (int coin : coins) {
            if (coin > currentChangeCreated + 1)
                return currentChangeCreated + 1;
            currentChangeCreated += coin;
        }
        return currentChangeCreated + 1;
    }
}
