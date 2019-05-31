package com.xyzniu.leetcode.array;

import java.util.Collection;
import java.util.HashMap;

/**
 * 697
 */
public class DegreeOfAnArray {
    
    
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Entry> map = new HashMap<>();
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            Entry e;
            if (!map.containsKey(nums[i])) {
                e = new Entry(i);
            } else {
                e = map.get(nums[i]);
                e.end = i;
                e.count++;
                max = Math.max(e.count, max);
            }
            map.put(nums[i], e);
        }
        
        int min = Integer.MAX_VALUE;
        for (Entry e : map.values()) {
            if (e.count == max) {
                min = Math.min(min, e.end - e.start);
            }
        }
        return min + 1;
        
    }
    
    class Entry {
        int start;
        int end;
        int count;
        
        Entry(int start) {
            this.start = start;
            this.end = start;
            this.count = 1;
        }
    }
    
    
    
}
