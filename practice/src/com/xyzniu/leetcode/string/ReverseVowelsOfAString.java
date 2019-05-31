package com.xyzniu.leetcode.string;

import java.util.HashSet;
import java.util.Stack;

/**
 * 345
 */
public class ReverseVowelsOfAString {
    
    public String reverseVowels(String s) {
        HashSet<Character> vowels = generateVowels();
        int left = 0;
        int right = s.length() - 1;
        char[] chs = s.toCharArray();
        while (left < right) {
            while (left < right && !vowels.contains(chs[left])) {
                left++;
            }
            while (left < right && !vowels.contains(chs[right])) {
                right--;
            }
            if (left < right) {
                swap(chs, left, right);
                left++;
                right--;
            }
        }
        return String.valueOf(chs);
    }
    
    private void swap(char[] chs, int i, int j) {
        char c = chs[i];
        chs[i] = chs[j];
        chs[j] = c;
    }
    
    private HashSet<Character> generateVowels() {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        return vowels;
    }
    
}
