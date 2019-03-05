package com.xyzniu.leetcode.array;

/**
 * 665
 */
public class NonDecreasingArray {

    /**
     * 给定一个长度为 n 的整数数组，你的任务是判断在最多改变 1 个元素的情况下，该数组能否变成一个非递减数列。
     * 我们是这样定义一个非递减数列的： 对于数组中所有的 i (1 <= i < n)，满足 array[i] <= array[i + 1]。
     *
     * @param nums
     * @return
     */
    public boolean checkPossibility(int[] nums) {
        boolean flag = true;
        if (nums.length < 3) {
            return true;
        }
        if (nums[0] > nums[1]) {
            nums[0] = nums[1];
            flag = false;
        }


        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i - 1]) {
                continue;
            }
            if (!flag) {
                return false;
            }
            flag = false;
            if (nums[i - 1] > nums[i + 1]) {
                nums[i + 1] = nums[i];
            } else {
                nums[i] = nums[i + 1];
            }
        }
        return true;
    }

}
