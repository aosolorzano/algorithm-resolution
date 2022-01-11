package com.hiperium.algorithms.arrays;

import com.hiperium.algorithms.annotation.IntegerArrayConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

class SortedSquaredArrayTest {

    @ParameterizedTest(name = "solution1-targetArray = {1}")
    @CsvSource(value = {
            "[-7, -3, 1, 9, 14, 22]: [1, 9, 49, 81, 196, 484]",
            "[-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20]: [0, 0, 1, 1, 1, 4, 4, 9, 169, 361, 400, 2500]",
            "[-1, -1, 2, 3, 3, 3, 4]: [1, 1, 4, 9, 9, 9, 16]",
            "[-7, -3, 1, 9, 22, 30]: [1, 9, 49, 81, 484, 900]",
            "[-10, -5, 0, 5, 10]: [0, 25, 25, 100, 100]",
            "[-5, -4, -3, -2, -1]: [1, 4, 9, 16, 25]",
    }, delimiter = ':')
    void mustSquareSortedArray_solution1(@IntegerArrayConverter Integer[] array, @IntegerArrayConverter Integer[] targetArray) {
        Integer[] sortedSquares = SortedSquaredArray.getSquaredSortedArraySolution1(array);
        System.out.println("solution1 sortedSquares = " + Arrays.toString(sortedSquares));
        Assertions.assertArrayEquals(targetArray, sortedSquares);
    }

    @ParameterizedTest(name = "solution2-targetArray = {1}")
    @CsvSource(value = {
            "[-7, -3, 1, 9, 14, 22]: [1, 9, 49, 81, 196, 484]",
            "[-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20]: [0, 0, 1, 1, 1, 4, 4, 9, 169, 361, 400, 2500]",
            "[-1, -1, 2, 3, 3, 3, 4]: [1, 1, 4, 9, 9, 9, 16]",
            "[-7, -3, 1, 9, 22, 30]: [1, 9, 49, 81, 484, 900]",
            "[-10, -5, 0, 5, 10]: [0, 25, 25, 100, 100]",
            "[-5, -4, -3, -2, -1]: [1, 4, 9, 16, 25]",
    }, delimiter = ':')
    void mustSquareSortedArray_solution2(@IntegerArrayConverter Integer[] array, @IntegerArrayConverter Integer[] targetArray) {
        Integer[] sortedSquared = SortedSquaredArray.getSquaredSortedArraySolution2(array);
        System.out.println("solution2 SquaresArray = " + Arrays.toString(sortedSquared));
        Assertions.assertArrayEquals(targetArray, sortedSquared);
    }
}
