package com.xyzniu.leetcode.hashtable;

import java.util.*;

/**
 * 884
 */
public class UncommonWordsFromTwoSentences {


    /**
     * 给定两个句子 A 和 B 。 （句子是一串由空格分隔的单词。每个单词仅由小写字母组成。）
     * 如果一个单词在其中一个句子中只出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。
     * 返回所有不常用单词的列表。
     * 您可以按任何顺序返回列表。
     *
     * @param A
     * @param B
     * @return
     */
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] as = A.split(" ");
        String[] bs = B.split(" ");
        for (int i = 0; i < as.length; i++) {
            map.put(as[i], map.getOrDefault(as[i], 0) + 1);
        }
        for (int i = 0; i < bs.length; i++) {
            map.put(bs[i], map.getOrDefault(bs[i], 0) + 1);
        }

        List<String> rst = new ArrayList<>();
        for (String str : map.keySet()) {
            if (map.get(str) == 1) {
                rst.add(str);
            }
        }
        return rst.toArray(new String[0]);
    }


}
