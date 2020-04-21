package com.xyzniu.leetcode;

import java.util.HashSet;

public class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = creatHashSet(J);
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    
    private HashSet<Character> creatHashSet(String string) {
        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < string.length(); i++) {
            set.add(string.charAt(i));
        }
        
        return set;
    }
    
}
