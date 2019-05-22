package com.xyzniu.leetcode.hashtable;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 953
 */
public class VerifyingAnAlienDictionary {
    
    HashMap<Character, Integer> map;
    
    public boolean isAlienSorted(String[] words, String order) {
        getOrder(order);
        for (int i = 0; i < words.length - 1; i++) {
            String str1 = words[i];
            String str2 = words[i + 1];
            if (!isSorted(str1, str2)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean isSorted(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());
        
        for (int i = 0; i < len; i++) {
            int num1 = map.get(str1.charAt(i));
            int num2 = map.get(str2.charAt(i));
            if (num1 < num2) {
                return true;
            } else if (num1 > num2) {
                return false;
            }
        }
        
        return str1.length() <= str2.length();
    }
    
    private void getOrder(String order) {
        map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
    }
    
    
}
