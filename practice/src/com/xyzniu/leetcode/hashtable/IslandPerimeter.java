package com.xyzniu.leetcode.hashtable;

import java.util.HashSet;
import java.util.Objects;

/**
 * 463
 */
public class IslandPerimeter {
    
    /**
     * 给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。
     * 网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。
     * 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。
     *
     * @param grid
     * @return
     */
    public int islandPerimeter(int[][] grid) {
        int length = 0;
        int ilen = grid.length - 1;
        int jlen = grid[0].length - 1;
        for (int i = 0; i <= ilen; i++) {
            for (int j = 0; j <= jlen; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                if (i == 0) {
                    length++;
                } else if (grid[i - 1][j] == 0) {
                    length++;
                }
                if (i == ilen) {
                    length++;
                } else if (grid[i + 1][j] == 0) {
                    length++;
                }
                if (j == 0) {
                    length++;
                } else if (grid[i][j - 1] == 0) {
                    length++;
                }
                if (j == jlen) {
                    length++;
                } else if (grid[i][j + 1] == 0) {
                    length++;
                }
            }
        }
        return length;
    }
    
}
