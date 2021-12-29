package com.hiperium.algorithms.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. If
 * any two numbers in the input array sum up to the target sum, the function should return them in an array, in any
 * order. If no two numbers sum up to the target sum, the function should return an empty array.
 */
public final class TwoNumberSum {

    private TwoNumberSum() {}

    // O(n) time | O(n) space
    public static int[] solution2(Integer[] array, int targetSum) {
        System.out.println("solution2 array: " + Arrays.toString(array) + " - target sum: " + targetSum);
        Set<Integer> nums = new HashSet<>();
        for (int num : array) {
            int potentialMatch = targetSum - num;
            if (nums.contains(potentialMatch))
                return new int[] {potentialMatch, num};
            else
                nums.add(num);
        }
        return new int[0];
    }

    // O(nlog(n)) time | O(1) space
    public static int[] solution3(Integer[] array, int targetSum) {
        Arrays.sort(array);
        System.out.println("solution3 sorted array: " + Arrays.toString(array) + " - target sum: " + targetSum);
        int left = 0;
        int right = array.length - 1;
        int[] result = new int[2];
        while (left < right) {
            int currentSum = array[left] + array[right];
            if (currentSum == targetSum) {
                result[0] = array[left];
                result[1] = array[right];
                break;
            } else if (currentSum < targetSum)
                left++;
            else
                right--;
        }
        return result;
    }

}
