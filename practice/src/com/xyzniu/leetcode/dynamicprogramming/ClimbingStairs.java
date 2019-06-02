package com.xyzniu.leetcode.dynamicprogramming;

/**
 * 70
 */
public class ClimbingStairs {
    
    
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        int[] rst = new int[n + 1];
        rst[0] = 0;
        rst[1] = 1;
        rst[2] = 2;
        for (int i = 3; i <= n; i++) {
            rst[i] = rst[i - 1] + rst[i - 2];
        }
        return rst[n];
    }
    
}
