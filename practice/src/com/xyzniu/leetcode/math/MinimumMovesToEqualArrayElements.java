package com.xyzniu.leetcode.math;

/**
 * 453
 */
public class MinimumMovesToEqualArrayElements {
    
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int rst = 0;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
        }
        for (int i = 0; i < nums.length; i++) {
            rst += (nums[i] - min);
        }
        return rst;
    }
    
}
