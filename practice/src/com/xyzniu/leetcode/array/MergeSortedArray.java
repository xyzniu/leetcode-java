package com.xyzniu.leetcode.array;

import java.util.Arrays;

/**
 * 88
 */
public class MergeSortedArray {
    
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = Arrays.copyOf(nums1, m);
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        while (index3 < m && index2 < n) {
            if (nums3[index3] < nums2[index2]) {
                nums1[index1] = nums3[index3];
                index3++;
            } else {
                nums1[index1] = nums2[index2];
                index2++;
            }
            index1++;
        }
        while (index3 < m) {
            nums1[index1++] = nums3[index3++];
        }
        while (index2 < n) {
            nums1[index1++] = nums2[index2++];
        }
        return;
    }
    
}
