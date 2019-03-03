package com.xyzniu.leetcode.math;

/**
 * 540
 */
public class SingleElementInASortedArray {

    /**
     * 给定一个只包含整数的有序数组，每个元素都会出现两次，唯有一个数只会出现一次，找出这个数。
     *
     * @param nums
     * @return
     */
    public int singleNonDuplicate(int[] nums) {
        int rst = 0;
        for (int i = 0; i < nums.length; i++) {
            rst = rst ^ nums[i];
        }
        return rst;
    }

}
