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
        subsets(nums, rst, new ArrayList<Integer>(), 0);
        return rst;
    }
    
    private void subsets(int[] nums, List<List<Integer>> rst, ArrayList<Integer> row, int start) {
        if (start >= nums.length) {
            ArrayList<Integer> temp = new ArrayList<>(row);
            rst.add(temp);
            return;
        }
        row.add(nums[start]);
        subsets(nums, rst, row, start + 1);
        row.remove(row.size() - 1);
        subsets(nums, rst, row, start + 1);
    }
    

    
}
