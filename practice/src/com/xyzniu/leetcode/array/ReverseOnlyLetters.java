package com.xyzniu.leetcode.array;

/**
 * 917
 */
public class ReverseOnlyLetters {
    
    public String reverseOnlyLetters(String S) {
        int left = 0;
        int right = S.length() - 1;
        char[] chs = S.toCharArray();
        while (left < right) {
            while (left < right && !isLetter(S.charAt(left))) {
                left++;
            }
            while (left < right && !isLetter(S.charAt(right))) {
                right--;
            }
            if (left < right) {
                swap(chs, left, right);
                left++;
                right--;
            }
        }
        StringBuffer sb = new StringBuffer();
        sb.append(chs);
        return sb.toString();
    }
    
    private void swap(char[] chs, int i, int j) {
        char c = chs[i];
        chs[i] = chs[j];
        chs[j] = c;
    }
    
    private boolean isLetter(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        return false;
    }
    
}
