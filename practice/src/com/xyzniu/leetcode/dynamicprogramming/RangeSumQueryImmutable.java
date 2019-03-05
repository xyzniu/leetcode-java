package com.xyzniu.leetcode.dynamicprogramming;

/**
 * 303
 */
public class RangeSumQueryImmutable {

}

class NumArray {
    int[] left;
    int[] right;
    int sum;

    public NumArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        left = new int[nums.length];
        right = new int[nums.length];
        left[0] = 0;
        sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] + nums[i - 1];
            sum += nums[i];
        }
        right[nums.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i + 1];
        }
    }

    public int sumRange(int i, int j) {
        return sum - left[i] - right[j];
    }
}
