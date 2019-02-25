package com.xyzniu.leetcode.array;

/**
 * 674
 */
public class LongestContinuousIncreasingSubsequence {

    /**
     * 给定一个未经排序的整数数组，找到最长且连续的的递增序列。
     *
     * @param nums
     * @return
     */
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int prev = nums[0];
        int sum = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > prev) {
                sum++;
            } else {
                max = Math.max(max, sum);
                sum = 1;
            }
            prev = nums[i];
        }
        return Math.max(max, sum);
    }
}
