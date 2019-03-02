package com.xyzniu.leetcode.hashtable;

import java.util.HashMap;

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

    HashMap<Character, Integer> set;

    public boolean isAlienSorted(String[] words, String order) {
        set = createHashTable(order);
        for (int i = 1; i < words.length; i++) {
            if (!order(words[i - 1], words[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean order(String word1, String word2) {
        int index = 0;
        int length = Math.min(word1.length(), word2.length());
        while (index < length) {
            char c1 = word1.charAt(index);
            char c2 = word2.charAt(index);
            if (set.get(c1) < set.get(c2)) {
                return true;
            } else if (set.get(c1) > set.get(c2)) {
                return false;
            }
            index++;
        }
        return word1.length() < word2.length();
    }

    private HashMap<Character, Integer> createHashTable(String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        return map;
    }


}
