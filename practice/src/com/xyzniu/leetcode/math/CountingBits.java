package com.xyzniu.leetcode.math;

public class CountingBits {
    
    
    public int[] countBits(int num) {
        int[] rst = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            String str = Integer.toBinaryString(i);
            int oldLength = str.length();
            int newLength = str.replace("1", "").length();
            rst[i] = oldLength - newLength;
        }
        return rst;
    }
}
