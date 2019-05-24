package com.xyzniu.leetcode.array;

/**
 * 121
 */
public class BestTimeToBuyAndSellStock {
    
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int[] rightMaxPrices = new int[prices.length];
        int maxValue = Integer.MIN_VALUE;
        for (int i = prices.length - 1; i >= 0; i--) {
            maxValue = Math.max(maxValue, prices[i]);
            rightMaxPrices[i] = maxValue;
        }
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, rightMaxPrices[i] - prices[i]);
        }
        return maxProfit;
    }
    
    
}
