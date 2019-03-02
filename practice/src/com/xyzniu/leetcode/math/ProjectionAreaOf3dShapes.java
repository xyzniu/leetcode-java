package com.xyzniu.leetcode.math;

/**
 * 883
 */
public class ProjectionAreaOf3dShapes {


    /**
     * 在 N * N 的网格中，我们放置了一些与 x，y，z 三轴对齐的 1 * 1 * 1 立方体。
     * 每个值 v = grid[i][j] 表示 v 个正方体叠放在单元格 (i, j) 上。
     * 现在，我们查看这些立方体在 xy、yz 和 zx 平面上的投影。
     * 投影就像影子，将三维形体映射到一个二维平面上。
     * 在这里，从顶部、前面和侧面看立方体时，我们会看到“影子”。
     * 返回所有三个投影的总面积。
     *
     * @param grid
     * @return
     */
    public int projectionArea(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[0].length; j++) {
                max = Math.max(grid[i][j], max);
                if (grid[i][j] > 0) {
                    sum++;
                }
            }
            sum += max;
        }
        for (int j = 0; j < grid[0].length; j++) {
            int max = 0;
            for (int i = 0; i < grid.length; i++) {
                max = Math.max(max, grid[i][j]);
            }
            sum += max;
        }
        return sum;
    }
}