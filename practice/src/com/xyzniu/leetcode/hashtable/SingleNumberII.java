package com.xyzniu.leetcode.hashtable;

import java.util.HashMap;

/**
 * 137
 */
public class SingleNumberII {
    
    public int singleNumber(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], false);
            } else {
                map.put(nums[i], true);
            }
        }
        for (int num : nums) {
            if (!map.get(num)) {
                return num;
            }
        }
        return -1;
    }
    
}
