package com.xyzniu.leetcode;

public class CheckPermutation {
    
    
    public boolean checkPermutation(String s1, String s2) {
        
        int[] count1 = count(s1);
        int[] count2 = count(s2);
        
        
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
                
            }
        }
        return true;
        
    }
    
    private int[] count(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        return count;
    }
}
