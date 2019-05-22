package com.xyzniu.leetcode.string;

import java.util.Arrays;

/**
 * 748
 */
public class ShortestCompletingWord {
    
    private int[] chs;
    
    public String shortestCompletingWord(String licensePlate, String[] words) {
        chs = getChars(licensePlate);
        boolean[] isCompleting = new boolean[words.length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            int[] word = getChars(words[i]);
            if (isCompleting(word)) {
                isCompleting[i] = true;
                min = Math.min(min, words[i].length());
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (isCompleting[i]) {
                if (words[i].length() == min) {
                    return words[i];
                }
            }
        }
        return words[0];
    }
    
    private boolean isCompleting(int[] word) {
        for (int i = 0; i < word.length; i++) {
            if (word[i] < chs[i]) {
                return false;
            }
        }
        return true;
    }
    
    private int[] getChars(String licensePlate) {
        int[] rst = new int[26];
        licensePlate = licensePlate.toLowerCase();
        for (int i = 0; i < licensePlate.length(); i++) {
            if (licensePlate.charAt(i) < 'a' || licensePlate.charAt(i) > 'z') {
                continue;
            }
            int num = licensePlate.charAt(i) - 'a';
            rst[num]++;
        }
        return rst;
    }
    
}
