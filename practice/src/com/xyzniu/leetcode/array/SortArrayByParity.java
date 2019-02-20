package com.xyzniu.leetcode.array;

/**
 * 905
 */
public class SortArrayByParity {

    /**
     * Q:
     * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
     * 你可以返回满足此条件的任何数组作为答案。
     * <p>
     * A:
     * 标准的双指针
     * <p>
     * 也可以不原地交换，而是创建一个新数组。
     *
     * @param A
     * @return
     */
    public int[] sortArrayByParity(int[] A) {
        return sortArrayByParity1(A);
    }

    /**
     * 执行用时：23ms
     * 内存消耗：40MB
     *
     * @param A
     * @return
     */
    public int[] sortArrayByParity1(int[] A) {
        if (A == null || A.length <= 1) {
            return A;
        }

        int left = 0;
        int right = A.length - 1;

        while (left < right) {
            while (left < right && A[left] % 2 == 0) {
                left++;
            }
            while (left < right && A[right] % 2 == 1) {
                right--;
            }

            if (left < right) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
            }
        }
        return A;
    }

    /**
     * 执行用时：21ms
     * 内存消耗：41ms
     *
     * @param A
     * @return
     */
    public int[] sortArrayByParity2(int[] A) {
        int[] rst = new int[A.length];
        int left = 0;
        int right = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                rst[left++] = A[i];
            } else {
                rst[right--] = A[i];
            }
        }
        return rst;
    }


}