package com.xyzniu.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 216
 */
public class CombinationSumIII {

    /**
     * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
     * 说明：
     * 所有数字都是正整数。
     * 解集不能包含重复的组合。
     *
     * @param k
     * @param n
     * @return
     */
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> rst = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        helper(rst, row, k, n, 1);
        return rst;
    }

    private void helper(List<List<Integer>> rst, List<Integer> row, int k, int target, int one) {
        if (k == 0 && target == 0) {
            List<Integer> temp = new ArrayList<>();
            for (int i : row) {
                temp.add(i);
            }
            rst.add(temp);
            return;
        }
        if (k < 0 || target < 0 || one >= 10) {
            return;
        }

        row.add(one);
        helper(rst, row, k - 1, target - one, one + 1);
        row.remove(row.size() - 1);
        helper(rst, row, k, target, one + 1);
    }

}
