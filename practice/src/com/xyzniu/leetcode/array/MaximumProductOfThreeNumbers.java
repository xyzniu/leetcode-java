package com.xyzniu.leetcode.array;

import java.util.Arrays;

/**
 * 628
 */
public class MaximumProductOfThreeNumbers {
    
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        quicksort(nums, 0, len - 1);
        int rst = Integer.MIN_VALUE;
        if (nums[1] < 0) {
            rst = nums[0] * nums[1] * nums[len - 1];
        }
        rst = Math.max(rst, nums[len - 1] * nums[len - 2] * nums[len - 3]);
        
        return rst;
    }
    
    private void quicksort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int one = start;
        int left = start + 1;
        int right = end;
        while (left < right) {
            while (left < right && nums[left] <= nums[one]) {
                left++;
            }
            while (left < right && nums[right] >= nums[one]) {
                right--;
            }
            if (left < right) {
                swap(nums, left, right);
                left++;
                right--;
            }
        }
        int mid;
        if (nums[left] < nums[one]) {
            mid = left;
        } else {
            mid = left - 1;
        }
        swap(nums, one, mid);
        quicksort(nums, start, mid - 1);
        quicksort(nums, mid + 1, end);
        
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}
