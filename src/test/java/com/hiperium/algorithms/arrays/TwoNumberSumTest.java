package com.hiperium.algorithms.arrays;

import com.hiperium.algorithms.annotation.IntegerArrayConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

class TwoNumberSumTest {

    @ParameterizedTest(name = "solution2-targetSum = {1}")
    @CsvSource(value = {
            "[3, 5, -4, 8, 11, 1, -1, 6]: 10: 11: -1",
            "[4, 6]: 10: 4 : 6",
            "[4, 6, 1]: 5: 4 : 1",
            "[4, 6, 1, -3]: 3: 6: -3",
            "[1, 2, 3, 4, 5, 6, 7, 8, 9]: 17: 8: 9"
    }, delimiter = ':')
    void mustSumTwoNumber_solution2(@IntegerArrayConverter Integer[] array, int targetSum, int respNum1, int respNum2) {
        int[] result = TwoNumberSum.solution2(array, targetSum);
        Assertions.assertEquals(2, result.length);
        Assertions.assertTrue(contains(result, respNum1));
        Assertions.assertTrue(contains(result, respNum2));
    }

    @ParameterizedTest(name = "solution3-targetSum = {1}")
    @CsvSource(value = {
            "[3, 5, -4, 8, 11, 1, -1, 6]: 10: 11: -1",
            "[4, 6]: 10: 4 : 6",
            "[4, 6, 1]: 5: 4 : 1",
            "[4, 6, 1, -3]: 3: 6: -3",
            "[1, 2, 3, 4, 5, 6, 7, 8, 9]: 17: 8: 9"
    }, delimiter = ':')
    void mustSumTwoNumber_solution3(@IntegerArrayConverter Integer[] array, int targetSum, int respNum1, int respNum2) {
        int[] result = TwoNumberSum.solution3(array, targetSum);
        Assertions.assertEquals(2, result.length);
        Assertions.assertTrue(contains(result, respNum1));
        Assertions.assertTrue(contains(result, respNum2));
    }

    private boolean contains(int[] output, int val) {
        for (var el : output)
            if (el == val)
                return true;
        return false;
    }
}
