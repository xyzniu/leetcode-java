package com.xyzniu.leetcode.dynamicprogramming;

/**
 * 746
 */
public class MinCostClimbingStairs {

    /**
     * 数组的每个索引做为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
     * 每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。
     * 您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。
     *
     * @param cost
     * @return
     */
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < dp.length - 1; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        dp[dp.length-1] = Math.min(dp[dp.length-2], dp[dp.length-3]);
        return dp[dp.length - 1];
    }

}
