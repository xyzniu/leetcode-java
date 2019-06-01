package com.xyzniu.leetcode.math;

import com.xyzniu.leetcode.array.MaximumProductOfThreeNumbers;

/**
 * 405
 */
public class ConvertANumberToHexadecimal {
    
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        boolean lessThanZero = num < 0;
        if (lessThanZero) {
            num = Math.abs(num + 1);
        }
        char[] chars = "0123456789abcdef".toCharArray();
        StringBuffer sb = new StringBuffer();
        if (lessThanZero) {
            for (int i = 0; i < 8; i++) {
                sb.append(chars[15 - (num % 16)]);
                num /= 16;
            }
        } else {
            while (num != 0) {
                sb.append(chars[num % 16]);
                num /= 16;
            }
        }
        return sb.reverse().toString();
    }
}
