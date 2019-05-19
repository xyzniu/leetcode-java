package com.xyzniu.leetcode.dynamicprogramming;

/**
 * 303
 */
public class RangeSumQueryImmutable {

}

class NumArray {
    
    int[] sum;
    
    public NumArray(int[] nums) {
        sum = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            sum[i] = count;
        }
    }
    
    public int sumRange(int i, int j) {
        if (i == 0) {
            return sum[j];
        } else {
            return sum[j] - sum[i - 1];
        }
    }
}
