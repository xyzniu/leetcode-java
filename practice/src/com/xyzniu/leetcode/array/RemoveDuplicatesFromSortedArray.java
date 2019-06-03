package com.xyzniu.leetcode.array;

/**
 * 26
 */
public class RemoveDuplicatesFromSortedArray {
    
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[index]) {
                continue;
            } else {
                nums[++index] = nums[i];
            }
        }
        return index + 1;
    }
    
}
