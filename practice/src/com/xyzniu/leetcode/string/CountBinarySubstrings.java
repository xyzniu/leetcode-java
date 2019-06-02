package com.xyzniu.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 696
 */
public class CountBinarySubstrings {
    
    public int countBinarySubstrings(String s) {
        List<Integer> zeros = new ArrayList<>();
        List<Integer> ones = new ArrayList<>();
        
        int count = 1;
        char prev = s.charAt(0);
        char one = '1';
        char zero = '0';
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                count++;
            } else {
                if (prev == one) {
                    ones.add(count);
                    prev = zero;
                } else {
                    zeros.add(count);
                    prev = one;
                }
                count = 1;
            }
        }
        if (prev == one) {
            ones.add(count);
        } else {
            zeros.add(count);
        }
        List<Integer> first;
        List<Integer> second;
        if (s.charAt(0) == zero) {
            first = zeros;
            second = ones;
        } else {
            first = ones;
            second = zeros;
        }
        int rst = 0;
        int index1 = 0;
        int index2 = 0;
        boolean flag = true;
        while (index1 < first.size() && index2 < second.size()) {
            rst += Math.min(first.get(index1), second.get(index2));
            if (flag) {
                index1++;
            } else {
                index2++;
            }
            flag = !flag;
        }
        return rst;
    }
    
}
