package com.xyzniu.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class SmallerNumbersThanCurrent {
    
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedArray);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < sortedArray.length; i++) {
            if (!map.containsKey(sortedArray[i])) {
                map.put(sortedArray[i], i);
            }
        }
        
        int[] rst = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rst[i] = map.get(nums[i]);
        }
        
        return rst;
    }
}

