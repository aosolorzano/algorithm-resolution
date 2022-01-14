package com.hiperium.algorithms.main;

import com.hiperium.algorithms.arrays.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ALGORITHM ANALYSIS: is a study to provides theoretical estimation for the required resources of an algorithm
 * to solve a specific problem. Generally, the efficiency an algorithm is related to the input length (number of
 * steps), known as "time complexity", or the volume of memory, know as "space complexity".
 * <p>
 * Why do we need Algorithm Analysis?
 * - Knowing efficiency of an algorithm is very vital on "mission critical" tasks.
 * - Generally there are multiple approaches/methods/algorithms to solve 1 problem statement. Algorithm analysis
 * is performed to figure out which is the better/optimum approaches/methods/algorithms out of the options.
 * <p>
 * What does a BETTER Algorithm mean?
 * - Faster?               - Time Complexity.
 * - Less memory?          - Space Complexity.
 * - Easy to read?
 * - Fewer lines of code?
 * - Fewer HW/SW needs?
 * <p>
 * What is Asymptotic Algorithm Analysis?
 * - In mathematical analysis, asymptotic analysis of algorithm is a method of defining the mathematical boundaries
 * of its runtime performance.
 * - Using the asymptotic analysis, we can easily estimate about the average case, best case, and worst case
 * scenario of an algorithm.
 * - It is used to mathematically calculate the running time of any operation inside an algorithm.
 * <p>
 * TIME COMPLEXITY: is a computational way to show how (behaviour) runtime of a program increases (changes) as
 * the size of its input increases (changes).
 * <p>
 * BIG "O" NOTATION: is the formal/mathematical way to express the upper bound (worst case) of an algorithm's
 * running time. It measures the worst case time complexity or the longest amount of time an algorithm can
 * possibly take to complete.
 * - Constant time: O(1)
 * - Linear:        O(n)
 * - Logarithmic:   O(log n)
 * - Quadratic:     O(n^2)
 * <p>
 * SPACE COMPLEXITY: is the amount of memory space required to solve an instance of the computational problem
 * as a function of the size of the input. It is often expressed asymptotically in "big O" notation, such as
 * O(n), O[n*log(n)], O(n^2), etc., where "n" is the input size in units of bits needed to represent the input.
 */
public class MainClass {

    private static final String SOLUTION_2_TIME_MSG = "solution 2 time = (%d ms)%n";
    private static long totalExecutionTime = 0L;

    public static void main(String[] args) {
        twoNumberSum();
        validateSubsequence();
        sortedSquaredArray();
        tournamentWinner();
        nonConstructibleChange();
        System.out.printf("total time = (%d ms)%n", totalExecutionTime);
    }

    private static void twoNumberSum() {
        System.out.println("*** TWO NUMBER SUM ***");
        long startS2 = System.currentTimeMillis();
        TwoNumberSum.solution2(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 19);
        long finishS2 = System.currentTimeMillis() - startS2;
        System.out.printf(SOLUTION_2_TIME_MSG, finishS2);
        totalExecutionTime += finishS2;
        long startS3 = System.currentTimeMillis();
        TwoNumberSum.solution3(new Integer[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        long finishS3 = System.currentTimeMillis() - startS3;
        System.out.printf("solution 3 time = (%d ms)%n", finishS3);
        totalExecutionTime += finishS3;
    }

    private static void validateSubsequence() {
        System.out.println("*** VALIDATE SUBSEQUENCE ***");
        long startS1 = System.currentTimeMillis();
        ValidateSubsequence.isValidSubsequenceSolution1(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}, new Integer[]{1, 6, -1, 10});
        long finishS1 = System.currentTimeMillis() - startS1;
        System.out.printf("solution 1 time = (%d ms)%n", finishS1);
        totalExecutionTime += finishS1;
        long startS2 = System.currentTimeMillis();
        ValidateSubsequence.isValidSubsequenceSolution2(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}, new Integer[]{25});
        long finishS2 = System.currentTimeMillis() - startS2;
        System.out.printf(SOLUTION_2_TIME_MSG, finishS2);
        totalExecutionTime += finishS2;
    }

    private static void sortedSquaredArray() {
        System.out.println("*** SORTED SQUARED ARRAY ***");
        long startS1 = System.currentTimeMillis();
        SortedSquaredArray.getSquaredSortedArraySolution1(new Integer[]{-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20});
        long finishS1 = System.currentTimeMillis() - startS1;
        System.out.printf("solution 1 time = (%d ms)%n", finishS1);
        totalExecutionTime += finishS1;
        long startS2 = System.currentTimeMillis();
        SortedSquaredArray.getSquaredSortedArraySolution2(new Integer[]{-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20});
        long finishS2 = System.currentTimeMillis() - startS2;
        System.out.printf(SOLUTION_2_TIME_MSG, finishS2);
        totalExecutionTime += finishS2;
    }

    private static void tournamentWinner() {
        System.out.println("*** TOURNAMENT WINNER ***");
        List<List<String>> competitions = new ArrayList<>();
        List<String> competition1 = new ArrayList<>(Arrays.asList("HTML", "C#"));
        List<String> competition2 = new ArrayList<>(Arrays.asList("C#", "Python"));
        List<String> competition3 = new ArrayList<>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        long start = System.currentTimeMillis();
        TournamentWinner.getWinner(competitions, new Integer[]{0, 0, 1});
        long finish = System.currentTimeMillis() - start;
        System.out.printf("solution time = (%d ms)%n", finish);
        totalExecutionTime += finish;
    }

    private static void nonConstructibleChange() {
        System.out.println("*** NON-CONSTRUCTIBLE CHANGE ***");
        long start = System.currentTimeMillis();
        NonConstructibleChange.getNonConstructibleChange(new Integer[]{109, 2000, 8765, 19, 18, 17, 16, 8, 1, 1, 2, 4});
        long finish = System.currentTimeMillis() - start;
        System.out.printf("solution time = (%d ms)%n", finish);
        totalExecutionTime += finish;
    }
}
