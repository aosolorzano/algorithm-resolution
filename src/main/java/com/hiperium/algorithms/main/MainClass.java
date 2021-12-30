package com.hiperium.algorithms.main;

import com.hiperium.algorithms.arrays.TwoNumberSum;

/**
 * ALGORITHM ANALYSIS: is a study to provides theoretical estimation for the required resources of an algorithm
 * to solve a specific problem. Generally, the efficiency an algorithm is related to the input length (number of
 * steps), known as "time complexity", or the volume of memory, know as "space complexity".
 *
 * Why do we need Algorithm Analysis?
 *  - Knowing efficiency of an algorithm is very vital on "mission critical" tasks.
 *  - Generally there are multiple approaches/methods/algorithms to solve 1 problem statement. Algorithm analysis
 *    is performed to figure out which is the better/optimum approaches/methods/algorithms out of the options.
 *
 * What does a BETTER Algorithm mean?
 *  - Faster?               - Time Complexity.
 *  - Less memory?          - Space Complexity.
 *  - Easy to read?
 *  - Fewer lines of code?
 *  - Fewer HW/SW needs?
 *
 * What is Asymptotic Algorithm Analysis?
 *  - In mathematical analysis, asymptotic analysis of algorithm is a method of defining the mathematical boundaries
 *    of its runtime performance.
 *  - Using the asymptotic analysis, we can easily estimate about the average case, best case, and worst case
 *    scenario of an algorithm.
 *  - It is used to mathematically calculate the running time of any operation inside an algorithm.
 *
 *  TIME COMPLEXITY: is a computational way to show how (behaviour) runtime of a program increases (changes) as
 *  the size of its input increases (changes).
 *
 *  BIG "O" NOTATION: is the formal/mathematical way to express the upper bound (worst case) of an algorithm's
 *  running time. It measures the worst case time complexity or the longest amount of time an algorithm can
 *  possibly take to complete.
 *      - Constant time: O(1)
 *      - Linear:        O(n)
 *      - Logarithmic:   O(log n)
 *      - Quadratic:     O(n^2)
 *
 *  SPACE COMPLEXITY: is the amount of memory space required to solve an instance of the computational problem
 *  as a function of the size of the input. It is often expressed asymptotically in "big O" notation, such as
 *  O(n), O[n*log(n)], O(n^2), etc., where "n" is the input size in units of bits needed to represent the input.
 */
public class MainClass {

    public static void main(String[] args) {
        twoNumberSum();
    }

    private static void twoNumberSum() {
        System.out.println("*** TWO NUMBER SUM ***");
        TwoNumberSum.solution2(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 19);
        TwoNumberSum.solution3(new Integer[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
    }
}
