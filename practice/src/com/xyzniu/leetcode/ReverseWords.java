package com.xyzniu.leetcode;


public class ReverseWords {
    
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            sb.append(reverse(strings[i]));
            sb.append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }
    
    private char[] reverse(String string) {
        char[] chs = string.toCharArray();
        
        int left = 0;
        int right = chs.length - 1;
        
        while (left < right) {
            swap(chs, left, right);
            left++;
            right--;
        }
        return chs;
    }
    
    private void swap(char[] chs, int left, int right) {
        char c = chs[left];
        chs[left] = chs[right];
        chs[right] = c;
    }
    
}
