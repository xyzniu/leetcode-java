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
        if (num >= 0 && num < 10) {
            return num;
        }
        int sum = 0;
        while (num != 0) {
            sum += (num % 10);
            num = num / 10;
        }
        return addDigits(sum);
    }

}
