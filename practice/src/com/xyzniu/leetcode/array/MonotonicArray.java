package com.xyzniu.leetcode.array;

/**
 * 896
 */
public class MonotonicArray {

    /**
     * 如果数组是单调递增或单调递减的，那么它是单调的。
     * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
     * 当给定的数组 A 是单调数组时返回 true，否则返回 false。
     * <p>
     * @param A
     * @return
     */
    public boolean isMonotonic(int[] A) {
        return isMonotonic1(A);
    }

    public boolean isMonotonic2(int[] A) {
        int up = 0;
        int down = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                up++;
            }
            if (A[i] < A[i - 1]) {
                down++;
            }
            if (up != 0 && down != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isMonotonic1(int[] A) {
        if (A.length == 1) {
            return true;
        }

        int index = 1;
        while (index < A.length && A[index] == A[index - 1]) {
            index++;
        }

        if (index == A.length - 1) {
            return true;
        }
        boolean isUp = A[index - 1] - A[index] > 0 ? false : true;

        if (isUp) {
            return up(A, index);
        } else {
            return down(A, index);
        }

    }

    private boolean up(int[] A, int index) {
        for (int i = index + 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private boolean down(int[] A, int index) {
        for (int i = index + 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MonotonicArray m = new MonotonicArray();
        m.isMonotonic(new int[]{1, 3, 2});
    }


}
