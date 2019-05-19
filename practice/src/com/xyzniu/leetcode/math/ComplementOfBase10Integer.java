package com.xyzniu.leetcode.math;

/**
 * 1009
 */
public class ComplementOfBase10Integer {
    
    
    public int bitwiseComplement(int N) {
        String str = Integer.toBinaryString(N);
        StringBuffer sb = new StringBuffer();
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1' && flag) {
                continue;
            } else {
                if (str.charAt(i) == '0') {
                    flag = false;
                    sb.append(1);
                } else {
                    sb.append(0);
                }
            }
        }
        return toInteger(sb.toString());
    }
    
    private int toInteger(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum *= 2;
            if (str.charAt(i) == '1') {
                sum += 1;
            }
        }
        return sum;
    }
    
}
