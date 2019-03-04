package com.xyzniu.leetcode.array;

/**
 * 643
 */
public class MaximumAverageSubarrayI {

    /**
     * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
     *
     * @param nums
     * @param k
     * @return
     */
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            max = Math.max(max, sum);
        }
        return max / k;
    }

}
