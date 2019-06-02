package com.xyzniu.leetcode.array;

/**
 * 661
 */
public class ImageSmoother {
    
    public int[][] imageSmoother(int[][] M) {
        int[][] rst = new int[M.length][M[0].length];
        int ilen = M.length;
        int jlen = M[0].length;
        int sum;
        int count;
        for (int i = 0; i < ilen; i++) {
            for (int j = 0; j < jlen; j++) {
                sum = M[i][j];
                count = 1;
                if (i > 0 && j > 0) {
                    sum += M[i - 1][j - 1];
                    count++;
                }
                if (i > 0 && j < jlen - 1) {
                    sum += M[i - 1][j + 1];
                    count++;
                }
                if (i < ilen - 1 && j > 0) {
                    sum += M[i + 1][j - 1];
                    count++;
                }
                if (i < ilen - 1 && j < jlen - 1) {
                    sum += M[i + 1][j + 1];
                    count++;
                }
                if (i > 0) {
                    sum += M[i - 1][j];
                    count++;
                }
                if (i < ilen - 1) {
                    sum += M[i + 1][j];
                    count++;
                }
                if (j > 0) {
                    sum += M[i][j - 1];
                    count++;
                }
                if (j < jlen - 1) {
                    sum += M[i][j + 1];
                    count++;
                }
                rst[i][j] = sum / count;
            }
        }
        return rst;
    }
}
