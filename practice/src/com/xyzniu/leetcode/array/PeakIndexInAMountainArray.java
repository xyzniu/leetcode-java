package com.xyzniu.leetcode.array;

/**
 * 852
 */
public class PeakIndexInAMountainArray {
    
    /**
     * 我们把符合下列属性的数组 A 称作山脉：
     * A.length >= 3
     * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
     * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
     *
     * @param A
     * @return
     */
    public int peakIndexInMountainArray(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            int mid1 = (left + right) / 2;
            int mid2 = mid1 + 1;
            if (A[mid1] > A[mid2]) {
                right = mid1;
            } else if (A[mid1] < A[mid2]) {
                left = mid2;
            }
        }
        if (A[left] > A[left + 1]) {
            return left;
        } else {
            return left + 1;
        }
    }
    
}
