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
        return sortedSquares1(A);
    }

    /**
     * 执行用时14ms
     * 内存消耗43MB
     *
     * @param A
     * @return
     */
    private int[] sortedSquares1(int[] A) {
        if (A == null) {
            return A;
        }

        if (A.length == 1) {
            int[] rst = new int[A.length];
            rst[0] = A[0] * A[0];
            return rst;
        }

        int start = 0;
        int len = A.length;
        int end = len - 1;

        while (start < end) {
            int mid = (end + start) / 2;
            if (A[mid] < 0) {
                start = mid + 1;
            } else if (A[mid] > 0) {
                end = mid;
            } else {
                start = mid;
                end = mid;
                break;
            }
        }
        int right = start;
        int left = right - 1;
        int[] rst = new int[A.length];
        int index = 0;

        while (right < len && left >= 0) {
            if (Math.abs(A[right]) > Math.abs(A[left])) {
                rst[index++] = A[left] * A[left];
                left--;
            } else {
                rst[index++] = A[right] * A[right];
                right++;
            }
        }

        while (left >= 0) {
            rst[index++] = A[left] * A[left];
            left--;
        }

        while (right < len) {
            rst[index++] = A[right] * A[right];
            right++;
        }
        return rst;
    }

    /**
     * 内置函数：
     * 执行用时18ms
     * 内存消耗44MB
     * <p>
     * 自己写的快排：
     * 执行用时23ms
     * 内存消耗32MB
     *
     * @param A
     * @return
     */
    public int[] sortedSquares2(int[] A) {
        if (A == null) {
            return A;
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        //Arrays.sort(A);
        quickSort(A, 0, A.length - 1);
        return A;
    }

    /**
     * 这个快排写法是提溜着key到处换位置。
     * @param A
     * @param low
     * @param high
     */
    public void quickSort(int[] A, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int key = A[low];

        while (start < end) {
            while (start < end && A[end] >= key) {
                end--;
            }
            if (start < end) {
                int tmp = A[start];
                A[start] = A[end];
                A[end] = tmp;
            }
            while (start < end && A[start] < key) {
                start++;
            }

            if (start < end) {
                int tmp = A[start];
                A[start] = A[end];
                A[end] = tmp;
            }
        }
        quickSort(A, low, start - 1);
        quickSort(A, start + 1, high);
    }


}
