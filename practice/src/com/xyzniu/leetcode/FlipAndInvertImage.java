package com.xyzniu.leetcode;

public class FlipAndInvertImage {
    
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] rst = new int[A.length][A[0].length];
        
        int length = A[0].length;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < length; j++) {
                rst[i][length - j - 1] = A[i][j];
            }
        }
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < length; j++) {
                if (rst[i][j] == 1) {
                    rst[i][j] = 0;
                } else {
                    rst[i][j] = 1;
                }
            }
        }
        return rst;
    }
    
    
}
