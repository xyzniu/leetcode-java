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
     *
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rst = new ArrayList<>();
        if (numRows <= 0) {
            return rst;
        }
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        rst.add(row1);
        if (numRows <= 1) {
            return rst;
        }
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> prevrow = rst.get(i);
            for (int j = 1; j < i; j++) {
                row.add(prevrow.get(j - 1) + prevrow.get(j));
            }
            row.add(1);
            rst.add(row);
        }
        return rst;
    }
    
}
