package com.xyzniu.leetcode.array;

/**
 * 766
 */
public class ToeplitzMatrix {

    /**
     * 如果一个矩阵的每一方向由左上到右下的对角线上具有相同元素，那么这个矩阵是托普利茨矩阵。
     * 给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
     *
     * 执行用时：31ms
     * 内存消耗：37MB
     *
     * @param matrix
     * @return
     */
    public boolean isToeplitzMatrix(int[][] matrix) {
        int[] prev = matrix[0];
        for (int i = 1; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 1; j < row.length; j++) {
                if (row[j] != prev[j - 1]) {
                    return false;
                }
            }
            prev = row;
        }
        return true;
    }
}
