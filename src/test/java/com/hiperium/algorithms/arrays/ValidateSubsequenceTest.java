package com.hiperium.algorithms.arrays;

import com.hiperium.algorithms.annotation.IntegerArrayConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateSubsequenceTest {

    @ParameterizedTest(name = "solution1-subsequence = {1}")
    @CsvSource(value = {
            "[5, 1, 22, 25, 6, -1, 8, 10]: [1, 6, -1, 10]",
            "[5, 1, 22, 25, 6, -1, 8, 10]: [5, 1, 22, 25, 6, -1, 8, 10]",
            "[5, 1, 22, 25, 6, -1, 8, 10]: [5, 1, 22, 6, -1, 8, 10]",
            "[5, 1, 22, 25, 6, -1, 8, 10]: [25]",
            "[1, 1, 1, 1, 1]: [1, 1, 1]",
    }, delimiter = ':')
    void mustValidateSubsequence_solution1(@IntegerArrayConverter Integer[] array, @IntegerArrayConverter Integer[] sequence) {
        Assertions.assertTrue(ValidateSubsequence.isValidSubsequenceSolution1(array, sequence));
    }

    @ParameterizedTest(name = "solution1-not-subsequence = {1}")
    @CsvSource(value = {
            "[1, 1, 6, 1]: [1, 1, 1, 6]"
    }, delimiter = ':')
    void mustNotValidateSubsequence_solution1(@IntegerArrayConverter Integer[] array, @IntegerArrayConverter Integer[] sequence) {
        Assertions.assertFalse(ValidateSubsequence.isValidSubsequenceSolution1(array, sequence));
    }

    @ParameterizedTest(name = "solution2-subsequence = {1}")
    @CsvSource(value = {
            "[5, 1, 22, 25, 6, -1, 8, 10]: [1, 6, -1, 10]",
            "[5, 1, 22, 25, 6, -1, 8, 10]: [5, 1, 22, 25, 6, -1, 8, 10]",
            "[5, 1, 22, 25, 6, -1, 8, 10]: [5, 1, 22, 6, -1, 8, 10]",
            "[5, 1, 22, 25, 6, -1, 8, 10]: [25]",
            "[1, 1, 1, 1, 1]: [1, 1, 1]",
    }, delimiter = ':')
    void mustValidateSubsequence_solution2(@IntegerArrayConverter Integer[] array, @IntegerArrayConverter Integer[] sequence) {
        Assertions.assertTrue(ValidateSubsequence.isValidSubsequenceSolution2(array, sequence));
    }
}
