package com.xyzniu.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 1078
 */
public class OccurrencesAfterBigram {
    
    
    public String[] findOcurrences(String text, String first, String second) {
        String reg = first + " " + second + " ";
        int len = reg.length();
        List<String> finds = new ArrayList<>();
        int start = 0;
        while (start < text.length()) {
            String substr = text.substring(start);
            int index = substr.indexOf(reg);
            if (index >= 0) {
                substr = substr.substring(index + len);
                if (substr.indexOf(' ') > 0) {
                    finds.add(substr.substring(0, substr.indexOf(' ')));
                } else {
                    finds.add(substr);
                }
            } else {
                break;
            }
            start += index + len;
        }
        return finds.toArray(new String[0]);
    }
    
    
    
}
