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
        
        rst[0] = 0;
        int min = -1;
        int max = 1;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                rst[i + 1] = max++;
            } else {
                rst[i + 1] = min--;
            }
        }
        
        min = min + 1;
        for (int i = 0; i < rst.length; i++) {
            rst[i] -= min;
        }
        return rst;
    }
    
    
}
