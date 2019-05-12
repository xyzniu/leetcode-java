package com.xyzniu.leetcode.array;

/**
 * 977
 */
public class SquaresOfASortedArray {
    /**
     * Q：
     * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
     * <p>
     * A：
     * 先按绝对值排序，然后再平方，或者先平方，再按绝对值排序。
     * 先二分查找找到第一个非0的值，然后用左右指针遍历完整个数组。
     *
     * @param A
     * @return
     */
    public int[] sortedSquares(int[] A) {
        int[] square = new int[A.length];
        
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (A[mid] == 0) {
                left = mid;
                right = mid;
                break;
            } else if (A[mid] < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (A[left] >= 0) {
            right = left;
            left = left - 1;
        } else {
            right = left + 1;
        }
        int index = 0;
        while (index < A.length && left >= 0 && right < A.length) {
            if (Math.abs(A[left]) > Math.abs(A[right])) {
                square[index++] = A[right] * A[right];
                right++;
            } else {
                square[index++] = A[left] * A[left];
                left--;
            }
        }
        while (left >= 0) {
            square[index++] = A[left] * A[left];
            left--;
        }
        while (right < A.length) {
            square[index++] = A[right] * A[right];
            right++;
        }
        
        return square;
    }
    
    
}
