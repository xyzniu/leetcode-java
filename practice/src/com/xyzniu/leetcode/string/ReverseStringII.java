package com.xyzniu.leetcode.string;

/**
 * 541
 */
public class ReverseStringII {
    
    public String reverseStr(String s, int k) {
        char[] chs = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, s.length() - 1);
            reverse(chs, start, end);
        }
        return String.valueOf(chs);
        
    }
    
    private void reverse(char[] chs, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = chs[i];
            chs[i] = chs[j];
            chs[j] = temp;
        }
    }
    
}
