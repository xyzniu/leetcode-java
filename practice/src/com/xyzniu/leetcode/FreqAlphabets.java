package com.xyzniu.leetcode;

public class FreqAlphabets {
    
    public String freqAlphabets(String s) {
        StringBuffer sb = new StringBuffer();
        boolean flag = false;
        if (s.endsWith("#")) {
            s = s.substring(0, s.length() - 1);
            flag = true;
        }
        String[] words = s.split("#");
        for (int i = 0; i < words.length - 1; i++) {
            countWord(sb, words[i]);
        }
        
        String word = words[words.length - 1];
        if (flag) {
            countWord(sb, word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                sb.append((char) ('a' + word.charAt(i) - '1'));
            }
        }
        return sb.toString();
    }
    
    private void countWord(StringBuffer sb, String word) {
        for (int i = 0; i < word.length() - 2; i++) {
            sb.append((char) ('a' + word.charAt(i) - '1'));
        }
        sb.append((char) ('a' - 1 + Integer.valueOf(word.substring(word.length() - 2))));
    }
    
}
