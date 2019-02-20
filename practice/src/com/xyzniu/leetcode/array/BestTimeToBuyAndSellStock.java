package com.xyzniu.leetcode.array;

/**
 * 121
 */
public class BestTimeToBuyAndSellStock {

    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
     * 注意你不能在买入股票前卖出股票。
     * <p>
     * 执行用时：1ms
     * 内存消耗：27MB
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int rst = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            if (price - min > rst) {
                rst = price - min;
            }
            if (min > price) {
                min = price;
            }
        }
        return rst;
    }

}
