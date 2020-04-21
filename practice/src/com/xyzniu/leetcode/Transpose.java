package com.xyzniu.leetcode;

public class Transpose {
    
    public int[][] transpose(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int[][] rst = new int[n][m];
        for (int i = 0; i < m; i++) {
            
            for (int j = 0; j < n; j++) {
                rst[j][i] = A[i][j];
            }
        }
        return rst;
    }
    
}
