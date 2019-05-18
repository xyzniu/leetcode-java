package com.xyzniu.leetcode.math;

public class BinaryGap {
    
    public int binaryGap(int N) {
        String str = Integer.toBinaryString(N);
        int max = 0;
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)=='1'){
                max = Math.max(max, count);
                count = 1;
            }else{
                count++;
            }
        }
        return max;
    }
    
}
