package com.xyzniu.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 989
 */
public class AddToArrayFormOfInteger {
    
    public List<Integer> addToArrayForm(int[] A, int K) {
        int prev = 0;
        List<Integer> rst = new ArrayList<>();
        for (int i = A.length - 1; i >= 0; i--) {
            int num = A[i] + prev + (K % 10);
            rst.add(num % 10);
            prev = num / 10;
            K /= 10;
        }
        while (K != 0 || prev != 0) {
            int num = prev + (K % 10);
            rst.add(num % 10);
            prev = num / 10;
            K /= 10;
        }
        Collections.reverse(rst);
        return rst;
    }
    
}
