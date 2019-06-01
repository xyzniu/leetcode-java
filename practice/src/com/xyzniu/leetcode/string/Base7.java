package com.xyzniu.leetcode.string;

/**
 * 504
 */
public class Base7 {
    
    
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuffer sb = new StringBuffer();
        boolean lessThanZero = num < 0;
        num = Math.abs(num);
        while (num != 0) {
            sb.append(num % 7);
            num /= 7;
        }
        if (lessThanZero) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
    
}
