package com.xyzniu.leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class Intersection {
    
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : set1) {
            if (set2.contains(num)) {
                list.add(num);
            }
        }
        int[] rst = new int[list.size()];
        int index = 0;
        for (int number : list) {
            rst[index++] = number;
        }
        return rst;
    }
    
}
