package com.xyzniu.leetcode.math;

/**
 * 371
 */
public class SumOfTwoIntegers {

    /**
     * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
     *
     * @param a
     * @param b
     * @return
     */
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }

}
