package com.xyzniu.leetcode.array;

import java.util.Arrays;

/**
 * 581
 */
public class ShortestUnsortedContinuousSubarray {

    /**
     * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
     * 你找到的子数组应是最短的，请输出它的长度。
     *
     * @param nums
     * @return
     */
    public int findUnsortedSubarray(int[] nums) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);
        int left = 0;
        int right = nums.length - 1;
        for (; left < nums.length; left++) {
            if (nums[left] != sorted[left]) {
                break;
            }
        }

        for (; right >= 0; right--) {
            if (nums[right] != sorted[right]) {
                break;
            }
        }

        if (left > right) {
            return 0;
        } else {
            return right - left + 1;
        }
    }

}
