package com.xyzniu.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 509
 */
public class FibonacciNumber {

    /**
     * Q:
     * 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
     * F(0) = 0,   F(1) = 1
     * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
     * 给定 N，计算 F(N)。
     * <p>
     * A:
     * 递归/存储/动态规划
     *
     * @param N
     * @return
     */
    public int fib(int N) {
        return fib1(N);
    }

    /**
     * 执行用时：17ms
     * 内存消耗：20MB
     *
     * @param N
     * @return
     */
    public int fib1(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        } else return fib1(N - 1) + fib1(N - 2);
    }

    public int fib2(int N) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= N; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }
        return list.get(N);
    }

    public int fib3(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }

        int f0 = 0;
        int f1 = 1;
        int f2 = 0;
        for (int i = 2; i <= N; i++) {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
        return f2;
    }


}
