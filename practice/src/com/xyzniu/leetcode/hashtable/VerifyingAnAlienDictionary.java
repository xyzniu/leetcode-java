package com.xyzniu.leetcode.hashtable;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 953
 */
public class VerifyingAnAlienDictionary {
    
    /**
     * 某种外星语也使用英文小写字母，但可能顺序 order 不同。字母表的顺序（order）是一些小写字母的排列。
     * 给定一组用外星语书写的单词 words，以及其字母表的顺序 order，只有当给定的单词在这种外星语中按字典序排列时，返回 true；否则，返回 false。
     *
     * @param words
     * @param order
     * @return
     */
    HashMap<Character, Integer> map = new HashMap<>();
    
    public boolean isAlienSorted(String[] words, String order) {
        createmap(order);
        for (int i = 0; i < words.length - 1; i++) {
            if (!isAlienSorted(words[i], words[i + 1])) {
                return false;
            }
        }
        return true;
    }
    
    
    public boolean isAlienSorted(String word1, String word2) {
        int length = Math.min(word1.length(), word2.length());
        for (int i = 0; i < length; i++) {
            if (map.get(word1.charAt(i)) > map.get(word2.charAt(i))) {
                return true;
            }
        }
        if (word1.length() > word2.length()) {
            return false;
        }
        return true;
    }
    
    private void createmap(String order) {
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
    }
    
    
}
