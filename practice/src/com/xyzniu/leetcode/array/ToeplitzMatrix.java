package com.xyzniu.leetcode.array;

/**
 * 766
 */
public class ToeplitzMatrix {

    /**
     * 如果一个矩阵的每一方向由左上到右下的对角线上具有相同元素，那么这个矩阵是托普利茨矩阵。
     * 给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
     *
     * @param matrix
     * @return
     */
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i = 1; i < matrix.length; i++) {
        	for(int j = 1; j < matrix[0].length; j++) {
        		if(matrix[i][j]!=matrix[i-1][j-1]) {
        			return false;
        		}
        	}
        }
        return true;
    }
}
