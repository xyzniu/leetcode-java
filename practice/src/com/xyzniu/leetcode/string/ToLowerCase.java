package com.xyzniu.leetcode.string;

/**
 * 709
 */
public class ToLowerCase {
    
    /**
     * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
     *
     * @param str
     * @return
     */
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        int len = 'A' - 'a';
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('A' <= c && c <= 'Z') {
                sb.append((char) (c - len));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
}
