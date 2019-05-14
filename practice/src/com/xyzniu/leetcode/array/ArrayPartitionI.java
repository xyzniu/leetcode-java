package com.xyzniu.leetcode.array;

/**
 * 561
 */
public class ArrayPartitionI {
    
    
    /**
     * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
     * <p>
     * 排序
     *
     * @param nums
     * @return
     */
    public int arrayPairSum(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        int sum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
    
    private void quicksort(int[] nums, int left, int right) {
        if (right <= left) {
            return;
        }
        int one = left;
        int start = left + 1;
        int end = right;
        while (start < end) {
            while (start < end && nums[end] >= nums[one]) {
                end--;
            }
            while (start < end && nums[start] <= nums[one]) {
                start++;
            }
            if (start < end) {
                swap(nums, start, end);
            }
        }
        
        if (nums[start] > nums[one]) {
            swap(nums, start - 1, one);
            one = start-1;
        } else {
            swap(nums, start, one);
            one = start;
        }
        
        quicksort(nums, left, one - 1);
        quicksort(nums, one + 1, right);
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}
