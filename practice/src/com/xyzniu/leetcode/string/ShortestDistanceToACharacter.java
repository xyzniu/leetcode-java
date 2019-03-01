package com.xyzniu.leetcode.string;

/**
 * 821
 */
public class ShortestDistanceToACharacter {

    /**
     * 给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
     *
     * @param S
     * @param C
     * @return
     */
    public int[] shortestToChar(String S, char C) {
        int[] left = new int[S.length()];
        boolean flag = false;
        int num = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                flag = true;
                num = 0;
                left[i] = num;
            } else if (!flag) {
                left[i] = S.length();
            } else {
                left[i] = ++num;
            }
        }

        num = 0;
        flag = false;
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == C) {
                flag = true;
                num = 0;
                left[i] = num;
            } else if (!flag) {
                left[i] = Math.min(S.length(), left[i]);
            } else {
                left[i] = Math.min(++num, left[i]);
            }
        }
        return left;
    }
}
