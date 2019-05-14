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
    public int[] sortArrayByParityII(int[] A) {
        int even = 0;
        int odd = 1;
        if (A.length <= 1) {
            return A;
        }
        while (even < A.length && odd < A.length) {
            while (even < A.length && A[even] % 2 == 0) {
                even += 2;
            }
            while (odd < A.length && A[odd] % 2 == 1) {
                odd += 2;
            }
            if (odd < A.length && even < A.length) {
                swap(A, odd, even);
                odd += 2;
                even += 2;
            }
        }
        return A;
    }
    
    private void swap(int[] A, int odd, int even) {
        int temp = A[odd];
        A[odd] = A[even];
        A[even] = temp;
    }
    
    
}
