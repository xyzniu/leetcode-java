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
        int[][] rst = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int index = 1;
        while (index <= n * n) {
            for (int i = left; i <= right; i++) {
                rst[top][i] = index++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                rst[i][right] = index++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                rst[bottom][i] = index++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                rst[i][left] = index++;
            }
            left++;
        }
        return rst;
    }
    
}
