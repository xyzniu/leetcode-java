package com.xyzniu.leetcode;

public class PrintNumbers {
    public int[] printNumbers(int n) {
        int max = max(n);
        int[] rst = new int[max - 1];
        for (int i = 1; i < max; i++) {
            rst[i - 1] = i;
        }
        return rst;
        
    }
    
    private int max(int n) {
        int number = 1;
        while (n > 0) {
            number *= 10;
            n--;
        }
        return number;
    }
}
