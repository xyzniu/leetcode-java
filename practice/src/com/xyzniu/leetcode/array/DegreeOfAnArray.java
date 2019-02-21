package com.xyzniu.leetcode.array;

import java.util.Collection;
import java.util.HashMap;

/**
 * 697
 */
public class DegreeOfAnArray {


    /**
     * 给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。
     * 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
     *
     * @param nums
     * @return
     */
    public int findShortestSubArray(int[] nums) {
        return findShortestSubArray1(nums);
    }


    public int findShortestSubArray1(int[] nums) {
        HashMap<Integer, Entry> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Entry e = map.get(nums[i]);
                e.count++;
                e.right = i;
            } else {
                Entry e = new Entry(1, i, i);
                map.put(nums[i], e);
            }
        }
        int maxCount = 0;
        int minLen = Integer.MAX_VALUE;
        Collection<Entry> values = map.values();
        for (Entry e : values) {
            if (e.count < maxCount) {
                continue;
            }
            if (e.count > maxCount) {
                maxCount = e.count;
                minLen = e.right - e.left;
            } else {
                minLen = Math.min(minLen, e.right - e.left);
            }
        }
        return minLen + 1;
    }

    class Entry {
        int count;
        int left;
        int right;

        Entry(int count, int left, int right) {
            this.count = count;
            this.left = left;
            this.right = right;
        }
    }
}
