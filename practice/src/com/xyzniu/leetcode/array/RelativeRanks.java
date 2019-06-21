package com.xyzniu.leetcode.array;

import java.util.Iterator;
import java.util.TreeMap;

public class RelativeRanks {
    
    public String[] findRelativeRanks(int[] nums) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            treeMap.put(nums[i], i);
        }
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        String[] result = new String[nums.length];
        
        int i = 1;
        String value = null;
        while (it.hasNext()) {
            int num = it.next();
            switch (i) {
                case 1:
                    value = "Gold Medal";
                    break;
                case 2:
                    value = "Silver Medal";
                    break;
                case 3:
                    value = "Bronze Medal";
                    break;
                default:
                    value = String.valueOf(i);
                    break;
            }
            result[treeMap.get(num)] = value;
            i++;
        }
        return result;
    }
}
