package com.xyzniu.leetcode;

public class SumZero {
    
    public int[] sumZero(int n) {
        int[] rst = new int[n];
        int count = n / 2;
        for (int i = 0; i < count * 2; i += 2) {
            rst[i] = i + 1;
            rst[i + 1] = -1 * rst[i];
        }
        if (n % 2 != 0) {
            rst[rst.length - 1] = 0;
        }
        return rst;
    }
    
}
