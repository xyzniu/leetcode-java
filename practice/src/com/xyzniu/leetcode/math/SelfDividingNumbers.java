package com.xyzniu.leetcode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 728
 */
public class SelfDividingNumbers {
    /**
     * 自除数 是指可以被它包含的每一位数除尽的数。
     * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
     * 还有，自除数不允许包含 0 。
     * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
     *
     * @param left
     * @param right
     * @return
     */
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> rst = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                rst.add(i);
            }
        }
        return rst;
    }

    private boolean isSelfDividing(int num) {
        int i = num;
        while (i != 0) {
            int k = i % 10;
            i = i / 10;

            if (k == 0 || num % k != 0) {
                return false;
            }
        }
        return true;
    }
}
