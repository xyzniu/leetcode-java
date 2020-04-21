package com.xyzniu.leetcode;

public class CreateTargetArray {
    
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = createDefaultArray(nums.length);
        
        for (int i = 0; i < nums.length; i++) {
            insert(target, nums[i], index[i]);
        }
        return target;
    }
    
    private int[] createDefaultArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = -1;
        }
        return array;
    }
    
    private void insert(int[] target, int num, int index) {
        if (target[index] == -1) {
            target[index] = num;
            return;
        }
        
        for (int i = target.length - 1; i > index; i--) {
            target[i] = target[i - 1];
        }
        target[index] = num;
        return;
    }
}
