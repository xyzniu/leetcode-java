package com.xyzniu.leetcode.string;

/**
 * 557
 */
public class ReverseWordsInAStringIII {

    /**
     * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            sb.append(swap(strings[i]));
            if (i!=strings.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private String swap(String string) {

        StringBuffer sb = new StringBuffer();
        for (int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }

}
