package com.xyzniu.leetcode.array;

import java.util.Arrays;

/**
 * 888
 */
public class FairCandySwap {

    /**
     * 爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i 块糖的大小，B[j] 是鲍勃拥有的第 j 块糖的大小。
     * 因为他们是朋友，所以他们想交换一个糖果棒，这样交换后，他们都有相同的糖果总量。（一个人拥有的糖果总量是他们拥有的糖果棒大小的总和。）
     * 返回一个整数数组 ans，其中 ans[0] 是爱丽丝必须交换的糖果棒的大小，ans[1] 是 Bob 必须交换的糖果棒的大小。
     * 如果有多个答案，你可以返回其中任何一个。保证答案存在。
     *
     * @param A
     * @param B
     * @return
     */
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        int sumB = 0;
        int[] rst = new int[2];
        for (int i = 0; i < A.length; i++) {
            sumA += A[i];
        }
        for (int i = 0; i < B.length; i++) {
            sumB += B[i];
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int swap = (sumA - sumB) / 2;
        int i = 0;
        int j = 0;
        while (i < A.length && j < B.length) {
            if (A[i] - B[i] == swap) {
                rst[0] = A[i];
                rst[1] = B[i];
                return rst;
            }
            if (A[i] - B[i] > swap) {
                j++;
            } else {
                i++;
            }
        }
        return rst;
    }


}
