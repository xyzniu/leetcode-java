package com.xyzniu.leetcode;

import java.util.Arrays;

public class ArrayPairSum {
    
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int rst = 0;
        for (int i = 0; i < nums.length; i += 2) {
            rst += nums[i];
        }
        return rst;
    }
    
    
}
