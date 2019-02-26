package com.xyzniu.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 39
 */
public class CombinationSum {

    /**
     * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
     * candidates 中的数字可以无限制重复被选取。
     * 说明：
     * 所有数字（包括 target）都是正整数。
     * 解集不能包含重复的组合。
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> rst = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        helper(rst, row, candidates, target, 0);
        return rst;
    }

    private void helper(List<List<Integer>> rst, List<Integer> row, int[] candidates, int target, int start) {
        if (target == 0) {
            List<Integer> temp = new ArrayList<>();
            for (int i : row) {
                temp.add(i);
            }
            rst.add(temp);
            return;
        }

        if (start >= candidates.length || target < 0) {
            return;
        }

        row.add(candidates[start]);
        helper(rst, row, candidates, target - candidates[start], start);
        row.remove(row.size() - 1);

        helper(rst, row, candidates, target, start + 1);
    }

}
