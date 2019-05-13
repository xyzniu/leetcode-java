package com.xyzniu.leetcode.hashtable;

import java.util.*;

/**
 * 500
 */
public class KeyboardRow {
    
    /**
     * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
     *
     * @param words
     * @return
     */
    public String[] findWords(String[] words) {
        HashMap<Character, Integer> map = getKeyboard();
        int index = 0;
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            if (isRow(word, map)) {
                words[index++] = words[i];
            }
        }
        return Arrays.copyOf(words, index);
    }
    
    private boolean isRow(String word, HashMap<Character, Integer> map) {
        int row = map.get(word.charAt(0));
        for (int j = 1; j < word.length(); j++) {
            if (map.get(word.charAt(j)) != row) {
                return false;
            }
        }
        return true;
    }
    
    private HashMap<Character, Integer> getKeyboard() {
        HashMap<Character, Integer> map = new HashMap<>();
        String[] strings = new String[]{
                "qwertyuiop",
                "asdfghjkl",
                "zxcvbnm",
        };
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            for (int j = 0; j < str.length(); j++) {
                map.put(str.charAt(j), i + 1);
            }
        }
        return map;
    }
    
    
}
