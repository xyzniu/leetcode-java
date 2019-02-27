package com.xyzniu.leetcode.dynamicprogramming;

import java.util.List;

/**
 * 120
 */
public class Triangle {

    /**
     * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
     *
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> prev = triangle.get(0);
        List<Integer> row = null;
        for (int i = 1; i < triangle.size(); i++) {
            row = triangle.get(i);
            row.set(0, row.get(0) + prev.get(0));
            for (int j = 1; j < row.size() - 1; j++) {
                int min = Math.min(prev.get(j - 1), prev.get(j));
                row.set(j, row.get(j) + min);
            }
            row.set(row.size() - 1, row.get(row.size() - 1) + prev.get(prev.size() - 1));
            prev = row;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prev.size(); i++) {
            min = Math.min(min, prev.get(i));
        }
        return min;
    }

}
