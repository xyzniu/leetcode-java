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
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            while (left < right && A[left] % 2 == 0) {
                left++;
            }
            while (left < right && A[right] % 2 != 0) {
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
    
    
}
