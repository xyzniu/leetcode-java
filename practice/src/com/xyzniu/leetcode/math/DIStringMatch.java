package com.xyzniu.leetcode.math;

/**
 * 942
 */
public class DIStringMatch {

    /**
     * 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
     * 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
     * 如果 S[i] == "I"，那么 A[i] < A[i+1]
     * 如果 S[i] == "D"，那么 A[i] > A[i+1]
     *
     * @param S
     * @return
     */
    public int[] diStringMatch(String S) {
        int[] rst = new int[S.length() + 1];
        int d = -1;
        int i = 1;
        rst[0] = 0;
        for (int j = 0; j < S.length(); j++) {
            if (S.charAt(j) == 'I') {
                rst[j + 1] = i++;
            } else {
                rst[j + 1] = d--;
            }
        }
        d = Math.abs(d) - 1;
        for (int j = 0; j < rst.length; j++) {
            rst[j] += d;
        }
        return rst;
    }

}
