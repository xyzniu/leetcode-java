package com.xyzniu.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * 599
 */
public class MinimumIndexSumOfTwoLists {
    
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int m = map.get(list2[i]) + i;
                min = Math.min(min, m);
                map2.put(list2[i], m);
            }
        }
        List<String> rst = new ArrayList<>();
        for (String str : map2.keySet()) {
            if (map2.get(str) == min) {
                rst.add(str);
            }
        }
        return rst.toArray(new String[0]);
    }
    
}
