package com.xyzniu.leetcode.hashtable;

import java.util.HashMap;

/**
 * 409
 */
public class LongestPalindrome {
    
    
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        boolean hasOdd = false;
        int rst = 0;
        for (Integer i : map.values()) {
            if (i % 2 == 0) {
                rst += i;
            } else {
                rst += (i - 1);
                hasOdd = true;
            }
        }
        if (hasOdd) {
            rst++;
        }
        return rst;
    }
    
}
