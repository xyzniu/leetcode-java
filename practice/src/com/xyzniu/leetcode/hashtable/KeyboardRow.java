package com.xyzniu.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

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
        HashMap<Character, Integer> map = getHashMap();
        List<String> rst = new ArrayList<>();
        for (String str : words) {
            String s = str.toLowerCase();
            int line = map.get(s.charAt(0));
            boolean flag = true;
            for (int i = 1; i < s.length(); i++) {
                if (line != map.get(s.charAt(i))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                rst.add(str);
            }
        }

        String[] result = new String[rst.size()];
        for (int i = 0; i < rst.size(); i++) {
            result[i] = rst.get(i);
        }
        return result;
    }

    public HashMap<Character, Integer> getHashMap() {
        HashMap<Character, Integer> map = new HashMap<>();
        String str1 = "qwertyuiop";
        char[] ch1 = str1.toCharArray();
        String str2 = "asdfghjkl";
        char[] ch2 = str2.toCharArray();
        String str3 = "zxcvbnm";
        char[] ch3 = str3.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            map.put(ch1[i], 1);
        }
        for (int i = 0; i < ch2.length; i++) {
            map.put(ch2[i], 2);
        }
        for (int i = 0; i < ch3.length; i++) {
            map.put(ch3[i], 3);
        }
        return map;
    }

}
