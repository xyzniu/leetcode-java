package com.xyzniu.leetcode.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 973
 */
public class KClosestPointsToOrigin {

    /**
     * 我们有一个由平面上的点组成的列表 points。需要从中找出 K 个距离原点 (0, 0) 最近的点。
     * （这里，平面上两点之间的距离是欧几里德距离。）
     * 你可以按任何顺序返回答案。除了点坐标的顺序之外，答案确保是唯一的。
     *
     * @param points
     * @param K
     * @return
     */
    public int[][] kClosest(int[][] points, int K) {
        int[][] rst = new int[K][2];
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int a1 = o1[0] * o1[0] + o1[1] * o1[1];
                int a2 = o2[0] * o2[0] + o2[1] * o2[1];
                return a1 - a2;
            }
        });
        for (int i = 0; i < K; i++) {
            rst[i] = points[i];
        }
        return rst;
    }

}
