package com.xyzniu.leetcode.array;

import com.xyzniu.leetcode.dynamicprogramming.MinimumPathSum;
import com.xyzniu.leetcode.hashtable.FindTheDifference;

/**
 * 287
 */
public class FindTheDuplicateNumber {

    /**
     * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
     *
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]) - 1;
            if (nums[num] < 0) {
                return num + 1;
            } else {
                nums[num] = -nums[num];
            }
        }
        return -1;
    }


}
