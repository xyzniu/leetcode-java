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
        if (rowIndex == 0) {
            return prev;
        }
        List<Integer> row;
        while (prev.size() <= rowIndex) {
            row = new ArrayList<>();
            row.add(1);
            for (int i = 1; i < prev.size(); i++) {
                row.add(prev.get(i - 1) + prev.get(i));
            }
            row.add(1);
            prev = row;
        }
        return prev;
    }
    
}
