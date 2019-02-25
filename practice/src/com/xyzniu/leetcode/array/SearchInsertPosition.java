package com.xyzniu.leetcode.array;

/**
 * 35
 */
public class SearchInsertPosition {

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * 你可以假设数组中无重复元素。
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }
        if (nums[i] >= target) {
            return i;
        } else {
            return i + 1;
        }
    }
}
