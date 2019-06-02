package com.xyzniu.leetcode.math;

/**
 * 415
 */
public class AddStrings {
    
    public String addStrings(String num1, String num2) {
        StringBuffer sb = new StringBuffer();
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        int prev = 0;
        int number1, number2;
        while (index1 >= 0 && index2 >= 0) {
            number1 = num1.charAt(index1--) - '0';
            number2 = num2.charAt(index2--) - '0';
            sb.append((number1 + number2 + prev) % 10);
            prev = (number1 + number2 + prev) / 10;
        }
        int index;
        String str;
        if (index1 < 0) {
            index = index2;
            str = num2;
        } else {
            index = index1;
            str = num1;
        }
        int number;
        while (prev != 0 && index >= 0) {
            number = str.charAt(index--) - '0';
            sb.append((number + prev) % 10);
            prev = (number + prev) / 10;
        }
        if (index < 0) {
            if (prev == 0) {
                return sb.reverse().toString();
            } else {
                return sb.append(prev).reverse().toString();
            }
        } else {
            return str.substring(0, index + 1) + sb.reverse().toString();
        }
    }
    
    
}
