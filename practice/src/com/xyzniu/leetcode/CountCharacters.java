package com.xyzniu.leetcode;

public class CountCharacters {
    
    public int countCharacters(String[] words, String chars) {
        int[] count = count(chars);
        int rst = 0;
        for (String str : words) {
            int[] string = count(str);
            boolean flag = true;
            for (int i = 0; i < 26 && flag; i++) {
                if (string[i] > count[i]) {
                    flag = false;
                }
            }
            if (flag) {
                rst += str.length();
            }
        }
        return rst;
    }
    
    private int[] count(String chars) {
        int[] count = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            count[chars.charAt(i) - 'a']++;
        }
        return count;
    }
    
}
