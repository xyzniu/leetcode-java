package com.xyzniu.leetcode.array;

import java.lang.reflect.GenericArrayType;

/**
 * 59
 */
public class SpiralMatrixII {

    /**
     * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
     *
     * @param n
     * @return
     */
    public int[][] generateMatrix(int n) {
        int i = 1;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int down = n - 1;
        int[][] rst = new int[n][n];
        while (i < n * n) {
            for (int j = left; j < right; j++) {
                rst[top][j] = i++;
            }
            for (int j = top; j < down; j++) {
                rst[j][right] = i++;
            }
            for (int j = right; j > left; j--) {
                rst[down][j] = i++;
            }
            for (int j = down; j > top; j--) {
                rst[j][left] = i++;
            }
            left++;
            right--;
            top++;
            down--;
        }
        if (i == n * n) {
            rst[top][left] = i;
        }
        return rst;
    }

}
