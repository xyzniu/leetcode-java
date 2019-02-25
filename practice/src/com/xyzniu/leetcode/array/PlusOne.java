package com.xyzniu.leetcode.array;

/**
 * 66
 */
public class PlusOne {
    /**
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     *
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int one = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int old = digits[i] + one;
            digits[i] = old % 10;
            one = old / 10;
            if (one == 0) {
                return digits;
            }
        }
        int[] rst = new int[digits.length + 1];
        rst[0] = 1;
        for (int i = 1; i < rst.length; i++) {
            rst[i] = digits[i - 1];
        }
        return rst;
    }

}
