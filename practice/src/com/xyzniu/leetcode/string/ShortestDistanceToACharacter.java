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
        int[] leftToRight = new int[S.length()];
        int[] rightToLeft = new int[S.length()];
        int[] rst = new int[S.length()];
        
        boolean flag = true;
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                leftToRight[i] = 0;
                count = 1;
                flag = false;
            } else if (flag) {
                leftToRight[i] = Integer.MAX_VALUE;
            } else {
                leftToRight[i] = count++;
            }
        }
        
        flag = true;
        count = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == C) {
                rightToLeft[i] = 0;
                count = 1;
                flag = false;
            } else if (flag) {
                rightToLeft[i] = Integer.MAX_VALUE;
            } else {
                rightToLeft[i] = count++;
            }
        }
        
        for (int i = 0; i < S.length(); i++) {
            rst[i] = Math.min(leftToRight[i], rightToLeft[i]);
        }
        return rst;
    }
    
}
