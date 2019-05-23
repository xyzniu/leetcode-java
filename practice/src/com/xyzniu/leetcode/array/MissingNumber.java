package com.xyzniu.leetcode.array;

/**
 * 268
 */
public class MissingNumber {
    
    /**
     * Q:
     * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
     * <p>
     * A:
     * 相加，但是这种方式可能会溢出
     * 异或，没出现的就被暴露出来了。
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int rst = 0;
        for (int i = 0; i < nums.length; i++) {
            rst = rst ^ i ^ nums[i];
        }
        rst = rst ^ nums.length;
        return rst;
    }
    
    
}
