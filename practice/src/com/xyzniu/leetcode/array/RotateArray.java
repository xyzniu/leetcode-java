package com.xyzniu.leetcode.array;

/**
 * 189
 */
public class RotateArray {

    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        k = nums.length - k - 1;
        rotate(nums, 0, k);
        rotate(nums, k + 1, nums.length - 1);
        rotate(nums, 0, nums.length - 1);
    }

    private void rotate(int[] nums, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

}
