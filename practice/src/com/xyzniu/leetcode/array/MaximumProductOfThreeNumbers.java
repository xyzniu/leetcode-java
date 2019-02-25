package com.xyzniu.leetcode.array;

import java.util.Arrays;

/**
 * 628
 */
public class MaximumProductOfThreeNumbers {

    /**
     * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
     *
     * @param nums
     * @return
     */
    public int maximumProduct(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        int len = nums.length - 1;
        int right = nums[len] * nums[len - 1] * nums[len - 2];
        int left = nums[len] * nums[0] * nums[1];
        return Math.max(right, left);
    }

    public void quickSort(int[] nums, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int start = lo;
        int end = hi;
        int key = nums[lo];
        while (start < end) {
            while (start < end && nums[end] >= key) {
                end--;
            }
            if (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
            while (start < end && nums[start] < key) {
                start++;
            }
            if (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
        }
        quickSort(nums, lo, start - 1);
        quickSort(nums, start + 1, hi);
    }


}
