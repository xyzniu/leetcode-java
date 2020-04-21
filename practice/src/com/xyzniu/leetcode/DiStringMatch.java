package com.xyzniu.leetcode;

public class DiStringMatch {
    
    public int[] diStringMatch(String S) {
        int[] rst = new int[S.length() + 1];
        int min = -1;
        int max = 1;
        rst[0] = 0;
        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case 'I':
                    rst[i + 1] = max;
                    max++;
                    break;
                case 'D':
                    rst[i + 1] = min;
                    min--;
                    break;
            }
        }
        
        int count = Math.abs(min);
        for (int i = 0; i < rst.length; i++) {
            rst[i] += count;
        }
        return rst;
    }
    
}
