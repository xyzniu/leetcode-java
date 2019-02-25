package com.xyzniu.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 989
 */
public class AddToArrayFormOfInteger {

    /**
     * 对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
     * 给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
     *
     * @param A
     * @param K
     * @return
     */
    public List<Integer> addToArrayForm(int[] A, int K) {
        int i = A.length - 1;
        int num = K;
        int add = 0;
        List<Integer> rst = new ArrayList<>();
        while (i >= 0 && num != 0) {
            int sum = add + A[i] + (num % 10);
            num = num / 10;
            add = sum / 10;
            rst.add(sum % 10);
            i--;
        }

        while (i >= 0) {
            int sum = add + A[i];
            add = sum / 10;
            rst.add(sum % 10);
            i--;
        }

        while (num != 0) {
            int sum = add + (num % 10);
            num = num / 10;
            add = sum / 10;
            rst.add(sum % 10);
        }
        if (add != 0) {
            rst.add(add);
        }
        Collections.reverse(rst);
        return rst;
    }

}
