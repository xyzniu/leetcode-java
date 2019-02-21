package com.xyzniu.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 118
 */
public class PascalsTriangle {

    /**
     * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
     * <p>
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rst = new ArrayList<>();
        if (numRows == 0) {
            return rst;
        }
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        rst.add(row1);
        List<Integer> row;
        List<Integer> prev = row1;
        for (int i = 1; i < numRows; i++) {
            row = new ArrayList<>();
            row.add(1);
            for (int j = 0; j < i - 1; j++) {
                row.add(prev.get(j) + prev.get(j + 1));
            }
            row.add(1);
            rst.add(row);
            prev = row;
        }
        return rst;
    }

}
