package com.xyzniu.leetcode.array;

/**
 * 88
 */
public class MergeSortedArray {

    /**
     * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
     * 说明:
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
     * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        merge1(nums1, m, nums2, n);
    }

    /**
     * merge, 从大到小方向
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;

        int index3 = m + n - 1;
        while (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] > nums2[index2]) {
                nums1[index3--] = nums1[index1--];
            } else {
                nums1[index3--] = nums2[index2--];
            }
        }

        while (index1 >= 0) {
            nums1[index3--] = nums1[index1--];
        }

        while (index2 >= 0) {
            nums1[index3--] = nums1[index1--];
        }

    }

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m];
        for (int i = 0; i < m; i++) {
            nums3[i] = nums1[i];
        }

        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        while (index2 < n && index3 < m) {
            if (nums2[index2] > nums3[index3]) {
                nums1[index1++] = nums3[index3++];
            } else {
                nums1[index1++] = nums2[index2++];
            }
        }
        while (index2 < n) {
            nums1[index1++] = nums2[index2++];
        }

        while (index3 < m) {
            nums1[index1++] = nums3[index3++];
        }
    }

}
