package com.xyzniu.leetcode.array;

import java.util.Arrays;

/**
 * 888
 */
public class FairCandySwap {
    
    
    public int[] fairCandySwap(int[] A, int[] B) {
        int alice = sum(A);
        int bob = sum(B);
        int swap = (bob - alice) / 2;
        Arrays.sort(A);
        Arrays.sort(B);
        int indexA = 0;
        int indexB = 0;
        while (indexA < A.length && indexB < B.length) {
            if (B[indexB] - A[indexA] == swap) {
                return new int[]{A[indexA], B[indexB]};
            } else if (B[indexB] - A[indexA] > swap) {
                indexA++;
            } else {
                indexB++;
            }
        }
        return null;
    }
    
    private int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    
    
}
