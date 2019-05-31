package com.xyzniu.leetcode.math;

/**
 * 263
 */
public class UglyNumber {
    
    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        int[] primesFactors = new int[]{2, 3, 5};
        for (int i = 0; i < primesFactors.length; i++) {
            while (num % primesFactors[i] == 0) {
                num = num / primesFactors[i];
            }
        }
        return num == 1;
    }
    
    
}
