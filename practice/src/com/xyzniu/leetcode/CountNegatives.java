package com.xyzniu.leetcode;

public class CountNegatives {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int rst = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = grid[0].length - count - 1; j >= 0 && grid[i][j] < 0; j--) {
                count++;
            }
            rst += count;
        }
        return rst;
    }
}