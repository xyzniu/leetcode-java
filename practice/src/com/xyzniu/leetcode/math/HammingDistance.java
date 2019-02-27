package com.xyzniu.leetcode.math;

/**
 * 461
 */
public class HammingDistance {


    /**
     * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
     * 给出两个整数 x 和 y，计算它们之间的汉明距离。
     *
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        int rst = x ^ y;
        String rst1 = Integer.toBinaryString(rst);
        String rst2 = rst1.replace("1", "");
        return rst1.length() - rst2.length();
    }

}
