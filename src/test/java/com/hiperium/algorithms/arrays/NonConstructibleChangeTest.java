package com.hiperium.algorithms.arrays;

import com.hiperium.algorithms.annotation.IntegerArrayConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

class NonConstructibleChangeTest {

    @ParameterizedTest(name = "coins = {0}")
    @CsvSource(value = {
            "[5, 7, 1, 1, 2, 3, 22]: 20",
            "[109, 2000, 8765, 19, 18, 17, 16, 8, 1, 1, 2, 4]: 87",
            "[5, 6, 1, 1, 2, 3, 4, 9]: 32",
            "[1, 5, 1, 1, 1, 10, 15, 20, 100]: 55",
            "[6, 4, 5, 1, 1, 8, 9]: 3",
            "[1, 1, 1, 1, 1]: 6",
            "[87]: 1",
            "[]: 1",
    }, delimiter = ':')
    void mustGetTournamentWinner(@IntegerArrayConverter Integer[] coins, Integer expected) {
        System.out.println("coins = " + Arrays.toString(coins));
        int currentChangeCreated = NonConstructibleChange.getNonConstructibleChange(coins);
        System.out.println("currentChangeCreated = " + currentChangeCreated);
        Assertions.assertEquals(expected, currentChangeCreated);
    }
}
