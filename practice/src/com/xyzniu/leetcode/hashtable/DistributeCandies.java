package com.xyzniu.leetcode.hashtable;

import java.util.HashSet;

/**
 * 575
 */
public class DistributeCandies {
    
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < candies.length; i++) {
            set.add(candies[i]);
        }
        return Math.min(set.size(), candies.length / 2);
    }
}
