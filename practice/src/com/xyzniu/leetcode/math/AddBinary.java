package com.xyzniu.leetcode.math;

/**
 * 67
 */
public class AddBinary {
    
    public String addBinary(String a, String b) {
        int prev = 0;
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        StringBuffer sb = new StringBuffer();
        while (indexA >= 0 && indexB >= 0) {
            int num1 = a.charAt(indexA--) - '0';
            int num2 = b.charAt(indexB--) - '0';
            int num = num1 + num2 + prev;
            sb.append(num % 2);
            prev = num / 2;
        }
        String c = a.length() > b.length() ? a : b;
        int index = a.length() > b.length() ? indexA : indexB;
        while (index >= 0) {
            int num = c.charAt(index--) - '0' + prev;
            sb.append(num % 2);
            prev = num / 2;
        }
        if (prev != 0) {
            sb.append(prev);
        }
        return sb.reverse().toString();
    }
    
}
