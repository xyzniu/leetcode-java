package com.xyzniu.leetcode.array;

/**
 * 985
 */
public class SumOfEvenNumbersAfterQueries {
    
    /**
     * Q:
     * 给出一个整数数组 A 和一个查询数组 queries。
     * 对于第 i 次查询，有 val = queries[i][0], index = queries[i][1]，我们会把 val 加到 A[index] 上。然后，第 i 次查询的答案是 A 中偶数值的和。
     * （此处给定的 index = queries[i][1] 是从 0 开始的索引，每次查询都会永久修改数组 A。）
     * 返回所有查询的答案。你的答案应当以数组 answer 给出，answer[i] 为第 i 次查询的答案。
     * <p>
     * A:
     * 从评论区找的思路哈哈
     * 先统计出来所有偶数的和。
     * 每次一次，如果A[index]是偶数就暂时先剪掉A[index]
     * 然后再看如果A[index]+VAL是偶数，就把它再给加回来
     *
     * @param A
     * @param queries
     * @return
     */
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                sum += A[i];
            }
        }
        
        int[] rst = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];
            
            if (A[index] % 2 == 0) {
                sum -= A[index];
            }
            A[index] = A[index] + val;
            if (A[index] % 2 == 0) {
                sum += A[index];
            }
            rst[i] = sum;
        }
        return rst;
    }
}
