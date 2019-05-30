package com.xyzniu.leetcode.array;

/**
 * 598
 */
public class RangeAdditionII {
    
    public int maxCount(int m, int n, int[][] ops) {
        int maxM = m;
        int maxN = n;
        
        for (int i = 0; i < ops.length; i++) {
            maxM = Math.min(maxM, ops[i][0]);
            maxN = Math.min(maxN, ops[i][1]);
        }
        return maxM * maxN;
    }
    
}
