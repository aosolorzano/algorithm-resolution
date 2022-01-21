package com.hiperium.algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. The
 * function should find all triplets in the array that sum up to the target sum and return a two-dimensional array of
 * all these triplets. The numbers in each triplet should be ordered in ascending order, and the triplets themselves
 * should be ordered in ascending order with respect to the numbers they hold.
 *
 * If no three numbers sum up to the target sum, the function should return an empty array.
 */
public final class ThreeNumberSum {

    private ThreeNumberSum() {}

    // O(n^2) time | O(n) space
    public static List<Integer[]> getThreeNumSum(Integer[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> results = new ArrayList<>();
        for (int i = 0; i < array.length - 2; i++) {    // We decrease 2 because we are finding triplets.
            int leftIndex = i + 1;
            int rightIndex = array.length - 1;
            while (leftIndex < rightIndex) {
                int currentSum = array[i] + array[leftIndex] + array[rightIndex];
                if (currentSum == targetSum) {
                    results.add(new Integer[]{array[i], array[leftIndex], array[rightIndex]});
                    leftIndex++;
                    rightIndex--;
                } else if (currentSum < targetSum)
                    leftIndex++;
                else
                    rightIndex--;
            }
        }
        return results;
    }
}
