package com.xyzniu.leetcode.array;

/**
 * 122
 */
public class BestTimeToBuyAndSellStockII {


    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
     * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }

        int now = prices[0];
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > now) {
                sum += prices[i] - now;
                now = prices[i];
            } else {
                now = prices[i];
            }
        }
        return sum;
    }

}
