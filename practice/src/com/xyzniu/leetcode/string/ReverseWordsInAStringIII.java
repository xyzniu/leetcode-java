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
        char[] cs = s.toCharArray();
        int i = 0, j = cs.length - 1;
        while (i < j) {
            swap(cs, i, j);
            i++;
            j--;
        }
        
        String[] strs = String.valueOf(cs).split(" ");
        StringBuffer sb = new StringBuffer();
        for (int k = strs.length - 1; k >= 0; k--) {
            sb.append(" ");
            sb.append(strs[k]);
        }
        
        return sb.substring(1);
    }
    
    private void swap(char[] cs, int i, int j) {
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
    
}
