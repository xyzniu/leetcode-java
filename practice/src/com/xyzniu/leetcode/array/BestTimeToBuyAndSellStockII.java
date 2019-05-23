package com.xyzniu.leetcode.array;

/**
 * 122
 */
public class BestTimeToBuyAndSellStockII {
    
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > min) {
                sum += prices[i] - min;
            }
            min = prices[i];
        }
        return sum;
    }
}
