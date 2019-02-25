package com.xyzniu.leetcode.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 969
 */
public class PancakeSorting {

    /**
     * 给定数组 A，我们可以对其进行煎饼翻转：我们选择一些正整数 k <= A.length，然后反转 A 的前 k 个元素的顺序。我们要执行零次或多次煎饼翻转（按顺序一次接一次地进行）以完成对数组 A 的排序。
     * 返回能使 A 排序的煎饼翻转操作所对应的 k 值序列。任何将数组排序且翻转次数在 10 * A.length 范围内的有效答案都将被判断为正确。
     * <p>
     * 假设最大数位于k，那么首先反转前k个，则把最大的反转到第0个，再全部反转，则最大的就放到了最后一个。
     *
     * @param A
     * @return
     */
    public List<Integer> pancakeSort(int[] A) {
        List<Integer> rst = new ArrayList<>();
        pancakeSort(A, rst, A.length - 1);
        return rst;
    }

    private void pancakeSort(int[] A, List<Integer> rst, int len) {
        if (len == 0) {
            return;
        }
        boolean flag = true;
        int max = 0;
        for (int i = 1; i <= len; i++) {
            if (A[i] < A[i - 1]) {
                flag = false;
            }
            if (A[i] > A[max]) {
                max = i;
            }
        }
        if (flag) {
            return;
        }
        if (max != len) {
            rotate(A, 0, max);
            rotate(A, 0, len);
            rst.add(max + 1);
            rst.add(len + 1);
        }
        pancakeSort(A, rst, len - 1);
    }

    private void rotate(int[] A, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }


}
