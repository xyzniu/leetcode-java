package com.xyzniu.leetcode;

public class DecompressRLElist {
    public int[] decompressRLElist(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i += 2) {
            count += nums[i];
        }
        
        int[] array = new int[count];
        
        int index = 0;
        
        for (int i = 0; i < nums.length; i += 2) {
            int number = nums[i + 1];
            for (int j = 0; j < nums[i]; j++) {
                array[index++] = number;
            }
        }
        
        return array;
    }
    
}
