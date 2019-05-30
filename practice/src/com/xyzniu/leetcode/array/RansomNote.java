package com.xyzniu.leetcode.array;

/**
 * 383
 */
public class RansomNote {
    
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomCount = new int[26];
        int[] magazineCount = new int[26];
        countChars(ransomCount, ransomNote);
        countChars(magazineCount, magazine);
        for (int i = 0; i < 26; i++) {
            if (ransomCount[i] > magazineCount[i]) {
                return false;
            }
        }
        return true;
    }
    
    private void countChars(int[] count, String s) {
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
    }
    
}
