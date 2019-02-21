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
        return arrayPairSum1(nums);
    }

    public int arrayPairSum1(int[] nums) {
        //Arrays.sort(nums);
        int len = nums.length;
        quickSort(nums, 0, len - 1);
        int sum = 0;
        for (int i = 0; i < len; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    /**
     * 快排（然而一点都不快）
     * @param nums
     * @param low
     * @param high
     */
    public void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int key = nums[start];

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
        quickSort(nums, low, start - 1);
        quickSort(nums, start + 1, high);
    }


}
