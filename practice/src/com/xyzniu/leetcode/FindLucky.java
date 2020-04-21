package com.xyzniu.leetcode;

import java.util.HashMap;

public class FindLucky {
    
    
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int max = -1;
        
        for (int n : map.keySet()) {
            if (n == map.get(n)) {
                max = Math.max(max, n);
            }
        }
        return max;
    }
    
}
