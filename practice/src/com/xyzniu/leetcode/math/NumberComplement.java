package com.xyzniu.leetcode.math;

/**
 * 476
 */
public class NumberComplement {

    /**
     * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
     * 注意:
     * 给定的整数保证在32位带符号整数的范围内。
     * 你可以假定二进制数不包含前导零位。
     *
     * @param num
     * @return
     */
    public int findComplement(int num) {
        int k = 1;
        while ((k - 1) < num) {
            k = k << 1;
        }
        k = k - 1;
        return num ^ k;
    }

}
