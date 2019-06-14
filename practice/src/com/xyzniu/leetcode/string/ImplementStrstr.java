package com.xyzniu.leetcode.string;

/**
 * 28
 */
public class ImplementStrstr {
    
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        boolean flag;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            flag = true;
            int index = i;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(index++) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
    
    
}
