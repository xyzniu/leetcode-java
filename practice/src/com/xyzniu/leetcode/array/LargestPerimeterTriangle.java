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
        return largestPerimeter1(A);
    }

    public int largestPerimeter1(int[] A) {
        quickSort(A, 0, A.length - 1);
        for (int i = 0; i < A.length - 2; i++) {
            int num1 = A[i];
            int num2 = A[i + 1];
            int num3 = A[i + 2];
            if (num2 + num3 > num1) {
                return num1 + num2 + num3;
            }
        }
        return 0;
    }

    public void quickSort(int[] A, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int start = lo;
        int end = hi;
        int key = A[lo];

        while (start < end) {
            while (start < end && A[end] <= key) {
                end--;
            }

            if (start < end) {
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;
            }

            while (start < end && A[start] > key) {
                start++;
            }

            if (start < end) {
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;
            }
        }

        quickSort(A, lo, start - 1);
        quickSort(A, start + 1, hi);
    }

}
