package com.xyzniu.leetcode.hashtable;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 532
 */
public class KDiffPairsInAnArray {


    /**
     * 给定一个整数数组和一个整数 k, 你需要在数组里找到不同的 k-diff 数对。这里将 k-diff 数对定义为一个整数对 (i, j), 其中 i 和 j 都是数组中的数字，且两数之差的绝对值是 k.
     *
     * @param nums
     * @param k
     * @return
     */
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int rst = 0;
        if (k < 0) {
            return 0;
        }
        if (k != 0) {
            for (int i = 0; i < nums.length; i++) {
                if (set.contains(nums[i])) {
                    continue;
                } else {
                    if (set.contains(nums[i] - k)) {
                        rst++;
                    }
                    if (set.contains(nums[i] + k)) {
                        rst++;
                    }
                    set.add(nums[i]);
                }
            }
        } else {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            for (int i : map.values()) {
                if (i > 1) {
                    rst++;
                }
            }
        }
        return rst;
    }

}
