package com.xyzniu.leetcode.math;

/**
 * 231
 */
public class PowerOfTwo {
    
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n % 4 == 0) {
            n = n / 4;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }
    
}
