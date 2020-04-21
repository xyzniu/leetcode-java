package com.xyzniu.leetcode;

public class ToLowerCase {
    public String toLowerCase(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c <= 'Z' && c >= 'A') {
                c = (char) (c - ('A' - 'a'));
            }
            sb.append(c);
        }
        return sb.toString();
    }
    
}
