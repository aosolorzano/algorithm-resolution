package com.hiperium.algorithms.main;

import com.hiperium.algorithms.arrays.TwoNumberSum;

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
