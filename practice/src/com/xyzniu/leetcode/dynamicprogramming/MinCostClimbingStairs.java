package com.xyzniu.leetcode.dynamicprogramming;

import com.xyzniu.leetcode.array.MatrixCellsInDistanceOrder;

/**
 * 746
 */
public class MinCostClimbingStairs {
    
    public int minCostClimbingStairs(int[] cost) {
        int[] mincost = new int[cost.length];
        mincost[0] = cost[0];
        mincost[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            mincost[i] = cost[i] + Math.min(mincost[i - 1], mincost[i - 2]);
        }
        return Math.min(mincost[mincost.length - 1], mincost[mincost.length - 2]);
    }
    
}
