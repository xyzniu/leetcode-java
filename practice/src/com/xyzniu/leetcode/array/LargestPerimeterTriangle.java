package com.xyzniu.leetcode.array;

/**
 * 976
 */
public class LargestPerimeterTriangle {
    
    /**
     * Q:
     * 给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。
     * 如果不能形成任何面积不为零的三角形，返回 0。
     * <p>
     * A:
     * 排序，然后从头开始往下顺大小？
     *
     * @param A
     * @return
     */
    public int largestPerimeter(int[] A) {
        quicksort(A, 0, A.length - 1);
        for (int i = A.length - 1; i >= 2; i--) {
            int num1 = A[i];
            int num2 = A[i - 1];
            int num3 = A[i - 2];
            if (num2 + num3 > num1 && num1 - num2 < num3) {
                return num1 + num2 + num3;
            }
        }
        return 0;
    }
    
    private void quicksort(int[] A, int start, int end) {
        if (start >= end) {
            return;
        }
        int one = start;
        int left = start + 1;
        int right = end;
        
        while (left < right) {
            while (left < right && A[left] <= A[one]) {
                left++;
            }
            while (left < right && A[right] >= A[one]) {
                right--;
            }
            if (left < right) {
                swap(A, left, right);
                left++;
                right--;
            }
        }
        
        int mid = 0;
        if (A[left] > A[one]) {
            swap(A, left - 1, one);
            mid = left - 1;
        } else {
            swap(A, left, one);
            mid = left;
        }
        quicksort(A, start, mid - 1);
        quicksort(A, mid + 1, end);
    }
    
    private void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
    
}
