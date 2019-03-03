package com.xyzniu.leetcode.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * 797
 */
public class AllPathsFromSourceToTarget {

    /**
     * 给一个有 n 个结点的有向无环图，找到所有从 0 到 n-1 的路径并输出（不要求按顺序）
     * 二维数组的第 i 个数组中的单元都表示有向图中 i 号结点所能到达的下一些结点（译者注：有向图是有方向的，即规定了a→b你就不能从b→a）空就是没有下一个结点了。
     *
     * @param graph
     * @return
     */
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> rst = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        allPathsSourceTarget(graph, rst, row, 0);
        return rst;
    }

    private void allPathsSourceTarget(int[][] graph, List<List<Integer>> rst, List<Integer> row, int start) {
        if (start == graph.length - 1) {
            List<Integer> temp = new ArrayList<>();
            row.add(start);
            temp.addAll(row);
            rst.add(temp);
            return;
        }
        row.add(start);
        for (int i = 0; i < graph[start].length; i++) {
            allPathsSourceTarget(graph, rst, row, graph[start][i]);
            row.remove(row.size() - 1);
        }
    }
}
