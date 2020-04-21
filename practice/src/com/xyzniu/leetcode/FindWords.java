package com.xyzniu.leetcode;

import java.util.HashSet;

public class FindWords {
    
    HashSet<Character> set1 = new HashSet<>();
    HashSet<Character> set2 = new HashSet<>();
    HashSet<Character> set3 = new HashSet<>();
    
    public String[] findWords(String[] words) {
        createSet();
        StringBuffer sb = new StringBuffer();
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (contain(word)) {
                sb.append(word);
                sb.append(" ");
            }
        }
        if (sb.length() == 0) {
            return new String[]{};
        }
        return sb.substring(0, sb.length() - 1).split(" ");
    }
    
    private boolean contain(String word) {
        char c = word.charAt(0);
        HashSet<Character> set = null;
        if (set1.contains(c)) {
            set = set1;
        } else if (set2.contains(c)) {
            set = set2;
        } else {
            set = set3;
        }
        
        for (int i = 1; i < word.length(); i++) {
            if (!set.contains(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    private void createSet() {
        String string1 = "qwertyuiop";
        String string2 = "asdfghjkl";
        String string3 = "zxcvbnm";
        int num = 'A' - 'a';
        for (int i = 0; i < string1.length(); i++) {
            char c = string1.charAt(i);
            set1.add(c);
            set1.add((char) (c + num));
        }
        for (int i = 0; i < string2.length(); i++) {
            char c = string2.charAt(i);
            set2.add(c);
            set2.add((char) (c + num));
        }
        for (int i = 0; i < string3.length(); i++) {
            char c = string3.charAt(i);
            set3.add(c);
            set3.add((char) (c + num));
        }
    }
    
}
