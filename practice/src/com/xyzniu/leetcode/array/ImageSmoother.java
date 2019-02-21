package com.xyzniu.leetcode.array;

/**
 * 661
 */
public class ImageSmoother {

    public int[][] imageSmoother(int[][] M) {
        int[][] rst = new int[M.length][M[0].length];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                int sum = M[i][j];
                int count = 1;

                if (i > 0) {
                    sum += M[i - 1][j];
                    count++;
                }
                if (j > 0) {
                    sum += M[i][j - 1];
                    count++;
                }
                if (i < M.length - 1) {
                    sum += M[i + 1][j];
                    count++;
                }
                if (j < M[0].length - 1) {
                    sum += M[i][j + 1];
                    count++;
                }


                if (i > 0 && j > 0) {
                    sum += M[i - 1][j - 1];
                    count++;
                }
                if (i > 0 && j < M[0].length - 1) {
                    sum += M[i - 1][j + 1];
                    count++;
                }
                if (i < M.length - 1 && j > 0) {
                    sum += M[i + 1][j - 1];
                    count++;
                }
                if (i < M.length - 1 && j < M[0].length - 1) {
                    sum += M[i + 1][j + 1];
                    count++;
                }
                rst[i][j] = sum / count;
            }
        }
        return rst;
    }
}
