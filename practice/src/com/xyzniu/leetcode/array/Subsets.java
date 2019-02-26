package com.xyzniu.leetcode.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 78
 */
public class Subsets {

    /**
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> rst = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        helper(rst, nums, 0, row);
        return rst;
    }

    private void helper(List<List<Integer>> rst, int[] nums, int start, List<Integer> row) {
        if (start >= nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < row.size(); i++) {
                temp.add(row.get(i));
            }
            rst.add(temp);
            return;
        }
        row.add(nums[start]);
        helper(rst, nums, start + 1, row);
        row.remove(row.size() - 1);
        helper(rst, nums, start + 1, row);
    }

}
