package com.xyzniu.leetcode;

import java.util.HashSet;

public class IsUnique {
    
    public boolean isUnique(String astr) {
        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < astr.length(); i++) {
            char c = astr.charAt(i);
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
    
    
}
