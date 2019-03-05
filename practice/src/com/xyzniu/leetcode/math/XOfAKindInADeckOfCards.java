package com.xyzniu.leetcode.math;


import com.xyzniu.leetcode.array.MagicSquaresInGrid;

import java.util.HashMap;

/**
 * 914
 */
public class XOfAKindInADeckOfCards {

    /**
     * 给定一副牌，每张牌上都写着一个整数。
     * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
     * 每组都有 X 张牌。
     * 组内所有的牌上都写着相同的整数。
     * 仅当你可选的 X >= 2 时返回 true。
     *
     * @param deck
     * @return
     */
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            map.put(deck[i], map.getOrDefault(deck[i], 0) + 1);
        }
        int commonDivisor = map.get(deck[0]);

        for (int var : map.values()) {
            commonDivisor = greatestCommonDivisor(commonDivisor, var);
            if (commonDivisor == 1) {
                return false;
            }
        }
        return true;
    }

    public int greatestCommonDivisor(int a, int b) {
        int num1 = Math.max(a, b);
        int num2 = Math.min(a, b);
        while (num1 % num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num2;
    }


}
