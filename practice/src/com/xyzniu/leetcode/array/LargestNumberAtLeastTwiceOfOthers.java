package com.xyzniu.leetcode.array;

/**
 * 747
 */
public class LargestNumberAtLeastTwiceOfOthers {

    /**
     * 在一个给定的数组nums中，总是存在一个最大元素 。
     * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
     * 如果是，则返回最大元素的索引，否则返回-1。
     *
     * @param nums
     * @return
     */
    public int dominantIndex(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }
        int max1 = nums[0] > nums[1] ? 0 : 1;
        int max2 = 1 - max1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > nums[max1]) {
                max2 = max1;
                max1 = i;
            } else if (nums[i] > nums[max2]) {
                max2 = i;
            }
        }
        if (nums[max1] >= 2 * nums[max2]) {
            return max1;
        } else {
            return -1;
        }
    }
}
