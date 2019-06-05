package com.xyzniu.leetcode.array;

/**
 * 744
 */
public class FindSmallestLetterGreaterThanTarget {
    
    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (target < letters[i]) {
                return letters[i];
            }
        }
        return letters[0];
    }
    
}
