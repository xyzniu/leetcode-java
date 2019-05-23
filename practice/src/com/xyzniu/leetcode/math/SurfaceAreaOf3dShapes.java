package com.xyzniu.leetcode.math;

/**
 * 892
 */
public class SurfaceAreaOf3dShapes {
    
    public int surfaceArea(int[][] grid) {
        int sum = 0;
        int[] row = new int[grid.length];
        int[] column = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                row[i] = Math.max(row[i], grid[i][j]);
                column[j] = Math.max(column[j], grid[i][j]);
                sum += 1;
            }
        }
        for (int i = 0; i < row.length; i++) {
            sum += row[i];
        }
        for (int i = 0; i < column.length; i++) {
            sum += column[i];
        }
        return sum * 2;
    }
    
}
