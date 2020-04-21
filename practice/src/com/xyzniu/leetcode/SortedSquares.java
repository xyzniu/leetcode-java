package com.xyzniu.leetcode;

import java.util.Arrays;

public class SortedSquares {
    
    
    public int[] sortedSquares(int[] A) {
        int[] rst = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            rst[i] = A[i] * A[i];
        }
        Arrays.sort(rst);
        return rst;
    }
    
    
}
