package com.hiperium.algorithms.arrays;

import java.util.Arrays;

public class SortedSquaredArray {
    private SortedSquaredArray() {}

    // O[n*log(n)] time | O(n) space
    public static Integer[] getSquaredSortedArraySolution1(Integer[] array) {
        Integer[] sortedSquares = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            sortedSquares[i] = value * value;
        }
        Arrays.sort(sortedSquares);     // This sort function increases the time complexity of algorithm.
        return sortedSquares;
    }

    // O(n) time | O(n) space
    public static Integer[] getSquaredSortedArraySolution2(Integer[] array) {
        Integer[] sortedSquared = new Integer[array.length];
        int smallerValueIndex = 0;
        int largerValueIndex = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            int smallerValue = array[smallerValueIndex];
            int largerValue = array[largerValueIndex];
            if (Math.abs(smallerValue) > Math.abs(largerValue)) {
                sortedSquared[i] = smallerValue * smallerValue;
                smallerValueIndex++;
            } else {
                sortedSquared[i] = largerValue * largerValue;
                largerValueIndex--;
            }
        }
        return sortedSquared;
    }
}
