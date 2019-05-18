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
        int[] chs = new int[26];
        count(chs, s, 1);
        count(chs, t, -1);
        for (int i = 0; i < chs.length; i++) {
            if (chs[i]==-1){
                return (char)('a'+i);
            }
        }
        return 'a';
    }
    
    private void count(int[] chs, String s, int num) {
        for (int i = 0; i < s.length(); i++) {
            chs[s.charAt(i)-'a']+=num;
        }
    }
    
}
