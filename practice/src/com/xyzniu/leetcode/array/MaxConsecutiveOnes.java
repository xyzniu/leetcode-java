package com.xyzniu.leetcode.array;

/**
 * 485
 */
public class MaxConsecutiveOnes {
    
    /**
     * 给定一个二进制数组， 计算其中最大连续1的个数。
     *
     * @param nums
     * @return
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
