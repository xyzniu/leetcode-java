package com.xyzniu.leetcode.math;

/**
 * 693
 */
public class BinaryNumberWithAlternatingBits {


    /**
     * 给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。
     *
     * @param n
     * @return
     */
    public boolean hasAlternatingBits(int n) {
        int num = n ^ (n >> 1);
        int rst = num & (num + 1);
        return rst == 0;
    }

}
