package com.xyzniu.leetcode;

public class GenerateTheString {
    
    public String generateTheString(int n) {
        StringBuffer sb = new StringBuffer();
        if (n % 2 == 0) {
            sb.append('a');
            n = n - 1;
        }
        for (int i = 0; i < n; i++) {
            sb.append("b");
        }
        return sb.toString();
    }
    
}
