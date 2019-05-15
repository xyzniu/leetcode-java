package com.xyzniu.leetcode.math;

/**
 * 806
 */
public class NumberOfLinesToWriteString {
    
    public int[] numberOfLines(int[] widths, String S) {
        int sum = 0;
        int[] rst = new int[]{1, 0};
        for (int i = 0; i < S.length(); i++) {
            sum += widths[S.charAt(i) - 'a'];
            if (sum > 100) {
                rst[0] += 1;
                sum = S.charAt(i) - 'a';
            }
        }
        return rst;
    }
}
