package com.xyzniu.leetcode.array;

/**
 * 941
 */
public class ValidMountainArray {

    /**
     * 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
     * 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：
     * A.length >= 3
     * 在 0 < i < A.length - 1 条件下，存在 i 使得：
     * A[0] < A[1] < ... A[i-1] < A[i]
     * A[i] > A[i+1] > ... > A[B.length - 1]
     *
     * @param A
     * @return
     */
    public boolean validMountainArray(int[] A) {
        boolean up = true;
        if (A.length == 0 || A.length == 1) {
            return false;
        }
        if (A[1] < A[0]) {
            return false;
        }
        for (int i = 1; i < A.length; i++) {
            if (up) {
                if (A[i] > A[i - 1]) {
                    continue;
                } else if (A[i] == A[i - 1]) {
                    return false;
                } else {
                    up = false;
                }
            } else {
                if (A[i] < A[i - 1]) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (up) {
            return false;
        }
        return true;
    }

}
