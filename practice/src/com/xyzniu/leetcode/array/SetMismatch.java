package com.xyzniu.leetcode.array;

/**
 * 645
 */
public class SetMismatch {
    
    
    public int[] findErrorNums(int[] nums) {
        boolean[] booleans = new boolean[nums.length];
        int[] rst = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (booleans[nums[i] - 1]) {
                rst[0] = nums[i];
            }
            booleans[nums[i] - 1] = true;
        }
        for (int i = 0; i < booleans.length; i++) {
            if (!booleans[i]) {
                rst[1] = i + 1;
                return rst;
            }
        }
        return rst;
    }
    
}
