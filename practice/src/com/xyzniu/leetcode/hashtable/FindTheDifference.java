package com.xyzniu.leetcode.hashtable;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 389
 */
public class FindTheDifference {

    /**
     * 给定两个字符串 s 和 t，它们只包含小写字母。
     * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
     * 请找出在 t 中被添加的字母。
     *
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = getHashMap();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
            map.put(t.charAt(i), map.get(t.charAt(i)) + 1);
        }
        char c = t.charAt(t.length() - 1);
        map.put(c, map.get(c) + 1);
        for (char cc : map.keySet()) {
            if (map.get(cc) != 0) {
                return cc;
            }
        }
        return 'a';
    }

    public HashMap<Character, Integer> getHashMap() {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, 0);
        }
        return map;
    }

    public char findTheDifference1(String s, String t) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum ^ s.charAt(i) ^ t.charAt(i);
        }
        sum = sum ^ t.charAt(t.length() - 1);
        return (char)sum;
    }

}
