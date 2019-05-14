package com.xyzniu.leetcode.math;

/**
 * 908
 */
public class SmallestRangeI {
    
    public int smallestRangeI(int[] A, int K) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < A.length; i++) {
            min = Math.min(A[i], min);
            max = Math.max(A[i], max);
        }
        
        if (max - min <= 2 * K) {
            return 0;
        } else {
            return max - min - 2 * K;
        }
    }
    
}
