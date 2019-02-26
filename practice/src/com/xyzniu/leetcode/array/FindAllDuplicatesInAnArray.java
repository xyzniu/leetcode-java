package com.xyzniu.leetcode.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 442
 */
public class FindAllDuplicatesInAnArray {

    /**
     * 给定一个整数数组 a，其中1 ≤ a[i] ≤ n （n为数组长度）, 其中有些元素出现两次而其他元素出现一次。
     * 找到所有出现两次的元素。
     * 你可以不用到任何额外空间并在O(n)时间复杂度内解决这个问题吗？
     *
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> rst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                rst.add(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return rst;
    }
}
