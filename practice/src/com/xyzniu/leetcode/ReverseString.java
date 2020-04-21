package com.xyzniu.leetcode;

public class ReverseString {
    
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            swap(s, left++, right--);
        }
        return;
    }
    
    private void swap(char[] s, int left, int right) {
        char c = s[left];
        s[left] = s[right];
        s[right] = c;
    }
    
}
