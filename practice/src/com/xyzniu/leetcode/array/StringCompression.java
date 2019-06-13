package com.xyzniu.leetcode.array;

/**
 * 443
 */
public class StringCompression {
    
    
    public int compress(char[] chars) {
        int start = 0;
        int count = 1;
        char prev = chars[start];
        for (int i = 1; i < chars.length; i++) {
            if (prev == chars[i]) {
                count++;
            } else {
                chars[start++] = prev;
                if (count != 1) {
                    String str = String.valueOf(count);
                    int j = 0;
                    while (j < str.length()) {
                        chars[start++] = str.charAt(j);
                        j++;
                    }
                }
                prev = chars[i];
                count = 1;
            }
        }
        chars[start++] = prev;
        if (count != 1) {
            String str = String.valueOf(count);
            int j = 0;
            while (j < str.length()) {
                chars[start++] = str.charAt(j);
                j++;
            }
        }
        return start;
    }
    
}
