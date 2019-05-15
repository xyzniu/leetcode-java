package com.xyzniu.leetcode.math;

/**
 * 258
 */
public class AddDigits {
    /**
     * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
     *
     * @param num
     * @return
     */
    public int addDigits(int num) {
        while (num >= 10) {
            num = count(num);
        }
        return num;
    }
    
    private int count(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    
}
