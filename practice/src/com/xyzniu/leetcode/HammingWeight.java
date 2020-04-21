package com.xyzniu.leetcode;

public class HammingWeight {
    
    
    public int hammingWeight(int n) {
        String string = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
    
}
