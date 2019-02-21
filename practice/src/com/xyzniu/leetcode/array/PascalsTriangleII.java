package com.xyzniu.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 119
 */
public class PascalsTriangleII {

    /**
     * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
     * <p>
     *
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        List<Integer> one = new ArrayList<>();
        if (rowIndex == 0) {
            return prev;
        }
        if (rowIndex == 1) {
            prev.add(1);
            return prev;
        }

        for (int i = 1; i <= rowIndex; i++) {
            one = new ArrayList<>();
            one.add(1);
            for (int j = 1; j < i; j++) {
                one.add(prev.get(j) + prev.get(j - 1));
            }
            one.add(1);
            prev = one;
        }
        return one;
    }

}
