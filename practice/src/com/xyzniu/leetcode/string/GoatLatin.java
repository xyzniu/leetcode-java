package com.xyzniu.leetcode.string;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 824
 */
public class GoatLatin {
    
    /**
     * 给定一个由空格分割单词的句子 S。每个单词只包含大写或小写字母。
     * 我们要将句子转换为 “Goat Latin”（一种类似于 猪拉丁文 - Pig Latin 的虚构语言）。
     * 山羊拉丁文的规则如下：
     * 如果单词以元音开头（a, e, i, o, u），在单词后添加"ma"。
     * 例如，单词"apple"变为"applema"。
     * 如果单词以辅音字母开头（即非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
     * 例如，单词"goat"变为"oatgma"。
     * 根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从1开始。
     * 例如，在第一个单词后添加"a"，在第二个单词后添加"aa"，以此类推。
     * 返回将 S 转换为山羊拉丁文后的句子。
     *
     * @param S
     * @return
     */
    public String toGoatLatin(String S) {
        String[] strings = S.split(" ");
        HashSet<Character> set = createHashset();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            if (set.contains(string.charAt(0))) {
                sb.append(string.substring(1));
                sb.append(string.charAt(0));
            } else {
                sb.append(string);
            }
            sb.append("ma");
            for (int j = 0; j <= i; j++) {
                sb.append('a');
            }
            sb.append(' ');
        }
        return sb.substring(0, sb.length() - 1);
    }
    
    private HashSet<Character> createHashset() {
        HashSet<Character> set = new HashSet<>();
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        return set;
    }
    
    
}
