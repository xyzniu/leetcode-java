package com.xyzniu.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 1
 */
public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] * 2 == target) {
                continue;
            }
            if (map.containsKey(target - nums[i])) {
                int[] rst = new int[]{map.get(target - nums[i]), i};
                return rst;
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
