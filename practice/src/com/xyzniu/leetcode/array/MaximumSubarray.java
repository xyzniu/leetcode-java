package com.xyzniu.leetcode.array;

/**
 * 53
 */
public class MaximumSubarray {
    
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            sum = Math.max(0, sum);
        }
        return max;
    }
}
