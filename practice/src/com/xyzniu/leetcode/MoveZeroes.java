package com.xyzniu.leetcode;

public class MoveZeroes {
    
    
    public void moveZeroes(int[] nums) {
        int one = 0;
        int zero = 0;
        while (zero < nums.length) {
            while (zero < nums.length && nums[zero] == 0) {
                zero++;
            }
            if (zero < nums.length) {
                nums[one] = nums[zero];
                one++;
                zero++;
            }
        }
        while (one < nums.length) {
            nums[one++] = 0;
        }
    }
}
