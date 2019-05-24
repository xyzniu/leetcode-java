package com.xyzniu.leetcode.string;

/**
 * 38
 */
public class CountAndSay {
    
    public String countAndSay(int n) {
        int i = 1;
        String str = "1";
        while (i < n) {
            char[] chs = str.toCharArray();
            str = count(chs);
            i++;
        }
        return str;
    }
    
    private String count(char[] chs) {
        StringBuffer sb = new StringBuffer();
        int index = 1;
        int sum = 1;
        char prev = chs[0];
        while (index < chs.length) {
            if (chs[index] != prev) {
                sb.append(sum);
                sb.append(prev);
                sum = 1;
                prev = chs[index];
            } else {
                sum++;
            }
            index++;
        }
        sb.append(sum);
        sb.append(prev);
        return sb.toString();
    }
    
    
}
