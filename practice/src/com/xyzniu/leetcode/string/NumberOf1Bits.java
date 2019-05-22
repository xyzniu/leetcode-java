package com.xyzniu.leetcode.string;

/**
 * 191
 */
public class NumberOf1Bits {
    
    
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        String str2 = str.replace("1", "");
        return str.length() - str2.length();
    }
    
}
