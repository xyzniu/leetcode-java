package com.xyzniu.leetcode;

import java.util.HashSet;

public class UniqueMorseRepresentations {
    String[] alphabet = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            set.add(translate(words[i]));
        }
        return set.size();
    }
    
    private String translate(String string) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < string.length(); i++) {
            int number = string.charAt(i) - 'a';
            sb.append(alphabet[number]);
        }
        return sb.toString();
    }
    
}
