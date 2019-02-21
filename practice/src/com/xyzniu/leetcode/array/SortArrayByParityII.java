package com.xyzniu.leetcode.array;

/**
 * 922
 */
public class SortArrayByParityII {

    /**
     * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
     * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
     * 你可以返回任何满足上述条件的数组作为答案。
     *
     * @param A
     * @return
     */
    public int[] sortArrayByParityII(int[] A) {
        return sortArrayByParityII1(A);
    }

    public int[] sortArrayByParityII1(int[] A) {
        if (A == null) {
            return A;
        }
        int[] rst = new int[A.length];

        int even = 0;
        int odd = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                rst[even] = A[i];
                even += 2;
            } else {
                rst[odd] = A[i];
                odd += 2;
            }
        }
        return rst;
    }
}
