package com.xyzniu.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrences {
    
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int number : arr) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        
        HashSet<Integer> set = new HashSet<>();
        for (int number : map.values()) {
            if (set.contains(number)) {
                return false;
            }
            set.add(number);
        }
        return true;
    }
    
}
