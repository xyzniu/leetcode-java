package com.xyzniu.leetcode.array;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 840
 */
public class MagicSquaresInGrid {

    /**
     * 3 x 3 的幻方是一个填充有从 1 到 9 的不同数字的 3 x 3 矩阵，其中每行，每列以及两条对角线上的各数之和都相等。
     * 给定一个由整数组成的 grid，其中有多少个 3 × 3 的 “幻方” 子矩阵？（每个子矩阵都是连续的）。
     *
     * @param grid
     * @return
     */
    public int numMagicSquaresInside(int[][] grid) {
        int sum = 0;
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {
                HashSet<Integer> set = new HashSet<>();
                int row1 = grid[i - 1][j - 1] + grid[i - 1][j] + grid[i - 1][j + 1];
                int row2 = grid[i][j - 1] + grid[i][j] + grid[i][j + 1];
                int row3 = grid[i + 1][j - 1] + grid[i + 1][j] + grid[i + 1][j + 1];
                if (row1 != row2 || row1 != row3) {
                    continue;
                }
                int col1 = grid[i - 1][j - 1] + grid[i][j - 1] + grid[i + 1][j - 1];
                int col2 = grid[i - 1][j] + grid[i][j] + grid[i + 1][j];
                int col3 = grid[i - 1][j + 1] + grid[i][j + 1] + grid[i + 1][j + 1];
                if (row1 != col1 || col1 != col2 || col1 != col3) {
                    continue;
                }
                int cross1 = grid[i - 1][j - 1] + grid[i + 1][j + 1] + grid[i][j];
                int cross2 = grid[i + 1][j - 1] + grid[i - 1][j + 1] + grid[i][j];
                if (col1 != cross1 || cross1 != cross2) {
                    continue;
                }
                set.add(grid[i - 1][j - 1]);
                set.add(grid[i - 1][j]);
                set.add(grid[i - 1][j + 1]);
                set.add(grid[i][j - 1]);
                set.add(grid[i][j]);
                set.add(grid[i][j + 1]);
                set.add(grid[i + 1][j - 1]);
                set.add(grid[i + 1][j]);
                set.add(grid[i + 1][j + 1]);
                if (set.size() < 9) {
                    continue;
                }
                Iterator iterator = set.iterator();
                boolean flag = true;
                while (iterator.hasNext()) {
                    int num = (int) iterator.next();
                    if (num <= 0 || num > 9) {
                        flag = false;
                        continue;
                    }
                }
                if (flag) {

                    sum++;
                }
            }
        }
        return sum;
    }
}
