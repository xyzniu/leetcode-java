package com.xyzniu.leetcode.hashtable;

import java.util.HashMap;

/**
 * 350
 */
public class IntersectionOfTwoArraysII {
    
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = getMap(nums1);
        HashMap<Integer, Integer> map2 = getMap(nums2);
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0;
        for (int num : map1.keySet()) {
            if (map2.containsKey(num)) {
                int count = Math.min(map1.get(num), map2.get(num));
                map.put(num, count);
                len += count;
            }
        }
        int[] rst = new int[len];
        int index = 0;
        for (int num : map.keySet()) {
            int count = map.get(num);
            for (int i = 0; i < count; i++) {
                rst[index++] = num;
            }
        }
        return rst;
    }
    
    private HashMap<Integer, Integer> getMap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        return map;
    }
    
    
}
