package com.xyzniu.leetcode.hashtable;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 290
 */
public class WordPattern {
    
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        
        String[] strings = str.split(" ");
        if (pattern.length() != strings.length) {
            return false;
        }
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                String s = map.get(c);
                if (!s.equals(strings[i])) {
                    return false;
                }
            } else {
                if (!set.contains(strings[i])) {
                    map.put(c, strings[i]);
                    set.add(strings[i]);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    
    
}
