package com.xyzniu.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * 349
 */
public class IntersectionOfTwoArrays {


    /**
     * 给定两个数组，编写一个函数来计算它们的交集。
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        List<Integer> rst = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                rst.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] result = new int[rst.size()];
        for (int i = 0; i < rst.size(); i++) {
            result[i] = rst.get(i);
        }
        return result;
    }

}
