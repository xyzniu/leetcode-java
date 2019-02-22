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
        HashSet<Entry> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                sum += 4;
                Entry e1 = new Entry(i - 1, j);
                Entry e2 = new Entry(i, j - 1);
                if (set.contains(e1)) {
                    sum -= 2;
                }
                if (set.contains(e2)) {
                    sum -= 2;
                }
                Entry e = new Entry(i, j);
                set.add(e);
            }
        }
        return sum;
    }

    class Entry {
        int i;
        int j;

        public Entry(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Entry entry = (Entry) o;
            return i == entry.i &&
                    j == entry.j;
        }

        @Override
        public int hashCode() {
            return i * j;
        }
    }

    public static void main(String[] args) {
        IslandPerimeter i = new IslandPerimeter();
        i.islandPerimeter(new int[][]{
                {0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}
        });
    }

    public int islandPerimeter1(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        int len = grid.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                set.add(i * len + j);
                sum += 4;
                if (set.contains((i - 1) * len + j)) {
                    sum -= 2;
                }
                if (set.contains(i * len + j - 1)) {
                    sum -= 2;
                }
            }
        }
        return sum;
    }

    public int islandPerimeter3(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                sum += 4;
                if (i > 0 && grid[i - 1][j] == 1) {
                    sum -= 2;
                }
                if (j > 0 && grid[i][j - 1] == 1) {
                    sum -= 2;
                }
            }
        }
        return sum;
    }

}
