package com.xyzniu.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 73
 */
public class SetMatrixZeroes {

    /**
     * 给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。
     *
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> column = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    column.add(j);
                }
            }
        }

        for (int i = 0; i < row.size(); i++) {
            int rownum = row.get(i);
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[rownum][j] = 0;
            }
        }
        for (int i = 0; i < column.size(); i++) {
            int columnnum = column.get(i);
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][columnnum] = 0;
            }
        }
    }

}
