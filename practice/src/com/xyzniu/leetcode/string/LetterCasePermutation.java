package com.xyzniu.leetcode.string;


import java.util.ArrayList;
import java.util.List;

/**
 * 784
 */
public class LetterCasePermutation {
    
    private int num = 'A' - 'a';
    
    public List<String> letterCasePermutation(String S) {
        List<String> rst = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        letterCasePermutation(S, 0, rst, sb);
        return rst;
    }
    
    private void letterCasePermutation(String s, int start, List<String> rst, StringBuffer sb) {
        char c = s.charAt(start);
        char c2 = '-';
        if (c >= 'a' && c <= 'z') {
            c2 = (char) (c + num);
        } else if (c >= 'A' && c <= 'Z') {
            c2 = (char) (c - num);
        }
        if (start == s.length() - 1) {
            sb.append(c);
            rst.add(sb.toString());
            sb.deleteCharAt(sb.length() - 1);
            if (c2 != '-') {
                sb.append(c2);
                rst.add(sb.toString());
                sb.deleteCharAt(sb.length() - 1);
            }
        } else {
            sb.append(c);
            letterCasePermutation(s, start + 1, rst, sb);
            sb.deleteCharAt(sb.length() - 1);
            if (c2 != '-') {
                sb.append(c2);
                letterCasePermutation(s, start + 1, rst, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
    
    
}
