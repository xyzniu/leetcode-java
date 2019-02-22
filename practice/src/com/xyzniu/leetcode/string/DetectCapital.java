package com.xyzniu.leetcode.string;

/**
 * 520
 */
public class DetectCapital {

    /**
     * 给定一个单词，你需要判断单词的大写使用是否正确。
     * 我们定义，在以下情况时，单词的大写用法是正确的：
     * 全部字母都是大写，比如"USA"。
     * 单词中所有字母都不是大写，比如"leetcode"。
     * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
     * 否则，我们定义这个单词没有正确使用大写字母。
     *
     * @param word
     * @return
     */
    public boolean detectCapitalUse(String word) {
        char c = word.charAt(0);
        if (c >= 'A' && c <= 'Z') {
            if (word.length() == 1) {
                return true;
            }
            char cc = word.charAt(1);
            if (cc >= 'A' && cc <= 'Z') {
                char ccc;
                for (int i = 2; i < word.length(); i++) {
                    ccc = word.charAt(i);
                    if (ccc > 'Z' || ccc < 'A') {
                        return false;
                    }
                }
            } else {
                char ccc;
                for (int i = 2; i < word.length(); i++) {
                    ccc = word.charAt(i);
                    if (ccc > 'z' || ccc < 'a') {
                        return false;
                    }
                }
            }

        } else {
            for (int i = 1; i < word.length(); i++) {
                char ccc = word.charAt(i);
                if (ccc < 'a' || ccc > 'z') {
                    return false;
                }
            }
        }
        return true;
    }
}
