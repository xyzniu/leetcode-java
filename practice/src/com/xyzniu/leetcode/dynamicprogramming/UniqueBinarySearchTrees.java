package com.xyzniu.leetcode.dynamicprogramming;

/**
 * 96
 */
public class UniqueBinarySearchTrees {

    /**
     * 给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
     *
     * @param n
     * @return
     */
    public int numTrees(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum = sum + dp[j] * dp[i - j - 1];
            }
            dp[i] = sum;
        }
        return dp[n];
    }


}
