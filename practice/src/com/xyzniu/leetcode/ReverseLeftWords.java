package com.xyzniu.leetcode;

public class ReverseLeftWords {
    
    public String reverseLeftWords(String s, int n) {
        char[] oldArr = s.toCharArray();
        char[] newArr = new char[oldArr.length];
        for (int i = n; i < oldArr.length; i++) {
            newArr[i - n] = oldArr[i];
        }
        for (int i = 0; i < n; i++) {
            newArr[oldArr.length - n + i] = oldArr[i];
        }
        return String.valueOf(newArr);
    }
    
}
