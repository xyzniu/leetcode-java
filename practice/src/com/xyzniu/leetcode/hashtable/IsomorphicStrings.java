package com.xyzniu.leetcode.hashtable;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 205
 */
public class IsomorphicStrings {
    
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        if (s == null && t == null) {
            return true;
        } else if (s == null || t == null) {
            return false;
        } else if (s.length() != t.length()) {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (set.contains(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            } else {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
    
}
