package com.xyzniu.leetcode.array;

/**
 * 485
 */
public class MaxConsecutiveOnes {

    /**
     * 给定一个二进制数组， 计算其中最大连续1的个数。
     *
     * 执行用时：9ms
     * 内存消耗：42MB
     *
     * @param nums
     * @return
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int rst = 0;
        int one = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                one++;
            }
            if (nums[i] == 0) {
                rst = Math.max(rst, one);
                one = 0;
            }
        }
        rst = Math.max(rst, one);
        return rst;
    }

}
