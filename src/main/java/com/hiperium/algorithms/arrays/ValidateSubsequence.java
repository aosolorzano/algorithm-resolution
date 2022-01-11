package com.hiperium.algorithms.arrays;

/**
 * Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence of
 * the first one. A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array but that
 * are in the same order as they appear in the array. For instance, the numbers [1, 3, 4] form a subsequence of the
 * array [1, 2, 3, 4], and so do the numbers [2, 4]. Note that a single number in an array and the array itself are both
 * valid subsequences of the array.
 */
public class ValidateSubsequence {

    private ValidateSubsequence() {}

    // O(n) time | O(1) space
    public static boolean isValidSubsequenceSolution1(Integer[] array, Integer[] sequence) {
        int arrayIndex = 0;
        int sequenceIndex = 0;
        while (arrayIndex < array.length && sequenceIndex < sequence.length) {
            if (array[arrayIndex].equals(sequence[sequenceIndex]))
                sequenceIndex++;
            if (sequenceIndex == sequence.length)
                break;
            arrayIndex++;
        }
        return sequenceIndex == sequence.length;
    }

    // O(n) time | O(1) space
    public static boolean isValidSubsequenceSolution2(Integer[] array, Integer[] sequence) {
        int sequenceIndex = 0;
        for (var value : array) {
            if (sequenceIndex == sequence.length)       // Avoids IndexOutOfBoundsExceptions at runtime
                return true;
            if (sequence[sequenceIndex].equals(value))
                sequenceIndex++;
        }
        return sequenceIndex == sequence.length;
    }
}
