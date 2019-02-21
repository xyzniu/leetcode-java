package com.xyzniu.leetcode.hashtable;

import java.util.HashSet;

/**
 * 961
 */
public class NRepeatedElementInSize2nArray {


    /**
     * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
     * 返回重复了 N 次的那个元素。
     *
     * @param A
     * @return
     */
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i])) {
                return A[i];
            }
            set.add(A[i]);
        }
        return -1;
    }

}
