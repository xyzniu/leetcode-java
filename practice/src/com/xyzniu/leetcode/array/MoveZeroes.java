package com.xyzniu.leetcode.array;

/**
 * 283
 */
public class MoveZeroes {
    
    
    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int index = 0;
        int i = 0;
        while (i < nums.length) {
            while (i < nums.length && nums[i] == 0) {
                i++;
            }
            if (i < nums.length) {
                nums[index++] = nums[i++];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
    
}
