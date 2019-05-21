package com.xyzniu.leetcode.hashtable;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 260
 */
public class SingleNumberIII {
    
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                set.remove(num);
            }
        }
        
        int[] rst = new int[2];
        int index = 0;
        for (int num : set) {
            rst[index++] = num;
        }
        return rst;
    }
    
}
