package com.xyzniu.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1
 */
public class TwoSum {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     *
     * 使用一个map，如果和没出现，就把这个数字先记录下来，如果和出现了，就直接返回。
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] rst = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                rst[0] = map.get(nums[i]);
                rst[1] = i;
                return rst;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return rst;
    }

}
