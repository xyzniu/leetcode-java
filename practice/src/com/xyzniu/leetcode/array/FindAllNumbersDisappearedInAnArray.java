package com.xyzniu.leetcode.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 448
 */
public class FindAllNumbersDisappearedInAnArray {
    
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            nums[num - 1] = -Math.abs(nums[num - 1]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                disappearedNumbers.add(i + 1);
            }
        }
        return disappearedNumbers;
    }
}
