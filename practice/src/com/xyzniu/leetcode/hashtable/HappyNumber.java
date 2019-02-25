package com.xyzniu.leetcode.hashtable;

import java.util.HashSet;

/**
 * 202
 */
public class HappyNumber {

    /**
     * 编写一个算法来判断一个数是不是“快乐数”。
     * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
     *
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int number = n;
        while (!set.contains(number)) {
            int sum = 0;
            set.add(number);
            while (number != 0) {
                int num = number % 10;
                sum = sum + num * num;
                number = number / 10;
            }
            number = sum;
        }
        return number == 1;
    }


}
