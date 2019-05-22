package com.xyzniu.leetcode.array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 447
 */
public class NumberOfBoomerangs {
    
    public int numberOfBoomerangs(int[][] points) {
        int rst = 0;
        for (int i = 0; i < points.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int x1 = points[i][0];
            int y1 = points[i][1];
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                int x = x1 - points[j][0];
                int y = y1 - points[j][1];
                int len = x * x + y * y;
                map.put(len, map.getOrDefault(len, 0) + 1);
            }
            for (int value : map.values()) {
                rst += (value - 1) * value;
            }
        }
        return rst;
    }
    
}
