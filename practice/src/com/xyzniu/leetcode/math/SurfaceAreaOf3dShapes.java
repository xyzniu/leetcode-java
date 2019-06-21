package com.xyzniu.leetcode.math;

/**
 * 892
 */
public class SurfaceAreaOf3dShapes {
    
    public int surfaceArea(int[][] grid) {
        int sum = 0;
        int num = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                num = grid[i][j];
                if (num == 0) {
                    continue;
                }
                sum += 2;
                if (i != 0) {
                    sum += Math.max(0, num - grid[i - 1][j]);
                } else {
                    sum += num;
                }
                if (i != grid.length - 1) {
                    sum += Math.max(0, num - grid[i + 1][j]);
                } else {
                    sum += num;
                }
                if (j != 0) {
                    sum += Math.max(0, num - grid[i][j - 1]);
                } else {
                    sum += num;
                }
                if (j != grid[0].length - 1) {
                    sum += Math.max(0, num - grid[i][j + 1]);
                } else {
                    sum += num;
                }
            }
        }
        return sum;
    }
    
}
