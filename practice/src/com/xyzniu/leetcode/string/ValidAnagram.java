package com.xyzniu.leetcode.string;


/**
 * 242
 */
public class ValidAnagram {
    
    
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] a = getChars(s);
        int[] b = getChars(t);
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
    
    private int[] getChars(String s) {
        int[] chs = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chs[s.charAt(i) - 'a']++;
        }
        return chs;
    }
    
}
