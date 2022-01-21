package com.hiperium.algorithms.arrays;

import com.hiperium.algorithms.annotation.BiDimensionalIntegerListConverter;
import com.hiperium.algorithms.annotation.IntegerArrayConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeNumberSumTest {

    @ParameterizedTest(name = "targetSum = {1}")
    @CsvSource(value = {
            "[12, 3, 1, 2, -6, 5, -8, 6]: 0: [{-8, 2, 6}; {-8, 3, 5}; {-6, 1, 5}]",
            "[12, 3, 1, 2, -6, 5, 0, -8, -1]: 0: [{-8, 3, 5}; {-6, 1, 5}; {-1, 0, 1}]",
            "[12, 3, 1, 2, -6, 5, 0, -8, -1, 6]: 0: [{-8, 2, 6}; {-8, 3, 5}; {-6, 0, 6}; {-6, 1, 5}; {-1, 0, 1}]",
            "[12, 3, 1, 2, -6, 5, 0, -8, -1, 6, -5]: 0: [{-8, 2, 6}; {-8, 3, 5}; {-6, 0, 6}; {-6, 1, 5}; {-5, -1, 6}; {-5, 0, 5}; {-5, 2, 3}; {-1, 0, 1}]",
            "[1, 2, 3, 4, 5, 6, 7, 8, 9, 15]: 18: [{1, 2, 15}; {1, 8, 9}; {2, 7, 9}; {3, 6, 9}; {3, 7, 8}; {4, 5, 9}; {4, 6, 8}; {5, 6, 7}]",
            "[1, 2, 3, 4, 5, 6, 7, 8, 9, 15]: 32: [{8, 9, 15}]",
            "[1, 2, 3, 4, 5, 6, 7, 8, 9, 15]: 5: []"
    }, delimiter = ':')
    void mustSumThreeNumber(@IntegerArrayConverter Integer[] array, int targetSum, @BiDimensionalIntegerListConverter List<Integer[]> expectedResults) {
        System.out.println("Three sum array = " + Arrays.toString(array));
        List<Integer[]> results = ThreeNumberSum.getThreeNumSum(array, targetSum);
        for (Integer[] result : results) {
            System.out.println("result = " + Arrays.toString(result));
        }
        boolean isExpectedResult = Boolean.TRUE;
        if (expectedResults.size() != results.size())
            isExpectedResult = Boolean.FALSE;
        else if (expectedResults.size() > 0)
            for (int i = 0; i < results.size(); i++) {
                if (!Arrays.equals(results.get(i), expectedResults.get(i))) {
                    isExpectedResult = Boolean.FALSE;
                    break;
                }
            }
        Assertions.assertTrue(isExpectedResult);
    }
}
